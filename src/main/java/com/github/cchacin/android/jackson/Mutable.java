package com.github.cchacin.android.jackson;

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

        if (this.name != null ? !this.name.equals(mutable.name) : mutable.name != null) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return this.name != null ? this.name.hashCode() : 0;
    }
}
