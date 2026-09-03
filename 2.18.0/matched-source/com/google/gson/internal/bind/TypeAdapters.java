package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.LinkedTreeMap;
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
import p388o0OOoo0O.o000OOo0;
import p388o0OOoo0O.o00O0;
import p388o0OOoo0O.o00O00;
import p388o0OOoo0O.o00O000o;
import p388o0OOoo0O.o00O00O;
import p388o0OOoo0O.o00O0O00;
import p388o0OOoo0O.o0O0ooO;
import p388o0OOoo0O.oOO00O;
import p390o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeAdapters {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final o00O0O00 f19289OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00O0O00 f19290OooO00o = new AnonymousClass31(Class.class, new OooOo00().nullSafe());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o00O0O00 f19291OooO0O0 = new AnonymousClass31(BitSet.class, new o00oO0o().nullSafe());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o00O0<Boolean> f19292OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00O0<Boolean> f19293OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o00O0<Number> f19294OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o00O0O00 f19295OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o00O0O00 f19296OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o00O0<Number> f19297OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final o00O0<Number> f19298OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final o00O0O00 f19299OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final o00O0O00 f19300OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final o00O0O00 f19301OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final o00O0O00 f19302OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final o00O0<Number> f19303OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final o00O0<Number> f19304OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final o00O0<Character> f19305OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final o00O0<Number> f19306OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final o00O0O00 f19307OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final o00O0O00 f19308OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final o00O0<BigDecimal> f19309OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final o00O0<String> f19310OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final o00O0<BigInteger> f19311OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final o00O0<LazilyParsedNumber> f19312OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final o00O0O00 f19313OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final o00O0<StringBuilder> f19314OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final o00O0<StringBuffer> f19315OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final o00O0<URL> f19316OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final o00O0O00 f19317OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final o00O0O00 f19318OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final o00O0<URI> f19319OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final o00O0<o00O000o> f19320Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final o00O0<UUID> f19321Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final o00O0O00 f19322Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final o00O0<InetAddress> f19323Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final o00O0O00 f19324Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final o00O0O00 f19325Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final o00O0O00 f19326Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o00O0O00 f19327Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final o00O0<Calendar> f19328Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final o00O0<Locale> f19329Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final o00O0O00 f19330Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final o00O0O00 f19331OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final o00O0O00 f19332OoooO00;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$31, reason: invalid class name */
    public class AnonymousClass31 implements o00O0O00 {
        public final /* synthetic */ Class val$type;
        public final /* synthetic */ o00O0 val$typeAdapter;

        public AnonymousClass31(Class cls, o00O0 o00o1) {
            this.val$type = cls;
            this.val$typeAdapter = o00o1;
        }

        @Override // p388o0OOoo0O.o00O0O00
        public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
            if (o00000o1.getRawType() == this.val$type) {
                return this.val$typeAdapter;
            }
            return null;
        }

        public String toString() {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Factory[type=");
            sbOooO0O0.append(this.val$type.getName());
            sbOooO0O0.append(",adapter=");
            sbOooO0O0.append(this.val$typeAdapter);
            sbOooO0O0.append("]");
            return sbOooO0O0.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$32, reason: invalid class name */
    public class AnonymousClass32 implements o00O0O00 {
        public final /* synthetic */ Class val$boxed;
        public final /* synthetic */ o00O0 val$typeAdapter;
        public final /* synthetic */ Class val$unboxed;

        public AnonymousClass32(Class cls, Class cls2, o00O0 o00o1) {
            this.val$unboxed = cls;
            this.val$boxed = cls2;
            this.val$typeAdapter = o00o1;
        }

        @Override // p388o0OOoo0O.o00O0O00
        public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
            Class<? super T> rawType = o00000o1.getRawType();
            if (rawType == this.val$unboxed || rawType == this.val$boxed) {
                return this.val$typeAdapter;
            }
            return null;
        }

        public String toString() {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Factory[type=");
            sbOooO0O0.append(this.val$boxed.getName());
            sbOooO0O0.append("+");
            sbOooO0O0.append(this.val$unboxed.getName());
            sbOooO0O0.append(",adapter=");
            sbOooO0O0.append(this.val$typeAdapter);
            sbOooO0O0.append("]");
            return sbOooO0O0.toString();
        }
    }

    public class OooO extends o00O0<Character> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p388o0OOoo0O.o00O0
        public Character read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            if (strNextString.length() == 1) {
                return Character.valueOf(strNextString.charAt(0));
            }
            StringBuilder sbOooO00o = OooO0o.OooO0o.OooO00o("Expecting character, got: ", strNextString, "; at ");
            sbOooO00o.append(jsonReader.getPreviousPath());
            throw new JsonSyntaxException(sbOooO00o.toString());
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, Character ch) throws IOException {
            jsonWriter.value(ch == null ? null : String.valueOf(ch));
        }
    }

    public class OooO00o extends o00O0<AtomicIntegerArray> {
        @Override // p388o0OOoo0O.o00O0
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

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.value(atomicIntegerArray.get(i));
            }
            jsonWriter.endArray();
        }
    }

    public class OooO0O0 extends o00O0<Number> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p388o0OOoo0O.o00O0
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

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public class OooO0OO extends o00O0<Number> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p388o0OOoo0O.o00O0
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public class OooO0o extends o00O0<Number> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p388o0OOoo0O.o00O0
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public class OooOO0 extends o00O0<String> {
        @Override // p388o0OOoo0O.o00O0
        public String read(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek != JsonToken.NULL) {
                return jsonTokenPeek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, String str) throws IOException {
            jsonWriter.value(str);
        }
    }

    public class OooOO0O extends o00O0<BigDecimal> {
        @Override // p388o0OOoo0O.o00O0
        public BigDecimal read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            try {
                return new BigDecimal(strNextString);
            } catch (NumberFormatException e) {
                StringBuilder sbOooO00o = OooO0o.OooO0o.OooO00o("Failed parsing '", strNextString, "' as BigDecimal; at path ");
                sbOooO00o.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbOooO00o.toString(), e);
            }
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
            jsonWriter.value(bigDecimal);
        }
    }

    public class OooOOO extends o00O0<LazilyParsedNumber> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p388o0OOoo0O.o00O0
        public LazilyParsedNumber read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new LazilyParsedNumber(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, LazilyParsedNumber lazilyParsedNumber) throws IOException {
            jsonWriter.value(lazilyParsedNumber);
        }
    }

    public class OooOOO0 extends o00O0<BigInteger> {
        @Override // p388o0OOoo0O.o00O0
        public BigInteger read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            try {
                return new BigInteger(strNextString);
            } catch (NumberFormatException e) {
                StringBuilder sbOooO00o = OooO0o.OooO0o.OooO00o("Failed parsing '", strNextString, "' as BigInteger; at path ");
                sbOooO00o.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbOooO00o.toString(), e);
            }
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
            jsonWriter.value(bigInteger);
        }
    }

    public class OooOOOO extends o00O0<StringBuilder> {
        @Override // p388o0OOoo0O.o00O0
        public StringBuilder read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new StringBuilder(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
            jsonWriter.value(sb == null ? null : sb.toString());
        }
    }

    public class OooOo extends o00O0<StringBuffer> {
        @Override // p388o0OOoo0O.o00O0
        public StringBuffer read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new StringBuffer(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
            jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    public class OooOo00 extends o00O0<Class> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p388o0OOoo0O.o00O0
        public Class read(JsonReader jsonReader) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, Class cls) throws IOException {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Attempted to serialize java.lang.Class: ");
            sbOooO0O0.append(cls.getName());
            sbOooO0O0.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(sbOooO0O0.toString());
        }
    }

    public class Oooo0 extends o00O0<URI> {
        @Override // p388o0OOoo0O.o00O0
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

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, URI uri) throws IOException {
            jsonWriter.value(uri == null ? null : uri.toASCIIString());
        }
    }

    public class Oooo000 extends o00O0<URL> {
        @Override // p388o0OOoo0O.o00O0
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

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, URL url) throws IOException {
            jsonWriter.value(url == null ? null : url.toExternalForm());
        }
    }

    public class o000000 extends o00O0<AtomicBoolean> {
        @Override // p388o0OOoo0O.o00O0
        public AtomicBoolean read(JsonReader jsonReader) throws IOException {
            return new AtomicBoolean(jsonReader.nextBoolean());
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
            jsonWriter.value(atomicBoolean.get());
        }
    }

    public static final class o000000O<T extends Enum<T>> extends o00O0<T> {
        private final Map<String, T> nameToConstant = new HashMap();
        private final Map<T, String> constantToName = new HashMap();

        public class OooO00o implements PrivilegedAction<Field[]> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ Class f19333OooO00o;

            public OooO00o(Class cls) {
                this.f19333OooO00o = cls;
            }

            @Override // java.security.PrivilegedAction
            public final Field[] run() {
                Field[] declaredFields = this.f19333OooO00o.getDeclaredFields();
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

        @Override // p388o0OOoo0O.o00O0
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return this.nameToConstant.get(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            jsonWriter.value(t == null ? null : this.constantToName.get(t));
        }
    }

    public class o000OOo extends o00O0<AtomicInteger> {
        @Override // p388o0OOoo0O.o00O0
        public AtomicInteger read(JsonReader jsonReader) throws IOException {
            try {
                return new AtomicInteger(jsonReader.nextInt());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
            jsonWriter.value(atomicInteger.get());
        }
    }

    public class o000oOoO extends o00O0<InetAddress> {
        @Override // p388o0OOoo0O.o00O0
        public InetAddress read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return InetAddress.getByName(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
            jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    public class o00O0O extends o00O0<Currency> {
        @Override // p388o0OOoo0O.o00O0
        public Currency read(JsonReader jsonReader) throws IOException {
            String strNextString = jsonReader.nextString();
            try {
                return Currency.getInstance(strNextString);
            } catch (IllegalArgumentException e) {
                StringBuilder sbOooO00o = OooO0o.OooO0o.OooO00o("Failed parsing '", strNextString, "' as Currency; at path ");
                sbOooO00o.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbOooO00o.toString(), e);
            }
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, Currency currency) throws IOException {
            jsonWriter.value(currency.getCurrencyCode());
        }
    }

    public class o00Oo0 extends o00O0<Calendar> {
        private static final String DAY_OF_MONTH = "dayOfMonth";
        private static final String HOUR_OF_DAY = "hourOfDay";
        private static final String MINUTE = "minute";
        private static final String MONTH = "month";
        private static final String SECOND = "second";
        private static final String YEAR = "year";

        @Override // p388o0OOoo0O.o00O0
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

        @Override // p388o0OOoo0O.o00O0
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

    public class o00Ooo extends o00O0<Locale> {
        @Override // p388o0OOoo0O.o00O0
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

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, Locale locale) throws IOException {
            jsonWriter.value(locale == null ? null : locale.toString());
        }
    }

    public class o00oO0o extends o00O0<BitSet> {
        @Override // p388o0OOoo0O.o00O0
        public BitSet read(JsonReader jsonReader) throws IOException {
            BitSet bitSet = new BitSet();
            jsonReader.beginArray();
            JsonToken jsonTokenPeek = jsonReader.peek();
            int i = 0;
            while (jsonTokenPeek != JsonToken.END_ARRAY) {
                int i2 = o0ooOOo.f19334OooO00o[jsonTokenPeek.ordinal()];
                boolean zNextBoolean = true;
                if (i2 == 1 || i2 == 2) {
                    int iNextInt = jsonReader.nextInt();
                    if (iNextInt == 0) {
                        zNextBoolean = false;
                    } else if (iNextInt != 1) {
                        StringBuilder sbOooO00o = androidx.appcompat.widget.o00000O0.OooO00o("Invalid bitset value ", iNextInt, ", expected 0 or 1; at path ");
                        sbOooO00o.append(jsonReader.getPreviousPath());
                        throw new JsonSyntaxException(sbOooO00o.toString());
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

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
            jsonWriter.beginArray();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.value(bitSet.get(i) ? 1L : 0L);
            }
            jsonWriter.endArray();
        }
    }

    public class o0O0O00 extends o00O0<Number> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p388o0OOoo0O.o00O0
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

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public class o0OO00O extends o00O0<Number> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p388o0OOoo0O.o00O0
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
                StringBuilder sbOooO00o = androidx.appcompat.widget.o00000O0.OooO00o("Lossy conversion from ", iNextInt, " to byte; at path ");
                sbOooO00o.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbOooO00o.toString());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public class o0OOO0o extends o00O0<Boolean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p388o0OOoo0O.o00O0
        public Boolean read(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek != JsonToken.NULL) {
                return jsonTokenPeek == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString())) : Boolean.valueOf(jsonReader.nextBoolean());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool);
        }
    }

    public class o0Oo0oo extends o00O0<Boolean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p388o0OOoo0O.o00O0
        public Boolean read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Boolean.valueOf(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool == null ? "null" : bool.toString());
        }
    }

    public class o0OoOo0 extends o00O0<UUID> {
        @Override // p388o0OOoo0O.o00O0
        public UUID read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            try {
                return UUID.fromString(strNextString);
            } catch (IllegalArgumentException e) {
                StringBuilder sbOooO00o = OooO0o.OooO0o.OooO00o("Failed parsing '", strNextString, "' as UUID; at path ");
                sbOooO00o.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbOooO00o.toString(), e);
            }
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, UUID uuid) throws IOException {
            jsonWriter.value(uuid == null ? null : uuid.toString());
        }
    }

    public static /* synthetic */ class o0ooOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19334OooO00o;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f19334OooO00o = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19334OooO00o[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19334OooO00o[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19334OooO00o[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19334OooO00o[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19334OooO00o[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19334OooO00o[JsonToken.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19334OooO00o[JsonToken.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19334OooO00o[JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19334OooO00o[JsonToken.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public class oo000o extends o00O0<o00O000o> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, o00O000o o00o000o2) throws IOException {
            if (o00o000o2 == null || (o00o000o2 instanceof o00O00)) {
                jsonWriter.nullValue();
                return;
            }
            if (o00o000o2 instanceof oOO00O) {
                oOO00O ooo00oOooO0O0 = o00o000o2.OooO0O0();
                Serializable serializable = ooo00oOooO0O0.f38907OooO00o;
                if (serializable instanceof Number) {
                    jsonWriter.value(ooo00oOooO0O0.OooO0oO());
                    return;
                } else if (serializable instanceof Boolean) {
                    jsonWriter.value(ooo00oOooO0O0.OooO0o0());
                    return;
                } else {
                    jsonWriter.value(ooo00oOooO0O0.OooO0OO());
                    return;
                }
            }
            boolean z = o00o000o2 instanceof o0O0ooO;
            if (z) {
                jsonWriter.beginArray();
                if (!z) {
                    throw new IllegalStateException("Not a JSON Array: " + o00o000o2);
                }
                Iterator<o00O000o> it = ((o0O0ooO) o00o000o2).iterator();
                while (it.hasNext()) {
                    write(jsonWriter, it.next());
                }
                jsonWriter.endArray();
                return;
            }
            if (!(o00o000o2 instanceof o00O00O)) {
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Couldn't write ");
                sbOooO0O0.append(o00o000o2.getClass());
                throw new IllegalArgumentException(sbOooO0O0.toString());
            }
            jsonWriter.beginObject();
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            LinkedTreeMap.OooO oooO = linkedTreeMap.f19244OoooO.f19254OoooO0O;
            int i = linkedTreeMap.f19247OoooO0O;
            while (true) {
                LinkedTreeMap.OooO oooO2 = linkedTreeMap.f19244OoooO;
                if (!(oooO != oooO2)) {
                    jsonWriter.endObject();
                    return;
                }
                if (oooO == oooO2) {
                    throw new NoSuchElementException();
                }
                if (linkedTreeMap.f19247OoooO0O != i) {
                    throw new ConcurrentModificationException();
                }
                LinkedTreeMap.OooO oooO3 = oooO.f19254OoooO0O;
                jsonWriter.name((String) oooO.f19255OoooOO0);
                write(jsonWriter, (o00O000o) oooO.f19257o000oOoO);
                oooO = oooO3;
            }
        }

        @Override // p388o0OOoo0O.o00O0
        public o00O000o read(JsonReader jsonReader) throws IOException {
            if (jsonReader instanceof com.google.gson.internal.bind.OooO0O0) {
                com.google.gson.internal.bind.OooO0O0 oooO0O0 = (com.google.gson.internal.bind.OooO0O0) jsonReader;
                JsonToken jsonTokenPeek = oooO0O0.peek();
                if (jsonTokenPeek != JsonToken.NAME && jsonTokenPeek != JsonToken.END_ARRAY && jsonTokenPeek != JsonToken.END_OBJECT && jsonTokenPeek != JsonToken.END_DOCUMENT) {
                    o00O000o o00o000o2 = (o00O000o) oooO0O0.OooO0O0();
                    oooO0O0.skipValue();
                    return o00o000o2;
                }
                throw new IllegalStateException("Unexpected " + jsonTokenPeek + " when reading a JsonElement.");
            }
            switch (o0ooOOo.f19334OooO00o[jsonReader.peek().ordinal()]) {
                case 1:
                    return new oOO00O(new LazilyParsedNumber(jsonReader.nextString()));
                case 2:
                    return new oOO00O(jsonReader.nextString());
                case 3:
                    return new oOO00O(Boolean.valueOf(jsonReader.nextBoolean()));
                case 4:
                    jsonReader.nextNull();
                    return o00O00.f38904OooO00o;
                case 5:
                    o0O0ooO o0o0ooo = new o0O0ooO();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        o0o0ooo.OooO0o0(read(jsonReader));
                    }
                    jsonReader.endArray();
                    return o0o0ooo;
                case 6:
                    o00O00O o00o00o2 = new o00O00O();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        o00o00o2.OooO0o0(jsonReader.nextName(), read(jsonReader));
                    }
                    jsonReader.endObject();
                    return o00o00o2;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public class oo0o0Oo extends o00O0<Number> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p388o0OOoo0O.o00O0
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
                StringBuilder sbOooO00o = androidx.appcompat.widget.o00000O0.OooO00o("Lossy conversion from ", iNextInt, " to short; at path ");
                sbOooO00o.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(sbOooO00o.toString());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }

        @Override // p388o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    static {
        o0OOO0o o0ooo0o2 = new o0OOO0o();
        f19292OooO0OO = o0ooo0o2;
        f19293OooO0Oo = new o0Oo0oo();
        f19295OooO0o0 = new AnonymousClass32(Boolean.TYPE, Boolean.class, o0ooo0o2);
        o0OO00O o0oo00o2 = new o0OO00O();
        f19294OooO0o = o0oo00o2;
        f19296OooO0oO = new AnonymousClass32(Byte.TYPE, Byte.class, o0oo00o2);
        oo0o0Oo oo0o0oo = new oo0o0Oo();
        f19297OooO0oo = oo0o0oo;
        f19289OooO = new AnonymousClass32(Short.TYPE, Short.class, oo0o0oo);
        o0O0O00 o0o0o00 = new o0O0O00();
        f19298OooOO0 = o0o0o00;
        f19299OooOO0O = new AnonymousClass32(Integer.TYPE, Integer.class, o0o0o00);
        f19300OooOO0o = new AnonymousClass31(AtomicInteger.class, new o000OOo().nullSafe());
        f19302OooOOO0 = new AnonymousClass31(AtomicBoolean.class, new o000000().nullSafe());
        f19301OooOOO = new AnonymousClass31(AtomicIntegerArray.class, new OooO00o().nullSafe());
        f19303OooOOOO = new OooO0O0();
        f19304OooOOOo = new OooO0OO();
        f19306OooOOo0 = new OooO0o();
        OooO oooO = new OooO();
        f19305OooOOo = oooO;
        f19307OooOOoo = new AnonymousClass32(Character.TYPE, Character.class, oooO);
        OooOO0 oooOO1 = new OooOO0();
        f19310OooOo00 = oooOO1;
        f19309OooOo0 = new OooOO0O();
        f19311OooOo0O = new OooOOO0();
        f19312OooOo0o = new OooOOO();
        f19308OooOo = new AnonymousClass31(String.class, oooOO1);
        OooOOOO oooOOOO = new OooOOOO();
        f19314OooOoO0 = oooOOOO;
        f19313OooOoO = new AnonymousClass31(StringBuilder.class, oooOOOO);
        OooOo oooOo = new OooOo();
        f19315OooOoOO = oooOo;
        f19317OooOoo0 = new AnonymousClass31(StringBuffer.class, oooOo);
        Oooo000 oooo000 = new Oooo000();
        f19316OooOoo = oooo000;
        f19318OooOooO = new AnonymousClass31(URL.class, oooo000);
        Oooo0 oooo0 = new Oooo0();
        f19319OooOooo = oooo0;
        f19322Oooo000 = new AnonymousClass31(URI.class, oooo0);
        final o000oOoO o000oooo2 = new o000oOoO();
        f19323Oooo00O = o000oooo2;
        final Class<InetAddress> cls = InetAddress.class;
        f19324Oooo00o = new o00O0O00() { // from class: com.google.gson.internal.bind.TypeAdapters.34

            /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$34$OooO00o */
            public class OooO00o extends o00O0<Object> {
                public final /* synthetic */ Class val$requestedType;

                public OooO00o(Class cls) {
                    this.val$requestedType = cls;
                }

                @Override // p388o0OOoo0O.o00O0
                public Object read(JsonReader jsonReader) throws IOException {
                    Object obj = o000oooo2.read(jsonReader);
                    if (obj == null || this.val$requestedType.isInstance(obj)) {
                        return obj;
                    }
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Expected a ");
                    sbOooO0O0.append(this.val$requestedType.getName());
                    sbOooO0O0.append(" but was ");
                    sbOooO0O0.append(obj.getClass().getName());
                    sbOooO0O0.append("; at path ");
                    sbOooO0O0.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(sbOooO0O0.toString());
                }

                @Override // p388o0OOoo0O.o00O0
                public void write(JsonWriter jsonWriter, Object obj) throws IOException {
                    o000oooo2.write(jsonWriter, obj);
                }
            }

            @Override // p388o0OOoo0O.o00O0O00
            public <T2> o00O0<T2> create(o000OOo0 o000ooo1, o00000O0<T2> o00000o1) {
                Class<? super T2> rawType = o00000o1.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return new OooO00o(rawType);
                }
                return null;
            }

            public String toString() {
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Factory[typeHierarchy=");
                sbOooO0O0.append(cls.getName());
                sbOooO0O0.append(",adapter=");
                sbOooO0O0.append(o000oooo2);
                sbOooO0O0.append("]");
                return sbOooO0O0.toString();
            }
        };
        o0OoOo0 o0oooo1 = new o0OoOo0();
        f19321Oooo0 = o0oooo1;
        f19325Oooo0O0 = new AnonymousClass31(UUID.class, o0oooo1);
        f19326Oooo0OO = new AnonymousClass31(Currency.class, new o00O0O().nullSafe());
        final o00Oo0 o00oo1 = new o00Oo0();
        f19328Oooo0o0 = o00oo1;
        final Class<Calendar> cls2 = Calendar.class;
        final Class<GregorianCalendar> cls3 = GregorianCalendar.class;
        f19327Oooo0o = new o00O0O00() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // p388o0OOoo0O.o00O0O00
            public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
                Class<? super T> rawType = o00000o1.getRawType();
                if (rawType == cls2 || rawType == cls3) {
                    return o00oo1;
                }
                return null;
            }

            public String toString() {
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Factory[type=");
                sbOooO0O0.append(cls2.getName());
                sbOooO0O0.append("+");
                sbOooO0O0.append(cls3.getName());
                sbOooO0O0.append(",adapter=");
                sbOooO0O0.append(o00oo1);
                sbOooO0O0.append("]");
                return sbOooO0O0.toString();
            }
        };
        o00Ooo o00ooo2 = new o00Ooo();
        f19329Oooo0oO = o00ooo2;
        f19330Oooo0oo = new AnonymousClass31(Locale.class, o00ooo2);
        final oo000o oo000oVar = new oo000o();
        f19320Oooo = oo000oVar;
        final Class<o00O000o> cls4 = o00O000o.class;
        f19332OoooO00 = new o00O0O00() { // from class: com.google.gson.internal.bind.TypeAdapters.34

            /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$34$OooO00o */
            public class OooO00o extends o00O0<Object> {
                public final /* synthetic */ Class val$requestedType;

                public OooO00o(Class cls) {
                    this.val$requestedType = cls;
                }

                @Override // p388o0OOoo0O.o00O0
                public Object read(JsonReader jsonReader) throws IOException {
                    Object obj = oo000oVar.read(jsonReader);
                    if (obj == null || this.val$requestedType.isInstance(obj)) {
                        return obj;
                    }
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Expected a ");
                    sbOooO0O0.append(this.val$requestedType.getName());
                    sbOooO0O0.append(" but was ");
                    sbOooO0O0.append(obj.getClass().getName());
                    sbOooO0O0.append("; at path ");
                    sbOooO0O0.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(sbOooO0O0.toString());
                }

                @Override // p388o0OOoo0O.o00O0
                public void write(JsonWriter jsonWriter, Object obj) throws IOException {
                    oo000oVar.write(jsonWriter, obj);
                }
            }

            @Override // p388o0OOoo0O.o00O0O00
            public <T2> o00O0<T2> create(o000OOo0 o000ooo1, o00000O0<T2> o00000o1) {
                Class<? super T2> rawType = o00000o1.getRawType();
                if (cls4.isAssignableFrom(rawType)) {
                    return new OooO00o(rawType);
                }
                return null;
            }

            public String toString() {
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Factory[typeHierarchy=");
                sbOooO0O0.append(cls4.getName());
                sbOooO0O0.append(",adapter=");
                sbOooO0O0.append(oo000oVar);
                sbOooO0O0.append("]");
                return sbOooO0O0.toString();
            }
        };
        f19331OoooO0 = new o00O0O00() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // p388o0OOoo0O.o00O0O00
            public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
                Class<? super T> rawType = o00000o1.getRawType();
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

    public static <TT> o00O0O00 OooO00o(Class<TT> cls, Class<TT> cls2, o00O0<? super TT> o00o1) {
        return new AnonymousClass32(cls, cls2, o00o1);
    }

    public static <TT> o00O0O00 OooO0O0(Class<TT> cls, o00O0<TT> o00o1) {
        return new AnonymousClass31(cls, o00o1);
    }

    public static <TT> o00O0O00 OooO0OO(final o00000O0<TT> o00000o1, final o00O0<TT> o00o1) {
        return new o00O0O00() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // p388o0OOoo0O.o00O0O00
            public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o2) {
                if (o00000o2.equals(o00000o1)) {
                    return o00o1;
                }
                return null;
            }
        };
    }
}
