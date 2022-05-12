package Task6;
//using dynamic programing
class Q6 {
    static int moves=0;
    private static void hanoiTower(int n, int k, String Peg_from, String temp_peg, String Peg_to) {
        if (n == 0) {
            System.out.println();

            return;
        }
        hanoiTower(n - 1, k, Peg_from, Peg_to, temp_peg);
        System.out.print("Move disc " + (n + k) + " from " + Peg_from + " to " + Peg_to);
        hanoiTower(n - 1, k, temp_peg, Peg_from, Peg_to);
    }
    //we will use hanoiTower Algorithm to help us to solve the problem as hanoiTower uses 3 pegs and in our problem
    //we will use 4 pegs
    private static void hanoiTower4(int n, String Peg_from, String temp_peg, String Peg_to, String temp_peg2) {
        int z = (int) (n + 1 - Math.round(Math.sqrt(2 * n + 1)));
        //calculation of the additional peg formula.
        if (z == 0){
            System.out.println("Move disc " + 1  + " from " + Peg_from + " to " + Peg_to);

            return;
        }
        hanoiTower4(z, Peg_from , Peg_to, temp_peg , temp_peg2);
        hanoiTower(n-z,z, Peg_from, temp_peg2, Peg_to);
        hanoiTower4(z,temp_peg,Peg_from,Peg_to,temp_peg2);
    }
    public static void main(String[] args) {
        int n = 8;
        hanoiTower4(n, "Peg1", "Peg2", "Peg3", "Peg4");
        System.out.println(Q6.moves);
    }
}
