import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class 03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		FileWriter fw=null;
		FileReader fr=null;
		
		System.out.println("복사할 원본 파일명을 적어주세요");
		String origiFilename=scan.nextLine();
		
		System.out.println("복사될 파일명을 적어주세요");
		String copyfilename=scan.nextLine();
		
		try {
			fr=new FileReader(origiFilename);
			fw=new FileWriter(copyfilename);

			char[] string = new char[128]; 
			int n=0;
			while((n=fr.read(string))!=-1) {
				fw.write(string,0,n);
			}
			System.out.println("파일을 복사했습니다");
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}finally {
			try {
				if(fw!=null) fw.close();
				if(fr!=null) fr.close();
			}catch(IOException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}
}
