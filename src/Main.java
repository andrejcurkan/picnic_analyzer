import picnicanalyzer.FileLongestWordFinder;
import picnicanalyzer.FileWordCounter;
import picnicanalyzer.FileWordFrequencyCalculator;
import picnicanalyzer.PicnicAnalyzer;

public static void main(String[] args) {
    PicnicAnalyzer analyzer = new PicnicAnalyzer(new FileWordCounter("src\\input.txt"),
            new FileLongestWordFinder("src\\input.txt"),
            new FileWordFrequencyCalculator("src\\input.txt"));
    analyzer.analyze();
}

