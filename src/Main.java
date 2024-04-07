import picnicanalyzer.FileLongestWordFinder;
import picnicanalyzer.FileWordCounter;
import picnicanalyzer.FileWordFrequencyCalculator;
import picnicanalyzer.PicnicAnalyzer;

public static void main(String[] args) {
    PicnicAnalyzer analyzer = new PicnicAnalyzer(new FileWordCounter("picnicanalyzer/input.txt"),
            new FileLongestWordFinder("picnicanalyzer/input.txt"),
            new FileWordFrequencyCalculator("picnicanalyzer/input.txt"));
    analyzer.analyze();
}

