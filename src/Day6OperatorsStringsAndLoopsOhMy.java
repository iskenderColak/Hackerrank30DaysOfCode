import java.util.Scanner;

public class Day6OperatorsStringsAndLoopsOhMy {

    public static void main(String[] args) {

        // Day 6 class is created

        /*

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < count; i++) {
            String str = scanner.nextLine();
            char[] charArray = str.toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(charArray[j]);
                }
            }

            System.out.print(" ");

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 == 1) {
                    System.out.print(charArray[j]);
                }
            }

            System.out.println();
        }
        scanner.close();

        */ // ekstra solution with the method string.toCharArray();

        Scanner scanner = new Scanner(System.in);
        int countOfWords = scanner.nextInt();

        String strEven = "";
        String strOdd = "";

        for (int i = 0; i < countOfWords; i++) {
            String str = scanner.next();
            for (int j = 0; j < str.length(); j++) {
                if (j % 2 == 0) {
                    strEven += str.charAt(j);
                } else {
                    strOdd += str.charAt(j);
                }
            }
            System.out.println(strEven + " " + strOdd);
            strEven = "";
            strOdd = "";
        }
        scanner.close();
    }
}
