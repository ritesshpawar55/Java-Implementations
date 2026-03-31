import java.io.*;
import java.util.*;

public class UniqueWords {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        Set<String> uniqueWords = new HashSet<>();

        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.toLowerCase().split("\\W+");
            for (String word : words) {
                if (!word.isEmpty()) {
                    uniqueWords.add(word);
                }
            }
        }
        br.close();

        System.out.println("Unique Words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}