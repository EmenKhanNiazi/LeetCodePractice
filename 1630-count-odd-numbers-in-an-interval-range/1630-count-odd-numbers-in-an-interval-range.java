import java.util.Scanner;
class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        if (low % 2 == 0) {
            low++;
        }
        for(int i=low; i<=high;i+=2){
            if(i%2!=0){
                count+=1;
            }
        }
        System.out.println("Odd Numbers between "+low+ " and "+high+" is "+count);
        return count;
    }
    }