public class InvertTriangle {
    static int moves=0;
    
    public static void invert() {
        
        String[][] current = new String[5][5]; //creates starting coin array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {

                current[i][j] = " ";
            }
            for (int m = 3 - i; m < 4; m++) {
                current[i][m] = "o ";
            }
        }


        String[][] goal = new String[5][5]; //creates goal array
        for (int i = 1; i < 5; i++) {
            for (int j=0;j<i;j++){

                goal[i][j]=" ";
            }
            for(int m=i-1;m<4;m++){

                goal[i][m]="o ";
            }
            
        }
        for (int i=0;i<4;i++) { //prints the starting array
            for (int j = 0; j < 4; j++) {
                System.out.print(current[i][j]);
            }
            System.out.println();
        }

        for (int i=0;i<5;i++){//each iteration
            for (int j=0;j<5;j++){
                if (goal[i][j]=="o "&& goal[i][j]!=current[i][j]){
                    current[i][j]="o ";
                    moves++;
                }
                if (current[i][j]=="o "&& goal[i][j]!=current[i][j]){
                    current[i][j]=" ";
                }
            }
        }
        for (int i=0;i<5;i++) {
            for (int j = 0; j < 4; j++) {
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
        InvertTriangle.invert();
        System.out.println(InvertTriangle.moves);
    }
}
