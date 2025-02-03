import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return \\;

        Arrays.sort(strs); // Sort lexicographically

        String firstone  = strs[0];
        String lastone = strs[strs.length-1];
        String m =\\;
        if(firstone==lastone  ){
            return firstone ;
        }else{
            for(int i =0; i<Math.min(firstone.length(),lastone.length()); i++){
                if(firstone.charAt(i)==lastone.charAt(i)){
                    m=m+ firstone.charAt(i);
                }else{
                    break;
                }
            }
            return m;
        }
    }
}