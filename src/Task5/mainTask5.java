package Task5;

import Task5.SwitchProblemV3;

public class mainTask5 {
    public static void main(String[] args) {
        int [] x = {1,1,1,1,1,1};
        SwitchProblemV3.switchProblem(x,0,x.length-2);
        for(int j=0;j<x.length;j++){
            System.out.print(x[j]);
        }
        System.out.println("");
        for (int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
        System.out.println("Number of switching is " + SwitchProblemV3.moves);
    }
}