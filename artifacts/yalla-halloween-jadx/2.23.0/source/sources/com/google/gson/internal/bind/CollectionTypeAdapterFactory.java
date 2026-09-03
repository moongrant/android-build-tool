package com.google.gson.internal.bind;

import com.google.gson.OooOOO0;
import com.google.gson.internal.OooOo00;
import com.google.gson.internal.oo000o;
import com.google.gson.o0OOO0o;
import com.google.gson.o0ooOOo;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionTypeAdapterFactory implements o0OOO0o {
    private final OooOo00 constructorConstructor;

    public static final class OooO00o<E> extends o0ooOOo<Collection<E>> {
        private final oo000o<? extends Collection<E>> constructor;
        private final o0ooOOo<E> elementTypeAdapter;

        public OooO00o(OooOOO0 oooOOO0, Type type, o0ooOOo<E> o0ooooo, oo000o<? extends Collection<E>> oo000oVar) {
            this.elementTypeAdapter = new OooO0o(oooOOO0, o0ooooo, type);
            this.constructor = oo000oVar;
        }

        @Override // com.google.gson.o0ooOOo
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

        @Override // com.google.gson.o0ooOOo
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

    public CollectionTypeAdapterFactory(OooOo00 oooOo00) {
        this.constructorConstructor = oooOo00;
    }

    @Override // com.google.gson.o0OOO0o
    public <T> o0ooOOo<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type typeOooO0oO = com.google.gson.internal.OooO0O0.OooO0oO(type, rawType, Collection.class);
        if (typeOooO0oO instanceof WildcardType) {
            typeOooO0oO = ((WildcardType) typeOooO0oO).getUpperBounds()[0];
        }
        Type type2 = typeOooO0oO instanceof ParameterizedType ? ((ParameterizedType) typeOooO0oO).getActualTypeArguments()[0] : Object.class;
        return new OooO00o(oooOOO0, type2, oooOOO0.OooO0o0(TypeToken.get(type2)), this.constructorConstructor.OooO00o(typeToken));
    }
}
