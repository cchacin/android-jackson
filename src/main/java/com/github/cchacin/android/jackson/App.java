package com.github.cchacin.android.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class App {

    public final String  a;
    public final int     b;
    public final boolean c;

    @JsonCreator
    public App(@JsonProperty("a") final String a,
               @JsonProperty("b") final int b,
               @JsonProperty("c") final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
