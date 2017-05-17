package snakecamel;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		/*Scanner s=new Scanner(System.in);
		System.out.println("適当なアルファベットを入力してください");
		String word=s.next();
		System.out.println("あなたが入力した単語は次のうち、どのパターンですか？番号を入力してください");
		System.out.println("_を含む→１");
		System.out.println("大文字を１つ含む→２");
		System.out.println("大文字を2つ以上含む→３");
		System.out.println("小文字のみ→４");
		String number=s.next();
		int n = Integer.parseInt(number);
		SnakeCamelUtil snake=new SnakeCamelUtil();
		if(n==1){
			String st=snake.snakeToCamelcase(word);
			System.out.println(st);
		}else if(n==2){
			String st=snake.uncapitalize(word);
			System.out.println(st);
		}else if(n==3){
			String st=snake.camelToSnakecase(word);
			System.out.println(st);
		}else{
			String st=snake.capitalize(word);
			System.out.println(st);
		}*/
		SnakeCamelUtilTest test=new SnakeCamelUtilTest();
		test.test0();
		test.test1();
		test.test2();
		test.test3();
		test.test4();
		test.test5();
		test.test6();
		test.test7();
		test.test8();
		test.test9();
		test.test10();
		test.test11();
		test.test12();
		test.test13();
	}
}
