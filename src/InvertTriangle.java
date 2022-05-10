public class InvertTriangle {
    public static void invert() {
        String[][] x = new String[5][4];
        for (int i = 0; i < 4; i++) {
            for (int j=0;j<4-i;j++){

                x[i][j]=" ";
            }
            for(int m=3-i;m<4;m++){

                x[i][m]="o ";
            }
            System.out.println("");
        }

        for (int i = 0; i < 4; i++) {
            for (int j=0;j<4;j++) {
                System.out.print(x[i][j]);
            }
            System.out.println("");
        }


        String[][] y = new String[5][5];
        for (int i = 1; i < 5; i++) {
            for (int j=0;j<i;j++){

                y[i][j]=" ";
            }
            for(int m=i-1;m<4;m++){

                y[i][m]="o ";
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j=0;j<4;j++) {
                System.out.print(y[i][j]);
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {


    }
}
