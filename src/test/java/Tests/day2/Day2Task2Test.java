package Tests.day2;

import Tests.AbstractTest;
import day2.Task2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Day2Task2Test extends AbstractTest {

    @Test
    public void One_ninetyEight() {
        setInput("1 98");
        Task2.main(new String[0]);
        assertEquals("5 15 25 35 45 55 65 75 85 95 ", getOutput(), "a = 1, b = 98");
    }

    @Test
    public void MinusTen_fifty() {
        setInput("-10 50");
        Task2.main(new String[0]);
        assertEquals("-5 5 15 25 35 45 ", getOutput(), "a = -10, b = 50");
    }
}