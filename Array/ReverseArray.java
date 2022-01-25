// Write a program to reverse the array

import java.util.Scanner;

class ReverseArray{
    public static void main(String args[]){
        int i;
        Scanner obj = new Scanner(System.in);
        System.out.println("Size of array:  ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        int max , min ;
        System.out.println("Enter "+n+" elements : ");
        for(i = 0 ; i<n ; i++){
            arr[i] = obj.nextInt();
        }
        for(i=n-1 ; i>=0 ; i--){
            System.out.print("  "+arr[i]);
        }
    }
}