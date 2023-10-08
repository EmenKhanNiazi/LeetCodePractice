class Solution {
    public double average(int[] array) {
        int max_salary = 0;
        for (int i = 0; i < array.length; i++) {  //updating the max salary

            if (array[i] > max_salary) {
                max_salary = array[i];
            }}
        int min_salary = max_salary;
        for (int i = 0; i < array.length ; i++) { //updating the min salary
            if (array[i] < min_salary) {
                min_salary = array[i];
            }}
        //System.out.println("Max salary is "+max_salary);
       // System.out.println("Min salary is "+min_salary);
        //we initialize max_salary with the lowest possible integer value and min_salary with the highest possible value.
        // Then, we iterate through the array and update max_salary and min_salary 
        double average = 0;
        double sum = 0;
        double count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == min_salary || array[j] == max_salary) { 
                //not adding max_salary and min_salary in the sum
                continue;
            } else {
                sum += array[j];
                count++;
            }
        }

        average = sum / count;
return average;


    }}  