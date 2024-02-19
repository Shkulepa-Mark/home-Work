package HomeWork_2;

public class Runner {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.calculate();

        NumberInterval numberInterval = new NumberInterval();
        numberInterval.interval();

        Translator translator = new Translator();
        translator.translate();

        ParityOfNumbers parityOfNumbers = new ParityOfNumbers();
        parityOfNumbers.parity();
    }
}
