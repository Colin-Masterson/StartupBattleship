/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author colin
 */
public class SimpleStartupGame {

    public static void main(String[] args) {
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        SimpleStartup theStartup = new SimpleStartup();

        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        theStartup.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {
            int guess = helper.getUserInput("enter a number");

            String result = theStartup.checkYourself(guess);

            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;

                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
