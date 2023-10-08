class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        boolean b=true;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            
            //separating i into digits
            int num=i; //creating a copy of i to manipulate
            while (num != 0) { 
                int digit = num % 10; // Extract the last digit of the number
                if (digit == 0) {
                     //if the self dividing digit contains zero break that instantly
                    b=false;
                    break;
                } else if (i%digit == 0) { //checking if divided by the orignl no
                    //add it in a list
                    b=true;
                    
                } else if(i%digit != 0) {
                    b=false;
                   break;
                }
                num /= 10; // Remove the last digit from the number
            }
            if(b==true){
                arr.add(i);
            }
        } return arr;
      
    }
}