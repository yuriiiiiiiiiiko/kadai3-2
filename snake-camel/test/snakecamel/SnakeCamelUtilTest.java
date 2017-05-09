package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class SnakeCamelUtilTest {

	@Test
	public void test0() {
		//fail("Not yet implemented");
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected ="VnBallet";
		String actual=snake.snakeToCamelcase("vn_ballet_suki");
		assertThat(actual, is(expected));
	}
	@Test
	public void test1() {
		//fail("Not yet implemented");
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected ="oOpqr_sS_tTu";
		String actual=snake.camelToSnakecase("OpqrSTu");
		assertThat(actual, is(expected));
	}
}
