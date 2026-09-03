package com.google.gson.internal.bind;

import androidx.media3.session.o00O0O0;
import com.google.gson.JsonSyntaxException;
import com.google.gson.OooOOO0;
import com.google.gson.Oooo0;
import com.google.gson.internal.OooOo00;
import com.google.gson.internal.o00oO0o;
import com.google.gson.internal.oo000o;
import com.google.gson.o000oOoO;
import com.google.gson.o00O0O;
import com.google.gson.o00Ooo;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import com.google.gson.o0OoOo0;
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

/* JADX INFO: loaded from: classes3.dex */
public final class MapTypeAdapterFactory implements o0Oo0oo {
    final boolean complexMapKeySerialization;
    private final OooOo00 constructorConstructor;

    public final class OooO00o<K, V> extends o0OOO0o<Map<K, V>> {
        private final o00oO0o<? extends Map<K, V>> constructor;
        private final o0OOO0o<K> keyTypeAdapter;
        private final o0OOO0o<V> valueTypeAdapter;

        public OooO00o(OooOOO0 oooOOO0, Type type, o0OOO0o<K> o0ooo0o2, Type type2, o0OOO0o<V> o0ooo0o3, o00oO0o<? extends Map<K, V>> o00oo0o2) {
            this.keyTypeAdapter = new OooO0o(oooOOO0, o0ooo0o2, type);
            this.valueTypeAdapter = new OooO0o(oooOOO0, o0ooo0o3, type2);
            this.constructor = o00oo0o2;
        }

        private String keyToString(o000oOoO o000oooo2) {
            o000oooo2.getClass();
            boolean z = o000oooo2 instanceof o00Ooo;
            if (!z) {
                if (o000oooo2 instanceof o0OoOo0) {
                    return "null";
                }
                throw new AssertionError();
            }
            if (!z) {
                throw new IllegalStateException(Oooo0.OooO00o("Not a JSON Primitive: ", o000oooo2));
            }
            o00Ooo o00ooo2 = (o00Ooo) o000oooo2;
            Serializable serializable = o00ooo2.f20241OooO0Oo;
            if (serializable instanceof Number) {
                return String.valueOf(o00ooo2.OooO0Oo());
            }
            if (serializable instanceof Boolean) {
                return Boolean.toString(o00ooo2.OooO0OO());
            }
            if (serializable instanceof String) {
                return o00ooo2.OooO0O0();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.o0OOO0o
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
                        throw new JsonSyntaxException(o00O0O0.OooO0O0("duplicate key: ", k));
                    }
                    jsonReader.endArray();
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    oo000o.INSTANCE.promoteNameToValue(jsonReader);
                    K k2 = this.keyTypeAdapter.read(jsonReader);
                    if (mapOooO00o.put(k2, this.valueTypeAdapter.read(jsonReader)) != null) {
                        throw new JsonSyntaxException(o00O0O0.OooO0O0("duplicate key: ", k2));
                    }
                }
                jsonReader.endObject();
            }
            return mapOooO00o;
        }

        @Override // com.google.gson.o0OOO0o
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
                o000oOoO jsonTree = this.keyTypeAdapter.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                jsonTree.getClass();
                z |= (jsonTree instanceof com.google.gson.OooOo00) || (jsonTree instanceof o00O0O);
            }
            if (!z) {
                jsonWriter.beginObject();
                int size = arrayList.size();
                while (i < size) {
                    jsonWriter.name(keyToString((o000oOoO) arrayList.get(i)));
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
                TypeAdapters.f20221OooOoO.write(jsonWriter, (o000oOoO) arrayList.get(i));
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

    private o0OOO0o<?> getKeyAdapter(OooOOO0 oooOOO0, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f20200OooO0OO : oooOOO0.OooO0o0(TypeToken.get(type));
    }

    @Override // com.google.gson.o0Oo0oo
    public <T> o0OOO0o<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
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
