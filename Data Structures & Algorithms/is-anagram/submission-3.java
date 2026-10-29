class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr=new int[255];
        for(char c:s.toCharArray()){
            arr[c]++;

        }
        for(char c:t.toCharArray()){
            arr[c]--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;

    }
}
