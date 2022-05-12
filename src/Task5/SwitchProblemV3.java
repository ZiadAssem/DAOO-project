package Task5;

public class SwitchProblemV3 {
    static int moves=0;
    //static int beginGlob=0;
    static int cursor=0;
    public static void switchProblem(int[]x,int begin,int end) {

        if (end - begin == 1) {
            // while(x[begin]!=0&&begin!=x.length-2){

            if (x[end] == 0) {
                turn(x, end);
                turn(x, x.length - 1);
                if (end != x.length - 2) { //not the second to last bit
                    return;
                }

            }
            if ( end == x.length - 2 && x[x.length - 1] == 1&&cursor==0) {//is the second to last bit  && last bit =1
                turn(x, x.length - 1);
                cursor++;
            }

            turn(x, begin);
            turn(x, x.length - 1);

            if (end == x.length - 2) {
                turn(x, end);
                turn(x, x.length - 1);
            }

        }

        // }
        else if (end - begin == 0) {
            if (x[end] == x[x.length - 1] && x[end] == 0) {
                turn(x, x.length - 1);
            }
            turn(x, end);
            turn(x, x.length - 1);


            // turn(x,end);
            //turn(x, x.length-1);
            //turn(x,end);


        }else {
            if (end-begin ==2) {

                int q = end;
                switchProblem(x, q, end);
                switchProblem(x, begin, q - 1);
            } else {
                // while (x[begin] == 1) {
                //  int q = (int) Math.floor((begin + end) / 2);
                switchProblem(x, begin + 2, end);
                switchProblem(x, begin, begin + 1);
                // }

            }
            if (isNecessary(x, begin, x.length - 2)) {
                switchProblem(x, getI(x, begin, x.length - 2), x.length - 2);
            }
        }


    }





    public static void turn(int[] x, int i){//toggles the switch

        x[i]=Math.abs(x[i]-1);
        for(int j=0;j<x.length;j++){
           System.out.print(x[j]);
        }
        System.out.println("");
        moves++;
    }
    public static boolean isNecessary(int[]x,int begin,int end){//checks if there are 1's remaining
        for(int i=begin;i<=end;i++){
            if (x[i]==1){
                return true;
            }
        }
        return false;
    }
    public static int getI(int[]x,int begin,int end){ //gets the index of the 1st 1 in array
        for(int i=begin;i<=end;i++){
            if (x[i]==1){
                return i;
            }
        }
        return 0;
    }
}
