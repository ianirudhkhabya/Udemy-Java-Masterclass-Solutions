public class SumOddRange {

    public static boolean isOdd(int number){
           if(number<0){
               return false;
           }
           if(number%2 == 1){
               return true;
           }
           return false;
       }
   
    public static int sumOdd(int start, int end){
        if((start < 0) || (end < 0) || (start>end)){
           return -1;
        }
        int sum = 0;
        for(int i = start; i<=end; i++){
           if(isOdd(i)){
               sum+=i;
            }
        }
        return sum;
    }
}
