package leetcode.stringsProgram;


public class integerToRoman {
        public String intToRoman(int num) {

            String[] thousands = {"", "M", "MM", "MMM"};

            String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; //1 9 9 4

            String[] tens =  {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

            String[] units =  {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

            return thousands[num / 1000] +
                    hundreds[(num % 1000) / 100] +
                    tens[(num % 100) / 10] +
                    units[num % 10];

        }

    public static void main(String[] args){
        integerToRoman object = new integerToRoman();
        String result = object.intToRoman(1994);

        System.out.println(result);
    }
}
