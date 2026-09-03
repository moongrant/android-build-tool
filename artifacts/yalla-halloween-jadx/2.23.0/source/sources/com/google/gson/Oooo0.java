package com.google.gson;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Oooo0 {
    public final o0OoOo0 OooO00o() {
        if (this instanceof o0OoOo0) {
            return (o0OoOo0) this;
        }
        throw new IllegalStateException(com.app.base.protobuf.OooO0OO.OooO0O0("Not a JSON Object: ", this));
    }

    public String OooO0O0() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            TypeAdapters.f20694OooOoO.write(jsonWriter, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
