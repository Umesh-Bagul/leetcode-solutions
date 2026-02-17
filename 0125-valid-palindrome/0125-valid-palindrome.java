class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.toLowerCase();
        String sss = ss.replaceAll("[^a-zA-Z0-9]", "");

        for(int i = 0; i<sss.length(); i++){
            if(sss.charAt(i) != sss.charAt(sss.length()-i-1)) return false;
        }
        return true;
    }
}