package main;

import java.text.MessageFormat;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Counter counter = new Counter();

        do {
            counter.count(scanner.nextLine());
        } while (!counter.stop);

        var out = MessageFormat.format("words: {0}\ncharacters: {1}\nrows: {2}\nlongest word: {3}", counter.words, counter.characters, counter.rows, counter.longestWord);
        System.out.println(out);
    }
}
