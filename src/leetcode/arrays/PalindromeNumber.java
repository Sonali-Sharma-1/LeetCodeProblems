package leetcode.arrays;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String orginalStr = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(orginalStr);
        stringBuilder = stringBuilder.reverse();
        if (stringBuilder.toString().equals(orginalStr)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPalindromeWithoutConvertingToString(int x){
        int originalNumber = x;
        int rev_num = 0;
        while(x > 0){
            rev_num = rev_num * 10 + x % 10;
            x = x /10;
        }

        if(rev_num == originalNumber){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        PalindromeNumber object = new PalindromeNumber();
        boolean result = object.isPalindromeWithoutConvertingToString(-121);
        System.out.println(result);
    }
}
