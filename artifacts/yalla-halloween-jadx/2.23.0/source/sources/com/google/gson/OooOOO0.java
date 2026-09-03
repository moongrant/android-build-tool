package com.google.gson;

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
import com.google.gson.reflect.TypeToken;
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

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final FieldNamingPolicy f20585OooOOO = FieldNamingPolicy.IDENTITY;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final ToNumberPolicy f20586OooOOOO = ToNumberPolicy.DOUBLE;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final ToNumberPolicy f20587OooOOOo = ToNumberPolicy.LAZILY_PARSED_NUMBER;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final TypeToken<?> f20588OooOOo0 = TypeToken.get(Object.class);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f20589OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ThreadLocal<Map<TypeToken<?>, OooO00o<?>>> f20590OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap f20591OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final com.google.gson.internal.OooOo00 f20592OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f20593OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<Type, OooOOOO<?>> f20594OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<o0OOO0o> f20595OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f20596OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f20597OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f20598OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f20599OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final List<o0OOO0o> f20600OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final List<o0OOO0o> f20601OooOOO0;

    public static class OooO00o<T> extends o0ooOOo<T> {
        private o0ooOOo<T> delegate;

        @Override // com.google.gson.o0ooOOo
        public T read(JsonReader jsonReader) throws IOException {
            o0ooOOo<T> o0ooooo = this.delegate;
            if (o0ooooo != null) {
                return o0ooooo.read(jsonReader);
            }
            throw new IllegalStateException();
        }

        public void setDelegate(o0ooOOo<T> o0ooooo) {
            if (this.delegate != null) {
                throw new AssertionError();
            }
            this.delegate = o0ooooo;
        }

        @Override // com.google.gson.o0ooOOo
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            o0ooOOo<T> o0ooooo = this.delegate;
            if (o0ooooo == null) {
                throw new IllegalStateException();
            }
            o0ooooo.write(jsonWriter, t);
        }
    }

    public OooOOO0() {
        this(Excluder.DEFAULT, f20585OooOOO, Collections.emptyMap(), true, true, LongSerializationPolicy.DEFAULT, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f20586OooOOOO, f20587OooOOOo);
    }

    public static void OooO00o(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final void OooO(JsonWriter jsonWriter, o000oOoO o000oooo2) throws JsonIOException {
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f20589OooO);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f20596OooO0oO);
        try {
            try {
                TypeAdapters.f20694OooOoO.write(jsonWriter, (Oooo0) o000oooo2);
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
                    T t = OooO0o0(TypeToken.get(type)).read(jsonReader);
                    jsonReader.setLenient(zIsLenient);
                    return t;
                } catch (IOException e) {
                    throw new JsonSyntaxException(e);
                } catch (IllegalStateException e2) {
                    throw new JsonSyntaxException(e2);
                }
            } catch (EOFException e3) {
                if (!z) {
                    throw new JsonSyntaxException(e3);
                }
                jsonReader.setLenient(zIsLenient);
                return null;
            } catch (AssertionError e4) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e4.getMessage());
                assertionError.initCause(e4);
                throw assertionError;
            }
        } catch (Throwable th) {
            jsonReader.setLenient(zIsLenient);
            throw th;
        }
    }

    public final <T> T OooO0OO(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) o00O0.OooO0o.OooO0o0(cls).cast(OooO0Oo(str, cls));
    }

    public final <T> T OooO0Oo(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        jsonReader.setLenient(this.f20599OooOO0O);
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

    public final <T> o0ooOOo<T> OooO0o(o0OOO0o o0ooo0o2, TypeToken<T> typeToken) {
        List<o0OOO0o> list = this.f20595OooO0o0;
        if (!list.contains(o0ooo0o2)) {
            o0ooo0o2 = this.f20593OooO0Oo;
        }
        boolean z = false;
        for (o0OOO0o o0ooo0o3 : list) {
            if (z) {
                o0ooOOo<T> o0oooooCreate = o0ooo0o3.create(this, typeToken);
                if (o0oooooCreate != null) {
                    return o0oooooCreate;
                }
            } else if (o0ooo0o3 == o0ooo0o2) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public final <T> o0ooOOo<T> OooO0o0(TypeToken<T> typeToken) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.f20591OooO0O0;
        o0ooOOo<T> o0ooooo = (o0ooOOo) concurrentHashMap.get(typeToken == null ? f20588OooOOo0 : typeToken);
        if (o0ooooo != null) {
            return o0ooooo;
        }
        ThreadLocal<Map<TypeToken<?>, OooO00o<?>>> threadLocal = this.f20590OooO00o;
        Map map = threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set((Map<TypeToken<?>, OooO00o<?>>) map);
            z = true;
        } else {
            z = false;
        }
        OooO00o oooO00o = (OooO00o) map.get(typeToken);
        if (oooO00o != null) {
            return oooO00o;
        }
        try {
            OooO00o oooO00o2 = new OooO00o();
            map.put(typeToken, oooO00o2);
            Iterator<o0OOO0o> it = this.f20595OooO0o0.iterator();
            while (it.hasNext()) {
                o0ooOOo<T> o0oooooCreate = it.next().create(this, typeToken);
                if (o0oooooCreate != null) {
                    oooO00o2.setDelegate(o0oooooCreate);
                    concurrentHashMap.put(typeToken, o0oooooCreate);
                    map.remove(typeToken);
                    if (z) {
                        threadLocal.remove();
                    }
                    return o0oooooCreate;
                }
            }
            throw new IllegalArgumentException("GSON (2.9.0) cannot handle " + typeToken);
        } catch (Throwable th) {
            map.remove(typeToken);
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final JsonWriter OooO0oO(Writer writer) throws IOException {
        if (this.f20597OooO0oo) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f20598OooOO0) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setHtmlSafe(this.f20589OooO);
        jsonWriter.setLenient(this.f20599OooOO0O);
        jsonWriter.setSerializeNulls(this.f20596OooO0oO);
        return jsonWriter;
    }

    public final String OooO0oo(Object obj) {
        if (obj == null) {
            o000oOoO o000oooo2 = o000oOoO.f20713OooO0Oo;
            StringWriter stringWriter = new StringWriter();
            try {
                OooO(OooO0oO(stringWriter), o000oooo2);
                return stringWriter.toString();
            } catch (IOException e) {
                throw new JsonIOException(e);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            OooOO0(obj, cls, OooO0oO(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    public final void OooOO0(Object obj, Class cls, JsonWriter jsonWriter) throws JsonIOException {
        o0ooOOo o0oooooOooO0o0 = OooO0o0(TypeToken.get((Type) cls));
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f20589OooO);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f20596OooO0oO);
        try {
            try {
                try {
                    o0oooooOooO0o0.write(jsonWriter, obj);
                    jsonWriter.setLenient(zIsLenient);
                    jsonWriter.setHtmlSafe(zIsHtmlSafe);
                    jsonWriter.setSerializeNulls(serializeNulls);
                } catch (AssertionError e) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.0): " + e.getMessage());
                    assertionError.initCause(e);
                    throw assertionError;
                }
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        } catch (Throwable th) {
            jsonWriter.setLenient(zIsLenient);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f20596OooO0oO + ",factories:" + this.f20595OooO0o0 + ",instanceCreators:" + this.f20592OooO0OO + "}";
    }

    public OooOOO0(Excluder excluder, FieldNamingPolicy fieldNamingPolicy, Map map, boolean z, boolean z2, LongSerializationPolicy longSerializationPolicy, List list, List list2, List list3, ToNumberPolicy toNumberPolicy, ToNumberPolicy toNumberPolicy2) {
        o0ooOOo oooO;
        this.f20590OooO00o = new ThreadLocal<>();
        this.f20591OooO0O0 = new ConcurrentHashMap();
        this.f20594OooO0o = map;
        com.google.gson.internal.OooOo00 oooOo00 = new com.google.gson.internal.OooOo00(map, z2);
        this.f20592OooO0OO = oooOo00;
        this.f20596OooO0oO = false;
        this.f20597OooO0oo = false;
        this.f20589OooO = z;
        this.f20598OooOO0 = false;
        this.f20599OooOO0O = false;
        this.f20600OooOO0o = list;
        this.f20601OooOOO0 = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f20696OooOoOO);
        arrayList.add(ObjectTypeAdapter.getFactory(toNumberPolicy));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f20685OooOOOo);
        arrayList.add(TypeAdapters.f20677OooO0oO);
        arrayList.add(TypeAdapters.f20674OooO0Oo);
        arrayList.add(TypeAdapters.f20676OooO0o0);
        arrayList.add(TypeAdapters.f20675OooO0o);
        if (longSerializationPolicy == LongSerializationPolicy.DEFAULT) {
            oooO = TypeAdapters.f20680OooOO0O;
        } else {
            oooO = new OooO();
        }
        arrayList.add(TypeAdapters.OooO0OO(Long.TYPE, Long.class, oooO));
        arrayList.add(TypeAdapters.OooO0OO(Double.TYPE, Double.class, new OooO0OO(this)));
        arrayList.add(TypeAdapters.OooO0OO(Float.TYPE, Float.class, new OooO0o(this)));
        arrayList.add(NumberTypeAdapter.getFactory(toNumberPolicy2));
        arrayList.add(TypeAdapters.f20678OooO0oo);
        arrayList.add(TypeAdapters.f20670OooO);
        arrayList.add(TypeAdapters.OooO0O0(AtomicLong.class, new OooOO0(oooO).nullSafe()));
        arrayList.add(TypeAdapters.OooO0O0(AtomicLongArray.class, new OooOO0O(oooO).nullSafe()));
        arrayList.add(TypeAdapters.f20679OooOO0);
        arrayList.add(TypeAdapters.f20681OooOO0o);
        arrayList.add(TypeAdapters.f20687OooOOo0);
        arrayList.add(TypeAdapters.f20686OooOOo);
        arrayList.add(TypeAdapters.OooO0O0(BigDecimal.class, TypeAdapters.f20683OooOOO0));
        arrayList.add(TypeAdapters.OooO0O0(BigInteger.class, TypeAdapters.f20682OooOOO));
        arrayList.add(TypeAdapters.OooO0O0(LazilyParsedNumber.class, TypeAdapters.f20684OooOOOO));
        arrayList.add(TypeAdapters.f20688OooOOoo);
        arrayList.add(TypeAdapters.f20691OooOo00);
        arrayList.add(TypeAdapters.f20692OooOo0O);
        arrayList.add(TypeAdapters.f20693OooOo0o);
        arrayList.add(TypeAdapters.f20695OooOoO0);
        arrayList.add(TypeAdapters.f20690OooOo0);
        arrayList.add(TypeAdapters.f20672OooO0O0);
        arrayList.add(DateTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.f20689OooOo);
        if (com.google.gson.internal.sql.OooO00o.f20707OooO00o) {
            arrayList.add(com.google.gson.internal.sql.OooO00o.f20712OooO0o0);
            arrayList.add(com.google.gson.internal.sql.OooO00o.f20710OooO0Oo);
            arrayList.add(com.google.gson.internal.sql.OooO00o.f20711OooO0o);
        }
        arrayList.add(ArrayTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.f20671OooO00o);
        arrayList.add(new CollectionTypeAdapterFactory(oooOo00));
        arrayList.add(new MapTypeAdapterFactory(oooOo00, false));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(oooOo00);
        this.f20593OooO0Oo = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f20697OooOoo0);
        arrayList.add(new ReflectiveTypeAdapterFactory(oooOo00, fieldNamingPolicy, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f20595OooO0o0 = Collections.unmodifiableList(arrayList);
    }
}
