import java.util.Scanner;

public class Sorted {
    private static boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
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

        boolean ans=isSorted(arr);
        System.out.println("Ans : " + ans);

    }  
}
