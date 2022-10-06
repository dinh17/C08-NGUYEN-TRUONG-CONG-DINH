package ss2_loop_in_java.exercise;

public class OneHundredPrime {
    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {
            i++;
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println("" + i + "\t");

            }
        }

    }
}
