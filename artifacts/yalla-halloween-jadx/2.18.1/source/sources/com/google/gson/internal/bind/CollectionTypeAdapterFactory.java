package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Iterator;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p386o0OOoo0O.o00O0O00;
import p387o0OOoo0o.o00O0O0O;
import p387o0OOoo0o.o00OO00O;
import p387o0OOoo0o.o0o0Oo;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements o00O0O00 {
    private final o00OO00O constructorConstructor;

    public static final class OooO00o<E> extends o00O0<Collection<E>> {
        private final o0o0Oo<? extends Collection<E>> constructor;
        private final o00O0<E> elementTypeAdapter;

        public OooO00o(o000OOo0 o000ooo1, Type type, o00O0<E> o00o1, o0o0Oo<? extends Collection<E>> o0o0oo) {
            this.elementTypeAdapter = new OooO0o(o000ooo1, o00o1, type);
            this.constructor = o0o0oo;
        }

        @Override // p386o0OOoo0O.o00O0
        public Collection<E> read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> collectionOooO00o = this.constructor.OooO00o();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collectionOooO00o.add(this.elementTypeAdapter.read(jsonReader));
            }
            jsonReader.endArray();
            return collectionOooO00o;
        }

        @Override // p386o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.elementTypeAdapter.write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(o00OO00O o00oo00o) {
        this.constructorConstructor = o00oo00o;
    }

    @Override // p386o0OOoo0O.o00O0O00
    public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
        Type type = o00000o1.getType();
        Class<? super T> rawType = o00000o1.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type typeOooO0oO = o00O0O0O.OooO0oO(type, rawType, Collection.class);
        if (typeOooO0oO instanceof WildcardType) {
            typeOooO0oO = ((WildcardType) typeOooO0oO).getUpperBounds()[0];
        }
        Type type2 = typeOooO0oO instanceof ParameterizedType ? ((ParameterizedType) typeOooO0oO).getActualTypeArguments()[0] : Object.class;
        return new OooO00o(o000ooo1, type2, o000ooo1.OooO0o0(o00000O0.get(type2)), this.constructorConstructor.OooO00o(o00000o1));
    }
}
