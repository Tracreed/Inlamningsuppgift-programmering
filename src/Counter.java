public class Counter {
    int words;
    int rows;
    int characters;
    String longestWord;

    boolean stop = false;

    Counter() {
        this.words = 0;
        this.rows = 0;
        this.characters = 0;
        this.longestWord = "";
    }

    void count(String line) {
        if (line.equalsIgnoreCase("stop")) {
            this.stop = true;
        }

        var characters = line.replace(" ", "");
        this.characters += characters.length();

        var words = line.split(" ");
        this.words += words.length;

        for (String word : words) {
            if (word.length() > this.longestWord.length()) {
                this.longestWord = word;
            }
        }

        this.rows++;
    }
}
