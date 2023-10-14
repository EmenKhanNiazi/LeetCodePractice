class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
          int count = 0;
        int temp = 10; //initializing other than 1 or 0 

        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0) { //for first index
               if (flowerbed[i] == 0) {
                    if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                        count++;
                        flowerbed[i] = 1;
                    }
                }
            } else {
                if (temp == 0) {
                    if (flowerbed[i] == 0) { ///if prev flowerpot and the recent both are empty then we can plant; so count increases
                        if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) { //if the current plot is the last plot in the flowerbed(there's no plot next to it, and it's safe to plant a flower) 
                            //or  if the next plot is empty (represented by 0), it means there is no flower planted in the adjacent plot, and it's also safe to plant a flower) 
                            count++;
                            flowerbed[i] = 1;  //now considering this flowerpot planted
                        }
                    }
                }
            }
            temp = flowerbed[i]; //storing the previous flowers value
        }
        return count >= n; //true if the count of successfully planted flowers is greater than or equal to the given number of flowers
    }
}




