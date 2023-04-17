public class Main {

    public static void main(String[] args) {
        int counter = 0;

        Secret[] secrets = Secret.values();
        for(Secret secret: secrets) {
            if (secret.toString().contains("STAR")) {
                counter += 1;
            }
        }
        // write your code here


        System.out.println(counter);
    }
}

/*
enum Secret {
    STAR, CRASH, START, // ...
}
*/
