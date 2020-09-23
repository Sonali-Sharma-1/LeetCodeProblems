package leetcode;

//14. Longest Common Prefix
public class longestCommonPrefixClass {
    public String longestCommonPrefix(String[] strs) {

        //My approach - Worked half way

//        String first = strs[0];
//        String second = strs[1];
//        String third = strs[2];
//        char resultString = '\0';
//
//        for (int i = 0; i < first.length(); i++) {
//            for (int j = 0; j < second.length(); j++) {
//                for (int k = 0; k < third.length(); k++) {
//                    int success = Character.compare(first.charAt(i), second.charAt(j));
//                    int success1 = Character.compare(second.charAt(j), third.charAt(k));
//                    if (success == 0 && success1 == 0) {
//                        resultString += first.charAt(i);
//                        i++;
//                        j++;
//                        k++;
//                    }else{
//                        resultString += '\0';
//                    }
//                }
//            }
//        }

        // Time Complextity - O(n)
        // Space Complexity - O(1)

        String resultString = "";
        if (strs == null || strs.length == 0) {
            return resultString;
        }

        int index = 0;
        for (char c : strs[0].toCharArray()) {
            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || c != strs[i].charAt(index)) {
                    return resultString;
                }
            }
            resultString += c;
            index++;
        }


        return resultString;
    }

    public static void main(String[] args) {
        longestCommonPrefixClass obj = new longestCommonPrefixClass();
        String[] inputString= {"flower", "flow", "flight"};
        String result = obj.longestCommonPrefix(inputString);
        System.out.println(result);
    }
}
