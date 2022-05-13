package Task4;

import Task3.KnightProblem;

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
            while (vector.get(i) >= 2)
            {
                iterations++;
                vector.set(i, (vector.get(i) - 2));
                if (vector.size() > i + 1) //avoids out of bounds exception
                {
                    vector.set(i + 1, (vector.get(i + 1) + 1));
                }
                else vector.add(1);
            }
        }

        for (Integer integer : vector) {
            System.out.println(integer);
        }
        System.out.println("Number of iterations equals " + iterations);
    }
    public static void main(String[] args) {
        CoinProblem.solve();
    }
    }
