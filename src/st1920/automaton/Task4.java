import static org.junit.Assert.*;

import org.junit.Test;

import st1920.automaton.RegExpMatcher;

public class Task1 {

    @Test
    public void test1() {
        assertTrue(reg.matches("\n", "$"));
    }

    @Test
    public void test2() {
        assertTrue(reg.matches("\r", "$"));
    }

    @Test
    public void test3() {
        assertTrue(reg.matches("\r\n", "$"));
    }

    @Test
    public void test4() {
        assertTrue(reg.matches("a\naaa\r\n", "(a+$)+"));
    }
}
