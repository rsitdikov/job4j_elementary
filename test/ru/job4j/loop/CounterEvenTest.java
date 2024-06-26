package ru.job4j.loop;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterEvenTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int st = 1;
        int fn = 10;
        int expected = 30;
        int sm = CounterEven.add(st, fn);
        assertThat(sm, is(expected));
    }
}
