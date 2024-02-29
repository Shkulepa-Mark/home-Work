package HomeWork_4;

import java.util.Scanner;

public class FifthTask {
    Scanner scanner = new Scanner(System.in);

    void printTwoBlocks(String arr) {
        String firstBlock = arr.substring(0, 4);
        String secondBlock = arr.substring(9, 13);

        System.out.println("First block (nums): " + firstBlock);
        System.out.println("Second block (nums): " + secondBlock);
    }

    boolean isValidNumber(String arr) {
        if (!arr.substring(0, 4).matches("\\d{4}") ||
                !arr.substring(5, 8).matches("[a-zA-Z]{3}") ||
                !arr.substring(9, 13).matches("\\d{4}") ||
                !arr.substring(14, 17).matches("[a-zA-Z]{3}") ||
                !arr.substring(18, 22).matches("\\d[a-zA-Z]\\d[a-zA-Z]")) {
            return false;
        }

        if (arr.charAt(4) != '-' || arr.charAt(13) != '-' ||
                arr.charAt(17) != '-' || arr.charAt(8) != '-') {
            return false;
        }

        return true;
    }

    void printLettersInLowerCase(String arr){
        String firstBlock = arr.substring(5,8);
        String secondBlock = arr.substring(14,17);
        String thirdBlock = arr.substring(19,20);
        String fourthBlock = arr.substring(21,22);

        String document = firstBlock.concat("/").concat(secondBlock).concat("/").concat(thirdBlock).concat("/").concat(fourthBlock);

        System.out.println(document);
    }

    void containsAbc(String arr){
        int index1 = arr.toLowerCase().indexOf("abc");

        if(index1 != -1){
            System.out.println("String has ABC/abc");
        }else{
            System.out.println("String doesn't have ABC/abc");
        }
    }

    void containsFive(String arr){
        String five = arr.substring(0,3);

        if(five.equals("555")){
            System.out.println("The document starts with 555");
        }else{
            System.out.println("Document doesn't start with 555");
        }
    }

    void endOfDoc(String arr){
        String firstNum = arr.substring(18,19);
        String firstLetter = arr.substring(19,20);
        String secondNum = arr.substring(20,21);
        String secondLetter = arr.substring(21,22);

        if(firstNum.equals("1") && firstLetter.equals("a") && secondNum.equals("2") && secondLetter.equals("b")){
            System.out.println("Last block of document is 1a2b");
        }
        else{
            System.out.println("Last block of document isn't 1a2b");
        }
    }

    void printLettersInUpperCase(String arr){
        StringBuilder firstBlock = new StringBuilder(arr.substring(5,8).toUpperCase());
        StringBuilder secondBlock = new StringBuilder(arr.substring(14,17).toUpperCase());
        StringBuilder thirdBlock = new StringBuilder(arr.substring(19,20).toUpperCase());
        StringBuilder fourthBlock = new StringBuilder(arr.substring(21,22).toUpperCase());

        StringBuilder result = firstBlock.append("/").append(secondBlock).append("/").append(thirdBlock).append("/").append(fourthBlock);

        System.out.println(result);
    }

    void printDocWithoutLetter(String arr) {
        String redactedNumber = arr.replaceFirst("([a-zA-Z]{3})", "***").replaceFirst("([a-zA-Z]{3})", "***");

        System.out.println("Pass number without letters: " + redactedNumber);
    }

    void mainStr() {
        System.out.println("Enter the pass number (xxxx-yyy-xxxx-yyy-xyxy): ");
        String pass = scanner.nextLine();

        if (isValidNumber(pass)) {
            printTwoBlocks(pass);
            printDocWithoutLetter(pass);
            printLettersInLowerCase(pass);
            printLettersInUpperCase(pass);
            containsAbc(pass);
            containsFive(pass);
            endOfDoc(pass);
        } else {
            System.out.println("Invalid pass number format.");
        }
    }
}
