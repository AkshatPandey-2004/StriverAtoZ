import java.util.Scanner;

public class SecondLargest {
    private static int Snd_Lar(int[] arr){
        int max=-1;
        int max2=-1;       
        for(int i: arr){
            if(i>max){
                max2=max;
                max=i;
            }
            else if(i<max && i>max2){
                max2=i;
            }
        }
       return max2;
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

        int ans=Snd_Lar(arr);
        System.out.println("2nd Max Value : " + ans);

    }    
}
