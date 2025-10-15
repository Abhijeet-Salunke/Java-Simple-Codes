class Solution {
    public boolean isAnagram(String s, String t) {
        String str1 = s.toLowerCase();
        String str2 = t.toLowerCase();

        int[] count = new int[26];

        for(int i = 0; i < str1.length(); i++){
            count[str1.charAt(i) - 'a']++;
        }

        for(int i = 0; i < str2.length(); i++){
            count[str2.charAt(i) - 'a']--;
        }

        for(int i : count){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}