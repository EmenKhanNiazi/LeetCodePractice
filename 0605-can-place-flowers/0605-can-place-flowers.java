class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
          int count = 0;
        int temp = 10;

        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0) {
               if (flowerbed[i] == 0) {
                    if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                        count++;
                        flowerbed[i] = 1;
                    }
                }
            } else {
                if (temp == 0) {
                    if (flowerbed[i] == 0) {
                        if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                            count++;
                            flowerbed[i] = 1;
                        }
                    }
                }
            }
            temp = flowerbed[i];}
        return count >= n;
    }
}




