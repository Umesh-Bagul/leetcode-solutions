class Solution {
    public String largestOddNumber(String num) {
        int ending_index = -1;
        for(int i = num.length()-1; i>=0; i--){
            if((num.charAt(i)-'0')%2 == 1){
                ending_index = i;
                break;
            }
        }
        if(ending_index == -1)    return"";

        int starting_index = 0;
        while(num.charAt(starting_index) == '0' && starting_index<=ending_index){
            starting_index++;
        }
        return num.substring(starting_index, ending_index+1);
    }
}