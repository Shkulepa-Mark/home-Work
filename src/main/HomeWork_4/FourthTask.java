package HomeWork_4;

public class FourthTask {
    void badDay(){
        StringBuilder bDay = new StringBuilder("Плохой день");

        int lastIndexBad = bDay.lastIndexOf("Плохой");

        StringBuilder deleteBad = new StringBuilder(bDay.substring(lastIndexBad + 6));

        StringBuilder gDay = new StringBuilder(deleteBad);

        gDay.insert(0, "Хороший");

        int lastIndexDay = gDay.lastIndexOf("день");

        gDay.insert(lastIndexDay + 4, "!!!!!!!!!");

        System.out.println("String before replace symbols: " + gDay);

        int lastIndexSymbol = gDay.lastIndexOf("!");

        gDay.replace(lastIndexSymbol,lastIndexSymbol + 1, "?");

        System.out.println("Result string: " + gDay);
    }
}
