
import java.util.*;

public class Main {

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones)
        {
            pq.add(stone);
        }

        while(pq.size() > 1)
        {
            int y = pq.poll(); 
            int x = pq.poll(); 

            if(y != x)
            {
                pq.add(y - x);
            }
        }

        if(pq.isEmpty())
            return 0;
        else
            return pq.poll();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] stones = new int[n];

        for(int i = 0; i < n; i++)
        {
            stones[i] = sc.nextInt();
        }

        int result = lastStoneWeight(stones);

        System.out.println(result);
    }
}
