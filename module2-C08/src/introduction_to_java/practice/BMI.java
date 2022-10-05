package introduction_to_java.practice;
import java.util.Scanner ;
public class BMI {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in) ;
        double canNang,chieuCao,bmi;
        System.out.println("can nang");
        canNang = scanner.nextDouble();
        System.out.println("chieu cao");
        chieuCao = scanner.nextDouble();
        System.out.println("bmi");
        bmi = canNang / Math.pow(chieuCao, 2);
        if (bmi < 18)
            System.out.println(+ bmi+ "     Underweight");
        else if (bmi < 25.0)
            System.out.println(+ bmi+ "      Normal");
        else if (bmi < 30.0)
            System.out.println(+ bmi+"     Overweight");
        else
            System.out.println(+ bmi+ "     Obese");
    }
}
