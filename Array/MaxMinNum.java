// Find the minimum and maximum element in an array

import java.util.Scanner;

class MaxMinNum{
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
        min = arr[0];
        max = arr[0];
        for(i = 0 ; i<n ; i++){
            if(arr[i]<min)
            {
                min = arr[i];
            }
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
}
