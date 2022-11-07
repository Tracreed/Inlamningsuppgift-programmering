package test;

import main.Counter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    Counter counter;

    @BeforeEach
    void setUp() {
        counter = new Counter();
        counter.count("Word");
        counter.count("LongestWord");
        counter.count("Four Words");
    }

    @Test
    @DisplayName("Check that stop sets the flag correctly")
    void testStop() {
        counter.count("stop");
        assertTrue(counter.stop);
    }

    @Test
    @DisplayName("Check that stop trigger is case insensitive")
    void testStopCase() {
        counter.count("StOp");
        assertTrue(counter.stop);
    }

    @Test
    @DisplayName("Check word count")
    void testWordCount() {
        assertEquals(4, counter.words);
    }

    @Test
    @DisplayName("Check line count")
    void testRowCount() {
        assertEquals(3, counter.rows);
    }

    @Test
    @DisplayName("Check character count")
    void testCharacterCount() {
        assertEquals(25, counter.characters);
    }

    @Test
    @DisplayName("Check that the longest word is tracked correctly")
    void testLongestWord() {
        assertEquals(11, counter.longestWord.length());
    }
}