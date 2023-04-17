import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String inputLower = input.toLowerCase();
        char[] inputArray = input.toCharArray();
        int j = 1;
        int k = 2;
        if (inputLower.contains("the")) {
            for (int i = 0; i < inputLower.length(); i++){
                if (inputLower.charAt(i) == 't' && inputLower.charAt(j) == 'h' && inputLower.charAt(k) =='e'){
                    System.out.println(i);
                    break;
                }
                j++;
                k++;
            }
       } else {
            System.out.println("-1");
        }
        // put your code here
    }
}