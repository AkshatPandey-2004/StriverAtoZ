
import java.util.Scanner;


public class Largest{
    private static int Lar(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i: arr){
            max=(i>max)?i:max;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Array Size User Input
        System.out.print("Enter Size of Array :");
        int n=sc.nextInt();
        // Array Declare
        int[] arr=new int[n];
        // Array Element Insert
        for(int i=0;i<n;i++){
            System.out.print("Enter Element at index "+ i + ":");
            arr[i]=sc.nextInt();
        }

        int ans=Lar(arr);
        System.out.println("Max Value : " + ans);

    }
}