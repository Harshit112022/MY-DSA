public class largestAndsecond {
    public static void main(String[] args) {
        int max1,max2;
        max1=0;
        max2=0;
        int arr[]={10,20,30,40};
        int len =arr.length;
        for (int i =0;i<len;i++)
        {
            if(max1<arr[i])
            {
                max2 = max1;
                max1 = arr[i];
            }
            if(max2<arr[i]&&arr[i]<max1)
            {
                max2=arr[i];
            }

        }
        System.out.println(max1);
        System.out.println(max2);
    }

}
