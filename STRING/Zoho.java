import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        String[] a1=a.split("\\s++");
        String[] b1=b.split("\\s++");
        String[] c1=c.split("\\s++");
        for(int i=0;i<=a.length()-3;i++){
            String s=a1[i]+" "+a1[i+1]+" "+a1[i+2];
            if(b.contains(s) && c.contains(s)){
                System.out.println(s);
                break;
            }
        }
    }
}