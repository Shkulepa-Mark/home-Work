package HomeWork_4;

public class ThirdTask {
    void replaceSymbol(){
        String text = "teamwithsomeofexcersicesabcwanttomakeitbetter";

        int firstIndex = text.indexOf("abc");
        int lastIndex = text.lastIndexOf("abc");

        String beforeAbc = text.substring(0,firstIndex);
        String afterAbc = text.substring(lastIndex + 3);

        System.out.println("Original string: " + text);
        System.out.println("Before abc: " + beforeAbc);
        System.out.println("After abc: " + afterAbc);
    }
}
