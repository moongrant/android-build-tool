package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Objects;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p386o0OOoo0O.o00O00;
import p386o0OOoo0O.o00O000;
import p386o0OOoo0O.o00O000o;
import p386o0OOoo0O.o00O00OO;
import p386o0OOoo0O.o00O00o0;
import p386o0OOoo0O.o00O0O00;
import p386o0OOoo0O.o00oOoo;
import p387o0OOoo0o.o00O0O0;
import p387o0OOoo0o.o00OOOO0;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends o00O0<T> {
    private final TreeTypeAdapter<T>.OooO00o context = new OooO00o();
    private volatile o00O0<T> delegate;
    private final o00O000<T> deserializer;
    public final o000OOo0 gson;
    private final o00O00o0<T> serializer;
    private final o00O0O00 skipPast;
    private final o00000O0<T> typeToken;

    public final class OooO00o implements o00O00OO, o00oOoo {
        public OooO00o() {
        }

        public final <R> R OooO00o(o00O000o o00o000o2, Type type) throws JsonParseException {
            o000OOo0 o000ooo1 = TreeTypeAdapter.this.gson;
            Objects.requireNonNull(o000ooo1);
            if (o00o000o2 == null) {
                return null;
            }
            return (R) o000ooo1.OooO0O0(new OooO0O0(o00o000o2), type);
        }
    }

    public static final class SingleTypeFactory implements o00O0O00 {
        private final o00O000<?> deserializer;
        private final o00000O0<?> exactType;
        private final Class<?> hierarchyType;
        private final boolean matchRawType;
        private final o00O00o0<?> serializer;

        public SingleTypeFactory(Object obj, o00000O0<?> o00000o1, boolean z, Class<?> cls) {
            o00O00o0<?> o00o00o1 = obj instanceof o00O00o0 ? (o00O00o0) obj : null;
            this.serializer = o00o00o1;
            o00O000<?> o00o001 = obj instanceof o00O000 ? (o00O000) obj : null;
            this.deserializer = o00o001;
            o00O0O0.OooO00o((o00o00o1 == null && o00o001 == null) ? false : true);
            this.exactType = o00000o1;
            this.matchRawType = z;
            this.hierarchyType = cls;
        }

        @Override // p386o0OOoo0O.o00O0O00
        public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
            boolean zIsAssignableFrom;
            o00000O0<?> o00000o2 = this.exactType;
            if (o00000o2 != null) {
                zIsAssignableFrom = o00000o2.equals(o00000o1) || (this.matchRawType && this.exactType.getType() == o00000o1.getRawType());
            } else {
                zIsAssignableFrom = this.hierarchyType.isAssignableFrom(o00000o1.getRawType());
            }
            if (zIsAssignableFrom) {
                return new TreeTypeAdapter(this.serializer, this.deserializer, o000ooo1, o00000o1, this);
            }
            return null;
        }
    }

    public TreeTypeAdapter(o00O00o0<T> o00o00o1, o00O000<T> o00o001, o000OOo0 o000ooo1, o00000O0<T> o00000o1, o00O0O00 o00o0o01) {
        this.serializer = o00o00o1;
        this.deserializer = o00o001;
        this.gson = o000ooo1;
        this.typeToken = o00000o1;
        this.skipPast = o00o0o01;
    }

    private o00O0<T> delegate() {
        o00O0<T> o00o1 = this.delegate;
        if (o00o1 != null) {
            return o00o1;
        }
        o00O0<T> o00o0OooO0o = this.gson.OooO0o(this.skipPast, this.typeToken);
        this.delegate = o00o0OooO0o;
        return o00o0OooO0o;
    }

    public static o00O0O00 newFactory(o00000O0<?> o00000o1, Object obj) {
        return new SingleTypeFactory(obj, o00000o1, false, null);
    }

    public static o00O0O00 newFactoryWithMatchRawType(o00000O0<?> o00000o1, Object obj) {
        return new SingleTypeFactory(obj, o00000o1, o00000o1.getType() == o00000o1.getRawType(), null);
    }

    public static o00O0O00 newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // p386o0OOoo0O.o00O0
    public T read(JsonReader jsonReader) throws IOException {
        boolean z;
        o00O000o o00o000o2;
        if (this.deserializer == null) {
            return delegate().read(jsonReader);
        }
        try {
            try {
                jsonReader.peek();
                z = false;
                try {
                    o00o000o2 = (o00O000o) TypeAdapters.f19301Oooo.read(jsonReader);
                } catch (EOFException e) {
                    e = e;
                    if (!z) {
                        throw new JsonSyntaxException(e);
                    }
                    o00o000o2 = o00O00.f38884OooO00o;
                }
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
            Objects.requireNonNull(o00o000o2);
            if (o00o000o2 instanceof o00O00) {
                return null;
            }
            return this.deserializer.deserialize(o00o000o2, this.typeToken.getType(), this.context);
        } catch (MalformedJsonException e3) {
            throw new JsonSyntaxException(e3);
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        } catch (NumberFormatException e5) {
            throw new JsonSyntaxException(e5);
        }
    }

    @Override // p386o0OOoo0O.o00O0
    public void write(JsonWriter jsonWriter, T t) throws IOException {
        o00O00o0<T> o00o00o1 = this.serializer;
        if (o00o00o1 == null) {
            delegate().write(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            o00OOOO0.OooO00o(o00o00o1.serialize(t, this.typeToken.getType(), this.context), jsonWriter);
        }
    }
}
