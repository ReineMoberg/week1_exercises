package se.lexicon.ReineMoberg;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        ///Exercise 1

        /*System.out.println("Hello" + "\n" + "Reine!");*/


        //Exercise 2

        /*int year = 0;
        System.out.println("Enter a year: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        boolean isLeap = false;
        if(year % 4 == 0){                      //Year divisible by 4?
            if(year % 100 == 0){                //and divisible by 100?
                if(year % 400 == 0)             //and divisible by 400?
                    isLeap = true;              //then it's a leap year
                else
                    isLeap = false;
            }
            else
                isLeap = true;                  //is not divisible by 100
        }
        else
            isLeap = false;                     //is not divisible by 4
        if(isLeap){
            System.out.println(year + " is a leap year.");
        }
        else
            System.out.println(year + " is not a leap year.");*/


        //Exercise 3

        /*int number1 = 55;
        int number2 = 12;
        long addResult = number1 + number2;                     //Add
        long subResult = number1 - number2;                     //Subtract
        long mulResult = number1 * number2;                     //Multiply
        double divResult = (double)number1 / (double)number2;   //Divide, change data type
        System.out.println("Addition: " + addResult);
        System.out.println("Subtraction: " + subResult);
        System.out.println("Multiplication: " + mulResult);
        System.out.println("Division " + divResult);*/


        //Exercise 4

        /*int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        System.out.println("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        System.out.println("Enter second number: ");
        number2 = sc.nextInt();
        System.out.println("Enter third number: ");
        number3 = sc.nextInt();
        double averageResult = ((double)(number1+number2+number3) / 3);
        System.out.println("Average is: " + averageResult);*/


        //Exercise 5

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);*/


        //Exercise 6

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = sc.nextInt();                     //read first input from user
        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();                     //Read second input from user
        long sumResult = number1 + number2;             //Sum
        long subResult = number1 - number2;             //Subtract
        long mulResult = number1 * number2;             //Multiply
        float divResult = (float)number1 / (float)number2;  //Divide, change data type
        System.out.println("Sum: " + sumResult);            //Print result
        System.out.println("Subtraction: " + subResult);
        System.out.println("Multiplication: " + mulResult);
        System.out.println("Division " + divResult);*/


        //Exercise 7

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int seconds = sc.nextInt();
        int secs = seconds % 60;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        System.out.println(hours + ":" + minutes + ":" + secs);*/


        //Exercise 8

        Scanner sc = new Scanner(System.in);
        double randomValue = 0;
        int roundedRandom = 0;
        int guess = 0;
        int numberOfGuesses = 0;
        boolean correct = false;
        String inputAnswer = " ";

        randomValue = Math.random() * 500;
        roundedRandom = (int) randomValue;
        //System.out.println(roundedRandom);            //For validation
        if(roundedRandom == 0){                         //If value is zero, set to one
            roundedRandom = 1;
        }
        while(!correct){                                //Keep guessing until correct
            System.out.println("Guess a number between 1 - 500: ");
            guess = sc.nextInt();
            numberOfGuesses++;
            if(guess < roundedRandom){
                System.out.println("Your guess number " + numberOfGuesses + " was too small");
            }
            else if(guess > roundedRandom){
                System.out.println("Your guess number " + numberOfGuesses + " was too big");
            }
            else{
                System.out.println("Your guess number " + numberOfGuesses + " was correct");
                correct = true;
            }
            if(!correct){                               //Ask if continue when guess incorrect
                System.out.println("Want to continue? (y/n)");
                inputAnswer = sc.next();
                if(inputAnswer.equals("n")) {
                    break;
                }
            }

        }



    }

}
