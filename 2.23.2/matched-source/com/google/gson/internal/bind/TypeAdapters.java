package com.google.gson.internal.bind;

import androidx.appcompat.widget.o0000O0;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes3.dex */
public final class TypeAdapters {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20197OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20198OooO00o = new AnonymousClass31(Class.class, new OooOo00().nullSafe());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20199OooO0O0 = new AnonymousClass31(BitSet.class, new o00oO0o().nullSafe());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0Oo0oo f20200OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20201OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20202OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20203OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20204OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20205OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20206OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooO0O0 f20207OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20208OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooOOO0 f20209OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final OooOO0O f20210OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final OooOOO f20211OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20212OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20213OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20214OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20215OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20216OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20217OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20218OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20219OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20220OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final oo000o f20221OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20222OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20223OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final com.google.gson.o0Oo0oo f20224OooOoo0;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$31, reason: invalid class name */
    public class AnonymousClass31 implements com.google.gson.o0Oo0oo {
        final /* synthetic */ Class val$type;
        final /* synthetic */ com.google.gson.o0OOO0o val$typeAdapter;

        public AnonymousClass31(Class cls, com.google.gson.o0OOO0o o0ooo0o2) {
            this.val$type = cls;
            this.val$typeAdapter = o0ooo0o2;
        }

        @Override // com.google.gson.o0Oo0oo
        public <T> com.google.gson.o0OOO0o<T> create(com.google.gson.OooOOO0 oooOOO0, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == this.val$type) {
                return this.val$typeAdapter;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.val$type.getName() + ",adapter=" + this.val$typeAdapter + "]";
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$32, reason: invalid class name */
    public class AnonymousClass32 implements com.google.gson.o0Oo0oo {
        final /* synthetic */ Class val$boxed;
        final /* synthetic */ com.google.gson.o0OOO0o val$typeAdapter;
        final /* synthetic */ Class val$unboxed;

        public AnonymousClass32(Class cls, Class cls2, com.google.gson.o0OOO0o o0ooo0o2) {
            this.val$unboxed = cls;
            this.val$boxed = cls2;
            this.val$typeAdapter = o0ooo0o2;
        }

        @Override // com.google.gson.o0Oo0oo
        public <T> com.google.gson.o0OOO0o<T> create(com.google.gson.OooOOO0 oooOOO0, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            if (rawType == this.val$unboxed || rawType == this.val$boxed) {
                return this.val$typeAdapter;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.val$boxed.getName() + "+" + this.val$unboxed.getName() + ",adapter=" + this.val$typeAdapter + "]";
        }
    }

    public class OooO extends com.google.gson.o0OOO0o<Character> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.o0OOO0o
        public Character read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            if (strNextString.length() == 1) {
                return Character.valueOf(strNextString.charAt(0));
            }
            StringBuilder sbOooO0O0 = p004OooO0oO.o0OoOo0.OooO0O0("Expecting character, got: ", strNextString, "; at ");
            sbOooO0O0.append(jsonReader.getPreviousPath());
            throw new JsonSyntaxException(sbOooO0O0.toString());
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, Character ch) throws IOException {
            jsonWriter.value(ch == null ? null : String.valueOf(ch));
        }
    }

    public class OooO00o extends com.google.gson.o0OOO0o<AtomicIntegerArray> {
        @Override // com.google.gson.o0OOO0o
        public AtomicIntegerArray read(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.value(atomicIntegerArray.get(i));
            }
            jsonWriter.endArray();
        }
    }

    public class OooO0O0 extends com.google.gson.o0OOO0o<Number> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.o0OOO0o
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public class OooO0OO extends com.google.gson.o0OOO0o<Number> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.o0OOO0o
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public class OooO0o extends com.google.gson.o0OOO0o<Number> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.o0OOO0o
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public class OooOO0 extends com.google.gson.o0OOO0o<String> {
        @Override // com.google.gson.o0OOO0o
        public String read(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek != JsonToken.NULL) {
                return jsonTokenPeek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, String str) throws IOException {
            jsonWriter.value(str);
        }
    }

    public class OooOO0O extends com.google.gson.o0OOO0o<BigDecimal> {
        @Override // com.google.gson.o0OOO0o
        public BigDecimal read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            try {
                return new BigDecimal(strNextString);
            } catch (NumberFormatException e) {
                StringBuilder sbOooO0O0 = p004OooO0oO.o0OoOo0.OooO0O0("Failed parsing '", strNextString, "' as BigDecimal; at path ");
                sbOooO0O0.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbOooO0O0.toString(), e);
            }
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
            jsonWriter.value(bigDecimal);
        }
    }

    public class OooOOO extends com.google.gson.o0OOO0o<LazilyParsedNumber> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.o0OOO0o
        public LazilyParsedNumber read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new LazilyParsedNumber(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, LazilyParsedNumber lazilyParsedNumber) throws IOException {
            jsonWriter.value(lazilyParsedNumber);
        }
    }

    public class OooOOO0 extends com.google.gson.o0OOO0o<BigInteger> {
        @Override // com.google.gson.o0OOO0o
        public BigInteger read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            try {
                return new BigInteger(strNextString);
            } catch (NumberFormatException e) {
                StringBuilder sbOooO0O0 = p004OooO0oO.o0OoOo0.OooO0O0("Failed parsing '", strNextString, "' as BigInteger; at path ");
                sbOooO0O0.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbOooO0O0.toString(), e);
            }
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
            jsonWriter.value(bigInteger);
        }
    }

    public class OooOOOO extends com.google.gson.o0OOO0o<StringBuilder> {
        @Override // com.google.gson.o0OOO0o
        public StringBuilder read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new StringBuilder(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
            jsonWriter.value(sb == null ? null : sb.toString());
        }
    }

    public class OooOo extends com.google.gson.o0OOO0o<StringBuffer> {
        @Override // com.google.gson.o0OOO0o
        public StringBuffer read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new StringBuffer(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
            jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    public class OooOo00 extends com.google.gson.o0OOO0o<Class> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.o0OOO0o
        public Class read(JsonReader jsonReader) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    public class Oooo0 extends com.google.gson.o0OOO0o<URI> {
        @Override // com.google.gson.o0OOO0o
        public URI read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                String strNextString = jsonReader.nextString();
                if ("null".equals(strNextString)) {
                    return null;
                }
                return new URI(strNextString);
            } catch (URISyntaxException e) {
                throw new JsonIOException(e);
            }
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, URI uri) throws IOException {
            jsonWriter.value(uri == null ? null : uri.toASCIIString());
        }
    }

    public class Oooo000 extends com.google.gson.o0OOO0o<URL> {
        @Override // com.google.gson.o0OOO0o
        public URL read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            if ("null".equals(strNextString)) {
                return null;
            }
            return new URL(strNextString);
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, URL url) throws IOException {
            jsonWriter.value(url == null ? null : url.toExternalForm());
        }
    }

    public class o000000 extends com.google.gson.o0OOO0o<AtomicBoolean> {
        @Override // com.google.gson.o0OOO0o
        public AtomicBoolean read(JsonReader jsonReader) throws IOException {
            return new AtomicBoolean(jsonReader.nextBoolean());
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
            jsonWriter.value(atomicBoolean.get());
        }
    }

    public static final class o000000O<T extends Enum<T>> extends com.google.gson.o0OOO0o<T> {
        private final Map<String, T> nameToConstant = new HashMap();
        private final Map<T, String> constantToName = new HashMap();

        public class OooO00o implements PrivilegedAction<Field[]> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ Class f20225OooO00o;

            public OooO00o(Class cls) {
                this.f20225OooO00o = cls;
            }

            @Override // java.security.PrivilegedAction
            public final Field[] run() {
                Field[] declaredFields = this.f20225OooO00o.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public o000000O(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new OooO00o(cls))) {
                    Enum r4 = (Enum) field.get(null);
                    String strName = r4.name();
                    SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                        strName = serializedName.value();
                        for (String str : serializedName.alternate()) {
                            this.nameToConstant.put(str, (T) r4);
                        }
                    }
                    this.nameToConstant.put(strName, (T) r4);
                    this.constantToName.put((T) r4, strName);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.gson.o0OOO0o
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return this.nameToConstant.get(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            jsonWriter.value(t == null ? null : this.constantToName.get(t));
        }
    }

    public class o000OOo extends com.google.gson.o0OOO0o<AtomicInteger> {
        @Override // com.google.gson.o0OOO0o
        public AtomicInteger read(JsonReader jsonReader) throws IOException {
            try {
                return new AtomicInteger(jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
            jsonWriter.value(atomicInteger.get());
        }
    }

    public class o000oOoO extends com.google.gson.o0OOO0o<InetAddress> {
        @Override // com.google.gson.o0OOO0o
        public InetAddress read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return InetAddress.getByName(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
            jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    public class o00O0O extends com.google.gson.o0OOO0o<Currency> {
        @Override // com.google.gson.o0OOO0o
        public Currency read(JsonReader jsonReader) throws IOException {
            String strNextString = jsonReader.nextString();
            try {
                return Currency.getInstance(strNextString);
            } catch (IllegalArgumentException e) {
                StringBuilder sbOooO0O0 = p004OooO0oO.o0OoOo0.OooO0O0("Failed parsing '", strNextString, "' as Currency; at path ");
                sbOooO0O0.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbOooO0O0.toString(), e);
            }
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, Currency currency) throws IOException {
            jsonWriter.value(currency.getCurrencyCode());
        }
    }

    public class o00Oo0 extends com.google.gson.o0OOO0o<Calendar> {
        private static final String DAY_OF_MONTH = "dayOfMonth";
        private static final String HOUR_OF_DAY = "hourOfDay";
        private static final String MINUTE = "minute";
        private static final String MONTH = "month";
        private static final String SECOND = "second";
        private static final String YEAR = "year";

        @Override // com.google.gson.o0OOO0o
        public Calendar read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (jsonReader.peek() != JsonToken.END_OBJECT) {
                String strNextName = jsonReader.nextName();
                int iNextInt = jsonReader.nextInt();
                if (YEAR.equals(strNextName)) {
                    i = iNextInt;
                } else if ("month".equals(strNextName)) {
                    i2 = iNextInt;
                } else if (DAY_OF_MONTH.equals(strNextName)) {
                    i3 = iNextInt;
                } else if (HOUR_OF_DAY.equals(strNextName)) {
                    i4 = iNextInt;
                } else if (MINUTE.equals(strNextName)) {
                    i5 = iNextInt;
                } else if (SECOND.equals(strNextName)) {
                    i6 = iNextInt;
                }
            }
            jsonReader.endObject();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, Calendar calendar) throws IOException {
            if (calendar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(YEAR);
            jsonWriter.value(calendar.get(1));
            jsonWriter.name("month");
            jsonWriter.value(calendar.get(2));
            jsonWriter.name(DAY_OF_MONTH);
            jsonWriter.value(calendar.get(5));
            jsonWriter.name(HOUR_OF_DAY);
            jsonWriter.value(calendar.get(11));
            jsonWriter.name(MINUTE);
            jsonWriter.value(calendar.get(12));
            jsonWriter.name(SECOND);
            jsonWriter.value(calendar.get(13));
            jsonWriter.endObject();
        }
    }

    public class o00Ooo extends com.google.gson.o0OOO0o<Locale> {
        @Override // com.google.gson.o0OOO0o
        public Locale read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (strNextToken2 == null && strNextToken3 == null) {
                return new Locale(strNextToken);
            }
            return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, Locale locale) throws IOException {
            jsonWriter.value(locale == null ? null : locale.toString());
        }
    }

    public class o00oO0o extends com.google.gson.o0OOO0o<BitSet> {
        @Override // com.google.gson.o0OOO0o
        public BitSet read(JsonReader jsonReader) throws IOException {
            BitSet bitSet = new BitSet();
            jsonReader.beginArray();
            JsonToken jsonTokenPeek = jsonReader.peek();
            int i = 0;
            while (jsonTokenPeek != JsonToken.END_ARRAY) {
                int i2 = o0ooOOo.f20226OooO00o[jsonTokenPeek.ordinal()];
                boolean zNextBoolean = true;
                if (i2 == 1 || i2 == 2) {
                    int iNextInt = jsonReader.nextInt();
                    if (iNextInt == 0) {
                        zNextBoolean = false;
                    } else if (iNextInt != 1) {
                        StringBuilder sbOooO0O0 = o0000O0.OooO0O0("Invalid bitset value ", iNextInt, ", expected 0 or 1; at path ");
                        sbOooO0O0.append(jsonReader.getPreviousPath());
                        throw new JsonSyntaxException(sbOooO0O0.toString());
                    }
                } else {
                    if (i2 != 3) {
                        throw new JsonSyntaxException("Invalid bitset value type: " + jsonTokenPeek + "; at path " + jsonReader.getPath());
                    }
                    zNextBoolean = jsonReader.nextBoolean();
                }
                if (zNextBoolean) {
                    bitSet.set(i);
                }
                i++;
                jsonTokenPeek = jsonReader.peek();
            }
            jsonReader.endArray();
            return bitSet;
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
            jsonWriter.beginArray();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.value(bitSet.get(i) ? 1L : 0L);
            }
            jsonWriter.endArray();
        }
    }

    public class o0O0O00 extends com.google.gson.o0OOO0o<Number> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.o0OOO0o
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public class o0OO00O extends com.google.gson.o0OOO0o<Number> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.o0OOO0o
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                int iNextInt = jsonReader.nextInt();
                if (iNextInt <= 255 && iNextInt >= -128) {
                    return Byte.valueOf((byte) iNextInt);
                }
                StringBuilder sbOooO0O0 = o0000O0.OooO0O0("Lossy conversion from ", iNextInt, " to byte; at path ");
                sbOooO0O0.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbOooO0O0.toString());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public class o0OOO0o extends com.google.gson.o0OOO0o<Boolean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.o0OOO0o
        public Boolean read(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek != JsonToken.NULL) {
                return jsonTokenPeek == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString())) : Boolean.valueOf(jsonReader.nextBoolean());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool);
        }
    }

    public class o0Oo0oo extends com.google.gson.o0OOO0o<Boolean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.o0OOO0o
        public Boolean read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Boolean.valueOf(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool == null ? "null" : bool.toString());
        }
    }

    public class o0OoOo0 extends com.google.gson.o0OOO0o<UUID> {
        @Override // com.google.gson.o0OOO0o
        public UUID read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            try {
                return UUID.fromString(strNextString);
            } catch (IllegalArgumentException e) {
                StringBuilder sbOooO0O0 = p004OooO0oO.o0OoOo0.OooO0O0("Failed parsing '", strNextString, "' as UUID; at path ");
                sbOooO0O0.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbOooO0O0.toString(), e);
            }
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, UUID uuid) throws IOException {
            jsonWriter.value(uuid == null ? null : uuid.toString());
        }
    }

    public static /* synthetic */ class o0ooOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f20226OooO00o;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f20226OooO00o = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20226OooO00o[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20226OooO00o[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20226OooO00o[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20226OooO00o[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20226OooO00o[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20226OooO00o[JsonToken.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20226OooO00o[JsonToken.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20226OooO00o[JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20226OooO00o[JsonToken.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public class oo000o extends com.google.gson.o0OOO0o<com.google.gson.o000oOoO> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, com.google.gson.o000oOoO o000oooo2) throws IOException {
            if (o000oooo2 == null || (o000oooo2 instanceof com.google.gson.o0OoOo0)) {
                jsonWriter.nullValue();
                return;
            }
            boolean z = o000oooo2 instanceof com.google.gson.o00Ooo;
            if (z) {
                if (!z) {
                    throw new IllegalStateException(com.google.gson.Oooo0.OooO00o("Not a JSON Primitive: ", o000oooo2));
                }
                com.google.gson.o00Ooo o00ooo2 = (com.google.gson.o00Ooo) o000oooo2;
                Serializable serializable = o00ooo2.f20241OooO0Oo;
                if (serializable instanceof Number) {
                    jsonWriter.value(o00ooo2.OooO0Oo());
                    return;
                } else if (serializable instanceof Boolean) {
                    jsonWriter.value(o00ooo2.OooO0OO());
                    return;
                } else {
                    jsonWriter.value(o00ooo2.OooO0O0());
                    return;
                }
            }
            boolean z2 = o000oooo2 instanceof com.google.gson.OooOo00;
            if (z2) {
                jsonWriter.beginArray();
                if (!z2) {
                    throw new IllegalStateException(com.google.gson.Oooo0.OooO00o("Not a JSON Array: ", o000oooo2));
                }
                Iterator<com.google.gson.o000oOoO> it = ((com.google.gson.OooOo00) o000oooo2).iterator();
                while (it.hasNext()) {
                    write(jsonWriter, it.next());
                }
                jsonWriter.endArray();
                return;
            }
            if (!(o000oooo2 instanceof com.google.gson.o00O0O)) {
                throw new IllegalArgumentException("Couldn't write " + o000oooo2.getClass());
            }
            jsonWriter.beginObject();
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            LinkedTreeMap.OooO oooO = linkedTreeMap.f20137OooO0oo.f20143OooO0oO;
            int i = linkedTreeMap.f20136OooO0oO;
            while (true) {
                LinkedTreeMap.OooO oooO2 = linkedTreeMap.f20137OooO0oo;
                if (!(oooO != oooO2)) {
                    jsonWriter.endObject();
                    return;
                }
                if (oooO == oooO2) {
                    throw new NoSuchElementException();
                }
                if (linkedTreeMap.f20136OooO0oO != i) {
                    throw new ConcurrentModificationException();
                }
                LinkedTreeMap.OooO oooO3 = oooO.f20143OooO0oO;
                jsonWriter.name((String) oooO.f20139OooO);
                write(jsonWriter, (com.google.gson.o000oOoO) oooO.f20145OooOO0);
                oooO = oooO3;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.o0OOO0o
        public com.google.gson.o000oOoO read(JsonReader jsonReader) throws IOException {
            if (jsonReader instanceof com.google.gson.internal.bind.OooO0O0) {
                com.google.gson.internal.bind.OooO0O0 oooO0O0 = (com.google.gson.internal.bind.OooO0O0) jsonReader;
                JsonToken jsonTokenPeek = oooO0O0.peek();
                if (jsonTokenPeek != JsonToken.NAME && jsonTokenPeek != JsonToken.END_ARRAY && jsonTokenPeek != JsonToken.END_OBJECT && jsonTokenPeek != JsonToken.END_DOCUMENT) {
                    com.google.gson.o000oOoO o000oooo2 = (com.google.gson.o000oOoO) oooO0O0.OooO0OO();
                    oooO0O0.skipValue();
                    return o000oooo2;
                }
                throw new IllegalStateException("Unexpected " + jsonTokenPeek + " when reading a JsonElement.");
            }
            switch (o0ooOOo.f20226OooO00o[jsonReader.peek().ordinal()]) {
                case 1:
                    return new com.google.gson.o00Ooo(new LazilyParsedNumber(jsonReader.nextString()));
                case 2:
                    return new com.google.gson.o00Ooo(jsonReader.nextString());
                case 3:
                    return new com.google.gson.o00Ooo(Boolean.valueOf(jsonReader.nextBoolean()));
                case 4:
                    jsonReader.nextNull();
                    return com.google.gson.o0OoOo0.f20242OooO0Oo;
                case 5:
                    com.google.gson.OooOo00 oooOo00 = new com.google.gson.OooOo00();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.google.gson.o000oOoO o000oooo3 = read(jsonReader);
                        if (o000oooo3 == null) {
                            o000oooo3 = com.google.gson.o0OoOo0.f20242OooO0Oo;
                        }
                        oooOo00.f20129OooO0Oo.add(o000oooo3);
                    }
                    jsonReader.endArray();
                    return oooOo00;
                case 6:
                    com.google.gson.o00O0O o00o0o2 = new com.google.gson.o00O0O();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        o00o0o2.OooO0OO(jsonReader.nextName(), read(jsonReader));
                    }
                    jsonReader.endObject();
                    return o00o0o2;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public class oo0o0Oo extends com.google.gson.o0OOO0o<Number> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.o0OOO0o
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                int iNextInt = jsonReader.nextInt();
                if (iNextInt <= 65535 && iNextInt >= -32768) {
                    return Short.valueOf((short) iNextInt);
                }
                StringBuilder sbOooO0O0 = o0000O0.OooO0O0("Lossy conversion from ", iNextInt, " to short; at path ");
                sbOooO0O0.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbOooO0O0.toString());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    static {
        o0OOO0o o0ooo0o2 = new o0OOO0o();
        f20200OooO0OO = new o0Oo0oo();
        f20201OooO0Oo = new AnonymousClass32(Boolean.TYPE, Boolean.class, o0ooo0o2);
        f20203OooO0o0 = new AnonymousClass32(Byte.TYPE, Byte.class, new o0OO00O());
        f20202OooO0o = new AnonymousClass32(Short.TYPE, Short.class, new oo0o0Oo());
        f20204OooO0oO = new AnonymousClass32(Integer.TYPE, Integer.class, new o0O0O00());
        f20205OooO0oo = new AnonymousClass31(AtomicInteger.class, new o000OOo().nullSafe());
        f20197OooO = new AnonymousClass31(AtomicBoolean.class, new o000000().nullSafe());
        f20206OooOO0 = new AnonymousClass31(AtomicIntegerArray.class, new OooO00o().nullSafe());
        f20207OooOO0O = new OooO0O0();
        new OooO0OO();
        new OooO0o();
        f20208OooOO0o = new AnonymousClass32(Character.TYPE, Character.class, new OooO());
        OooOO0 oooOO1 = new OooOO0();
        f20210OooOOO0 = new OooOO0O();
        f20209OooOOO = new OooOOO0();
        f20211OooOOOO = new OooOOO();
        f20212OooOOOo = new AnonymousClass31(String.class, oooOO1);
        f20214OooOOo0 = new AnonymousClass31(StringBuilder.class, new OooOOOO());
        f20213OooOOo = new AnonymousClass31(StringBuffer.class, new OooOo());
        f20215OooOOoo = new AnonymousClass31(URL.class, new Oooo000());
        f20218OooOo00 = new AnonymousClass31(URI.class, new Oooo0());
        final o000oOoO o000oooo2 = new o000oOoO();
        final Class<InetAddress> cls = InetAddress.class;
        f20217OooOo0 = new com.google.gson.o0Oo0oo() { // from class: com.google.gson.internal.bind.TypeAdapters.34

            /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$34$OooO00o */
            public class OooO00o extends com.google.gson.o0OOO0o<Object> {
                final /* synthetic */ Class val$requestedType;

                public OooO00o(Class cls) {
                    this.val$requestedType = cls;
                }

                @Override // com.google.gson.o0OOO0o
                public Object read(JsonReader jsonReader) throws IOException {
                    Object obj = o000oooo2.read(jsonReader);
                    if (obj == null || this.val$requestedType.isInstance(obj)) {
                        return obj;
                    }
                    throw new JsonSyntaxException("Expected a " + this.val$requestedType.getName() + " but was " + obj.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
                }

                @Override // com.google.gson.o0OOO0o
                public void write(JsonWriter jsonWriter, Object obj) throws IOException {
                    o000oooo2.write(jsonWriter, obj);
                }
            }

            @Override // com.google.gson.o0Oo0oo
            public <T2> com.google.gson.o0OOO0o<T2> create(com.google.gson.OooOOO0 oooOOO0, TypeToken<T2> typeToken) {
                Class<? super T2> rawType = typeToken.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return new OooO00o(rawType);
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + o000oooo2 + "]";
            }
        };
        f20219OooOo0O = new AnonymousClass31(UUID.class, new o0OoOo0());
        f20220OooOo0o = new AnonymousClass31(Currency.class, new o00O0O().nullSafe());
        final o00Oo0 o00oo1 = new o00Oo0();
        final Class<Calendar> cls2 = Calendar.class;
        final Class<GregorianCalendar> cls3 = GregorianCalendar.class;
        f20216OooOo = new com.google.gson.o0Oo0oo() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.o0Oo0oo
            public <T> com.google.gson.o0OOO0o<T> create(com.google.gson.OooOOO0 oooOOO0, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType == cls2 || rawType == cls3) {
                    return o00oo1;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls3.getName() + ",adapter=" + o00oo1 + "]";
            }
        };
        f20222OooOoO0 = new AnonymousClass31(Locale.class, new o00Ooo());
        final oo000o oo000oVar = new oo000o();
        f20221OooOoO = oo000oVar;
        final Class<com.google.gson.o000oOoO> cls4 = com.google.gson.o000oOoO.class;
        f20223OooOoOO = new com.google.gson.o0Oo0oo() { // from class: com.google.gson.internal.bind.TypeAdapters.34

            /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$34$OooO00o */
            public class OooO00o extends com.google.gson.o0OOO0o<Object> {
                final /* synthetic */ Class val$requestedType;

                public OooO00o(Class cls) {
                    this.val$requestedType = cls;
                }

                @Override // com.google.gson.o0OOO0o
                public Object read(JsonReader jsonReader) throws IOException {
                    Object obj = oo000oVar.read(jsonReader);
                    if (obj == null || this.val$requestedType.isInstance(obj)) {
                        return obj;
                    }
                    throw new JsonSyntaxException("Expected a " + this.val$requestedType.getName() + " but was " + obj.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
                }

                @Override // com.google.gson.o0OOO0o
                public void write(JsonWriter jsonWriter, Object obj) throws IOException {
                    oo000oVar.write(jsonWriter, obj);
                }
            }

            @Override // com.google.gson.o0Oo0oo
            public <T2> com.google.gson.o0OOO0o<T2> create(com.google.gson.OooOOO0 oooOOO0, TypeToken<T2> typeToken) {
                Class<? super T2> rawType = typeToken.getRawType();
                if (cls4.isAssignableFrom(rawType)) {
                    return new OooO00o(rawType);
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls4.getName() + ",adapter=" + oo000oVar + "]";
            }
        };
        f20224OooOoo0 = new com.google.gson.o0Oo0oo() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.o0Oo0oo
            public <T> com.google.gson.o0OOO0o<T> create(com.google.gson.OooOOO0 oooOOO0, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new o000000O(rawType);
            }
        };
    }

    public static <TT> com.google.gson.o0Oo0oo OooO00o(final TypeToken<TT> typeToken, final com.google.gson.o0OOO0o<TT> o0ooo0o2) {
        return new com.google.gson.o0Oo0oo() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.o0Oo0oo
            public <T> com.google.gson.o0OOO0o<T> create(com.google.gson.OooOOO0 oooOOO0, TypeToken<T> typeToken2) {
                if (typeToken2.equals(typeToken)) {
                    return o0ooo0o2;
                }
                return null;
            }
        };
    }

    public static <TT> com.google.gson.o0Oo0oo OooO0O0(Class<TT> cls, com.google.gson.o0OOO0o<TT> o0ooo0o2) {
        return new AnonymousClass31(cls, o0ooo0o2);
    }

    public static <TT> com.google.gson.o0Oo0oo OooO0OO(Class<TT> cls, Class<TT> cls2, com.google.gson.o0OOO0o<? super TT> o0ooo0o2) {
        return new AnonymousClass32(cls, cls2, o0ooo0o2);
    }
}
