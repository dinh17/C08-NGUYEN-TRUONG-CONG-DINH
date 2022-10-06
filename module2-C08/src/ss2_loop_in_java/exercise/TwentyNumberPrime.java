package ss2_loop_in_java.exercise;


public class TwentyNumberPrime {

    public static void main(String[] args) {

        int count = 0;
        int i =1;
        while (count < 20) {
            i++;
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                }
            }

            if (check) {
                System.out.println(""+ i + "\t");
                count++;
            }

        }
    }
}
