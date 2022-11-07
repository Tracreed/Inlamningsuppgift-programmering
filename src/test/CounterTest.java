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
    @DisplayName("Check main.Counter counts")
    void testCounts() {
        assertEquals(4, counter.words);
        assertEquals(3, counter.rows);
        assertEquals(25, counter.characters);
    }

    @Test
    @DisplayName("Check that the longest word is tracked correctly")
    void testLongestWord() {
        assertEquals(11, counter.longestWord.length());
    }

    @Test
    @DisplayName("Confirm that no additional counting after stop occurs")
    void testStopCount() {
        counter.count("stop");
        assertEquals(4, counter.words);
        assertEquals(3, counter.rows);
        assertEquals(25, counter.characters);
        assertTrue(counter.stop);
    }
}