package com.github.cchacin.android.jackson;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MutableIssue {

    @Test
    public void test() throws Exception {
        // Given
        final Mutable mutable = new Mutable("carlos");
        final Set<Mutable> mutables = new HashSet<Mutable>();
        mutables.add(mutable);

        System.out.println(mutable.hashCode());

        // When
        mutable.name = "other";
        System.out.println(mutable.hashCode());

        // Then
        Assertions.assertThat(mutables.contains(mutable)).isTrue();

        for (final Mutable m : mutables) {
            if (m.equals(mutable)) {
                Assertions.assertThat(mutables.contains(m)).isTrue();
            }
        }
    }
}
