package java_last;
import java.util.Scanner;

public class last2 {
	public static void main(String[] args){
		Scanner scan = new Scanner( System.in );
		System.out.println("配列の長さを指定");
		int num = scan.nextInt();
		int score[] = new int[num];
		for(int i =0; i < num; i++){
		    System.out.println(i + 1 + "番目の数値を入れてください");
		    int digit = scan.nextInt(); scan.nextLine();
		    score[i] = digit;
		}
		System.out.println("昇順または降順を入力してください");
    	String repeat = scan.nextLine();
    	if (repeat.equalsIgnoreCase("昇順")) {
    		for(int i=0; i < score.length; i++) {
                for(int j = i; j < score.length; j++) {
                		if(score[i] >= score[j]) {
                			int swap = score[i];
                			score[i] = score[j];
                			score[j] = swap;
                		}
                	}
                System.out.print(score[i] + ", ");
         
            }
    		
    	}else if(!repeat.equalsIgnoreCase("昇順")) {
    		for(int i=0; i < score.length; i++) {
                for(int j = i; j < score.length; j++) {
                		if(score[i] <= score[j]) {
                			int swap = score[i];
                			score[i] = score[j];
                			score[j] = swap;
                		}
                	}
                System.out.print(score[i] + ", ");
    		
    		}
		
    	}
	}
}


