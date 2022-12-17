public class NumberPalindrome {

    public static boolean isPalindrome(int number){
   
        int reverse = 0;
        int temp = number;
   
        while(temp!=0){
            reverse *= 10;
            reverse += temp%10;
            temp /= 10;
        }
        return (reverse == number);
    }
}
