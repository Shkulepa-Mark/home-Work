package HomeWork_4;

import java.util.Scanner;

public class FirstTask {
    Scanner scanner = new Scanner(System.in);

    void text() {
        System.out.println("Enter original string: ");
        String text = scanner.nextLine();

        String changedStr = text.replace("test","testing").replaceAll("[0-9]", "");

        System.out.println("Original string: " + text);
        System.out.println("Changed string: " + changedStr);
    }
}
