import java.util.Scanner;
class FrequencyInteger{
    public static int count(int[] arr , int ele){
        int val = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ele){
                val++;
            }
        }
        return val;
    }
    public static void main(String args[]){
        int i ;
        Scanner obj = new Scanner(System.in);
        System.out.println("Size of array:  ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements in array:  ");
        for(i = 0 ; i<n ; i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("Enter the elemnet:  ");
        int ele = obj.nextInt();
        System.out.println(ele+" : "+count(arr,ele));
    }
}
