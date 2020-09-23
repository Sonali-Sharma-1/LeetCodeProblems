package leetcode;

public class countNsayClass {
    public String countAndSay(int n) {

        if(n <= 0){
            return null;
        }
        String val = "1";
        for (int i = 0; i < n-1; i++) {
            char c = val.charAt(0);
            StringBuilder builder = new StringBuilder();
            int count = 1;

            for (int j = 1; j < val.length(); j++) {
                if (c != val.charAt(j)) {
                    builder.append(count);
                    builder.append(c);
                    count = 0;
                    c = val.charAt(j);
                }
                count++;
            }

            builder.append(count);
            builder.append(c);
            val = builder.toString();
        }
        return val;
    }


    public static void main(String[] args) {
        countNsayClass object = new countNsayClass();
        String result = object.countAndSay(7);
        System.out.println(result);
    }

}
