package picnicanalyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLongestWordFinder implements LongestWordFinder {
    private String fileName;

    public FileLongestWordFinder(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String findLongestWord() {
        String longestWord = "";
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return longestWord;
    }
}
