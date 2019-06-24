import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // create scanner
        Scanner sc = new Scanner(System.in);
        // greet all users
        while (sc.hasNextLine()) {
            System.out.format("Ahoj, %s!%n", sc.nextLine());       
        }
    }

}
