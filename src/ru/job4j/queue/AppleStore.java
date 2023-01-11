package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    private String process(int count) {
        for (int i = 0; i < count; i++) {
            queue.poll();
        }
        Customer customer = queue.poll();
        return customer == null ? "" : customer.name();
    }

    public String getLastHappyCustomer() {
        return process(count - 1);
    }

    public String getLastUpsetCustomer() {
        return process(count);
    }
}