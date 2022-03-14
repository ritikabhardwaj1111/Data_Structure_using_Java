import java.util.Scanner;
class Rotate_array{
    public static void main(String args[]){
        int arr[] = {1 , 2 , 3 , 4 , 5};
        int arr0[] = new int[arr.length];
        Scanner obj = new Scanner(System.in);
        System.out.println("Number of roatation:    ");
        int n = obj.nextInt(); // number of rotation
        int rpoint = n ; // roating point
        int j = 0;
        while(rpoint < arr.length)
        {
            arr0[j] = arr[rpoint];
            j++;
            rpoint++;
        }
        rpoint = 0 ;
        while(rpoint < n)
        {
            arr0[j] = arr[rpoint];
            j++;
            rpoint++;
        }
        for(int k : arr0)
        {
            System.out.print(" "+k);
        }

    }
}