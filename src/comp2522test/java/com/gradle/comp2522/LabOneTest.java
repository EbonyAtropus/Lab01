package com.gradle.comp2522;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LabOneTest {
    @Test
    public void LabOneNormalNumbers() {

        LabOne fb = new LabOne();
        Assertions.assertEquals("1", fb.convert(1));
        Assertions.assertEquals("2", fb.convert(2));
    }

    @Test
    public void LabOneThreeNumbers() {

        LabOne fb = new LabOne();
        Assertions.assertEquals("LAB", fb.convert(3));
    }

    @Test
    public void LabOneFiveNumbers() {

        LabOne fb = new LabOne();
        Assertions.assertEquals("ONE", fb.convert(5));
    }

    @Test
    public void LabOneThreeAndFiveNumbers() {

        LabOne fb = new LabOne();
        Assertions.assertEquals("ONE", fb.convert(5));
    }
}