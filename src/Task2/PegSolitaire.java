package Task2;
import java.util.Stack;

public class PegSolitaire {

    static Stack path = new Stack<>();

    static int lastMove = 0;
    static String move = "";
    static int choice = 0;

    static void solve(int [] x,int pegs) {

        if(pegs==1){
            System.out.println("Solution found");
        }
        else{
            removePeg(x,pegs);

        }

    }

    static void removePeg(int [] x , int pegs){

    }


    static void reverseForwardMove(int[] x, int i) {
        x[i] = 0;
        x[i - 1] = 1;
        x[i - 2] = 1;
    }

    static void reverseBackwardMove(int[] x, int i) {
        x[i] = 0;
        x[i + 1] = 1;
        x[i + 2] = 1;
    }


    static void moveForward(int[] x, int i) {
        x[i] = 0;
        x[i + 1] = 0;
        x[i + 2] = 1;
    }

    static void moveBackward(int[] x, int i) {
        x[i] = 0;
        x[i - 1] = 0;
        x[i - 2] = 1;
    }

    static boolean legalReverseForward(int[] x, int i) {
        return (i > 1 && x[i - 1] == 0 && x[i - 2] == 0);
    }

    static boolean legalReverseBackward(int[] x, int i) {
        return (i < x.length - 2 && x[i] == 1 && x[i + 1] == 0 && x[i + 2] == 0);

    }

    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 1, 1,1,1};





    }
}

/*
 static void solve(int[] x, int holes) {
        boolean loop = true;

        while (loop) {
            if (holes == 1) {

                System.out.println("Solution found !!");
                loop = false;
                while (!PegSolitaire.path.empty()) {
                    int z = (int) path.pop();
                    z++;
                    System.out.println(z);
                }
                System.exit(0);



            }else {
                for (int j = 0; j < x.length; j++) {
                    if (x[j] == 1) {

                        if (legalReverseBackward(x, j) && choice == 0) {
                            reverseBackwardMove(x, j);
                            lastMove = j + 2;
                            j = lastMove;
                            path.push(lastMove);
                            holes--;
                            move = "back";
                            solve(x, holes);


                        } else if (legalReverseForward(x, j)) {
                            reverseForwardMove(x, j);
                            lastMove = j - 2;
                            j = lastMove;
                            path.push(lastMove);
                            holes--;
                            move = "forward";
                            choice = 0;
                            solve(x, holes);

                        }
                    }
                }
                if (!path.empty()) {
                    path.remove(path.peek());
                    holes++;
                    if (move.equals("back")) {
                        moveBackward(x, lastMove);
                        solve(x, holes);

                    } else {
                        moveForward(x, lastMove);
                        choice = 1;
                        solve(x, holes);
                    }

                }
            }
        }
 */


   /* static boolean solve(int [] x,Stack path) {
        for (int i = 0; i < x.length; i++) {
            if (legalForward(x, i)) {
                moveForward(x, i);
                path.push(i);
                moves.push(0);
            } else if (legalBackward(x, i)) {
                moveBackward(x, i);
                path.push(i);
                moves.push(-0);

            }
            boolean found = solve(x,path);
            if (found) {
                return true;
            } else {
                int y = (int) moves.pop();
                int index = (int) path.pop();
                if (y == 0) {
                    reverseForwardMove(x, y);
                    i--;
                } else {
                    reverseBackwardMove(x, y);
                    i--;
                }
            }
        }
        return false;
    }*/