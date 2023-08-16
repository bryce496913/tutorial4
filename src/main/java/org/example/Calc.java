package org.example;

public class Calc {

    public int add(int x, int y)
    {
        return x+y;
    }

    public int subtract(int x, int y)
    {
        return x*y;
    }

    public void testSubtraction() {
        assertEquals(2, c.subtract(4,2));
    }
}
