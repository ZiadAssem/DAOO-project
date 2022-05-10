public class KnightProblem {
    static int moves = 0;
   static char [][] chessboard= {{'b','b','b'},{'e','e','e'},{'e','e','e'},{'w','w','w'}};
    static void solve(char chessboard [][]){//we will solve each two knights at a time
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
    public static void main(String[] args){
        KnightProblem.solve(KnightProblem.chessboard);
        System.out.println(KnightProblem.moves);
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
    static void a1d2(char[][] chessboard){
        move(chessboard,1,6);
        move(chessboard,6,7);
        move(chessboard,11,6);
        move(chessboard,6,1);
        move(chessboard,7,6);
        move(chessboard,6,11);
    }
    static void d3a2(char[][] chessboard){
        move(chessboard,12,7);
        move(chessboard,7,6);
        move(chessboard,2,7);
        move(chessboard,7,12);
    }
    static void d1a3(char[][] chessboard){
        move(chessboard,10,9);
        move(chessboard,9,2);
        move(chessboard,3,4);
        move(chessboard,4,9);
        move(chessboard,9,10);
    }
    static void a1b3(char[][] chessboard){
        move(chessboard,1,8);
        move(chessboard,8,3);
        move(chessboard,6,1);
    }
}

