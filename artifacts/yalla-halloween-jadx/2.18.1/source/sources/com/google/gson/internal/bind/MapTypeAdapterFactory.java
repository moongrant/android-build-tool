package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p386o0OOoo0O.o00O00;
import p386o0OOoo0O.o00O000o;
import p386o0OOoo0O.o00O00O;
import p386o0OOoo0O.o00O0O00;
import p386o0OOoo0O.o0O0ooO;
import p386o0OOoo0O.oOO00O;
import p387o0OOoo0o.o00O0O0O;
import p387o0OOoo0o.o00OO00O;
import p387o0OOoo0o.o00OOO0O;
import p387o0OOoo0o.o00OOOO0;
import p387o0OOoo0o.o0o0Oo;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements o00O0O00 {
    public final boolean complexMapKeySerialization;
    private final o00OO00O constructorConstructor;

    public final class OooO00o<K, V> extends o00O0<Map<K, V>> {
        private final o0o0Oo<? extends Map<K, V>> constructor;
        private final o00O0<K> keyTypeAdapter;
        private final o00O0<V> valueTypeAdapter;

        public OooO00o(o000OOo0 o000ooo1, Type type, o00O0<K> o00o1, Type type2, o00O0<V> o00o2, o0o0Oo<? extends Map<K, V>> o0o0oo) {
            this.keyTypeAdapter = new OooO0o(o000ooo1, o00o1, type);
            this.valueTypeAdapter = new OooO0o(o000ooo1, o00o2, type2);
            this.constructor = o0o0oo;
        }

        private String keyToString(o00O000o o00o000o2) {
            Objects.requireNonNull(o00o000o2);
            if (!(o00o000o2 instanceof oOO00O)) {
                if (o00o000o2 instanceof o00O00) {
                    return "null";
                }
                throw new AssertionError();
            }
            oOO00O ooo00oOooO0O0 = o00o000o2.OooO0O0();
            Serializable serializable = ooo00oOooO0O0.f38887OooO00o;
            if (serializable instanceof Number) {
                return String.valueOf(ooo00oOooO0O0.OooO0oO());
            }
            if (serializable instanceof Boolean) {
                return Boolean.toString(ooo00oOooO0O0.OooO0o0());
            }
            if (serializable instanceof String) {
                return ooo00oOooO0O0.OooO0OO();
            }
            throw new AssertionError();
        }

        @Override // p386o0OOoo0O.o00O0
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
                        throw new JsonSyntaxException("duplicate key: " + k);
                    }
                    jsonReader.endArray();
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    o00OOO0O.INSTANCE.promoteNameToValue(jsonReader);
                    K k2 = this.keyTypeAdapter.read(jsonReader);
                    if (mapOooO00o.put(k2, this.valueTypeAdapter.read(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + k2);
                    }
                }
                jsonReader.endObject();
            }
            return mapOooO00o;
        }

        @Override // p386o0OOoo0O.o00O0
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
                o00O000o jsonTree = this.keyTypeAdapter.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                Objects.requireNonNull(jsonTree);
                z |= (jsonTree instanceof o0O0ooO) || (jsonTree instanceof o00O00O);
            }
            if (!z) {
                jsonWriter.beginObject();
                int size = arrayList.size();
                while (i < size) {
                    jsonWriter.name(keyToString((o00O000o) arrayList.get(i)));
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
                o00OOOO0.OooO00o((o00O000o) arrayList.get(i), jsonWriter);
                this.valueTypeAdapter.write(jsonWriter, (V) arrayList2.get(i));
                jsonWriter.endArray();
                i++;
            }
            jsonWriter.endArray();
        }
    }

    public MapTypeAdapterFactory(o00OO00O o00oo00o, boolean z) {
        this.constructorConstructor = o00oo00o;
        this.complexMapKeySerialization = z;
    }

    private o00O0<?> getKeyAdapter(o000OOo0 o000ooo1, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f19274OooO0Oo : o000ooo1.OooO0o0(o00000O0.get(type));
    }

    @Override // p386o0OOoo0O.o00O0O00
    public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
        Type[] actualTypeArguments;
        Type type = o00000o1.getType();
        if (!Map.class.isAssignableFrom(o00000o1.getRawType())) {
            return null;
        }
        Class<?> clsOooO0o = o00O0O0O.OooO0o(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type typeOooO0oO = o00O0O0O.OooO0oO(type, clsOooO0o, Map.class);
            actualTypeArguments = typeOooO0oO instanceof ParameterizedType ? ((ParameterizedType) typeOooO0oO).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        return new OooO00o(o000ooo1, actualTypeArguments[0], getKeyAdapter(o000ooo1, actualTypeArguments[0]), actualTypeArguments[1], o000ooo1.OooO0o0(o00000O0.get(actualTypeArguments[1])), this.constructorConstructor.OooO00o(o00000o1));
    }
}
