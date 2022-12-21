/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author colin
 */
public class SimpleStartupTestDrive {

    public static void main(String[] args) {
        SimpleStartup dot = new SimpleStartup();

        int[] locations = {2, 3, 4};

        dot.setLocationCells(locations);

        int userGuess = 2;

        String result = dot.checkYourself(userGuess);

        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);

    }

}
