import static org.junit.Assert.*;

import org.junit.Test;

import st1920.automaton.RegExpMatcher;

public class Task4 {
    private RegExpMatcher reg;

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

    @Test
    public void test5() {
        assertTrue(reg.matches("\r\n", "$$"));
    }

    @Test
    public void test6() {
        assertTrue(reg.matches("\r", "."));
    }

    @Test
    public void test7() {
        assertTrue(reg.matches("\n", "."));
    }

    @Test
    public void test8() {
        assertTrue(reg.matches("\r\n", ".."));
    }

    @Test
    public void test9() {
        assertTrue(reg.matches("\r\n\n\n", "\r\n+"));
    }

    @Test
    public void test10() {
        assertFalse(reg.matches("\r\n\r\n\r\n", "\r\n+"));
    }

    @Test
    public void test11() {
        assertFalse(reg.matches("", "$"));
    }

    @Test
    public void test12() {
        assertFalse(reg.matches("a", "$"));
    }

}
