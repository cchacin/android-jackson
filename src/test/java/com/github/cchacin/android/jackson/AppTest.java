package com.github.cchacin.android.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AppTest {

    @Test
    public void testSerialization() throws Exception {
        // Given
        final App app = new App("a", 1, true);

        // When
        final String json = new ObjectMapper().writeValueAsString(app);

        // Then
        Assertions.assertThat(json).isEqualTo("{\"a\":\"a\",\"b\":1,\"c\":true}");
    }

    @Test
    public void testDeserialization() throws Exception {
        // Given
        final String json = "{\"a\":\"a\",\"b\":1,\"c\":true}";

        // When
        final App app = new ObjectMapper().readValue(json, App.class);

        // Then
        Assertions.assertThat(app).isEqualToComparingFieldByField(new App("a", 1, true)); // We don't have equals() :(
    }
}
