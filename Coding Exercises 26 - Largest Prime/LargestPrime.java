public class LargestPrime {
    
    public static int getLargestPrime(int number){
        int i;
        if(number<=1){
            return -1;
        }else{
            for(i=2;i<=number;i++){
                if(number % i==0){
                    number/=i;
                    i--;
                }
            }
            return i;
        }
    }
}
