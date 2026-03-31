import java.io.*;
import java.util.*;
public class DuplicateWords {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        Map<String, Integer> wordCount = new HashMap<>();

        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.toLowerCase().split("\\W+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }
        
        br.close();

        System.out.println("Duplicate Words:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}