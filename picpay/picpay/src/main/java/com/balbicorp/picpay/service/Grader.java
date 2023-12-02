package com.balbicorp.picpay.service;

public class Grader {
    public char determineLetterGrade(int numberGrade){
        // Check for invalid input
        if (numberGrade < 0){
            throw new IllegalArgumentException("Number grade cannot be less than zero");
        }

        // Determine letter grade
        if (numberGrade >= 90) {
            return 'A';
        } else if (numberGrade >= 80) {
            return 'B';
        } else if (numberGrade >= 70) {
            return 'C';
        } else if (numberGrade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

}
