
public class mainTask5 {
    public static void main(String[] args) {
        int [] x = {1,1,1,1,1,1,1};
        SwitchProblemV3.switchProblem(x,0,x.length-2);
        for (int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
        System.out.println("Number of switching is " + SwitchProblemV3.moves);
    }
}
