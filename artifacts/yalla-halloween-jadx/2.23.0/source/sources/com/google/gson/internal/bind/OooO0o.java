package com.google.gson.internal.bind;

import com.google.gson.OooOOO0;
import com.google.gson.o0ooOOo;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o<T> extends o0ooOOo<T> {
    private final OooOOO0 context;
    private final o0ooOOo<T> delegate;
    private final Type type;

    public OooO0o(OooOOO0 oooOOO0, o0ooOOo<T> o0ooooo, Type type) {
        this.context = oooOOO0;
        this.delegate = o0ooooo;
        this.type = type;
    }

    private Type getRuntimeTypeIfMoreSpecific(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }

    @Override // com.google.gson.o0ooOOo
    public T read(JsonReader jsonReader) throws IOException {
        return this.delegate.read(jsonReader);
    }

    @Override // com.google.gson.o0ooOOo
    public void write(JsonWriter jsonWriter, T t) throws IOException {
        o0ooOOo<T> o0oooooOooO0o0 = this.delegate;
        Type runtimeTypeIfMoreSpecific = getRuntimeTypeIfMoreSpecific(this.type, t);
        if (runtimeTypeIfMoreSpecific != this.type) {
            o0oooooOooO0o0 = this.context.OooO0o0(TypeToken.get(runtimeTypeIfMoreSpecific));
            if (o0oooooOooO0o0 instanceof ReflectiveTypeAdapterFactory.OooO0O0) {
                o0ooOOo<T> o0ooooo = this.delegate;
                if (!(o0ooooo instanceof ReflectiveTypeAdapterFactory.OooO0O0)) {
                    o0oooooOooO0o0 = o0ooooo;
                }
            }
        }
        o0oooooOooO0o0.write(jsonWriter, t);
    }
}
