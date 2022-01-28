import java.util.Scanner;

class Kth_Largest_Smallest{
    public static int small(int[] arr , int k ){
        int i , j , temp;
        for(i=0 ; i<arr.length ; i++){
            for(j=i+1 ; j<arr.length ; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[k-1];
    }

    public static int large(int[] arr , int k ){
        int i , j , temp;
        for(i=0 ; i<arr.length ; i++){
            for(j=i+1 ; j<arr.length ; j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[k-1];
    }
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int i , j ; 
        System.out.println("Size of array:  ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements:   ");
        for(i=0;i<n;i++){
            arr[i] = obj.nextInt();    
        }
        int choice,k;
        while(true){
            System.out.println("1. Kth smallest number ");
            System.out.println("2. Kth largest number ");
            System.out.println("3. Exit");
            choice = obj.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Kth smallest element:   ");
                    k = obj.nextInt();
                    System.out.println("    "+(small(arr,k)));
                    break;

                case 2:
                    System.out.println("Kth largest element:        ");
                    k = obj.nextInt();
                    System.out.println("    "+(large(arr,k)));
                    break;    
                
                case 3:
                    System.exit(1);
                    break;    
            }
        }
    }
}