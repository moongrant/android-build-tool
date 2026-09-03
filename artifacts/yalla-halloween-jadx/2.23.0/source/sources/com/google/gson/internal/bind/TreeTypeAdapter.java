package com.google.gson.internal.bind;

import com.google.gson.JsonParseException;
import com.google.gson.OooOOO0;
import com.google.gson.OooOo;
import com.google.gson.Oooo0;
import com.google.gson.Oooo000;
import com.google.gson.o000oOoO;
import com.google.gson.o00Ooo;
import com.google.gson.o0OOO0o;
import com.google.gson.o0ooOOo;
import com.google.gson.oo000o;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class TreeTypeAdapter<T> extends o0ooOOo<T> {
    private final TreeTypeAdapter<T>.OooO00o context = new OooO00o();
    private volatile o0ooOOo<T> delegate;
    private final Oooo000<T> deserializer;
    final OooOOO0 gson;
    private final oo000o<T> serializer;
    private final o0OOO0o skipPast;
    private final TypeToken<T> typeToken;

    public final class OooO00o implements o00Ooo, OooOo {
        public OooO00o() {
        }

        public final Object OooO00o(Oooo0 oooo0, Class cls) throws JsonParseException {
            OooOOO0 oooOOO0 = TreeTypeAdapter.this.gson;
            oooOOO0.getClass();
            if (oooo0 == null) {
                return null;
            }
            return oooOOO0.OooO0O0(new OooO0O0(oooo0), cls);
        }
    }

    public static final class SingleTypeFactory implements o0OOO0o {
        private final Oooo000<?> deserializer;
        private final TypeToken<?> exactType;
        private final Class<?> hierarchyType;
        private final boolean matchRawType;
        private final oo000o<?> serializer;

        public SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z, Class<?> cls) {
            oo000o<?> oo000oVar = obj instanceof oo000o ? (oo000o) obj : null;
            this.serializer = oo000oVar;
            Oooo000<?> oooo000 = obj instanceof Oooo000 ? (Oooo000) obj : null;
            this.deserializer = oooo000;
            com.google.gson.internal.OooO00o.OooO00o((oo000oVar == null && oooo000 == null) ? false : true);
            this.exactType = typeToken;
            this.matchRawType = z;
            this.hierarchyType = cls;
        }

        @Override // com.google.gson.o0OOO0o
        public <T> o0ooOOo<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
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

    public TreeTypeAdapter(oo000o<T> oo000oVar, Oooo000<T> oooo000, OooOOO0 oooOOO0, TypeToken<T> typeToken, o0OOO0o o0ooo0o2) {
        this.serializer = oo000oVar;
        this.deserializer = oooo000;
        this.gson = oooOOO0;
        this.typeToken = typeToken;
        this.skipPast = o0ooo0o2;
    }

    private o0ooOOo<T> delegate() {
        o0ooOOo<T> o0ooooo = this.delegate;
        if (o0ooooo != null) {
            return o0ooooo;
        }
        o0ooOOo<T> o0oooooOooO0o = this.gson.OooO0o(this.skipPast, this.typeToken);
        this.delegate = o0oooooOooO0o;
        return o0oooooOooO0o;
    }

    public static o0OOO0o newFactory(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, false, null);
    }

    public static o0OOO0o newFactoryWithMatchRawType(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType(), null);
    }

    public static o0OOO0o newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // com.google.gson.o0ooOOo
    public T read(JsonReader jsonReader) throws IOException {
        if (this.deserializer == null) {
            return delegate().read(jsonReader);
        }
        Oooo0 oooo0OooO00o = com.google.gson.internal.o0ooOOo.OooO00o(jsonReader);
        oooo0OooO00o.getClass();
        if (oooo0OooO00o instanceof o000oOoO) {
            return null;
        }
        return this.deserializer.deserialize(oooo0OooO00o, this.typeToken.getType(), this.context);
    }

    @Override // com.google.gson.o0ooOOo
    public void write(JsonWriter jsonWriter, T t) throws IOException {
        oo000o<T> oo000oVar = this.serializer;
        if (oo000oVar == null) {
            delegate().write(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapters.f20694OooOoO.write(jsonWriter, oo000oVar.serialize(t, this.typeToken.getType(), this.context));
        }
    }
}
