package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class ShowType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 Print the rectangle\n" +
                "\n" +
                "2 Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                "\n" +
                "3  Print isosceles triangle\n" +
                "\n" +
                "4  Exit");

        int number;
        do {
            number = Integer.parseInt(scanner.nextLine());
            if (number < 0 || number > 4) {
                System.out.println("không có số phù hợp ");
            }
        } while (number < 0 || number > 4);

        switch (number) {
            case 1:
                //hình chữ nhật
                System.out.println("nhập chiều dài của hình chữ nhật");
                int width;
                do {
                    width = Integer.parseInt(scanner.nextLine());
                    if (width <= 0) {
                        System.out.println("nhập chiều dài của hình chữ nhật lớn hơn 0");
                    }

                } while (width <= 0);
                System.out.println("nhập chiều cao");
                int height;
                do {
                    height = Integer.parseInt(scanner.nextLine());
                    if (height <= 0) {
                        System.out.println("nhập chiều cao của hình chữ nhật lớn hơn 0");
                    }

                } while (height <= 0);
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Nhập cạnh tam giác vuông cân ");
                int edge;
                do {
                    edge = Integer.parseInt(scanner.nextLine());
                    if (edge < 0) {
                        System.out.println("Nhập lại ,cạnh tam giác không thể bé hơn 0");
                    }
                } while (edge < 0);
                for (int i = 1; i <= edge; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for (int i = edge; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                break;
            case 3:
                int hight;
                System.out.print("\n\nNhập vào chiều cao của tam giác cân: ");
                do {
                    hight = Integer.parseInt(scanner.nextLine());
                    if (hight < 0) {
                        System.out.println("Nhập lại chiều cao của tam giác cân lớn hon 1 !");
                    }
                } while (hight < 0);
                for (int i = 1; i <= hight; i++) {
                    for (int j = 1; j <= hight - i; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k < i * 2; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

            case 4:
                break;

        }
    }
}
