package com.netcracker.chapter3.student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    List<Integer> scores = new ArrayList<>();


    @Override
    public String toString() {
        String student = "";
        for(int i = 0; i < scores.size(); i++){
            student += "Test" + (i+1) + ":" + scores.get(i) + "; ";
        }
        return "Student{" + student + "}";
    }

    public void addQuiz(int score){
        scores.add(score);
    }

    public double getTotalScore(){
        int summa = 0;
        for(int score: scores){
            summa += score;
        }

        return summa;
    }

    public double getAverageScore(){
        return getTotalScore()/scores.size();
    }
}
