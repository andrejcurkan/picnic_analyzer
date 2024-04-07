package picnicanalyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileWordFrequencyCalculator implements WordFrequencyCalculator {
    private String fileName;

    public FileWordFrequencyCalculator(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Map<String, Integer> calculateWordFrequency() {
        Map<String, Integer> wordFrequency = new HashMap<>();
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()) {
                String word = scanner.next();
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return wordFrequency;
    }
}
