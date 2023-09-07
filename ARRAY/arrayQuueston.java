public class arrayQuueston {
    public static void main(String[] args) {
//        System.out.println("Hello");
    int arr[]={22,33,56,44,55};
    int len = arr.length;
    int min= -999;
    int min2=0;
    for (int i=0;i<len;i++)
    {
        if(min<arr[i])
        {

            min = arr[i];
            
        }

    }
        System.out.println("laragest number"+min);

    }
}
