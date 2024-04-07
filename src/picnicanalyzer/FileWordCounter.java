package picnicanalyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWordCounter implements WordCounter {
    private String fileName;

    public FileWordCounter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public int countWords() {
        int count = 0;
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return count;
    }
}
