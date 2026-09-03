package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.OooOOO0;
import com.google.gson.Oooo0;
import com.google.gson.internal.OooOo00;
import com.google.gson.internal.o00Ooo;
import com.google.gson.internal.oo000o;
import com.google.gson.o000oOoO;
import com.google.gson.o00Oo0;
import com.google.gson.o0OOO0o;
import com.google.gson.o0OoOo0;
import com.google.gson.o0ooOOo;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import p101o000oo.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
public final class MapTypeAdapterFactory implements o0OOO0o {
    final boolean complexMapKeySerialization;
    private final OooOo00 constructorConstructor;

    public final class OooO00o<K, V> extends o0ooOOo<Map<K, V>> {
        private final oo000o<? extends Map<K, V>> constructor;
        private final o0ooOOo<K> keyTypeAdapter;
        private final o0ooOOo<V> valueTypeAdapter;

        public OooO00o(OooOOO0 oooOOO0, Type type, o0ooOOo<K> o0ooooo, Type type2, o0ooOOo<V> o0ooooo2, oo000o<? extends Map<K, V>> oo000oVar) {
            this.keyTypeAdapter = new OooO0o(oooOOO0, o0ooooo, type);
            this.valueTypeAdapter = new OooO0o(oooOOO0, o0ooooo2, type2);
            this.constructor = oo000oVar;
        }

        private String keyToString(Oooo0 oooo0) {
            oooo0.getClass();
            boolean z = oooo0 instanceof o00Oo0;
            if (!z) {
                if (oooo0 instanceof o000oOoO) {
                    return "null";
                }
                throw new AssertionError();
            }
            if (!z) {
                throw new IllegalStateException(com.app.base.protobuf.OooO0OO.OooO0O0("Not a JSON Primitive: ", oooo0));
            }
            o00Oo0 o00oo1 = (o00Oo0) oooo0;
            Serializable serializable = o00oo1.f20714OooO0Oo;
            if (serializable instanceof Number) {
                return String.valueOf(o00oo1.OooO0Oo());
            }
            if (serializable instanceof Boolean) {
                return Boolean.toString(o00oo1.OooO0OO());
            }
            if (serializable instanceof String) {
                return o00oo1.OooO0O0();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.o0ooOOo
        public Map<K, V> read(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> mapOooO00o = this.constructor.OooO00o();
            if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K k = this.keyTypeAdapter.read(jsonReader);
                    if (mapOooO00o.put(k, this.valueTypeAdapter.read(jsonReader)) != null) {
                        throw new JsonSyntaxException(Oooo000.OooO00o("duplicate key: ", k));
                    }
                    jsonReader.endArray();
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    o00Ooo.INSTANCE.promoteNameToValue(jsonReader);
                    K k2 = this.keyTypeAdapter.read(jsonReader);
                    if (mapOooO00o.put(k2, this.valueTypeAdapter.read(jsonReader)) != null) {
                        throw new JsonSyntaxException(Oooo000.OooO00o("duplicate key: ", k2));
                    }
                }
                jsonReader.endObject();
            }
            return mapOooO00o;
        }

        @Override // com.google.gson.o0ooOOo
        public void write(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.this.complexMapKeySerialization) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.valueTypeAdapter.write(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                Oooo0 jsonTree = this.keyTypeAdapter.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                jsonTree.getClass();
                z |= (jsonTree instanceof com.google.gson.OooOo00) || (jsonTree instanceof o0OoOo0);
            }
            if (!z) {
                jsonWriter.beginObject();
                int size = arrayList.size();
                while (i < size) {
                    jsonWriter.name(keyToString((Oooo0) arrayList.get(i)));
                    this.valueTypeAdapter.write(jsonWriter, (V) arrayList2.get(i));
                    i++;
                }
                jsonWriter.endObject();
                return;
            }
            jsonWriter.beginArray();
            int size2 = arrayList.size();
            while (i < size2) {
                jsonWriter.beginArray();
                TypeAdapters.f20694OooOoO.write(jsonWriter, (Oooo0) arrayList.get(i));
                this.valueTypeAdapter.write(jsonWriter, (V) arrayList2.get(i));
                jsonWriter.endArray();
                i++;
            }
            jsonWriter.endArray();
        }
    }

    public MapTypeAdapterFactory(OooOo00 oooOo00, boolean z) {
        this.constructorConstructor = oooOo00;
        this.complexMapKeySerialization = z;
    }

    private o0ooOOo<?> getKeyAdapter(OooOOO0 oooOOO0, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f20673OooO0OO : oooOOO0.OooO0o0(TypeToken.get(type));
    }

    @Override // com.google.gson.o0OOO0o
    public <T> o0ooOOo<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
        Type[] actualTypeArguments;
        Type type = typeToken.getType();
        if (!Map.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        Class<?> clsOooO0o = com.google.gson.internal.OooO0O0.OooO0o(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type typeOooO0oO = com.google.gson.internal.OooO0O0.OooO0oO(type, clsOooO0o, Map.class);
            actualTypeArguments = typeOooO0oO instanceof ParameterizedType ? ((ParameterizedType) typeOooO0oO).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        return new OooO00o(oooOOO0, actualTypeArguments[0], getKeyAdapter(oooOOO0, actualTypeArguments[0]), actualTypeArguments[1], oooOOO0.OooO0o0(TypeToken.get(actualTypeArguments[1])), this.constructorConstructor.OooO00o(typeToken));
    }
}
