package ARRAY;

public class twoSum {
    public static void main(String[] args) {
        int arr[]={1,3,45,6,8,9,5};
        int target = 45;
        boolean flage = false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++)
                if(arr[i]+arr[j]==target)
                {
                    System.out.printf("[" +i+ "," +j+ "]");
                    flage = true;
                    break;
                }
        }
        if (flage)
        {
            ;
        }
        else
            System.out.println("not found");
    }
}
