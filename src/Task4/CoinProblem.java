package Task4;



import java.util.Scanner;
import java.util.Vector;

public class CoinProblem
{

    public static void solve()
    {    int iterations = 0;
        System.out.println("Enter the value of coins ");
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        Vector<Integer> vector = new Vector<>();
        vector.add(x);

        for (int i = 0; i < vector.size(); i++)
        {
            if (vector.get(i) >= 2)
            {
                int old = vector.get(i);
                int next = old/2;
                old=old-2*next;
                vector.set(i,old);
                vector.add(next);
                iterations++;

            }
        }
        int i=1;
        for (Integer integer : vector) {
            System.out.println("Box number "+ i+ " equals "+integer);
            i++;
        }
        System.out.println("Number of iterations equals " + iterations);
    }
    public static void main(String[] args) {
        CoinProblem.solve();
    }
    }
