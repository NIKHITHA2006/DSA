import java.util.Scanner;

public class CelebrityProblem {

    static int[][] matrix;

    static boolean knows(int a, int b)
    {
        return matrix[a][b] == 1;
    }

    static int findCelebrity(int n)
    {
        int candidate = 0;

        for(int i = 1; i < n; i++)
        {
            if(knows(candidate, i))
            {
                candidate = i;
            }
        }

        for(int i = 0; i < n; i++)
        {
            if(i == candidate)
                continue;

            if(knows(candidate, i) || !knows(i, candidate))
            {
                return -1;
            }
        }

        return candidate;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of people:");
        int n = sc.nextInt();

        matrix = new int[n][n];

        System.out.println("Enter the matrix:");

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        int result = findCelebrity(n);

        if(result == -1)
            System.out.println("No Celebrity");
        else
            System.out.println("Celebrity is person: " + result);
    }
}