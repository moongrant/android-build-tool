package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o<T> extends o00O0<T> {
    private final o000OOo0 context;
    private final o00O0<T> delegate;
    private final Type type;

    public OooO0o(o000OOo0 o000ooo1, o00O0<T> o00o1, Type type) {
        this.context = o000ooo1;
        this.delegate = o00o1;
        this.type = type;
    }

    private Type getRuntimeTypeIfMoreSpecific(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }

    @Override // p386o0OOoo0O.o00O0
    public T read(JsonReader jsonReader) throws IOException {
        return this.delegate.read(jsonReader);
    }

    @Override // p386o0OOoo0O.o00O0
    public void write(JsonWriter jsonWriter, T t) throws IOException {
        o00O0<T> o00o0OooO0o0 = this.delegate;
        Type runtimeTypeIfMoreSpecific = getRuntimeTypeIfMoreSpecific(this.type, t);
        if (runtimeTypeIfMoreSpecific != this.type) {
            o00o0OooO0o0 = this.context.OooO0o0(o00000O0.get(runtimeTypeIfMoreSpecific));
            if (o00o0OooO0o0 instanceof ReflectiveTypeAdapterFactory.OooO0O0) {
                o00O0<T> o00o1 = this.delegate;
                if (!(o00o1 instanceof ReflectiveTypeAdapterFactory.OooO0O0)) {
                    o00o0OooO0o0 = o00o1;
                }
            }
        }
        o00o0OooO0o0.write(jsonWriter, t);
    }
}
