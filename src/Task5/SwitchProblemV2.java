package Task5;

public class SwitchProblemV2 {
    static int moves=0;
    public static void divide(int[] x,int i,int j) {
        if (i +1<=j ) {
            int q = (i + j) / 2;
            divide(x, q+1, j);
            divide(x, i, q);
            //traverse(x, q+1, j);
            traverse(x,i,j);
        }


    }

    public static void traverse(int[]x,int i,int j){
        int q =(i+j)/2;
        if(j-i<=2) {
            if (x[j] == 0&&x[i]==1) {
                turn(x, j);
                turn(x,i);
                moves+=2;
            }

           turn(x, j);
            moves ++;
        }else
            traverse(x, q + 1, j);


    }

    public static void on(int[] x,int i){
        if (x.length>i+2){
            ready(x,i+2);
        }
        if (x.length>i+1){
        one(x,i+1);
        off(x,i+2);
        }
        one(x,i);

    }
    public static void ready(int[]x,int i){
        if (x.length>i+2){
            off(x,i+2);
        }
        one(x,i);
        if (x.length>i+1){
            zero(x,i+1);
        }
    }
    public static void off(int[]x,int i){
        if (x.length>i+2){
           zero(x,i+2);
        }
        zero(x,i);
        if (x.length>i+2){
            zero(x,i+2);
        }
        if (x.length>i+1){
            ready(x,i);
        }
        zero(x,i+1);
    }
    public static void one(int[]x,int i){
        x[i]=1;
        moves++;
    }
    public static void zero(int[]x,int i){
        x[i]=0;
        moves++;
    }


    public static void turn(int[] x, int i){

         x[i]=Math.abs(x[i]-1);
    }

    public static boolean isCapable(int[] x, int i){
        if(i==x.length-1){
            return true;
        }
        else if(x[i+1]==1){
            for (int j=i+2;j<x.length;j++){
                if (x[j]==1){
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }

}
