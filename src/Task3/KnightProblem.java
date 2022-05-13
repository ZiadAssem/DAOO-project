package Task3;

public class KnightProblem {
    static int moves = 0;
   static int dMoves = 0;

    public static void divide(char [][] chessboard,int n){
        if (n>2) {

            char[][] temp1 = {{'e', 'e', 'e'}, {'e', 'e', 'e'}, {'e', 'e', 'e'}, {'e', 'e', 'e'}};
            char[][] temp2 = {{'e', 'e', 'e'}, {'e', 'e', 'e'}, {'e', 'e', 'e'}, {'e', 'e', 'e'}};
            char[][] temp3 = {{'e', 'e', 'e'}, {'e', 'e', 'e'}, {'e', 'e', 'e'}, {'e', 'e', 'e'}};
            copyKnights(chessboard, temp1, 0, 0, 3, 1);
            copyKnights(chessboard, temp2, 0, 1, 3, 2);
            copyKnights(chessboard, temp3, 0, 2, 3, 0);
            n=n/3;
            divide(temp1,n);
            divide(temp2,n);
            divide(temp3,n);
            merge(temp1,temp2,temp3,chessboard);

            a1b3(chessboard);
        }else if(dMoves==0){

            a1d2(chessboard);

        }else if (dMoves==1){
            d3a2(chessboard);
        }else if(dMoves==2){
            d1a3(chessboard);
        }




    }

    public static void main(String[] args){
        char [][] chessboard= {{'b','b','b'},{'e','e','e'},{'e','e','e'},{'w','w','w'}};

        KnightProblem.divide(chessboard,6);
        System.out.println(KnightProblem.moves);

        for(int i=0;i<4;i++){
            for (int j = 0;j<3;j++){
                System.out.print(chessboard[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void move(char [][] chessboard,int i,int j){
        int x1 = (i-1)/3;
        int y1 = (i-1)%3;
        int x2 = (j-1)/3;
        int y2 = (j-1)%3;
        chessboard[x2][y2]=chessboard[x1][y1];
        chessboard[x1][y1]='e';
        moves++;
    }

    static void merge(char[][]temp1,char[][]temp2,char[][]temp3,char[][]chessboard){
        chessboard[0][0]=temp1[0][0];
        chessboard[0][1]=temp3[0][1];
        chessboard[3][0] = temp3[3][0];
        chessboard[3][1] = temp1[3][1];
        chessboard[3][2] = temp2[3][2];
        chessboard[1][2]=temp2[1][2];

    }
    static void a1d2(char[][] chessboard){
        move(chessboard,1,6);
        move(chessboard,6,7);
        move(chessboard,11,6);
        move(chessboard,6,1);
        move(chessboard,7,6);
        move(chessboard,6,11);
        dMoves++;
    }

    static void d3a2(char[][] chessboard){
        move(chessboard,12,7);
        move(chessboard,7,6);
        move(chessboard,2,7);
        move(chessboard,7,12);
        dMoves++;
    }

    static void d1a3(char[][] chessboard){
        move(chessboard,10,9);
        move(chessboard,9,2);
        move(chessboard,3,4);
        move(chessboard,4,9);
        move(chessboard,9,10);
        dMoves++;
    }

    static void a1b3(char[][] chessboard){
        move(chessboard,1,8);
        move(chessboard,8,3);
        move(chessboard,6,1);
    }

    static void copyKnights(char[][] chessboard,char[][] temp,int i1, int j1,int i2,int j2){
        temp[i1][j1] = chessboard[i1][j1];
        temp [i2][j2] = chessboard [i2][j2];
    }


   /* static void solve(char chessboard [][]){//we will solve each two knights at a time
        a1d2(chessboard);
        d3a2(chessboard);
        d1a3(chessboard);
        a1b3(chessboard);
        for(int i=0;i<4;i++){
            for (int j = 0;j<3;j++){
                System.out.print(chessboard[i][j]+" ");
            }
            System.out.println();
        }

    }
*/

}


