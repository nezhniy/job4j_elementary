package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Nums() {
        int[] data = new int[] {13, 44, 15};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {13, 15, 44};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort6Nums() {
        int[] data = new int[] {13, 44, 15, 0, 98, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 0, 13, 15, 44, 98};
        assertThat(result).containsExactly(expected);
    }
}