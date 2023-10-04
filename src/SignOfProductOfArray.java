import java.util.Scanner;

public class SignOfProductOfArray {

    static int signFunc(int[] a){
        int product=1;
        for (int i=0;i<a.length;i++){
        product=product*a[i];  //finding the product
        }
        System.out.println(product);
        if(product>0){ //if positive
            return 1;
        }
        else if(product<0){ //if negative
            return -1;
        }
        return 0; //if the product is zero
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Give the size of array");
        int size=sc.nextInt();
        int[] array= new int[size];
        for(int i=0;i<size;i++){  //adding elements to array
            System.out.println("Enter the element: "+(i+1));
            array[i]=sc.nextInt();
        }

        signFunc(array);

    }

}

