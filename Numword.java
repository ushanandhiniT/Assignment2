package Assignment3;

public class Numword {
        static void numtowords( char[] num)
        {
            int len = num.length;
            if(len==0)
            {
                System.out.println("Empty String");
                return;
            }
            if(len > 4){
                System.out.println("Length more than 4 s not supported");
                return;
            }
            String[] one_digit = new String[]{
                    "zero", "one", "two",   "three", "four",
                    "five", "six", "seven", "eight", "nine"
            };
            String[] two_digits = new String[] {
                    "",          "ten",      "eleven",  "twelve",
                    "thirteen",  "fourteen", "fifteen", "sixteen",
                    "seventeen", "eighteen", "nineteen"
            };
            String[] tens_multiple = new String[] {
                    "",      "",      "twenty",  "thirty", "forty",
                    "fifty", "sixty", "seventy", "eighty", "ninety"
            };
            String[] tens_power =new String[]{
                    "hundred" , "thousand"
            };
            System.out.print(String.valueOf(num) + ": ");

            if(len == 1) {
                System.out.println(one_digit[num[0] - '0']);
                return;
            }
            int x = 0;
            while (x < num.length) {
                if (len >= 3) {
                    if (num[x] - '0' != 0) {
                        System.out.print(
                                one_digit[num[x] - '0'] + " ");
                        System.out.print(tens_power[len - 3]
                                + " ");
                    }
                    --len;
                }
                else {
                    if (num[x] - '0' == 1) {
                        int sum
                                = num[x] - '0' + num[x + 1] - '0';
                        System.out.println(two_digits[sum]);
                        return;
                    }
                    else if (num[x] - '0' == 2
                            && num[x + 1] - '0' == 0) {
                        System.out.println("twenty");
                        return;
                    }
                    else {
                        int i = (num[x] - '0');
                        if (i > 0)
                            System.out.print(tens_multiple[i]
                                    + " ");
                        else
                            System.out.print("");
                        ++x;
                        if (num[x] - '0' != 0)
                            System.out.println(
                                    one_digit[num[x] - '0']);
                    }
                }
                ++x;
            }
        }
        public static void main(String[] args)
        {
            numtowords("9923".toCharArray());
            numtowords("523".toCharArray());
            numtowords("89".toCharArray());
            numtowords("8".toCharArray());
        }
    }


