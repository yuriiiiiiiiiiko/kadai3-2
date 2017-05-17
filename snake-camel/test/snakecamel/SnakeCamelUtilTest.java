package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class SnakeCamelUtilTest {

	@Test
	public void test0() {
		//fail("Not yet implemented");
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected ="VnBalletSuki";
		String actual=snake.snakeToCamelcase("vn_ballet_suki");
		assertThat(actual, is(expected));
	}
	@Test
	public void test1() {
		//fail("Not yet implemented");
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected ="opqr_s_tu";
		String actual=snake.camelToSnakecase("OpqrSTu");
		assertThat(actual, is(expected));
	}
	@Test
	public void test2() {
		//fail("Not yet implemented");
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected ="A";
		String actual=snake.capitalize("a");
		assertThat(actual, is(expected));
	}
	@Test
	public void test3() {
		//fail("Not yet implemented");
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected ="Xyz";
		String actual=snake.capitalize("xyz");
		assertThat(actual, is(expected));
	}
	@Test
	public void test4() {
		//fail("Not yet implemented");
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected ="a";
		String actual=snake.uncapitalize("A");
		assertThat(actual, is(expected));
	}
	@Test
	public void test5() {
		//fail("Not yet implemented");
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected ="xyz";
		String actual=snake.uncapitalize("Xyz");
		assertThat(actual, is(expected));
	}
	@Test
	public void test6() {
		//fail("Not yet implemented");
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected ="Abc";
		String actual=snake.snakeToCamelcase("abc");
		assertThat(actual, is(expected));
	}
	@Test
	public void test7() {
		//fail("Not yet implemented");
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected ="AbcDef";
		String actual=snake.snakeToCamelcase("abc_def");
		assertThat(actual, is(expected));
	}
	@Test
	public void test8() {
		//fail("Not yet implemented");
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected ="AbcDefGh";
		String actual=snake.snakeToCamelcase("abc_def_gh");
		assertThat(actual, is(expected));
	}
	@Test
	public void test9() {
		//fail("Not yet implemented");
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected ="AbcDefGh";
		String actual=snake.snakeToCamelcase("abc_def__gh");
		assertThat(actual, is(expected));
	}
	@Test
	public void test10() {
		//fail("Not yet implemented");
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected ="AbcDef";
		String actual=snake.snakeToCamelcase("_abc_def");
		assertThat(actual, is(expected));
	}
	@Test
	public void test11() {
		//fail("Not yet implemented");
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected ="abc";
		String actual=snake.camelToSnakecase("Abc");
		assertThat(actual, is(expected));
	}
	@Test
	public void test12() {
		//fail("Not yet implemented");
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected ="abc_def";
		String actual=snake.camelToSnakecase("AbcDef");
		assertThat(actual, is(expected));
	}
	@Test
	public void test13() {
		//fail("Not yet implemented");
		SnakeCamelUtil snake=new SnakeCamelUtil();
		String expected ="abc_def_gh";
		String actual=snake.camelToSnakecase("AbcDefGh");
		assertThat(actual, is(expected));
	}
}
