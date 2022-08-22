package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean rsl = false;
        if (!name.isEmpty() && isLowerLatinLetter(name.codePointAt(0))) {
            rsl = true;
            for (int index = 1; index < name.length(); index++) {
                int code = name.codePointAt(index);
                if (!Character.isDigit(code)) {
                    if (!isLowerLatinLetter(code)
                            && !isUpperLatinLetter(code)
                            && !isSpecialSymbol(code)) {
                        rsl = false;
                        break;
                    }
                }
            }
        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
