import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int n;
        do {
            n = scanner.nextInt();
            if (n > result) {
                result = n;
            }
        } while (n != 0);
        System.out.println(result);
    }
}