import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        int[] ints = new int[lenght];
        for (int i = 0; i < lenght; i++){
            ints[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int sum = 0;
        for (int integar:ints) {
            if (integar > n) {
                sum += integar;
            }
        }
        System.out.println(sum);
        // put your code here
    }
}