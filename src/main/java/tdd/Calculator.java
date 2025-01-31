package tdd;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int add(String numbers) {
        String[] numbersArray = numbers.split(",");
        int sum = 0;
        for(int i = 0; i < numbersArray.length; i++) {
            sum += Integer.parseInt(numbersArray[i].trim());
        }
        return sum;
    }

    public int add(int[] numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
