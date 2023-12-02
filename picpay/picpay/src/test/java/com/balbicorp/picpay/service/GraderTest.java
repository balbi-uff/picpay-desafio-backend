package com.balbicorp.picpay.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fortyShouldBeF() {
        Grader grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(40));
    }

    @Test
    void sixtyShouldBeD(){
        Grader grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(60));
    }

    @Test
    void seventyShouldBeC(){
        Grader grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(70));
    }
    @Test
    void eightyShouldBeB(){
        Grader grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(80));
    }

    @Test
    void oneHundredShouldBeA(){
        Grader grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(100));
    }

    @Test
    void negativeOneShouldReturnIllegalArgument(){
        Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class,
            () -> {
                grader.determineLetterGrade(-1);
            });
    }
}
