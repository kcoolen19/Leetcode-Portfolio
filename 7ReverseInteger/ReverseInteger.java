class Solution {
    public int reverse(int num) {
      // Declare variable that will store the reversed number
      // It is initialized to 0 so that it can be returned easily
      int reversed = 0;
        // Create a variable that will store of each number
        int sign;
        // If the number in the parameter is negative
        if (num < 0) {
            // Sign becomes -1 as since the number is preceded by "-"
            sign = -1;
            // Make the number positive for later calculation
            num = num * -1;  
        } else {
            // Sign will not change and keep value of 1
            sign = 1;
        }
        // While number is not zero
        while (num != 0) {
            // Obtain the each digit by getting the remainder 
            int digit = num % 10;
            // If the reversed number is greater than the maxmimum constrain
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                // zero is returned
                return 0;
            }
            // The reversed number is calculated by starting with the last digit from the integer parameter 
            reversed = reversed * 10 + digit;
            // The number is divided by 10 each time to get to the next digit
            num /= 10;
        }
        // The revered number is returned
        // It is multiplied by the sign to return the number in the state it was originally in
        return reversed * sign;
    }
}
