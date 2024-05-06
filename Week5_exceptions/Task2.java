package Week5_exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Task2 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("Lincoln.txt")) {
            StringBuilder sb = new StringBuilder();
            int WordsCount = 0;
            int c;
            while ((c = fis.read()) != -1) {
                if (Character.isWhitespace(c)) {
                    String word = sb.toString();
                    if (!word.isEmpty()) {
                        WordsCount++;
                        sb.setLength(0);
                    }
                } else {
                    sb.append((char) c);
                }
            }
            // Print the last word if any
            String lastWord = sb.toString();
            if (!lastWord.isEmpty()) {
                WordsCount++;
            }
            System.out.println(WordsCount);
            try(FileOutputStream fos = new FileOutputStream("Lincoln.txt",true)) {
                fos.write(("\n" + WordsCount + "\n").getBytes());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
