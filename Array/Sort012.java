// Sort an array of 0s, 1s and 2s 
class Sort012{
    public static void main(String args[]){
        int[] arr = {0, 2 , 1 , 2 , 1 , 0 , 2 , 1 , 1 , 1};
        int l = 0 , temp = 0 , m = 0 ;
        int h = arr.length-1;
        while(m<=h)
        {
            if(arr[m] == 0)
            {
                temp = arr[m];
                arr[m] = arr[l];
                arr[l] = temp;
                m++;
                l++;
            }
            else if(arr[m] == 1)
            {
                m++;
            }
            else if(arr[m] == 2)
            {
                temp = arr[m];
                arr[m] = arr[h];
                arr[h] = temp;
                h--;
            }
        }
        for(int i = 0 ; i < arr.length ; i++ )
        {
        System.out.print(" "+arr[i]);
        }
    }    
}