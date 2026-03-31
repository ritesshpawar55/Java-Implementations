package Task_9_Pro4;
import java.io.*;
import java.util.*;
class FileWordCount implements Runnable {
    String fileName;
    int count;

    FileWordCount(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) count += words.length;
            }
            br.close();
            System.out.println(fileName + " -> " + count);
        } catch (Exception e) {
            System.out.println(fileName + " -> Error");
        }
    }
}
public class WordCountMain {
    public static void main(String[] args) throws Exception {
        String[] files = {"file1.txt", "file2.txt", "file3.txt"};
        List<Thread> threads = new ArrayList<>();
        for (String f : files) {
            Thread t = new Thread(new FileWordCount(f));
            threads.add(t);
            t.start();
        }
        for (Thread t : threads) {
            t.join();
        }
    }
}