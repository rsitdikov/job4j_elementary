package ru.job4j.record;

public record PersonRecord(String name, int age) implements Comparable<PersonRecord> {
    public static int maxAge = 100;

    public PersonRecord {
        if (age > 101) {
            throw new IllegalArgumentException("Возраст должен быть менее 101");
        }
    }

    @Override
    public int compareTo(PersonRecord o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", age=" + age
                + '}';
    }

    public static int getMaxAge() {
        return maxAge;
    }

    public void info() {
        System.out.println("Напечатать информацию");
    }
}