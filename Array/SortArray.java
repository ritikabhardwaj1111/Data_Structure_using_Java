import java.util.Scanner;

class SortArray{
    public static void main(String args[]){
        int i,temp,j;
        Scanner obj = new Scanner(System.in);
        System.out.println("Size of array:  ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements:   ");
        for(i = 0 ; i<n ; i++){
            arr[i] = obj.nextInt();
        }
        for(i = 0 ; i<n ; i++){
            for(j=i+1 ; j<n ; j++){
                if(arr[i] > arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        }
        System.out.println("Sorted array:   ");
        for(i=0;i<n;i++){
            System.out.print("  "+arr[i]);
        }

    }
}