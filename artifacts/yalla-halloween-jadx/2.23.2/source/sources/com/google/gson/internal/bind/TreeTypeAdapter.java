package com.google.gson.internal.bind;

import com.google.gson.JsonParseException;
import com.google.gson.OooOOO0;
import com.google.gson.OooOo;
import com.google.gson.Oooo000;
import com.google.gson.o000oOoO;
import com.google.gson.o00oO0o;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import com.google.gson.o0OoOo0;
import com.google.gson.oo000o;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class TreeTypeAdapter<T> extends o0OOO0o<T> {
    private final TreeTypeAdapter<T>.OooO00o context = new OooO00o();
    private volatile o0OOO0o<T> delegate;
    private final Oooo000<T> deserializer;
    final OooOOO0 gson;
    private final o00oO0o<T> serializer;
    private final o0Oo0oo skipPast;
    private final TypeToken<T> typeToken;

    public final class OooO00o implements oo000o, OooOo {
        public OooO00o() {
        }

        public final Object OooO00o(o000oOoO o000oooo2, Class cls) throws JsonParseException {
            OooOOO0 oooOOO0 = TreeTypeAdapter.this.gson;
            oooOOO0.getClass();
            if (o000oooo2 == null) {
                return null;
            }
            return oooOOO0.OooO0O0(new OooO0O0(o000oooo2), cls);
        }
    }

    public static final class SingleTypeFactory implements o0Oo0oo {
        private final Oooo000<?> deserializer;
        private final TypeToken<?> exactType;
        private final Class<?> hierarchyType;
        private final boolean matchRawType;
        private final o00oO0o<?> serializer;

        public SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z, Class<?> cls) {
            o00oO0o<?> o00oo0o2 = obj instanceof o00oO0o ? (o00oO0o) obj : null;
            this.serializer = o00oo0o2;
            Oooo000<?> oooo000 = obj instanceof Oooo000 ? (Oooo000) obj : null;
            this.deserializer = oooo000;
            com.google.gson.internal.OooO00o.OooO00o((o00oo0o2 == null && oooo000 == null) ? false : true);
            this.exactType = typeToken;
            this.matchRawType = z;
            this.hierarchyType = cls;
        }

        @Override // com.google.gson.o0Oo0oo
        public <T> o0OOO0o<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
            boolean zIsAssignableFrom;
            TypeToken<?> typeToken2 = this.exactType;
            if (typeToken2 != null) {
                zIsAssignableFrom = typeToken2.equals(typeToken) || (this.matchRawType && this.exactType.getType() == typeToken.getRawType());
            } else {
                zIsAssignableFrom = this.hierarchyType.isAssignableFrom(typeToken.getRawType());
            }
            if (zIsAssignableFrom) {
                return new TreeTypeAdapter(this.serializer, this.deserializer, oooOOO0, typeToken, this);
            }
            return null;
        }
    }

    public TreeTypeAdapter(o00oO0o<T> o00oo0o2, Oooo000<T> oooo000, OooOOO0 oooOOO0, TypeToken<T> typeToken, o0Oo0oo o0oo0oo2) {
        this.serializer = o00oo0o2;
        this.deserializer = oooo000;
        this.gson = oooOOO0;
        this.typeToken = typeToken;
        this.skipPast = o0oo0oo2;
    }

    private o0OOO0o<T> delegate() {
        o0OOO0o<T> o0ooo0o2 = this.delegate;
        if (o0ooo0o2 != null) {
            return o0ooo0o2;
        }
        o0OOO0o<T> o0ooo0oOooO0o = this.gson.OooO0o(this.skipPast, this.typeToken);
        this.delegate = o0ooo0oOooO0o;
        return o0ooo0oOooO0o;
    }

    public static o0Oo0oo newFactory(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, false, null);
    }

    public static o0Oo0oo newFactoryWithMatchRawType(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType(), null);
    }

    public static o0Oo0oo newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // com.google.gson.o0OOO0o
    public T read(JsonReader jsonReader) throws IOException {
        if (this.deserializer == null) {
            return delegate().read(jsonReader);
        }
        o000oOoO o000ooooOooO00o = com.google.gson.internal.o0Oo0oo.OooO00o(jsonReader);
        o000ooooOooO00o.getClass();
        if (o000ooooOooO00o instanceof o0OoOo0) {
            return null;
        }
        return this.deserializer.deserialize(o000ooooOooO00o, this.typeToken.getType(), this.context);
    }

    @Override // com.google.gson.o0OOO0o
    public void write(JsonWriter jsonWriter, T t) throws IOException {
        o00oO0o<T> o00oo0o2 = this.serializer;
        if (o00oo0o2 == null) {
            delegate().write(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapters.f20221OooOoO.write(jsonWriter, o00oo0o2.serialize(t, this.typeToken.getType(), this.context));
        }
    }
}
