package leetcode;

public class additionClass {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;

        int carry = 0;

        while (lenA >= 0 || lenB >= 0) {
            int sum = carry;
            if (lenA >= 0) sum += a.charAt(lenA) - '0';
            if (lenB >= 0) sum += b.charAt(lenB) - '0';
            sb.append(sum % 2);
            carry = sum / 2;

            lenA--;
            lenB--;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        additionClass object = new additionClass();
        String result = object.addBinary("11", "1");
        System.out.println(result);
    }
}


