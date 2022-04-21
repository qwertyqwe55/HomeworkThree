package com.netcracker.chapter3.student;

public class StudentTester {

        public void testStudent(){
            Student student = new Student();
            student.addQuiz(20);
            student.addQuiz(50);
            student.addQuiz(100);
            System.out.println("Result score of tests for student: " + student);
            System.out.println("Total score: " + student.getTotalScore());
            System.out.println("Average score: " + student.getAverageScore());
        }

}
