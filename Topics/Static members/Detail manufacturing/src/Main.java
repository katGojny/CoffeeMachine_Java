import java.util.Scanner;

class ManufacturingController {
    public static int numberOfRequest = 0;
    // here you may declare a field

    public static String requestProduct(String product) {
        numberOfRequest += 1;
        return numberOfRequest + ". Requested " + product;// write your code here
    }

    public static int getNumberOfProducts() {
        return numberOfRequest;// write your code here
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();
            System.out.println(ManufacturingController.requestProduct(product));
            System.out.println(ManufacturingController.getNumberOfProducts());
        }
    }
}