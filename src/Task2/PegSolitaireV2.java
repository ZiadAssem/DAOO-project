package Task2;

import java.util.HashMap;
import java.util.Scanner;

public class PegSolitaireV2 {
   static int choice = 0;

    public static HashMap<String, Integer> hm;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many cases do you want to try");
        int cases = in.nextInt();
        System.out.println();

        for (int i = 0; i < cases; i++) {
             int min=0;
            hm = new HashMap<>();
            System.out.println("Enter the setup of the board with cavities even and bigger than 2");
            System.out.println("peg is denoted with letter o and empty cavity is with a dash -");
            System.out.println("For Example: o-oooooooo");
            StringBuilder board = new StringBuilder(in.next());
            if (board.length()<3||board.length()%2>0){
                System.out.println("Please try a board of even number and bigger than 2 and try again\n");

                continue;
            }
            boolean firstHalf=false;
           if(choice==0){
            for(int j=0;j<(board.length()/2)-1;j++) {
                if (board.charAt(i) == '-') {
                    firstHalf = true;
                    choice = 1;
                    break;

                }

            }
           }
            if(firstHalf){
                min=forwardSolve(board);
            }else{
                min = backwardSolve(board);
            }

            System.out.println(min);
            System.out.println(board);
        }

    }

    public static int backwardSolve(StringBuilder board){
        int min = 0;
        if (hm.containsKey(board.toString())) {
            return hm.get(board.toString());
        }

        for (int i = 0; i < board.length(); i++) {

            if (board.charAt(i) == 'o') {
                min++;
            }

        }
        for (int i = board.length() - 1; i > 1; i--) {
            if (board.charAt(i) == 'o' && board.charAt(i - 1) == 'o' && board.charAt(i - 2) == '-') {
                board.setCharAt(i, '-');
                board.setCharAt(i - 1, '-');
                board.setCharAt(i - 2, 'o');
                int returnValue = backwardSolve(board);
                if (returnValue < min) {
                    min = returnValue;
                }
             /*
                board.setCharAt(i, 'o');

                board.setCharAt(i - 1, 'o');
                board.setCharAt(i - 2, '-');
                */

            }

        }
        for (int i = 0; i < board.length() - 2; i++) {
            if (board.charAt(i) == 'o' && board.charAt(i + 1) == 'o' && board.charAt(i + 2) == '-') {
                board.setCharAt(i, '-');
                board.setCharAt(i + 1, '-');
                board.setCharAt(i + 2, 'o');
                int returnValue = backwardSolve(board);
                if (returnValue < min) {
                    min = returnValue;
                }
                //board.setCharAt(i, 'o');
                //board.setCharAt(i + 1, 'o');
                //board.setCharAt(i + 2, '-');
            }
        }


            hm.put(board.toString(), min);

        return min;
    }


    public static int forwardSolve(StringBuilder board) {
        int min = 0;
        if (hm.containsKey(board.toString())) {
            return hm.get(board.toString());
        }

        for (int i = 0; i < board.length(); i++) {

            if (board.charAt(i) == 'o') {
                min++;
            }

        }
        for (int i = 0; i < board.length() - 2; i++) {
            if (board.charAt(i) == 'o' && board.charAt(i + 1) == 'o' && board.charAt(i + 2) == '-') {
                board.setCharAt(i, '-');
                board.setCharAt(i + 1, '-');
                board.setCharAt(i + 2, 'o');
                int returnValue = forwardSolve(board);
                if (returnValue < min) {
                    min = returnValue;
                }
                //board.setCharAt(i, 'o');
                //board.setCharAt(i + 1, 'o');
                //board.setCharAt(i + 2, '-');
            }
        }
        for (int i = board.length() - 1; i > 1; i--) {
            if (board.charAt(i) == 'o' && board.charAt(i - 1) == 'o' && board.charAt(i - 2) == '-') {
                board.setCharAt(i, '-');
                board.setCharAt(i - 1, '-');
                board.setCharAt(i - 2, 'o');
                int returnValue = forwardSolve(board);
                if (returnValue < min) {
                    min = returnValue;
                }
             /*
                board.setCharAt(i, 'o');

                board.setCharAt(i - 1, 'o');
                board.setCharAt(i - 2, '-');
                */

            }

        }
        if(!hm.containsKey(board.toString())) {
            hm.put(board.toString(), min);
        }
        return min;
    }

}
