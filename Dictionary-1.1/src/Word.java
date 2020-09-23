public class Word {
    private String word_target;
    private String word_explain;

    //Getters and setters
    public String getWord_target() {
        return word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }

    /**
     * Constructor 1.
     */
    Word() {}

    /**
     * Constructor 2.
     * @param word_target a word
     * @param word_explain an explanation of this word
     */
    Word(String word_target, String word_explain) {
        this.word_target = word_target;
        this.word_explain = word_explain;
    }
}
