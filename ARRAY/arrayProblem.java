package Array;
import java.util.Scanner;
public class arrayProblem {
    public static void main(String[] args) {
    int arr[];//declaration
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();
        arr=new int [n];//initialisation
//        int arr2[] = new int [10];
//        System.out.println(arr[3]);
//        System.out.println(arr);
//        System.out.println(a rr2);
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the number= "+" "+ i+1);
            arr[i]=input.nextInt();
        }
        System.out.println("-----------------------------------------");
        for (int j =0;j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }
    }
}
