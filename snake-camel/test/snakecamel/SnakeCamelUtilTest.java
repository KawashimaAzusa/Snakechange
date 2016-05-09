package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
public class SnakeCamelUtilTest {

	
	@Test
	public void snakeToCamel(){
		SnakeCamelUtil SC = new SnakeCamelUtil();
		String expected = "AzusaKawashima";
		String actual = SC.snakeToCamelcase("azusa_kawashima");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnake(){
		SnakeCamelUtil SC = new SnakeCamelUtil();
		String expected = "azusa_kawashima";
		String actual = SC.camelToSnakecase("AzusaKawashima");
		assertThat(actual, is(expected));
	}
	@Test
	public void capitalizeTest(){
	SnakeCamelUtil SC = new SnakeCamelUtil();
	String expected = "Azusa";
	String actual = SC.capitalize("azusa");
	assertThat(actual, is(expected));	
	}	
	@Test
	public void uncapitalizeTest(){
	SnakeCamelUtil SC = new SnakeCamelUtil();
	String expected = "azusa";
	String actual = SC.uncapitalize("Azusa");
	assertThat(actual, is(expected));
	}
}