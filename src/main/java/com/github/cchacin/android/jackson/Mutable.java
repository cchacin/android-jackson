package com.github.cchacin.android.jackson;

import com.google.common.base.Objects;

public class Mutable {

    public String name;

    public Mutable(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        final Mutable mutable = (Mutable) o;
        return Objects.equal(this.name, mutable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.name);
    }
}
