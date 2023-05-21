package ru.job4j.array;

public class SimpleStringEncoder {

    private static String concatenate(String string, char sym, int count) {
        return count > 1 ? string + sym + count : string + sym;
    }

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int index = 1; index < input.length(); index++) {
            if (symbol == input.charAt(index)) {
                counter++;
            } else {
                result = concatenate(result, symbol, counter);
                symbol = input.charAt(index);
                counter = 1;
            }
        }
        return concatenate(result, symbol, counter);
    }
}