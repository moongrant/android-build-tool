package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0OOO0o<T> {

    public class OooO00o extends o0OOO0o<T> {
        public OooO00o() {
        }

        @Override // com.google.gson.o0OOO0o
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (T) o0OOO0o.this.read(jsonReader);
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
            } else {
                o0OOO0o.this.write(jsonWriter, t);
            }
        }
    }

    public final T fromJson(Reader reader) throws IOException {
        return read(new JsonReader(reader));
    }

    public final T fromJsonTree(o000oOoO o000oooo2) {
        try {
            return read(new com.google.gson.internal.bind.OooO0O0(o000oooo2));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final o0OOO0o<T> nullSafe() {
        return new OooO00o();
    }

    public abstract T read(JsonReader jsonReader) throws IOException;

    public final void toJson(Writer writer, T t) throws IOException {
        write(new JsonWriter(writer), t);
    }

    public final o000oOoO toJsonTree(T t) {
        try {
            com.google.gson.internal.bind.OooO0OO oooO0OO = new com.google.gson.internal.bind.OooO0OO();
            write(oooO0OO, t);
            return oooO0OO.OooO00o();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public abstract void write(JsonWriter jsonWriter, T t) throws IOException;

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
