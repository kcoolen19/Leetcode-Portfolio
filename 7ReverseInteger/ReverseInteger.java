class Solution {
    public int reverse(int num) {
      int reversed = 0;
        int sign;
        if (num < 0) {
            sign = -1;
            num = num * -1;  
        } else {
            sign = 1;
        }
        while (num != 0) {
            int digit = num % 10;
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed * sign;
    }
}
