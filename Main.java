import java.util.Scanner;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        String[][] play = new String[3][3]; // declare an array .
        Scanner scanner = new Scanner(System.in);
        play[0][0] = "1";
        play[0][1] = "2";
        play[0][2] = "3";
        play[1][0] = "4";
        play[1][1] = "5";
        play[1][2] = "6";
        play[2][0] = "7";
        play[2][1] = "8";
        play[2][2] = "9";

        // user chose one round or three rounds.
        System.out.println("Enter number 1 the game One Round or number 3 for three rounds ..");
        int round = scanner.nextInt();
        if(round == 1) {
            oneRound(play);
        }else if (round == 3) {
            threeRounds(play);
        }

    }

    // here this method will play one round.
    public static void oneRound(String[][] play) {
        Scanner scanner = new Scanner(System.in);
        // user chose X or O .
        System.out.println("Chose X or O ...");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("X")) {
            playX(play);
        } else if (choice.equalsIgnoreCase("O")) {
            playO(play);
        }


    }

    // method user will play X with one round.
    public static void playX(String[][] play) {
        Scanner scX = new Scanner(System.in);
        // num variable will store number of position from user.
        String num;
        do {
            System.out.println("Enter number to chose position or Zero for exit ");
            num = scX.next();
            int randomNum = (int) (Math.random() * (9 - 1)) + 1; // computer will generate random number for chose position.
            String randomNumStr = String.valueOf(randomNum);

            for (int i = 0; i < play.length; i++) {

                if (play[0][i].equals(num) && (!randomNumStr.equals(num))) {
                    System.out.println("Enter X first Row ");
                    String user_choice = scX.next();
                    play[0][i] = user_choice;
                    for (int j = 0; j < play.length; j++) {

                        if (play[0][j].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                            play[0][j] = "O";
                        } else if (play[1][j].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                            play[1][j] = "O";
                        } else if (play[2][j].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                            play[2][j] = "O";
                        }

                    }

                } else if (play[1][i].equals(num) && (!randomNumStr.equals(num))) {
                    System.out.println("Enter X second Row ");
                    String user_choice = scX.next();
                    play[1][i] = user_choice;
                } else if (play[2][i].equals(num) && (!randomNumStr.equals(num))) {
                    System.out.println("Enter X third Row ");
                    String user_choice = scX.next();
                    play[2][i] = user_choice;
                }

            }

            for (int i = 0; i < play.length; i++) {

                if (play[0][i].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                    play[0][i] = "O";
                } else if (play[1][i].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                    play[1][i] = "O";
                } else if (play[2][i].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                    play[2][i] = "O";
                }

            }
            // print the table of game.
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < play.length; j++) {
                    System.out.print(play[i][j]);
                    if (j < play.length - 1) {
                        System.out.print(" | ");
                    }
                }
                System.out.println();
                if (i < play.length - 1) {
                    System.out.println("---------");
                }
            }


            // user is won by Row.
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[i][0].equalsIgnoreCase("X")) && (play[i][1].equalsIgnoreCase("X")) && (play[i][2].equalsIgnoreCase("X"))) {
                        System.out.println("You are won! ");
                        System.exit(0);
                    }
                }

            }

            // user is won Column
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[0][i].equalsIgnoreCase("X")) && (play[0][i].equalsIgnoreCase("X")) && (play[2][i].equalsIgnoreCase("X"))) {
                        System.out.println("You are won! ");
                        System.exit(0);
                    }
                }

            }

            // user is won by Diagonal.
            if ((play[0][0].equalsIgnoreCase("X")) && (play[1][1].equalsIgnoreCase("X")) && (play[2][2].equalsIgnoreCase("X"))) {
                System.out.println("You are won! ");
                System.exit(0);
            } else if ((play[0][2].equalsIgnoreCase("X")) && (play[1][1].equalsIgnoreCase("X")) && (play[2][0].equalsIgnoreCase("X"))) {
                System.out.println("You are won! ");
                System.exit(0);
            }


            // Computer is won Column
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[0][i].equalsIgnoreCase("O")) && (play[0][i].equalsIgnoreCase("O")) && (play[2][i].equalsIgnoreCase("O"))) {
                        System.out.println("Computer is won! ");
                        System.exit(0);
                    }
                }

            }


            // Computer is won by Row.
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[i][0].equalsIgnoreCase("O")) && (play[i][1].equalsIgnoreCase("O")) && (play[i][2].equalsIgnoreCase("O"))) {
                        System.out.println("Computer is won! ");
                        System.exit(0);
                    }
                }
            }

            // Computer is won by Diagonal.
            if ((play[0][0].equalsIgnoreCase("O")) && (play[1][1].equalsIgnoreCase("O")) && (play[2][2].equalsIgnoreCase("O"))) {
                System.out.println("Computer is won! ");
                System.exit(0);
            } else if ((play[0][2].equalsIgnoreCase("O")) && (play[1][1].equalsIgnoreCase("O")) && (play[2][0].equalsIgnoreCase("O"))) {
                System.out.println("Computer is won! ");
                System.exit(0);
            }


        } while (!Objects.equals(num, "0"));
    }

    // method user will play O with one round.
    public static void playO(String[][] play) {

        Scanner scO = new Scanner(System.in);
        String num;
        do {
            System.out.println("Enter number to chose position or Zero for exit ");
            num = scO.next();
            int randomNum = (int) (Math.random() * (9 - 1)) + 1;
            String randomNumStr = String.valueOf(randomNum);

            for (int i = 0; i < play.length; i++) {

                if (play[0][i].equals(num) && (!randomNumStr.equals(num))) {
                    System.out.println("Enter O first Row ");
                    String user_choice = scO.next();
                    play[0][i] = user_choice;
                    for (int j = 0; j < play.length; j++) {

                        if (play[0][j].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                            play[0][j] = "X";
                        } else if (play[1][j].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                            play[1][j] = "X";
                        } else if (play[2][j].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                            play[2][j] = "X";
                        }

                    }

                } else if (play[1][i].equals(num) && (!randomNumStr.equals(num))) {
                    System.out.println("Enter O second Row ");
                    String user_choice = scO.next();
                    play[1][i] = user_choice;
                } else if (play[2][i].equals(num) && (!randomNumStr.equals(num))) {
                    System.out.println("Enter O third Row ");
                    String user_choice = scO.next();
                    play[2][i] = user_choice;
                }

            }

            for (int i = 0; i < play.length; i++) {

                if (play[0][i].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                    play[0][i] = "X";
                } else if (play[1][i].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                    play[1][i] = "X";
                } else if (play[2][i].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                    play[2][i] = "X";
                }

            }

            // print the table of game.
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < play.length; j++) {
                    System.out.print(play[i][j]);
                    if (j < play.length - 1) {
                        System.out.print(" | ");
                    }
                }
                System.out.println();
                if (i < play.length - 1) {
                    System.out.println("---------");
                }
            }


            // user is won by Row.
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[i][0].equalsIgnoreCase("O")) && (play[i][1].equalsIgnoreCase("O")) && (play[i][2].equalsIgnoreCase("O"))) {
                        System.out.println("You are won! ");
                        System.exit(0);
                    }
                }

            }

            // user is won Column
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[0][i].equalsIgnoreCase("O")) && (play[1][i].equalsIgnoreCase("O")) && (play[2][i].equalsIgnoreCase("O"))) {
                        System.out.println("You are won! ");
                        System.exit(0);
                    }
                }

            }

            // user is won by Diagonal.
            if ((play[0][0].equalsIgnoreCase("O")) && (play[1][1].equalsIgnoreCase("O")) && (play[2][2].equalsIgnoreCase("O"))) {
                System.out.println("You are won! ");
                System.exit(0);
            } else if ((play[0][2].equalsIgnoreCase("O")) && (play[1][1].equalsIgnoreCase("O")) && (play[2][0].equalsIgnoreCase("O"))) {
                System.out.println("You are won! ");
                System.exit(0);
            }


            // Computer is won Column
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[0][i].equalsIgnoreCase("X")) && (play[1][i].equalsIgnoreCase("X")) && (play[2][i].equalsIgnoreCase("X"))) {
                        System.out.println("Computer is won! ");
                        System.exit(0);
                    }
                }

            }

            // Computer is won by Row.
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[i][0].equalsIgnoreCase("X")) && (play[i][1].equalsIgnoreCase("X")) && (play[i][2].equalsIgnoreCase("X"))) {
                        System.out.println("Computer is won! ");
                        System.exit(0);
                    }
                }
            }

            // Computer is won by Diagonal.
            if ((play[0][0].equalsIgnoreCase("X")) && (play[1][1].equalsIgnoreCase("X")) && (play[2][2].equalsIgnoreCase("X"))) {
                System.out.println("Computer is won! ");
                System.exit(0);
            } else if ((play[0][2].equalsIgnoreCase("X")) && (play[1][1].equalsIgnoreCase("X")) && (play[2][0].equalsIgnoreCase("X"))) {
                System.out.println("Computer is won! ");
                System.exit(0);
            }


        } while (!Objects.equals(num, "0"));

    }



    // here method if you will play with three rounds.
    public static void threeRounds(String[][] play) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose X or O ...");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("X")) {
            playXThreeRounds(play);
        } else if (choice.equalsIgnoreCase("O")) {
            playOThreeRounds(play);
        }

    }

    public static void playXThreeRounds(String[][] play) {
        Scanner scX = new Scanner(System.in);
        String num;
        do {
            System.out.println("Enter number to chose position or Zero for exit ");
            num = scX.next();
            int randomNum = (int) (Math.random() * (9 - 1)) + 1;
            String randomNumStr = String.valueOf(randomNum);

            for (int i = 0; i < play.length; i++) {
                //5
                if (play[0][i].equals(num) && (!randomNumStr.equals(num))) {//1,5
                    System.out.println("Enter X first Row ");
                    String user_choice = scX.next();
                    play[0][i] = user_choice;
                    for (int j = 0; j < play.length; j++) {

                        if (play[0][j].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                            play[0][j] = "O";
                        } else if (play[1][j].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                            play[1][j] = "O";
                        } else if (play[2][j].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                            play[2][j] = "O";
                        }

                    }

                } else if (play[1][i].equals(num) && (!randomNumStr.equals(num))) {
                    System.out.println("Enter X second Row ");
                    String user_choice = scX.next();
                    play[1][i] = user_choice;
                } else if (play[2][i].equals(num) && (!randomNumStr.equals(num))) {
                    System.out.println("Enter X third Row ");
                    String user_choice = scX.next();
                    play[2][i] = user_choice;
                }

            }

            for (int i = 0; i < play.length; i++) {

                if (play[0][i].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                    play[0][i] = "O";
                } else if (play[1][i].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                    play[1][i] = "O";
                } else if (play[2][i].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                    play[2][i] = "O";
                }

            }

            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < play.length; j++) {
                    System.out.print(play[i][j]);
                    if (j < play.length - 1) {
                        System.out.print(" | ");
                    }
                }
                System.out.println();
                if (i < play.length - 1) {
                    System.out.println("---------");
                }
            }

            int winX =0;
            int winO =0;
            // user is won by Row.
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[i][0].equalsIgnoreCase("X")) && (play[i][1].equalsIgnoreCase("X")) && (play[i][2].equalsIgnoreCase("X"))) {
                        System.out.println("You are won By Row! ");
                        winX++;
                        break;

                    }
                }


            }

            // user is won Column
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[0][i].equalsIgnoreCase("X")) && (play[0][i].equalsIgnoreCase("X")) && (play[2][i].equalsIgnoreCase("X"))) {
                        System.out.println("You are won By Column! ");
                        winX++;
                       break;
                    }
                }

            }

            // user is won by Diagonal.
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {

                    if ((play[0][0].equalsIgnoreCase("X")) && (play[1][1].equalsIgnoreCase("X")) && (play[2][2].equalsIgnoreCase("X"))) {
                        System.out.println("You are won By Diagonal! ");
                        winX++;
                        break;

                    }
                }

            }

            // user is won by Diagonal.
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {

                    if ((play[0][2].equalsIgnoreCase("X")) && (play[1][1].equalsIgnoreCase("X")) && (play[2][0].equalsIgnoreCase("X"))) {
                        System.out.println("You are won By Diagonal! ");
                        winX++;
                        break;

                    }
                }

            }


            // Computer is won Column
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[0][i].equalsIgnoreCase("O")) && (play[1][i].equalsIgnoreCase("O")) && (play[2][i].equalsIgnoreCase("O"))) {
                        System.out.println("Computer is won By Column! ");
                        winO++;
                        break;
                    }
                }

            }


            // Computer is won by Row.
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[i][0].equalsIgnoreCase("O")) && (play[i][1].equalsIgnoreCase("O")) && (play[i][2].equalsIgnoreCase("O"))) {
                        System.out.println("Computer is won By Row! ");
                        winO++;
                        break;
                    }
                }
            }

            // Computer is won by Diagonal.
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[0][0].equalsIgnoreCase("O")) && (play[1][1].equalsIgnoreCase("O")) && (play[2][2].equalsIgnoreCase("O"))) {
                        System.out.println("Computer is won By Diagonal! ");
                        winO++;
                        break;
                    } else if ((play[0][2].equalsIgnoreCase("O")) && (play[1][1].equalsIgnoreCase("O")) && (play[2][0].equalsIgnoreCase("O"))) {
                        System.out.println("Computer is won By Diagonal! ");
                        winO++;
                        break;
                    }
                }
            }

            // this method check from number of win times.
            reRound(play, winX, winO);


        } while (!Objects.equals(num, "0"));
    }



    public static void playOThreeRounds(String[][] play){
        Scanner scO = new Scanner(System.in);
        String num;
        do {
            System.out.println("Enter number to chose position or Zero for exit ");
            num = scO.next();
            int randomNum = (int) (Math.random() * (9 - 1)) + 1;
            String randomNumStr = String.valueOf(randomNum);

            for (int i = 0; i < play.length; i++) {

                if (play[0][i].equals(num) && (!randomNumStr.equals(num))) {
                    System.out.println("Enter O first Row ");
                    String user_choice = scO.next();
                    play[0][i] = user_choice;
                    for (int j = 0; j < play.length; j++) {

                        if (play[0][j].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                            play[0][j] = "X";
                        } else if (play[1][j].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                            play[1][j] = "X";
                        } else if (play[2][j].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                            play[2][j] = "X";
                        }

                    }

                } else if (play[1][i].equals(num) && (!randomNumStr.equals(num))) {
                    System.out.println("Enter O second Row ");
                    String user_choice = scO.next();
                    play[1][i] = user_choice;
                } else if (play[2][i].equals(num) && (!randomNumStr.equals(num))) {
                    System.out.println("Enter O third Row ");
                    String user_choice = scO.next();
                    play[2][i] = user_choice;
                }

            }

            for (int i = 0; i < play.length; i++) {

                if (play[0][i].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                    play[0][i] = "X";
                } else if (play[1][i].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                    play[1][i] = "X";
                } else if (play[2][i].equals(randomNumStr) && (!randomNumStr.equals(num))) {
                    play[2][i] = "X";
                }

            }

            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < play.length; j++) {
                    System.out.print(play[i][j]);
                    if (j < play.length - 1) {
                        System.out.print(" | ");
                    }
                }
                System.out.println();
                if (i < play.length - 1) {
                    System.out.println("---------");
                }
            }

            int winX =0;
            int winO =0;
            // user is won by Row.
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[i][0].equalsIgnoreCase("O")) && (play[i][1].equalsIgnoreCase("O")) && (play[i][2].equalsIgnoreCase("O"))) {
                        System.out.println("You are won By Row! ");
                        winO++;
                        break;

                    }
                }

            }

            // user is won Column
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[0][i].equalsIgnoreCase("O")) && (play[1][i].equalsIgnoreCase("O")) && (play[2][i].equalsIgnoreCase("O"))) {
                        System.out.println("You are won By Column! ");
                        winO++;
                        break;
                    }
                }

            }

            // user is won by Diagonal.
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {

                    if ((play[0][0].equalsIgnoreCase("O")) && (play[1][1].equalsIgnoreCase("O")) && (play[2][2].equalsIgnoreCase("O"))) {
                        System.out.println("You are won By Diagonal! ");
                        winO++;
                        break;

                    }
                }

            }

            // Computer is won Column
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[0][i].equalsIgnoreCase("X")) && (play[1][i].equalsIgnoreCase("X")) && (play[2][i].equalsIgnoreCase("X"))) {
                        System.out.println("Computer is won By Column! ");
                        winX++;
                        break;
                    }
                }

            }


            // Computer is won by Row.
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[i][0].equalsIgnoreCase("X")) && (play[i][1].equalsIgnoreCase("X")) && (play[i][2].equalsIgnoreCase("X"))) {
                        System.out.println("Computer is won By Row! ");
                        winX++;
                        break;
                    }
                }
            }

            // Computer is won by Diagonal.
            for (int i = 0; i < play.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if ((play[0][0].equalsIgnoreCase("X")) && (play[1][1].equalsIgnoreCase("X")) && (play[2][2].equalsIgnoreCase("X"))) {
                        System.out.println("Computer is won By Diagonal! ");
                        winX++;
                        break;
                    } else if ((play[0][2].equalsIgnoreCase("X")) && (play[1][1].equalsIgnoreCase("X")) && (play[2][0].equalsIgnoreCase("X"))) {
                        System.out.println("Computer is won By Diagonal! ");
                        winX++;
                        break;
                    }
                }
            }

            // this method check from number of win times.
            reRound(play, winO, winX);


        } while (!Objects.equals(num, "0"));
    }

    public static void reRound(String[][] play, int winX, int winO) {
        if(winX == 1){
            play[0][0] = "1";
            play[0][1] = "2";
            play[0][2] = "3";
            play[1][0] = "4";
            play[1][1] = "5";
            play[1][2] = "6";
            play[2][0] = "7";
            play[2][1] = "8";
            play[2][2] = "9";
        }

        if(winX >= 2){
            System.out.println("Finish round, You are won!");
            System.exit(0);
        }else if(winO >= 2){
            System.out.println("Finish round, Computer won!");
            System.exit(0);
        }
    }
}