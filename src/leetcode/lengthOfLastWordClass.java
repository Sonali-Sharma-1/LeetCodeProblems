package leetcode;

public class lengthOfLastWordClass {
    public int lengthOfLastWord(String s) {
        int n = s.length(), result = 0;
        while(n > 0){
            if(s.charAt(--n) != ' ') result++;
            else if(result > 0) return result;
        }
        return result;
    }

    public static void main(String[] args) {
        lengthOfLastWordClass object = new lengthOfLastWordClass();
        int result = object.lengthOfLastWord("Hello World        ");
        System.out.println(result);
    }
}
