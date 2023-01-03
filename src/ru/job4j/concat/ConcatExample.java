package ru.job4j.concat;

public class ConcatExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder str = new StringBuilder("Job4j");
        for (int index = 0; index < 9999; index++) {
            str.append(index);
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
        String str1 = "abc".concat("def").concat("ghi").concat("jkl");
        System.out.println(str1);
        String str2 = String.join(" ", "abc", "def", "ghi");
        System.out.println(str2);
    }
}