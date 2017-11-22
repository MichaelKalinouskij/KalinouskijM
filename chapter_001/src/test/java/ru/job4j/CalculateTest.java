package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
* Test.
*
* @author Petr Arsentev (parsentev@yandex.ru)
* @version $Id$
* @since 0.1
*/

public class CalculateTest {
	/**
	* Test echo.
	*/

	@Test
	public void whenTakenThenTreeEchoPlusName() {
	
		String input = "Michail Kalinouskij";
		String expect = "Echo, echo, echo : Michail Kalinouskij";
	
		//new object
		Calculate calc = new Calculate();
	
		//execute method echo with parameter input and record it in the result variable.
		String result = calc.echo(input);
	
		//compare
		assertThat(result, is(expect));
	}
 
}