

import java.util.Scanner;

public class HelloUser {
    Scanner scanner = new Scanner(System.in);
    public void userName() {
        String user = scanner.next();

        System.out.println("Hello " + user);
    }
}
