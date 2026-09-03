package com.google.gson.internal.bind;

import com.google.gson.OooOOO0;
import com.google.gson.o0OOO0o;
import com.google.gson.o0ooOOo;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ArrayTypeAdapter<E> extends o0ooOOo<Object> {
    public static final o0OOO0o FACTORY = new o0OOO0o() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.o0OOO0o
        public <T> o0ooOOo<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
            Type type = typeToken.getType();
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(oooOOO0, oooOOO0.OooO0o0(TypeToken.get(genericComponentType)), com.google.gson.internal.OooO0O0.OooO0o(genericComponentType));
        }
    };
    private final Class<E> componentType;
    private final o0ooOOo<E> componentTypeAdapter;

    public ArrayTypeAdapter(OooOOO0 oooOOO0, o0ooOOo<E> o0ooooo, Class<E> cls) {
        this.componentTypeAdapter = new OooO0o(oooOOO0, o0ooooo, cls);
        this.componentType = cls;
    }

    @Override // com.google.gson.o0ooOOo
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

    @Override // com.google.gson.o0ooOOo
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
