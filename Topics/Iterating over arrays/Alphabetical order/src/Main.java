import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isAlphabetical = true;
        String string = scanner.nextLine();

        String[] strings = string.split(" ");

        for (int i = 0; i < strings.length - 1; i++) {
            int compare = strings[i].compareTo(strings[i + 1]);
            if (compare > 0) {
                isAlphabetical = false;
                break;
            }
        }
        System.out.println(isAlphabetical);
    }
}