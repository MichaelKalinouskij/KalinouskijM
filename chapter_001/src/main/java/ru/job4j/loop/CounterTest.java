package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;



public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThirty(){
        Counter sum = new Counter();
        sum.add(1,10);
        assertThat(sum, is(2+4+6+8+10));
    }
}
