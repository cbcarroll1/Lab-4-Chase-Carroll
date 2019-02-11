package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //The driver code for the menu goes in main
        //Create keyboard object
        Scanner keyboard = new Scanner(System.in);

    }

    /**
     * This method is used to display the menu options
     * The user can then make a pick.  That choice is returned to the main method
     * @param keyboard
     * @return the menu choice
     */
    public static String getMenuChoice(Scanner keyboard){
        System.out.println(" Hit (1) to display a triangle");
        System.out.println(" Hit (2) to display a chart");
        System.out.println(" Hit (3) to exit application ");

        if(1)
                displayTriangle();
        else if(2)
                displayChart();
        else if(3)
                System.exit(0);

    }

    /**
     * This method is used to display the triangle when called from the main menu
     */
    public static void displayTriangle() {
        for (int i = 10; i > 0; --i) {

            for (int j = 0; j < i + 1; j++) ;
            {

                System.out.print("*");

            }
            System.out.println();

        }

        /**
         * This method is used to display the table of numbers when called from the main menu
         * Use the tab escape sequence to get output to line up i.e. ("\t")
         */
        public static void displayChart(); {
            {
                int product = 0;

                for (int i = 1; i < 4; i++) ;
                {
                    for (int j = 0; j < 9; j++) ;

                return;
                }
            }}}}