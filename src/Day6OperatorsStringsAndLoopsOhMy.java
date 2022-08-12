import java.util.Scanner;

public class Day6OperatorsStringsAndLoopsOhMy {

    public static void main(String[] args) {

        // Day 6 class is created

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
