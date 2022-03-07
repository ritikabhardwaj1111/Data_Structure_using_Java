import java.util.*;
class Union{
    public static void main(String args[])
    {
        int[] arr1 = { 2 , 3 , 4 , 5 , 6 };
        int[] arr0 = { 6 , 7 , 8 , 9 , 10 };
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0 ; i < arr1.length ; i++)
        {
            s.add(arr1[i]);
        }
        for(int i = 0 ; i< arr0.length ; i++)
        {
            s.add(arr0[i]);
        }
        System.out.println("Union of two arrays:   ");
        System.out.println("    "+s.toString());

        }
}