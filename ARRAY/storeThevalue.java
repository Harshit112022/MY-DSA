//take two array arr1[] and arr2[] store value from arr1[] to arr2[] in reverse order
public class storeThevalue {
    public static void main(String[] args) {

        int arr1[]={30,40,50,60,70,80};
        int len=arr1.length;
        int arr2[]=new int[len];
        int j =0;
        for(int i=arr1.length-1;i>0;i--)
        {
            arr2[j++]=arr1[i];
        }
        for(int i=0;i<j;i++)
        {
            System.out.printf(" "+arr2[i]);
        }
    }
}
