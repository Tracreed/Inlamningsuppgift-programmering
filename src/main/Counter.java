package main;

public class Counter {
    public int words;
    public int rows;
    public int characters;
    public String longestWord;

    public boolean stop = false;

    public Counter() {
        this.words = 0;
        this.rows = 0;
        this.characters = 0;
        this.longestWord = "";
    }

    public void count(String line) {
        if (line.equalsIgnoreCase("stop")) {
            this.stop = true;
            return;
        }

        this.characters += line.length();

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

