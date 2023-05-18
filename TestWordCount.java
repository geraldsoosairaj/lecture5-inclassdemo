// Commands to compile and run JUnit Tests
// javac -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar WordCount.java TestWordCount.java
// java -cp lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore TestWordCount

import static org.junit.Assert.*;
import org.junit.*;

public class TestWordCount {
    @Test
    public void testWordCount() {
        String three_words = "all is well";
        assertEquals(3, WordCount.countWords(three_words));

//         String three_words_with_space = " all is well ";
//         assertEquals(3, WordCount.countWords(three_words_with_space));
        
    }
}
