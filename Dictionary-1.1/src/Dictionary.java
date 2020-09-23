import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private List<Word> dictionary;


    //Getters and setters
    public List<Word> getDictionary() {
        return dictionary;
    }

    public void setDictionary(List<Word> dictionary) {
        this.dictionary = dictionary;
    }


    /**
     * Constructor 1.
     */
    Dictionary() {
        dictionary = new ArrayList<Word>();
    }

    /**
     * Constructor 2;
     * @param dictionary an array of words
     */
    Dictionary(List<Word> dictionary) {
        this.dictionary = dictionary;
    }
}
