package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenManHeightIs100ThenWeightIs0() {
        double height = 100.0;
        double expectedWeight = 0.0;
        double actualWeight = Fit.calculateManWeight(height);
        assertThat(actualWeight).isEqualTo(expectedWeight);
    }

    @Test
    void whenManHeightIs180ThenWeightIs92() {
        double height = 180.0;
        double expectedWeight = 92.0;
        double actualWeight = Fit.calculateManWeight(height);
        assertThat(actualWeight).isEqualTo(expectedWeight);
    }

    @Test
    void whenWomanHeightIs150ThenWeightIs46() {
        double height = 150.0;
        double expectedWeight = 46.0;
        double actualWeight = Fit.calculateWomanWeight(height);
        assertThat(actualWeight).isEqualTo(expectedWeight);
    }

    @Test
    void whenHeightIsNegativeThenThrowException() {
        double manHeightAdjustment = 100.0;
        double height = -10.0;
        assertThatThrownBy(() -> Fit.calculateWeight(height, manHeightAdjustment))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Height must be greater than 0");
    }
}
