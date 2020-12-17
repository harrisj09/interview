package leetcode.math;

// https://leetcode.com/problems/multiply-strings/
public class MultiplyStrings {
    // http://www.asciitable.com

    /*

    "1" * "2"
    Take the ascii value
     48 = 0
     2 is 50
     - 50 - 48 = 2
     3 is 51
     - 51 - 48 = 3


    Do this
    char a = '1'
    int number = ((int)a-(int)'0'))
     */
    public static void main(String[] args) {
        System.out.println(multiply("3", "5"));
/*        System.out.println(multiply("7", "29"));
        System.out.println(multiply("21", "52"));
        System.out.println(multiply("647", "35"));*/
    }

    public static String multiply(String num1, String num2) {
        // groupNumb * numbInGroups
        String groupNumb = num1.length() >= num2.length() ? num1 : num2;
        String numbInGroups = num1.length() >= num2.length() ? num2 : num1;
        String singleNumb = "";
        String zeros = "";
        while(!numbInGroups.isEmpty()) {
            /*
            Test Case: 455 * 21
            singleNumb = numbInGroups.substring(numbInGroups.length() - 1);
            result = add(result, product(groupNumb, singleNumb) + zeros);
            zeros += "0";
             */
            numbInGroups = numbInGroups.substring(0, numbInGroups.length() - 1);
        }
        int finalResult = 0;
        return finalResult + "";
    }

    public static String product(String groupNumb, String singleNumb) {
        return "";
    }

    // Pass in the finalResult and the product of the multiplication that just happened
    public static String add(String result, String product) {
        return "";
    }
}