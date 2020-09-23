import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionaryCommandLine {

    /**
     * Show all words in dictionary in command line.
     * @param dictionary a dictionary
     */
    public static void showAllWords(Dictionary dictionary) {
        System.out.println("No   | English             | Vietnamese");
        for (int i = 0; i < dictionary.getDictionary().size(); i++) {
            System.out.printf("%-5d| %-20s| %s\n", i + 1, dictionary.getDictionary().get(i).getWord_target(), dictionary.getDictionary().get(i).getWord_explain());
        }
    }

    /**
     * Insert from command line then show all words of dictionary in command line.
     * @param dictionary a dictionary
     */
    public static void dictionaryBasic(Dictionary dictionary) {
        DictionaryManagement.insertFromCommandline(dictionary);
        DictionaryCommandLine.showAllWords(dictionary);
    }

    /**
     * Insert from file then show all words then look up a word's explanation.
     * @param d a dictionary
     */
    public static void dictionaryAdvanced(Dictionary d) throws FileNotFoundException {
        DictionaryManagement.insertFromFile(d);
        DictionaryCommandLine.showAllWords(d);
        DictionaryManagement.dictionaryLookUp(d);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Dictionary d = new Dictionary();
        DictionaryCommandLine.dictionaryAdvanced(d);
    }
}
