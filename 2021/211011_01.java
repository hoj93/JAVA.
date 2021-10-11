import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class 01 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(System.in);
		FileWriter fw=null;
			
		try {
			fw=new FileWriter("test.txt");
			System.out.println("영문을 입력하세요(종료:exit)");
			while(true) {
				String txt=scan.next();
			if(txt.equals("exit")) {
				System.out.println("종료합니다.");
				fw.close();
				break;	
				}
				fw.write(txt); 
				}
			}catch(IOException ie) {
				System.out.println(ie.getMessage());
		}
	}
}

