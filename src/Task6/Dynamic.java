package Task6;
class Main {
    int counter;
    static void RevePuzzle(int n, String Peg_from, String Peg_to, String temp_peg, String temp_peg2, int counter) {
        counter += 3;
        if (n == 0) return;
        if (n == 1) {
            System.out.println("Move disc " + n + " from " + Peg_from + " to " + Peg_to);
            counter = counter - 2;
            return;
        }
        RevePuzzle(n - 2, Peg_from, temp_peg, temp_peg2, Peg_to, 0);
        System.out.println("Move disc " + (n - 1) + " from " + Peg_from + " to " + temp_peg2);
        System.out.println("Move disc " + n + " from " + Peg_from + " to " + Peg_to);
        System.out.println("Move disc " + (n - 1) + " from " + temp_peg2 + " to " + Peg_to);
        RevePuzzle(n - 2, temp_peg, Peg_to, Peg_from, temp_peg2, 0);
    }

    public static void main(String[] args) {
        int n = 8;
        RevePuzzle(n, "Peg1", "Peg2", "Peg3", "Peg4", 0);
    }
}

