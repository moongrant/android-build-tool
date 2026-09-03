package p386o0OOoo0O;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p387o0OOoo0o.o00OO00O;
import p387o0OOoo0o.o00OOOO0;
import p388o0OOooO.o00000O0;
import p660o0ooo0o0.oo0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo0 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final FieldNamingPolicy f38867OooOOO = FieldNamingPolicy.IDENTITY;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final ToNumberPolicy f38868OooOOOO = ToNumberPolicy.DOUBLE;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final ToNumberPolicy f38869OooOOOo = ToNumberPolicy.LAZILY_PARSED_NUMBER;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final o00000O0<?> f38870OooOOo0 = o00000O0.get(Object.class);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f38871OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ThreadLocal<Map<o00000O0<?>, OooO00o<?>>> f38872OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<o00000O0<?>, o00O0<?>> f38873OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00OO00O f38874OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f38875OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<Type, o00O0000<?>> f38876OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<o00O0O00> f38877OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f38878OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f38879OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f38880OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f38881OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final List<o00O0O00> f38882OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final List<o00O0O00> f38883OooOOO0;

    public static class OooO00o<T> extends o00O0<T> {
        private o00O0<T> delegate;

        @Override // p386o0OOoo0O.o00O0
        public T read(JsonReader jsonReader) throws IOException {
            o00O0<T> o00o1 = this.delegate;
            if (o00o1 != null) {
                return o00o1.read(jsonReader);
            }
            throw new IllegalStateException();
        }

        public void setDelegate(o00O0<T> o00o1) {
            if (this.delegate != null) {
                throw new AssertionError();
            }
            this.delegate = o00o1;
        }

        @Override // p386o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            o00O0<T> o00o1 = this.delegate;
            if (o00o1 == null) {
                throw new IllegalStateException();
            }
            o00o1.write(jsonWriter, t);
        }
    }

    public o000OOo0() {
        this(Excluder.DEFAULT, f38867OooOOO, Collections.emptyMap(), true, true, LongSerializationPolicy.DEFAULT, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f38868OooOOOO, f38869OooOOOo);
    }

    public static void OooO00o(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final void OooO(JsonWriter jsonWriter) throws JsonIOException {
        o00O00 o00o01 = o00O00.f38884OooO00o;
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f38871OooO);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f38878OooO0oO);
        try {
            try {
                o00OOOO0.OooO00o(o00o01, jsonWriter);
                jsonWriter.setLenient(zIsLenient);
                jsonWriter.setHtmlSafe(zIsHtmlSafe);
                jsonWriter.setSerializeNulls(serializeNulls);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } catch (Throwable th) {
            jsonWriter.setLenient(zIsLenient);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    public final <T> T OooO0O0(JsonReader jsonReader, Type type) throws JsonSyntaxException, JsonIOException {
        boolean zIsLenient = jsonReader.isLenient();
        boolean z = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z = false;
                    T t = OooO0o0(o00000O0.get(type)).read(jsonReader);
                    jsonReader.setLenient(zIsLenient);
                    return t;
                } catch (AssertionError e) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e.getMessage());
                    assertionError.initCause(e);
                    throw assertionError;
                } catch (IllegalStateException e2) {
                    throw new JsonSyntaxException(e2);
                }
            } catch (EOFException e3) {
                if (!z) {
                    throw new JsonSyntaxException(e3);
                }
                jsonReader.setLenient(zIsLenient);
                return null;
            } catch (IOException e4) {
                throw new JsonSyntaxException(e4);
            }
        } catch (Throwable th) {
            jsonReader.setLenient(zIsLenient);
            throw th;
        }
    }

    public final <T> T OooO0OO(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) oo0O.OooO0O0(cls).cast(OooO0Oo(str, cls));
    }

    public final <T> T OooO0Oo(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        jsonReader.setLenient(this.f38881OooOO0O);
        T t = (T) OooO0O0(jsonReader, type);
        if (t != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
        return t;
    }

    public final <T> o00O0<T> OooO0o(o00O0O00 o00o0o01, o00000O0<T> o00000o1) {
        if (!this.f38877OooO0o0.contains(o00o0o01)) {
            o00o0o01 = this.f38875OooO0Oo;
        }
        boolean z = false;
        for (o00O0O00 o00o0o02 : this.f38877OooO0o0) {
            if (z) {
                o00O0<T> o00o0Create = o00o0o02.create(this, o00000o1);
                if (o00o0Create != null) {
                    return o00o0Create;
                }
            } else if (o00o0o02 == o00o0o01) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + o00000o1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<o0OOooO.o00000O0<?>, o0OOoo0O.o00O0<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Map<o0OOooO.o00000O0<?>, o0OOoo0O.o00O0<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final <T> o00O0<T> OooO0o0(o00000O0<T> o00000o1) {
        o00O0<T> o00o1 = (o00O0) this.f38873OooO0O0.get(o00000o1 == null ? f38870OooOOo0 : o00000o1);
        if (o00o1 != null) {
            return o00o1;
        }
        Map<o00000O0<?>, OooO00o<?>> map = this.f38872OooO00o.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f38872OooO00o.set(map);
            z = true;
        }
        OooO00o<?> oooO00o = map.get(o00000o1);
        if (oooO00o != null) {
            return oooO00o;
        }
        try {
            OooO00o<?> oooO00o2 = new OooO00o<>();
            map.put(o00000o1, oooO00o2);
            Iterator<o00O0O00> it = this.f38877OooO0o0.iterator();
            while (it.hasNext()) {
                o00O0<T> o00o0Create = it.next().create(this, o00000o1);
                if (o00o0Create != null) {
                    oooO00o2.setDelegate(o00o0Create);
                    this.f38873OooO0O0.put((o00000O0<?>) o00000o1, (o00O0<?>) o00o0Create);
                    map.remove(o00000o1);
                    if (z) {
                        this.f38872OooO00o.remove();
                    }
                    return o00o0Create;
                }
            }
            throw new IllegalArgumentException("GSON (2.9.0) cannot handle " + o00000o1);
        } catch (Throwable th) {
            map.remove(o00000o1);
            if (z) {
                this.f38872OooO00o.remove();
            }
            throw th;
        }
    }

    public final JsonWriter OooO0oO(Writer writer) throws IOException {
        if (this.f38879OooO0oo) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f38880OooOO0) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setHtmlSafe(this.f38871OooO);
        jsonWriter.setLenient(this.f38881OooOO0O);
        jsonWriter.setSerializeNulls(this.f38878OooO0oO);
        return jsonWriter;
    }

    public final String OooO0oo(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                OooO(OooO0oO(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new JsonIOException(e);
            }
        }
        Type type = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            OooOO0(obj, type, OooO0oO(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    public final void OooOO0(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
        o00O0 o00o0OooO0o0 = OooO0o0(o00000O0.get(type));
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f38871OooO);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f38878OooO0oO);
        try {
            try {
                o00o0OooO0o0.write(jsonWriter, obj);
                jsonWriter.setLenient(zIsLenient);
                jsonWriter.setHtmlSafe(zIsHtmlSafe);
                jsonWriter.setSerializeNulls(serializeNulls);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } catch (Throwable th) {
            jsonWriter.setLenient(zIsLenient);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f38878OooO0oO + ",factories:" + this.f38877OooO0o0 + ",instanceCreators:" + this.f38874OooO0OO + "}";
    }

    public o000OOo0(Excluder excluder, o000O0 o000o0, Map map, boolean z, boolean z2, LongSerializationPolicy longSerializationPolicy, List list, List list2, List list3, oo00o oo00oVar, oo00o oo00oVar2) {
        o00O0 o000o0o1;
        this.f38872OooO00o = new ThreadLocal<>();
        this.f38873OooO0O0 = new ConcurrentHashMap();
        this.f38876OooO0o = map;
        o00OO00O o00oo00o = new o00OO00O(map, z2);
        this.f38874OooO0OO = o00oo00o;
        this.f38878OooO0oO = false;
        this.f38879OooO0oo = false;
        this.f38871OooO = z;
        this.f38880OooOO0 = false;
        this.f38881OooOO0O = false;
        this.f38882OooOO0o = list;
        this.f38883OooOOO0 = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f19313OoooO00);
        arrayList.add(ObjectTypeAdapter.getFactory(oo00oVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f19289OooOo);
        arrayList.add(TypeAdapters.f19280OooOO0O);
        arrayList.add(TypeAdapters.f19276OooO0o0);
        arrayList.add(TypeAdapters.f19277OooO0oO);
        arrayList.add(TypeAdapters.f19270OooO);
        if (longSerializationPolicy == LongSerializationPolicy.DEFAULT) {
            o000o0o1 = TypeAdapters.f19284OooOOOO;
        } else {
            o000o0o1 = new o000O0O0();
        }
        arrayList.add(TypeAdapters.OooO00o(Long.TYPE, Long.class, o000o0o1));
        arrayList.add(TypeAdapters.OooO00o(Double.TYPE, Double.class, new o000O0Oo(this)));
        arrayList.add(TypeAdapters.OooO00o(Float.TYPE, Float.class, new o000OO0O(this)));
        arrayList.add(NumberTypeAdapter.getFactory(oo00oVar2));
        arrayList.add(TypeAdapters.f19281OooOO0o);
        arrayList.add(TypeAdapters.f19283OooOOO0);
        arrayList.add(TypeAdapters.OooO0O0(AtomicLong.class, new o000O(o000o0o1).nullSafe()));
        arrayList.add(TypeAdapters.OooO0O0(AtomicLongArray.class, new o000OO00(o000o0o1).nullSafe()));
        arrayList.add(TypeAdapters.f19282OooOOO);
        arrayList.add(TypeAdapters.f19288OooOOoo);
        arrayList.add(TypeAdapters.f19294OooOoO);
        arrayList.add(TypeAdapters.f19298OooOoo0);
        arrayList.add(TypeAdapters.OooO0O0(BigDecimal.class, TypeAdapters.f19290OooOo0));
        arrayList.add(TypeAdapters.OooO0O0(BigInteger.class, TypeAdapters.f19292OooOo0O));
        arrayList.add(TypeAdapters.OooO0O0(LazilyParsedNumber.class, TypeAdapters.f19293OooOo0o));
        arrayList.add(TypeAdapters.f19299OooOooO);
        arrayList.add(TypeAdapters.f19303Oooo000);
        arrayList.add(TypeAdapters.f19306Oooo0O0);
        arrayList.add(TypeAdapters.f19307Oooo0OO);
        arrayList.add(TypeAdapters.f19311Oooo0oo);
        arrayList.add(TypeAdapters.f19305Oooo00o);
        arrayList.add(TypeAdapters.f19272OooO0O0);
        arrayList.add(DateTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.f19308Oooo0o);
        if (com.google.gson.internal.sql.OooO00o.f19316OooO00o) {
            arrayList.add(com.google.gson.internal.sql.OooO00o.f19321OooO0o0);
            arrayList.add(com.google.gson.internal.sql.OooO00o.f19319OooO0Oo);
            arrayList.add(com.google.gson.internal.sql.OooO00o.f19320OooO0o);
        }
        arrayList.add(ArrayTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.f19271OooO00o);
        arrayList.add(new CollectionTypeAdapterFactory(o00oo00o));
        arrayList.add(new MapTypeAdapterFactory(o00oo00o, false));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(o00oo00o);
        this.f38875OooO0Oo = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f19312OoooO0);
        arrayList.add(new ReflectiveTypeAdapterFactory(o00oo00o, o000o0, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f38877OooO0o0 = Collections.unmodifiableList(arrayList);
    }
}
