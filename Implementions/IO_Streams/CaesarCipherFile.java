import java.io.*;
public class CaesarCipherFile {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append((char) ((ch - 'A' + shift) % 26 + 'A'));
            } else if (Character.isLowerCase(ch)) {
                result.append((char) ((ch - 'a' + shift) % 26 + 'a'));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }

    public static void main(String[] args) throws Exception {

        int shift = 3;

        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        BufferedWriter bwEnc = new BufferedWriter(new FileWriter("enc_message.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bwEnc.write(encrypt(line, shift));
            bwEnc.newLine();
        }
        br.close();
        bwEnc.close();

        BufferedReader brEnc = new BufferedReader(new FileReader("file2.txt"));
        BufferedWriter bwDec = new BufferedWriter(new FileWriter("dec_message.txt"));

        while ((line = brEnc.readLine()) != null) {
            bwDec.write(decrypt(line, shift));
            bwDec.newLine();
        }
        brEnc.close();
        bwDec.close();

        System.out.println("Encryption & Decryption Completed");
    }
}