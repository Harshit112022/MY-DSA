import java.util.Scanner;


public class homeWork {
    public static void main(String[] args) {
//        maximumElement maximumElement = new maximumElement();
//        maximumElement.method();
//        reverseArray reverseArray = new reverseArray();
//        reverseArray.method();
//        findsum findsum = new findsum();
//        findsum.method();
//        removeDuplicate removeDuplicate = new removeDuplicate();
//        removeDuplicate.method();
//        largeAndsecondlarage largeAndsecondlarage = new largeAndsecondlarage();
//        largeAndsecondlarage.method();

    }
}

    //Find the maximum Element
    class maximumElement
    {
        void method()
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the number");
            int a = sc.nextInt();
            System.out.println("Enter the number");
            int b= sc.nextInt();
            System.out.println("Enter the number");
            int c=sc.nextInt();
            if(a>b && a>c)
                System.out.println("Frist number is max");
            else if (b>a && b>c)
                System.out.println("Second number is max");
            else
                System.out.println("Third number is max");
        }
    }
//    Reverse an array Array using while loop
class reverseArray
{
    void  method()
    {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] ;
        arr =new int[n];
        for(int i =0;i<arr.length;i++)
        {
            System.out.println("Enter the"+i+"Number");
            arr[i]=sc.nextInt();
        }
        int i =0;
        while(i<arr.length)
        {
            System.out.printf(arr[i]+" ");
            i++;
        }
        System.out.println();
        System.out.println("Array in Reverse order");
        int j =arr.length-1;
        while(0<=j)
        {
            System.out.printf(arr[j]+" ");
            j--;
        }

    }
}
//find sum of even and odd number in array
class findsum {
    void method() {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[];
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i+1)+ " Number");
            arr[i] = sc.nextInt();
        }
        int i = 0;
        while (i < arr.length) {
            System.out.printf(arr[i] + " ");
            i++;
        }
        int evenSum = 0;
        int oddSum = 0;
        System.out.println();
        for (int k = 0; k <arr.length; k++) {
            if (arr[k] > -1) {
                if (arr[k] % 2 == 0) {
                    evenSum = evenSum + arr[k];
                } else
                    oddSum = oddSum + arr[k];

            }
        }
        System.out.println("Addition of Even number" + evenSum);
        System.out.println("Addition of odd number " + oddSum);
    }
}
//Remove Duplicate from array
class removeDuplicate
{
    void method()
    {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[];
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i+1)+ " Number");
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array");
            int i = 0;
            while (i < arr.length) {
                System.out.printf(arr[i] + " ");
                i++;
            }
         int temp [] = new int[arr.length];
            int j =0;
            for (int k=0;k< arr.length-1;k++)
            {

                    if(arr[k]!=arr[k+1])
                    {
                        temp[j++]=arr[k];
                    }

            }
            temp[j++]=arr[arr.length-1];



        System.out.println();
        System.out.println("Removed Duplicate ");
        int m = 0;
        while (m < j+1) {
            System.out.printf(temp[m] + " ");
            m++;
        }

    }
}
