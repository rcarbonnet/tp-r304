package fr.unilim.iut.tirepressuremonitoringsystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SafetyRangeTest {

    @Test
    void contains_value_inside_range() {
        SafetyRange range = new SafetyRange(17, 21);
        assertTrue(range.contains(19));
        assertFalse(range.contains(25));
    }

    @Test
    void does_not_contain_value_outside_range() {
        SafetyRange range = new SafetyRange(17, 21);
        assertTrue(range.doesNotContain(10));
        assertFalse(range.doesNotContain(19));
    }
}