package ru.job4j.max.maxTest;

import org.junit.Test;
import ru.job4j.max.maxMain.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void maximumOfTwoFirstMore() {
        Max maxim = new Max();
        int result = maxim.max(0, 1);
        assertThat(result, is(1));
    }

    @Test
    public void maximumOfTwoSecondMore(){
        Max maxim = new Max();
        int result = maxim.max(1,0);
        assertThat(result, is(1));




    }
    @Test
    public void maximumOfThreeFirstMore(){
        Max maxim = new Max();
        int result = maxim.max(10,1,2);
        assertThat(result, is(10));

    }

    @Test
    public void maximumOfThreeSecondMore(){
        Max maxim = new Max();
        int result = maxim.max(1,10,2);
        assertThat(result, is(10));

    }

    @Test
    public void maximumOfThreeThirdMore(){
        Max maxim = new Max();
        int result = maxim.max(1,2,10);
        assertThat(result, is(10));

    }

}
