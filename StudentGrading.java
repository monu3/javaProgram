package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Grades {
    private final int marks;
    private final String grade;

    public Grades(int marks) {
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    private String calculateGrade(int marks) {
        if (marks >= 70) {
            return "D"; // Distinction
        } else if (marks >= 60) {
            return "M"; // Merit
        } else if (marks >= 50) {
            return "P"; // Pass
        } else {
            return "F"; // Fail
        }
    }
}

class Courses {
    private final String name;

    public Courses(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Students {
    private final int id;
    private final String name;
    private final List<Grades> grades;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int marks) {
        grades.add(new Grades(marks));
    }

    public List<Grades> getGrades() {
        return grades;
    }

    public double calculateAverage() {
        double sum = 0;
        for (Grades grade : grades) {
            sum += grade.getMarks();
        }
        return sum / grades.size();
    }

    public void insertDataIntoDatabase() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gradingSystem", "username", "password");
            String insertStudentQuery = "INSERT INTO Student (id, name) VALUES (?, ?)";
            PreparedStatement insertStudentStatement = connection.prepareStatement(insertStudentQuery);
            insertStudentStatement.setInt(1, getId());
            insertStudentStatement.setString(2, getName());
            insertStudentStatement.executeUpdate();

            List<Grades> grades = getGrades();
            for (Grades grade : grades) {
                String insertGradeQuery = "INSERT INTO Grade (student_id, course_id, marks, grade) VALUES (?, ?, ?, ?)";
                PreparedStatement insertGradeStatement = connection.prepareStatement(insertGradeQuery);
                insertGradeStatement.setInt(1, getId());
                // You would need to modify this to get the actual course ID from the database
                insertGradeStatement.setInt(2, 1); // Assuming course ID 1 for simplicity
                insertGradeStatement.setInt(3, grade.getMarks());
                insertGradeStatement.setString(4, grade.getGrade());
                insertGradeStatement.executeUpdate();
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

public class StudentGrading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter student name: ");
        scanner.nextLine(); // Consume newline
        String name = scanner.nextLine();
        Students student = new Students(id, name);

        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter marks for Course " + i + ": ");
            int marks = scanner.nextInt();
            student.addGrade(marks);
        }

        System.out.println("\nStudent ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Grades:");
        List<Grades> grades = student.getGrades();
        for (int i = 0; i < grades.size(); i++) {
            System.out.println("Course " + (i + 1) + ": " + grades.get(i).getMarks() + " (" + grades.get(i).getGrade() + ")");
        }
        System.out.println("Average Marks: " + student.calculateAverage());


       student.insertDataIntoDatabase();

        scanner.close();
    }
}

