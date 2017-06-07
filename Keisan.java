/**
 * 
 */
package keisan;

import java.util.Random;
import java.util.Scanner;

/**
 * @author atomi
 *
 */
public class Keisan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//リハビリとして凄く適当に書いてます
		//今後の課題
		//do-while文使って、名前の個所に数字を打ち込んだら（真面目に答えてよ！）
		//って怒られたり、
		//計算の個所で文字列を入れたら（それは文字だよね！）
		//って怒られたい。
		//メイのバカ！ってさつきに怒られたい！（マゾ並みの感想）
		//ところで、楕円の面積ってどう出すんだっけ…これも課題
		
		//文字読み込み
		Scanner Name = new Scanner(System.in);
		
		//某有名映画っぽく
		System.out.print("君の名は？：");
		String name = Name.next();
		
		//トトロのメイみてーな口調
		System.out.println("あなた" + name + "っていうのね！？");
		
		
		// 実数値計算が可能にする
		Scanner stdIn = new Scanner(System.in);
		System.out.println("xとyを加減乗除します");

		System.out.print("xの値：");
		double x = stdIn.nextDouble();

		System.out.print("yの値：");
		double y = stdIn.nextDouble();

		//加減乗除と余りを出す
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y));
		
		double a = -x;
		double b = -y;
		
		System.out.println("xの符号反転：" + a);
		System.out.println("yの符号反転：" + b);
		
		//三角形
		double tria = (x * y) / 2;
		System.out.println("底辺x、高さyの三角形：" + tria);
		
		//平均
		double ave = (x + y) / 2;
		System.out.println("平均：" + ave);
		
		//円周率定義
		final double PI = 3.1415;
		
		//xの円(面積)
		double sircx = x * x * PI;
		System.out.println("xの円：" + sircx);
		
		//yの円(面積)
		double sircy = y * y * PI;
		System.out.println("yの円：" + sircy);
		
		//乱数(0～9)
		Random rand = new Random();
		int luc = rand.nextInt(10);
		System.out.println("1～9の乱数：" + luc);
	}

}
