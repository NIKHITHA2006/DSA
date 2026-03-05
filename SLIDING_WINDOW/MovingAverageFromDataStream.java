import java.util.Scanner;

public class MovingAverageFromDataStream {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   
        int k = sc.nextInt();   

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){

            double sum = 0;
            int count = 0;

            for(int j = i; j >= 0 && j > i - k; j--){
                sum += arr[j];
                count++;
            }

            System.out.print(sum / count + " ");
        }
    }
}