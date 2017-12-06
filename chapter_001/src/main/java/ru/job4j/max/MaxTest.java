package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenFirstLessSecond(){
        Max maxim = new Max();
        int result = maxim.max(0,1);
        assertThat(result, is(1));

    }
    @Test
    public void maximumOfThree(){
        Max maxim = new Max();
        int result = maxim.max(10,1,2);
        assertThat(result, is(10));

    }

}
