import java.util.Scanner;

/*Input: digits = [1,2,3]
        Output: [1,2,4] */
public class PlusOne {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Give the size of array");
        int size=sc.nextInt();
        int[] array= new int[size];
        for(int i=0;i<size;i++){  //adding elements to array
            System.out.println("Enter the element: "+(i+1));
            array[i]=sc.nextInt();
        }
        for(int i=size-1;i>=0;i--){
            if(i==size-1){
             array[i]=array[i]+1;}
            }

        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }



    }
}
