import java.util.Scanner;
public class CompressedMean{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    if(k > n){
    System.out.println("Invalid window size");
    return;
}
    int sum=0;
   for(int i=0;i<k;i++)
   {
    sum+=arr[i];

   }
   System.out.print((double)sum/k+" ");
   for(int i=k;i<n;i++)
   {
    sum=sum+arr[i]-arr[i-k];
    System.out.print((double)sum/k+" ");
   }
    }
  }
