class Solution {
    public String mergeAlternately(String word1, String word2) {
        System.out.println(word1);
        System.out.println(word2);
         int maxLength = Math.max(word1.length(), word2.length()); //gives max length from the two
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLength; i++) { //Inside the loop, we check if i is within the bounds of word1, we append the character at index i of word1 to the result.
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) { //if i is within the bounds of word2, we append the character at index i of word2 to the result
                result.append(word2.charAt(i));
            }
        }

        String mergedString = result.toString(); //i is within the bounds of word2, we append the character at index i of word2 to the result
        System.out.println("Merged string: " + mergedString); 
        return mergedString;
    }
    }