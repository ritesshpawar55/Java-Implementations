import java.io.*;
public class FileRead {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:/Users/Admin/OneDrive/Desktop/PORTFOLIO/ritz.txt");
		FileWriter fw = new FileWriter("C:/Users/Admin/OneDrive/Desktop/PORTFOLIO/ritessh.txt");
		
		int ch;
		
		while((ch = fr.read()) != -1) {
			System.out.println((char) ch);
			fw.write(ch);
		}
		
		fr.close();
		fw.close();
		
		System.out.println("Successfully excuted.");
	}

}
