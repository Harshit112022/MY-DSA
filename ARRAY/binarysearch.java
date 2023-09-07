package ARRAY;
import java.util.Scanner;
public class binarysearch {
    public static void main(String[] args) {
        int arr[]={12,53,89,345,876,521};
        int lec = arr.length;
        for(int i =0;i<arr.length;i++)
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        for(int k=0;k<arr.length;k++)
        {
            System.out.printf(arr[k]+" ");
        }
        int mid;
        int low=0;
        int high = arr.length;
        System.out.println();
        System.out.println("Enter the iteam");
        Scanner sc = new Scanner(System.in);
        int iteam=sc.nextInt();
        boolean flage = false;
        while(low<=high)
        {
            mid =( low + high)/2;
            if (arr[mid]==iteam)
            {
                flage =true;
                break;
            }
            else if (arr[mid]>iteam)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        if (flage)
        {
            System.out.println("Enterd number is found");
        }
        else
        {
            System.out.println("Enterd number is not found");
        }

    }
}
