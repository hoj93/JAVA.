import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class 05 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
			DataOutputStream dos=new DataOutputStream(new FileOutputStream("Student01.data"));
		
			System.out.println("학생 번호를 입력하세요.");
			int snum=scan.nextInt();
			dos.writeInt(snum);
			
			System.out.println("학생 이름을 입력하세요.");
			String name=scan.next();
			dos.writeUTF(name);
			
			System.out.println("국어 점수를 입력하세요.");
			int kor=scan.nextInt();
			dos.writeInt(kor);
			
			char grade=' ';
			if(kor>=90 && kor<=100) {
				grade='A';
			}else if(kor>=80) {
				grade='B';
			}else if(kor>=70) {
				grade='C';
			}else if(kor>=60){
				grade='F';	 	
			}
			dos.writeChar(grade);
			dos.close();
			System.out.println("파일 저장 완료");
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
