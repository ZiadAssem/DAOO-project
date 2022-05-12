package Task1;

public class InvertTriangle {
    static int moves=0;
    
    public static void invert(int n) {//n is the number of coins in each edge
        
        String[][] current = new String[20][20]; //creates starting coin array

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                current[i][j] = " ";
            }
            for (int m = n-1 - i; m < n; m++) {
                current[i][m] = "o ";
            }
        }


        String[][] goal = new String[20][20]; //creates goal array

        for (int i = 1; i < n+1; i++) {
            for (int j=0;j<i;j++){

                goal[i][j]=" ";
            }
            for(int m=i-1;m<n;m++){

                goal[i][m]="o ";
            }
            
        }

        for (int i=0;i<n;i++) { //prints the starting array
            for (int j = 0; j < n; j++) {
                System.out.print(current[i][j]);
            }
            System.out.println();
        }

        for (int i=0;i<n+1;i++){//each iteration
            for (int j=0;j<n+1;j++){
                if (goal[i][j]=="o "&& goal[i][j]!=current[i][j]){
                    current[i][j]="o ";
                    moves++;
                }
                if (current[i][j]=="o "&& goal[i][j]!=current[i][j]){
                    current[i][j]=" ";
                }
            }
        }

        for (int i=0;i<n+1;i++) {
            for (int j = 0; j < n+1; j++) {
                if (current[i][j]==null) {
                   System.out.print(" ");
                }else{
                    System.out.print(current[i][j]);
                }
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        InvertTriangle.invert(4);
        System.out.println(InvertTriangle.moves);
    }
}
