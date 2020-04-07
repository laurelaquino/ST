package st1920.automaton;

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

    @Test
    public void test13() {
        assertTrue(reg.matches("bbbb\nab", ".*$.."));
    }

    @Test
    public void test14() {
        try{
            assertTrue(reg.matches("(\r\nhello\n)\r", "($[a-z]{1-20}$)$"));
        } catch (Exception e) {

        }
    }

    @Test
    public void test15() {
        assertTrue(reg.matches("", "$?"));
    }

    @Test
    public void test16() {
        assertTrue(reg.matches("\r\n", "$?"));
    }

    @Test
    public void test17() {
        assertTrue(reg.matches("\n\r", "$*"));
    }

    @Test
    public void test18() {
        assertTrue(reg.matches("\r\n\r\n", "${2}"));
    }

    @Test
    public void test19() {
        assertTrue(reg.matches("\r\n\r\n", "${4}"));
    }

    @Test
    public void test20() {
        assertTrue(reg.matches("\r\n\r\n", "${2,}"));
    }

    @Test
    public void test21() {
        assertTrue(reg.matches("\r\n\r\n", "${2,4}"));
    }

    @Test
    public void test22() {
        assertTrue(reg.matches("hi", "..~$"));
    }

    @Test
    public void test23() {
        assertTrue(reg.matches("aaa\n\nbbb", "[a-c]*$*[b-c]+"));
    }

    @Test
    public void test24() {
        assertTrue(reg.matches("\n5\n5\n5", "($<1-10>)*"));
    }

    @Test
    public void test25() {
        assertTrue(reg.matches("$$$", "\\$\\$\\$"));
    }

    @Test
    public void test26() {
        assertTrue(reg.matches("\n", "[^ a-z A-Z 1-999]"));
    }

    @Test
    public void test27() {
        assertTrue(reg.matches("rrrrrrrrrr\r\nnnnnnnnnnnn", ".+$.*"));
    }

    @Test
    public void test28() {
        assertFalse(reg.matches("\n*", "$*"));
    }

    @Test
    public void test29() {
        assertFalse(reg.matches("hello  world", "hello$world"));
    }

    @Test
    public void test30() {
        assertTrue(reg.matches("t\ne\r\ns\rt", ".$.$.$."));
    }

}
