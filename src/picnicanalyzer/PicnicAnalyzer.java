package picnicanalyzer;

import java.util.Map;

public class PicnicAnalyzer {
    private WordCounter wordCounter;
    private LongestWordFinder longestWordFinder;
    private WordFrequencyCalculator wordFrequencyCalculator;

    public PicnicAnalyzer(WordCounter wordCounter, LongestWordFinder longestWordFinder, WordFrequencyCalculator wordFrequencyCalculator) {
        this.wordCounter = wordCounter;
        this.longestWordFinder = longestWordFinder;
        this.wordFrequencyCalculator = wordFrequencyCalculator;
    }

    public void analyze() {
        // Задание 1: Подсчет слов
        int wordCount = wordCounter.countWords();
        System.out.println("Количество слов в файле: " + wordCount);

        // Задание 2: Нахождение самого длинного слова
        String longestWord = longestWordFinder.findLongestWord();
        System.out.println("Самое длинное слово в файле: " + longestWord);

        // Задание 3: Вычисление частоты слов
        Map<String, Integer> wordFrequency = wordFrequencyCalculator.calculateWordFrequency();
        System.out.println("Частота слов в файле:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PicnicAnalyzer analyzer = new PicnicAnalyzer(new FileWordCounter("picnicanalyzer/input.txt"),
                new FileLongestWordFinder("picnicanalyzer/input.txt"),
                new FileWordFrequencyCalculator("picnicanalyzer/input.txt"));
        analyzer.analyze();
    }
}
