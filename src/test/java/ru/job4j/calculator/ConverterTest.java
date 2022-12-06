package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    void whenConvert140RblThen2dot3333Dlr() {
        float in = 140;
        float expected = 2.3333f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}