import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int u1 = scanner.nextInt();
       int u2 = scanner.nextInt();
       int v1 = scanner.nextInt();
       int v2 = scanner.nextInt();
       double up = (double) u1 * v1 + u2 * v2;
       double powU1 = Math.pow(u1, 2);
       double powU2 = Math.pow(u2, 2);
       double powV1 = Math.pow(v1, 2);
       double powV2 = Math.pow(v2, 2);
       double down = (double) Math.sqrt(powU1 + powU2) * Math.sqrt(powV1 + powV2);
       double cos = (double) up / down;
       double result = (double) Math.toDegrees(Math.acos(cos));
       double angle = Math.abs(Math.atan2(u2, u1) - Math.atan2(v2, v1));
      // double result = Math.toDegrees(angle);
        System.out.println(result);
    }
}