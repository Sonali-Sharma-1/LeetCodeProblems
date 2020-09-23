package leetcode;

public class needleProblemClass {

    public int strStr(String haystack, String needle) {

        //Brute-Force approach - O(mn) where m is the length of haystack and n is the length of needle.
        int count = 0;
        int indexOfNeedle = 0;
        if (needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() > haystack.length())
                return -1;

            int m = i;
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) == haystack.charAt(m)) {
                    if (j == needle.length() - 1)
                        return i;
                    m++;
                } else {
                    break;
                }

            }
        }

        return -1;

    }

    public static void main(String[] args) {
        needleProblemClass object = new needleProblemClass();
        int result = object.strStr("hello", "ll");
        System.out.println(result);
    }
 /*TO-DO
 * Knuth Morris implementation of finding occurences in String as it take O(n) time complexity - Efficient way to solve this problem*/


}
