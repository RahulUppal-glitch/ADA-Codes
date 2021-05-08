package Ada;

import java.util.*;

class BubbleSort
{
    void bubbleSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++) 
        {
            for(int j=0;j<n-i-1; j++)
            {   if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        
    }
 
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        BubbleSort bs = new BubbleSort();
        int arr[]=new int[10];
        Random rand= new Random();
        //System.out.println("Enter the array: ");
        for(int i=0;i<10;i++)
        {
        	arr[i]=rand.nextInt(1000);
        }
        
        long startTime= System.nanoTime();
        
        bs.bubbleSort(arr);
        
        long endTime = System.nanoTime();
        
        long duration = (endTime - startTime);
        
        System.out.println("Time taken: "+ duration);
        
        
        System.out.print("Sorted array is:");
        for(int i=0;i<10;++i)
            System.out.print(arr[i]+" ");
        System.out.println();
        
    }
}
