package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p386o0OOoo0O.o00O0O00;
import p387o0OOoo0o.o00O0O0O;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends o00O0<Object> {
    public static final o00O0O00 FACTORY = new o00O0O00() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // p386o0OOoo0O.o00O0O00
        public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
            Type type = o00000o1.getType();
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(o000ooo1, o000ooo1.OooO0o0(o00000O0.get(genericComponentType)), o00O0O0O.OooO0o(genericComponentType));
        }
    };
    private final Class<E> componentType;
    private final o00O0<E> componentTypeAdapter;

    public ArrayTypeAdapter(o000OOo0 o000ooo1, o00O0<E> o00o1, Class<E> cls) {
        this.componentTypeAdapter = new OooO0o(o000ooo1, o00o1, cls);
        this.componentType = cls;
    }

    @Override // p386o0OOoo0O.o00O0
    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.componentTypeAdapter.read(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.componentType, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // p386o0OOoo0O.o00O0
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.componentTypeAdapter.write(jsonWriter, (E) Array.get(obj, i));
        }
        jsonWriter.endArray();
    }
}
