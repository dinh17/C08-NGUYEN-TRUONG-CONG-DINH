package introduction_to_java.exercise;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số ");
        int number = scanner.nextInt();
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        }
        else if (number < 20) {
            switch (number % 10) {
                case 0:
                    System.out.print("ten");
                    break;
                case 1:
                    System.out.print("eleven");
                    break;
                case 2:
                    System.out.print("twelve");
                    break;
                case 3:
                    System.out.print("thirteen");
                    break;
                case 4:
                    System.out.print("fourteen");
                    break;
                case 5:
                    System.out.print("fifteen");
                    break;
                case 6:
                    System.out.print("sixteen");
                    break;
                case 7:
                    System.out.print("seventeen");
                    break;
                case 8:
                    System.out.print("eightteen");
                    break;
                case 9:
                    System.out.print("nineteen");
                    break;

            }
        }
        else if (number < 100) {
            int a = number % 10;
            int b = number / 10;
            switch (b) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("fourty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eightty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
            switch (a) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("file");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }

        }
        else if (number < 1000) {
            int a = number / 100;
            int b = (number / 10) % 10;
            int c = number % 10;
            switch (a) {
                case 1:
                    System.out.print("onehundred");
                    break;
                case 2:
                    System.out.print("twohundred");
                    break;
                case 3:
                    System.out.print("threehundred");
                    break;
                case 4:
                    System.out.print("fourhundred");
                    break;
                case 5:
                    System.out.print("fivehundred");
                    break;
                case 6:
                    System.out.print("sixhundred");
                    break;
                case 7:
                    System.out.print("sevenhundred");
                    break;
                case 8:
                    System.out.print("eighthundred");
                    break;
                case 9:
                    System.out.print("ninehundred");
                    break;

            }
            switch (b) {
                case 0 : break;
                case 1:
                    switch (c) {
                        case 0:
                            System.out.print("ten");
                            break;
                        case 1:
                            System.out.print("eleven");
                            break;
                        case 2:
                            System.out.print("twelve");
                            break;
                        case 3:
                            System.out.print("thirteen");
                            break;
                        case 4:
                            System.out.print("fourteen");
                            break;
                        case 5:
                            System.out.print("fifteen");
                            break;
                        case 6:
                            System.out.print("sixteen");
                            break;
                        case 7:
                            System.out.print("seventeen");
                            break;
                        case 8:
                            System.out.print("eightteen");
                            break;
                        case 9:
                            System.out.print("nineteen");
                            break;

                    }
                    break;
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("fourty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eightty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }

            switch (c) {
                case 0:
                    if (b == 1) {
                        break;
                    }
                         break ;
                case 1:
                    if (b == 1) {
                        break;
                    }
                    System.out.print("one");
                    break;
                case 2:
                    if (b == 1) {
                        break;
                    }
                    System.out.print("two");
                    break;
                case 3:
                    if (b == 1) {
                        break;
                    }
                    System.out.print("three");
                    break;
                case 4:
                    if (b == 1) {
                        break;
                    }
                    System.out.print("four");
                    break;
                case 5:
                    if (b == 1) {
                        break;
                    }
                    System.out.print("file");
                    break;
                case 6:
                    if (b == 1) {
                        break;
                    }
                    System.out.print("six");
                    break;
                case 7:
                    if (b == 1) {
                        break;
                    }
                    System.out.print("seven");
                    break;
                case 8:
                    if (b == 1) {
                        break;
                    }
                    System.out.print("eight");
                    break;
                case 9:
                    if (b == 1) {
                        break;
                    }
                    System.out.print("nine");
                    break;
            }

        }
    }
}

//Cua Nga
//package ss1_introduction_to_java.exercise;
//
//        import java.util.Scanner;
//
//public class NumIntoWordConversion {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = scanner.nextInt();
//        String hundreds = null;
//        String tens = null;
//        String units = null;
//        int temp = 0;
//        if (number < 1000 && number > 99) {
//            switch (number / 100) {
//                case 1:
//                    hundreds = "one hundred";
//                    break;
//                case 2:
//                    hundreds = "two hundred";
//                    break;
//                case 3:
//                    hundreds = "three hundred";
//                    break;
//                case 4:
//                    hundreds = "four hundred";
//                    break;
//                case 5:
//                    hundreds = "five hundred";
//                    break;
//                case 6:
//                    hundreds = "six hundred";
//                    break;
//                case 7:
//                    hundreds = "seven hundred";
//                    break;
//                case 8:
//                    hundreds = "eight hundred";
//                    break;
//                case 9:
//                    hundreds = "nine hundred";
//                    break;
//            }
//            temp = number;
//            number %= 100;
//            System.out.print(hundreds + " ");
//        }
//        if (number < 100 && number > 9) {
//            switch (number / 10) {
//                case 1:
//                    switch (number) {
//                        case 10:
//                            tens = "ten";
//                            break;
//                        case 11:
//                            tens = "eleven";
//                            break;
//                        case 12:
//                            tens = "twelve";
//                            break;
//                        case 13:
//                            tens = "thirteen";
//                            break;
//                        case 14:
//                            tens = "fourteen";
//                            break;
//                        case 15:
//                            tens = "fifteen";
//                            break;
//                        case 16:
//                            tens = "sixteen";
//                            break;
//                        case 17:
//                            tens = "seventeen";
//                            break;
//                        case 18:
//                            tens = "eighteen";
//                            break;
//                        case 19:
//                            tens = "nineteen";
//                            break;
//                    }
//                    break;
//                case 2:
//                    tens = "twenty";
//                    break;
//                case 3:
//                    tens = "thirty";
//                    break;
//                case 4:
//                    tens = "forty";
//                    break;
//                case 5:
//                    tens = "fifty";
//                    break;
//                case 6:
//                    tens = "sixty";
//                    break;
//                case 7:
//                    tens = "seventy";
//                    break;
//                case 8:
//                    tens = "eighty";
//                    break;
//                case 9:
//                    tens = "ninety";
//                    break;
//
//            }
//            temp = number;
//            number %= 10;
//            System.out.print(tens + " ");
//        }
//        if (number < 10) {
//            if ((temp % 100 != 0) && temp%10 != 0 && temp > 20 || temp == 0) {
//                switch (number) {
//                    case 0:
//                        units = "zero";
//                        break;
//                    case 1:
//                        units = "one";
//                        break;
//                    case 2:
//                        units = "two";
//                        break;
//                    case 3:
//                        units = "three";
//                        break;
//                    case 4:
//                        units = "four";
//                        break;
//                    case 5:
//                        units = "five";
//                        break;
//                    case 6:
//                        units = "six";
//                        break;
//                    case 7:
//                        units = "seven";
//                        break;
//                    case 8:
//                        units = "eight";
//                        break;
//                    case 9:
//                        units = "nine";
//                        break;
//                }
//
//            }
//            if (units != null) {
//                System.out.print(units + " ");
//            }
//
//        }
//
//    }
//}