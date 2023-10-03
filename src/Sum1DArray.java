/*     Input: nums = [1,2,3,4]
       Output: [1,3,6,10]
       Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].      */

import java.util.Scanner;
public class Sum1DArray {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Give the size of array");
        int size=sc.nextInt();
        int[] array= new int[size];
        for(int i=0;i<size;i++){  //adding elements to array
            System.out.println("Enter the element: "+(i+1));
            array[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<size;i++){
            array[i]=temp+array[i]; //adding the next element to the previous element
            temp=array[i];  //setting the temp to the previous element
        }
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
}
