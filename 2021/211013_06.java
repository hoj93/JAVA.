import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class 06 {
	public static void main(String[] args) {
		try {
			DataInputStream dis=new DataInputStream(new FileInputStream("Student01.data"));
			System.out.println("학생번호 이름 국어점수 학점");
			
			int snum=dis.readInt();
			String name=dis.readUTF();
			int kor=dis.readInt();
			char grade=dis.readChar();
			dis.close();
			System.out.println("  " + snum + "   " + name + "  " + kor + "    " + grade);
			
		}catch(EOFException e) {
			System.out.println("파일을 모두 읽었습니다.");	
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
	}
}
