import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:/Users/Admin/OneDrive/Desktop/PORTFOLIO/ritz.txt");
		
		fw.write("Hello I am doing File Handling Tasks.\n");
		fw.write("Further I'll be doing ReadFile also.");
		
		fw.close();
		
		System.out.println("Successfully excuted.");
	}
}
