import java.util.Scanner;

public class OddNosInIntervalRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Lower No: ");
        int lower=sc.nextInt();
        while(lower<0){
            System.out.println("Enter non-negative Lower No");
            lower= sc.nextInt();
        }
        System.out.println("Enter Higher No: ");
        int higher=sc.nextInt();
        while(higher<0){
            System.out.println("Enter non-negative Higher No");
            higher= sc.nextInt();
        }
        int count=0;
        for(int i=lower; i<=higher;i++){
            if(i%2!=0){
                count+=1;
    }
}
        System.out.println("Odd Numbers between "+lower+ " and "+higher+" is "+count);

    }
}
