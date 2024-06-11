import java.util.Scanner;

public class last {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 for (int i = 1; i < 101; i++) {
	            if (i % (3 * 5) == 0) {
	                System.out.println("FizzBuzz");
	            } else if (i % 3 == 0) {
	                System.out.println("Fizz");
	            } else if (i % 5 == 0) {
	                System.out.println("Buzz");
	            } else {
	                System.out.println(i);
	            }
	        }
		 System.out.println();
		 
		 
		 Scanner sc = new Scanner(System.in);
		  out : while (sc.hasNextLine()) {
		  String line = sc.nextLine();

		String[] arr = line.split(" ");

		double total = 0;

		if (arr.length < 3 || ((arr.length != 3) && (arr.length % 3 != 2))) {

		System.out.println("数値 演算子 数値 演算子 … の順に最低2つの引数を指定してください");
		  continue;

		} else {

		// 先頭の数値
		  if (checkNum(arr[0])) {

		//数値変換
		  total = Double.parseDouble(arr[0]);

		}

		for (int i = 0; i <= ((arr.length - 3) / 2); i++) {

		//先頭の数値以降は一つとびに演算子と数値が続く
		  if (checkOperator(arr[i * 2 + 1]) && checkNum(arr[i * 2 + 2])) {

		//演算子によってtotalに合算する処理を変更
		  switch (arr[i * 2 + 1]) {

		case "+":
		  total = total + Double.parseDouble(arr[i * 2 + 2]);
		  break;

		case "-":
		  total = total - Double.parseDouble(arr[i * 2 + 2]);
		  break;

		case "*":
		  total = total * Double.parseDouble(arr[i * 2 + 2]);
		  break;

		case "/":
		  total = total / Double.parseDouble(arr[i * 2 + 2]);
		  break;

		}

		} else {
		  System.out.println("数値 演算子 数値  … の順に引数を指定してください");
		  continue out;
		  }
		}
		  System.out.println("合計:" + total);
		  
		  }
        	System.out.println("続行/終了（続行：Y、終了：N）");
        	String repeat =sc.nextLine();
        	if (!repeat.equalsIgnoreCase("Y")) {
            break;
        	}sc.close();
		  }System.out.println();
		
		  }

		// 数値チェック 数値の場合にtrue 数値以外の場合false
		  private static boolean checkNum(String str) {

		try {

		// double型へ変換し、エラーが出なければ数値とみなす
		  Double.parseDouble(str);

		} catch (NumberFormatException e) {

		return false;

		}

		return true;

		}

		// 演算子チェック
		  private static boolean checkOperator(String str) {

		if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
		  return true;
		  } else {
		  return false;
		  }
		  }
		  
}
