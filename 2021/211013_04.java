import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class 04{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		try {
			OutputStream os=new FileOutputStream("eng.txt");
			PrintWriter pw=new PrintWriter(os);
			
			System.out.println("영어와 해석을 적어주세요.(종료:0)");
			
			for(int i=0; i<3; i++) {
				String eng=scan.next();
				if(eng.equals("0")) {
					System.out.println("종료합니다.");
					break;
				}
				pw.println(eng);
			}
			pw.close();
			System.out.println("파일 저장 완료");
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}

