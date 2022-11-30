package giai_thuat;

public class fib {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            if(checkfib(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean checkfib(int number){
        int number1 =  0 ;
        int number2 =  1 ;
        int number3 = 1;
        if (number ==1 || number ==0){
            return true ;
        }
        while(number>number1){

            number1=number2;
            number2=number3;
            number3=number2+number1 ;
            if(number==number1){
                return true ;
            }
        }
        return false ;
    }
//    private static boolean checkFib(int number) {
//        int num1 = 0;
//        int num2 = 1;
//        int num3;
//        while (num1 < number) {
//            num3 = num1 + num2;
//            num1 = num2;
//            num2 = num3;
//            if (number ==  num1) {
//                return true;
//            }
//        }
//        return false;
//    }
}
