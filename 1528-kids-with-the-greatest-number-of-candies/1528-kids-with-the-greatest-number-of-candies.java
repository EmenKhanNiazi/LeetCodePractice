class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> lst=new ArrayList<>();

        int[] array= new int[candies.length]; //making an array to store kids after receiving extra candies and then comparing them with the max candy
        int max=0;
        for(int i=0;i<candies.length;i++){ //for calculating the max from the candies
            if(candies[i]>max){
                max=candies[i];
        }}
            System.out.println(max);
        for(int j=0;j<candies.length;j++){ //storing the kids after receiving extra candies
            array[j]= candies[j]+extraCandies;
        }

        for(int k=0;k<candies.length;k++){ // comparing kids with extra candy with the max candy
            if(array[k]>=max){
                lst.add(true);
            }
            else {
                lst.add(false);
            }
            }
        return lst;
            }
        }