import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionaryManagement {

    /**
     * Insert from command line.
     * @param dictionary a dictionary
     */
    public static void insertFromCommandline(Dictionary dictionary) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < size; i++) {
            String wordTarget = scanner.nextLine();
            String wordExplain = scanner.nextLine();
            dictionary.getDictionary().add(new Word(wordTarget, wordExplain));
        }
    }

    /**
     * Insert from file.
     * @param d a dictionary
     * @throws FileNotFoundException if file is not found
     */
    public static void insertFromFile(Dictionary d) throws FileNotFoundException {
        File currentFile = new File("");
        File myDictionary = new File(currentFile.getAbsolutePath() + "\\src\\dictionaries.txt");

        Scanner scanner = new Scanner(myDictionary);
        while (scanner.hasNext()) {
            String wordTarget = scanner.next();
            scanner.skip("\t");
            String wordExplain = scanner.nextLine();
            d.getDictionary().add(new Word(wordTarget, wordExplain));
        }
    }

    /**
     * Look up a word in dictionary.
     * Print the word's explanation if it's found or "Not found" if not
     * @param d a dictionary
     */
    public static void dictionaryLookUp(Dictionary d) {
        String result = "Not found";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your word to look up: ");
        String wordTarget = scanner.next();
        for (int i = 0; i < d.getDictionary().size(); i++) {
            if (d.getDictionary().get(i).getWord_target().toLowerCase().equals(wordTarget.toLowerCase())) {
                result = d.getDictionary().get(i).getWord_explain();
                break;
            }
        }
        System.out.println("Your word's explanation: " + result);
    }
}