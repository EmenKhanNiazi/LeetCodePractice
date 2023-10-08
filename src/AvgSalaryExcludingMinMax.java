import java.util.Scanner;
/*Input: salary = [4000,3000,1000,2000]
        Output: 2500.00000
        Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
        Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500*/
public class AvgSalaryExcludingMinMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];


        for (int i = 0; i < size; i++) {  //adding elements to array
            System.out.println("Enter the element: " + (i + 1));
            array[i] = sc.nextInt();
        }
        int max_salary = 0;
        for (int i = 0; i < size; i++) {  //updating the max salary

            if (array[i] > max_salary) {
                max_salary = array[i];
            }}
        int min_salary = max_salary;
        for (int i = 0; i < size; i++) { //updating the min salary
            if (array[i] < min_salary) {
                min_salary = array[i];
            }}
        System.out.println("Max salary is "+max_salary);
        System.out.println("Min salary is "+min_salary);
        //we initialize max_salary with the lowest possible integer value and min_salary with the highest possible value.
        // Then, we iterate through the array and update max_salary and min_salary as needed.
        double average = 0;
        double sum = 0;
        double count = 0;
        for (int j = 0; j < size; j++) {
            if (array[j] == min_salary || array[j] == max_salary) { //not adding max_salary and min_salary in the sum
                continue;
            } else {
                sum += array[j];
                count++;
            }
        }

        average = sum / count;
        System.out.println("The average excluding the minimum and maximum salary is "+average);


    }}