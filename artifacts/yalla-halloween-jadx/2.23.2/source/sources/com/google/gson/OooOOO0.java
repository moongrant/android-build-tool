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
    public static final FieldNamingPolicy f20112OooOOO = FieldNamingPolicy.IDENTITY;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final ToNumberPolicy f20113OooOOOO = ToNumberPolicy.DOUBLE;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final ToNumberPolicy f20114OooOOOo = ToNumberPolicy.LAZILY_PARSED_NUMBER;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final TypeToken<?> f20115OooOOo0 = TypeToken.get(Object.class);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f20116OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ThreadLocal<Map<TypeToken<?>, OooO00o<?>>> f20117OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap f20118OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final com.google.gson.internal.OooOo00 f20119OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f20120OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<Type, OooOOOO<?>> f20121OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<o0Oo0oo> f20122OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f20123OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f20124OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f20125OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f20126OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final List<o0Oo0oo> f20127OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final List<o0Oo0oo> f20128OooOOO0;

    public static class OooO00o<T> extends o0OOO0o<T> {
        private o0OOO0o<T> delegate;

        @Override // com.google.gson.o0OOO0o
        public T read(JsonReader jsonReader) throws IOException {
            o0OOO0o<T> o0ooo0o2 = this.delegate;
            if (o0ooo0o2 != null) {
                return o0ooo0o2.read(jsonReader);
            }
            throw new IllegalStateException();
        }

        public void setDelegate(o0OOO0o<T> o0ooo0o2) {
            if (this.delegate != null) {
                throw new AssertionError();
            }
            this.delegate = o0ooo0o2;
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            o0OOO0o<T> o0ooo0o2 = this.delegate;
            if (o0ooo0o2 == null) {
                throw new IllegalStateException();
            }
            o0ooo0o2.write(jsonWriter, t);
        }
    }

    public OooOOO0() {
        this(Excluder.DEFAULT, f20112OooOOO, Collections.emptyMap(), true, true, LongSerializationPolicy.DEFAULT, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f20113OooOOOO, f20114OooOOOo);
    }

    public static void OooO00o(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final void OooO(JsonWriter jsonWriter, o0OoOo0 o0oooo1) throws JsonIOException {
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f20116OooO);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f20123OooO0oO);
        try {
            try {
                TypeAdapters.f20221OooOoO.write(jsonWriter, (o000oOoO) o0oooo1);
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
        return (T) com.google.gson.internal.o0OOO0o.OooO0O0(cls).cast(OooO0Oo(str, cls));
    }

    public final <T> T OooO0Oo(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        jsonReader.setLenient(this.f20126OooOO0O);
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

    public final <T> o0OOO0o<T> OooO0o(o0Oo0oo o0oo0oo2, TypeToken<T> typeToken) {
        List<o0Oo0oo> list = this.f20122OooO0o0;
        if (!list.contains(o0oo0oo2)) {
            o0oo0oo2 = this.f20120OooO0Oo;
        }
        boolean z = false;
        for (o0Oo0oo o0oo0oo3 : list) {
            if (z) {
                o0OOO0o<T> o0ooo0oCreate = o0oo0oo3.create(this, typeToken);
                if (o0ooo0oCreate != null) {
                    return o0ooo0oCreate;
                }
            } else if (o0oo0oo3 == o0oo0oo2) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public final <T> o0OOO0o<T> OooO0o0(TypeToken<T> typeToken) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.f20118OooO0O0;
        o0OOO0o<T> o0ooo0o2 = (o0OOO0o) concurrentHashMap.get(typeToken == null ? f20115OooOOo0 : typeToken);
        if (o0ooo0o2 != null) {
            return o0ooo0o2;
        }
        ThreadLocal<Map<TypeToken<?>, OooO00o<?>>> threadLocal = this.f20117OooO00o;
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
            Iterator<o0Oo0oo> it = this.f20122OooO0o0.iterator();
            while (it.hasNext()) {
                o0OOO0o<T> o0ooo0oCreate = it.next().create(this, typeToken);
                if (o0ooo0oCreate != null) {
                    oooO00o2.setDelegate(o0ooo0oCreate);
                    concurrentHashMap.put(typeToken, o0ooo0oCreate);
                    map.remove(typeToken);
                    if (z) {
                        threadLocal.remove();
                    }
                    return o0ooo0oCreate;
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
        if (this.f20124OooO0oo) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f20125OooOO0) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setHtmlSafe(this.f20116OooO);
        jsonWriter.setLenient(this.f20126OooOO0O);
        jsonWriter.setSerializeNulls(this.f20123OooO0oO);
        return jsonWriter;
    }

    public final String OooO0oo(Object obj) {
        if (obj == null) {
            o0OoOo0 o0oooo1 = o0OoOo0.f20242OooO0Oo;
            StringWriter stringWriter = new StringWriter();
            try {
                OooO(OooO0oO(stringWriter), o0oooo1);
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
        o0OOO0o o0ooo0oOooO0o0 = OooO0o0(TypeToken.get((Type) cls));
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f20116OooO);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f20123OooO0oO);
        try {
            try {
                try {
                    o0ooo0oOooO0o0.write(jsonWriter, obj);
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
        return "{serializeNulls:" + this.f20123OooO0oO + ",factories:" + this.f20122OooO0o0 + ",instanceCreators:" + this.f20119OooO0OO + "}";
    }

    public OooOOO0(Excluder excluder, FieldNamingPolicy fieldNamingPolicy, Map map, boolean z, boolean z2, LongSerializationPolicy longSerializationPolicy, List list, List list2, List list3, ToNumberPolicy toNumberPolicy, ToNumberPolicy toNumberPolicy2) {
        o0OOO0o oooO;
        this.f20117OooO00o = new ThreadLocal<>();
        this.f20118OooO0O0 = new ConcurrentHashMap();
        this.f20121OooO0o = map;
        com.google.gson.internal.OooOo00 oooOo00 = new com.google.gson.internal.OooOo00(map, z2);
        this.f20119OooO0OO = oooOo00;
        this.f20123OooO0oO = false;
        this.f20124OooO0oo = false;
        this.f20116OooO = z;
        this.f20125OooOO0 = false;
        this.f20126OooOO0O = false;
        this.f20127OooOO0o = list;
        this.f20128OooOOO0 = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f20223OooOoOO);
        arrayList.add(ObjectTypeAdapter.getFactory(toNumberPolicy));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f20212OooOOOo);
        arrayList.add(TypeAdapters.f20204OooO0oO);
        arrayList.add(TypeAdapters.f20201OooO0Oo);
        arrayList.add(TypeAdapters.f20203OooO0o0);
        arrayList.add(TypeAdapters.f20202OooO0o);
        if (longSerializationPolicy == LongSerializationPolicy.DEFAULT) {
            oooO = TypeAdapters.f20207OooOO0O;
        } else {
            oooO = new OooO();
        }
        arrayList.add(TypeAdapters.OooO0OO(Long.TYPE, Long.class, oooO));
        arrayList.add(TypeAdapters.OooO0OO(Double.TYPE, Double.class, new OooO0OO(this)));
        arrayList.add(TypeAdapters.OooO0OO(Float.TYPE, Float.class, new OooO0o(this)));
        arrayList.add(NumberTypeAdapter.getFactory(toNumberPolicy2));
        arrayList.add(TypeAdapters.f20205OooO0oo);
        arrayList.add(TypeAdapters.f20197OooO);
        arrayList.add(TypeAdapters.OooO0O0(AtomicLong.class, new OooOO0(oooO).nullSafe()));
        arrayList.add(TypeAdapters.OooO0O0(AtomicLongArray.class, new OooOO0O(oooO).nullSafe()));
        arrayList.add(TypeAdapters.f20206OooOO0);
        arrayList.add(TypeAdapters.f20208OooOO0o);
        arrayList.add(TypeAdapters.f20214OooOOo0);
        arrayList.add(TypeAdapters.f20213OooOOo);
        arrayList.add(TypeAdapters.OooO0O0(BigDecimal.class, TypeAdapters.f20210OooOOO0));
        arrayList.add(TypeAdapters.OooO0O0(BigInteger.class, TypeAdapters.f20209OooOOO));
        arrayList.add(TypeAdapters.OooO0O0(LazilyParsedNumber.class, TypeAdapters.f20211OooOOOO));
        arrayList.add(TypeAdapters.f20215OooOOoo);
        arrayList.add(TypeAdapters.f20218OooOo00);
        arrayList.add(TypeAdapters.f20219OooOo0O);
        arrayList.add(TypeAdapters.f20220OooOo0o);
        arrayList.add(TypeAdapters.f20222OooOoO0);
        arrayList.add(TypeAdapters.f20217OooOo0);
        arrayList.add(TypeAdapters.f20199OooO0O0);
        arrayList.add(DateTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.f20216OooOo);
        if (com.google.gson.internal.sql.OooO00o.f20234OooO00o) {
            arrayList.add(com.google.gson.internal.sql.OooO00o.f20239OooO0o0);
            arrayList.add(com.google.gson.internal.sql.OooO00o.f20237OooO0Oo);
            arrayList.add(com.google.gson.internal.sql.OooO00o.f20238OooO0o);
        }
        arrayList.add(ArrayTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.f20198OooO00o);
        arrayList.add(new CollectionTypeAdapterFactory(oooOo00));
        arrayList.add(new MapTypeAdapterFactory(oooOo00, false));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(oooOo00);
        this.f20120OooO0Oo = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f20224OooOoo0);
        arrayList.add(new ReflectiveTypeAdapterFactory(oooOo00, fieldNamingPolicy, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f20122OooO0o0 = Collections.unmodifiableList(arrayList);
    }
}
