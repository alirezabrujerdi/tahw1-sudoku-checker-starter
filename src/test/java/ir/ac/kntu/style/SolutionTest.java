/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.ac.kntu.style;

import ir.ac.kntu.SudokuChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 40 points
 * @author mhrimaz
 */
public class SolutionTest {
    static {
        System.err.println("$$$GRADER$$$ | { type:\"MSG\" , key:\"TOTAL\" , value:55, priority:1  }  | $$$GRADER$$$");
    }    
    private int[][] Grid = new int[9][9];
    private String[] Temp = new String[81];
    
    public boolean test(int[][] grid, boolean result) {
        return (SudokuChecker.isValidSolution(grid) == result);
    }
    @Test
    public void test7() {
        int[][] gridvalid ={{8,3,5,4,1,6,9,2,7},
                            {2,9,6,8,5,7,4,3,1},
                            {4,1,7,2,9,3,6,5,8},
                            {5,6,9,1,3,4,7,8,2},
                            {1,2,3,6,7,8,5,4,9},
                            {7,4,8,5,2,9,1,6,3},
                            {6,5,2,7,8,1,3,9,4},
                            {9,8,1,3,4,5,2,7,6},
                            {3,7,4,9,6,2,8,1,5}};
        assertTrue(test(gridvalid, true));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }
        @Test
    public void test8() {
        int[][] gridvalid ={{8,3,5,4,1,6,9,2,7},
                              {2,9,6,8,5,7,4,3,1},
                              {4,1,7,2,9,3,6,5,8},
                              {5,6,9,1,3,4,7,8,2},
                              {1,2,3,6,7,8,5,4,9},
                              {7,4,8,5,2,9,1,6,3},
                              {6,5,2,7,8,1,3,9,4},
                              {9,8,1,3,4,5,2,7,6},
                              {3,7,4,9,6,2,8,1,1}};
        assertTrue(test(gridvalid, false));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }
    
    @Test
    public void test1() {
        String in =     "1 2 6 4 3 7 9 5 8 "
                      + "8 9 5 6 2 1 4 7 3 "
                      + "3 7 4 9 8 5 1 2 6 "
                      + "4 5 7 1 9 3 8 6 2 "
                      + "9 8 3 2 4 6 5 1 7 "
                      + "6 1 2 5 7 8 3 9 4 "
                      + "2 6 9 3 1 4 7 8 5 "
                      + "5 4 8 7 6 9 2 3 1 "
                      + "7 3 1 8 5 2 6 4 9";
        Temp = in.split("\\s+");
        int c = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Grid[i][j] = Integer.valueOf(Temp[c]);
                c++;
            }
        }
        assertTrue(test(Grid, true));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }

    @Test
    public void test2() {
        String in = "1 2 6 4 3 7 9 5 8 "
                      + "8 9 5 6 2 1 4 7 3 "
                      + "3 7 4 9 8 5 1 2 6 "
                      + "4 5 7 1 9 3 8 6 2 "
                      + "9 8 3 0 4 6 5 1 7 "
                      + "6 1 2 5 7 8 3 9 4 "
                      + "2 6 9 3 1 4 7 8 5 "
                      + "5 4 8 7 6 9 2 3 1 "
                      + "7 3 1 8 5 2 6 4 9";
        Temp = in.split("\\s+");
        int c = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Grid[i][j] = Integer.valueOf(Temp[c]);
                c++;
            }
        }
        assertTrue(test(Grid, false));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }
    
    @Test
    public void test3() {
        String in = "1 2 6 4 3 7 9 5 8 "
                      + "8 9 5 6 2 1 4 7 3 "
                      + "3 7 4 9 8 5 1 2 6 "
                      + "4 5 7 1 9 3 8 6 2 "
                      + "9 8 3 2 4 6 9 1 7 "
                      + "6 1 2 5 7 8 3 9 4 "
                      + "2 6 9 3 1 4 7 8 5 "
                      + "5 4 8 7 6 9 2 3 1 "
                      + "7 3 1 8 5 2 6 4 9";
        Temp = in.split("\\s+");
        int c = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Grid[i][j] = Integer.valueOf(Temp[c]);
                c++;
            }
        }
        assertTrue(test(Grid, false));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }
    
    @Test
    public void test4() {
        String in = "1 6 9 7 4 2 3 8 5 "
                      + "7 2 8 9 5 3 4 6 1 "
                      + "3 4 5 8 1 6 7 9 2 "
                      + "9 5 1 3 2 8 6 7 4 "
                      + "6 8 2 5 7 4 1 3 9 "
                      + "4 7 3 1 6 9 5 2 8 "
                      + "5 3 6 2 8 1 9 4 7 "
                      + "2 1 4 6 9 7 8 5 3 "
                      + "8 9 7 4 3 5 2 1 6";
        Temp = in.split("\\s+");
        int c = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Grid[i][j] = Integer.valueOf(Temp[c]);
                c++;
            }
        }
        assertTrue(test(Grid, true));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }
    
    @Test
    public void test5() {
        String in =     "1 3 9 7 4 2 6 8 5 "
                      + "7 2 8 9 5 3 4 6 1 "
                      + "3 4 5 8 1 6 7 9 2 "
                      + "9 5 1 6 2 8 3 7 4 "
                      + "6 8 2 5 7 4 1 3 9 "
                      + "4 7 6 1 3 9 5 2 8 "
                      + "5 6 3 2 8 1 9 4 7 "
                      + "2 1 4 3 9 7 8 5 6 "
                      + "8 9 7 4 6 5 2 1 3";
        Temp = in.split("\\s+");
        int c = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Grid[i][j] = Integer.valueOf(Temp[c]);
                c++;
            }
        }
        assertTrue(test(Grid, false));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }
    
    @Test
    public void test6() {
        String in =     "1 3 9 7 4 2 6 8 5 "
                      + "7 2 8 9 5 3 4 6 1 "
                      + "3 4 5 8 1 6 7 9 2 "
                      + "9 5 1 6 2 8 3 7 4 "
                      + "6 8 2 5 7 4 1 3 9 "
                      + "4 7 6 1 3 9 5 2 8 "
                      + "5 6 3 2 8 1 9 4 7 "
                      + "2 1 4 3 9 7 8 5 6 "
                      + "8 9 7 4 6 5 2 1 -3";
        Temp = in.split("\\s+");
        int c = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Grid[i][j] = Integer.valueOf(Temp[c]);
                c++;
            }
        }
        assertTrue(test(Grid, false));
        System.err.println("$$$GRADER$$$ | { type:\"SCORE\" , amount:5 , reason:\"Test Passed.\" } | $$$GRADER$$$" );
    }
}

