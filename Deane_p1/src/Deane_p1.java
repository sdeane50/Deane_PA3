
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Random;

public class Deane_p1 {
    private static int num1, num2, numCorrect, numIncorrect, difficulty, type, type1, numResponses;
    private static String CompResponse;
    private static boolean UserCorrect = false;

    public static void randNUM() {
        SecureRandom rand = new SecureRandom();
        if (difficulty == 1) {
            num1 = rand.nextInt(9) + 1;
            num2 = rand.nextInt(9) + 1;
        } else if (difficulty == 2) {
            num1 = rand.nextInt(99) + 1;
            num2 = rand.nextInt(99) + 1;
        } else if (difficulty == 3) {
            num1 = rand.nextInt(999) + 1;
            num2 = rand.nextInt(999) + 1;
        } else if (difficulty == 4) {
            num1 = rand.nextInt(9999) + 1;
            num2 = rand.nextInt(9999) + 1;
        }
    }

    public static void responses() {
        SecureRandom rand = new SecureRandom();
        int response = rand.nextInt(4) + 1;
        if (UserCorrect) {
            switch (response) {
                case 1:
                    CompResponse = "Very good!";
                    break;
                case 2:
                    CompResponse = "Excellent!";
                    break;
                case 3:
                    CompResponse = "Nice work!";
                    break;
                case 4:
                    CompResponse = "Keep up the good work!";
                    break;
            }
        } else {
            switch (response) {
                case 1:
                    CompResponse = "No. Please try again.";
                    break;
                case 2:
                    CompResponse = "Wrong. Try once more.";
                    break;
                case 3:
                    CompResponse = "Don’t give up!";
                    break;
                case 4:
                    CompResponse = "No. Keep trying.";
                    break;
            }
        }
    }

    public static void math() {
        int rightAns;
        Scanner scnr = new Scanner(System.in);
        switch (type1) {
            case 1:
                rightAns = num1 + num2;
                int ANS = scnr.nextInt();
                if (rightAns == ANS) {
                    UserCorrect = true;
                    ++numResponses;
                    ++numCorrect;
                } else {
                    UserCorrect = false;
                    ++numResponses;
                    ++numIncorrect;
                }
                break;
            case 2:
                rightAns = num1 * num2;
                ANS = scnr.nextInt();
                if (rightAns == ANS) {
                    UserCorrect = true;
                    ++numResponses;
                    ++numCorrect;
                } else {
                    UserCorrect = false;
                    ++numResponses;
                    ++numIncorrect;
                }
                break;
            case 3:
                rightAns = num1 - num2;
                ANS = scnr.nextInt();
                if (rightAns == ANS) {
                    UserCorrect = true;
                    ++numResponses;
                    ++numCorrect;
                } else {
                    UserCorrect = false;
                    ++numResponses;
                    ++numIncorrect;
                }
                break;
            case 4:
                double no1 = num1;
                double no2 = num2;
                double rightAn = no1 / no2;
                double ANSdoub = scnr.nextDouble();
                if (Math.abs(ANSdoub - (no1 / no2)) < 0.1) {
                    UserCorrect = true;
                    ++numResponses;
                    ++numCorrect;
                } else {
                    UserCorrect = false;
                    ++numResponses;
                    ++numIncorrect;
                }
                break;

        }
    }

    public static void question() {
        SecureRandom rand = new SecureRandom();
        switch (type) {
            case 1:
                System.out.println("How much is " + num1 + " plus " + num2 + "?");
                type1 = 1;
                break;
            case 2:
                System.out.println("How much is " + num1 + " times " + num2 + "?");
                type1 = 2;
                break;
            case 3:
                System.out.println("How much is " + num1 + " minus " + num2 + "?");
                type1 = 3;
                break;
            case 4:
                System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                type1 = 4;
                break;
            case 5:
                int randomtype = rand.nextInt(4) + 1;
                switch (randomtype) {
                    case 1:
                        System.out.println("How much is " + num1 + " plus " + num2 + "?");
                        type1 = 1;
                        break;
                    case 2:
                        System.out.println("How much is " + num1 + " times " + num2 + "?");
                        type1 = 2;
                        break;
                    case 3:
                        System.out.println("How much is " + num1 + " minus " + num2 + "?");
                        type1 = 3;
                        break;
                    case 4:
                        System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                        type1 = 4;
                        break;
                }
                break;

        }
    }

    public static void menu() {
        Scanner scnr = new Scanner(System.in);
        {
            System.out.println("Please enter a difficulty:\n1:single digit\n2:two digit\n3:three digit\n4:four digit\n5:exit");
            difficulty = scnr.nextInt();
            if (difficulty != 5) {
                System.out.println("Please enter a arithmetic type:\n1:addition\n2:multiplication\n3:subtraction\n4:division\n5:mixture");
                type = scnr.nextInt();
            }
        }
    }

    public static void grade() {
        double pct;
        double Cor = numCorrect;
        double numr = numResponses;
        pct = Cor / numr;
        if (pct < 0.75) {
            System.out.println("Please ask your teacher for extra help.");
        } else {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
    }

    public static void main(String[] args) {
        //Scanner scnr = new Scanner(System.in);
        //int infinite = 0;
        while (difficulty != 5) {
            menu();
            if (difficulty != 5) {
                numResponses = 0;
                while (numResponses != 10) {
                    randNUM();
                    question();//asks question
                    math(); //runs math method
                    responses();
                    System.out.println(CompResponse);
                }
                grade();
            }
        }

    }
}