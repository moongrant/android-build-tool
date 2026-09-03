package com.google.gson.internal.bind;

import com.google.gson.OooOo00;
import com.google.gson.Oooo0;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.o000oOoO;
import com.google.gson.o00Oo0;
import com.google.gson.o0OoOo0;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends JsonReader {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Object[] f20651OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String[] f20652OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f20653OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int[] f20654OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO00o f20650OooO0oo = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Object f20649OooO = new Object();

    public class OooO00o extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    public OooO0O0(Oooo0 oooo0) {
        super(f20650OooO0oo);
        this.f20651OooO0Oo = new Object[32];
        this.f20653OooO0o0 = 0;
        this.f20652OooO0o = new String[32];
        this.f20654OooO0oO = new int[32];
        OooOOo0(oooo0);
    }

    private String locationString() {
        return " at path " + getPath(false);
    }

    public final void OooO00o(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    public final Object OooO0OO() {
        return this.f20651OooO0Oo[this.f20653OooO0o0 - 1];
    }

    public final Object OooO0oO() {
        Object[] objArr = this.f20651OooO0Oo;
        int i = this.f20653OooO0o0 - 1;
        this.f20653OooO0o0 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void OooOOo0(Object obj) {
        int i = this.f20653OooO0o0;
        Object[] objArr = this.f20651OooO0Oo;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f20651OooO0Oo = Arrays.copyOf(objArr, i2);
            this.f20654OooO0oO = Arrays.copyOf(this.f20654OooO0oO, i2);
            this.f20652OooO0o = (String[]) Arrays.copyOf(this.f20652OooO0o, i2);
        }
        Object[] objArr2 = this.f20651OooO0Oo;
        int i3 = this.f20653OooO0o0;
        this.f20653OooO0o0 = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginArray() throws IOException {
        OooO00o(JsonToken.BEGIN_ARRAY);
        OooOOo0(((OooOo00) OooO0OO()).iterator());
        this.f20654OooO0oO[this.f20653OooO0o0 - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginObject() throws IOException {
        OooO00o(JsonToken.BEGIN_OBJECT);
        OooOOo0(new LinkedTreeMap.OooO0O0.OooO00o(((o0OoOo0) OooO0OO()).OooO0o0()));
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f20651OooO0Oo = new Object[]{f20649OooO};
        this.f20653OooO0o0 = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endArray() throws IOException {
        OooO00o(JsonToken.END_ARRAY);
        OooO0oO();
        OooO0oO();
        int i = this.f20653OooO0o0;
        if (i > 0) {
            int[] iArr = this.f20654OooO0oO;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endObject() throws IOException {
        OooO00o(JsonToken.END_OBJECT);
        OooO0oO();
        OooO0oO();
        int i = this.f20653OooO0o0;
        if (i > 0) {
            int[] iArr = this.f20654OooO0oO;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final String getPath(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f20653OooO0o0;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.f20651OooO0Oo;
            Object obj = objArr[i];
            if (obj instanceof OooOo00) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.f20654OooO0oO[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof o0OoOo0) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.f20652OooO0o[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPreviousPath() {
        return getPath(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean hasNext() throws IOException {
        JsonToken jsonTokenPeek = peek();
        return (jsonTokenPeek == JsonToken.END_OBJECT || jsonTokenPeek == JsonToken.END_ARRAY || jsonTokenPeek == JsonToken.END_DOCUMENT) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean nextBoolean() throws IOException {
        OooO00o(JsonToken.BOOLEAN);
        boolean zOooO0OO = ((o00Oo0) OooO0oO()).OooO0OO();
        int i = this.f20653OooO0o0;
        if (i > 0) {
            int[] iArr = this.f20654OooO0oO;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zOooO0OO;
    }

    @Override // com.google.gson.stream.JsonReader
    public final double nextDouble() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        o00Oo0 o00oo1 = (o00Oo0) OooO0OO();
        double dDoubleValue = o00oo1.f20714OooO0Oo instanceof Number ? o00oo1.OooO0Oo().doubleValue() : Double.parseDouble(o00oo1.OooO0O0());
        if (!isLenient() && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        OooO0oO();
        int i = this.f20653OooO0o0;
        if (i > 0) {
            int[] iArr = this.f20654OooO0oO;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dDoubleValue;
    }

    @Override // com.google.gson.stream.JsonReader
    public final int nextInt() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        o00Oo0 o00oo1 = (o00Oo0) OooO0OO();
        int iIntValue = o00oo1.f20714OooO0Oo instanceof Number ? o00oo1.OooO0Oo().intValue() : Integer.parseInt(o00oo1.OooO0O0());
        OooO0oO();
        int i = this.f20653OooO0o0;
        if (i > 0) {
            int[] iArr = this.f20654OooO0oO;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iIntValue;
    }

    @Override // com.google.gson.stream.JsonReader
    public final long nextLong() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        o00Oo0 o00oo1 = (o00Oo0) OooO0OO();
        long jLongValue = o00oo1.f20714OooO0Oo instanceof Number ? o00oo1.OooO0Oo().longValue() : Long.parseLong(o00oo1.OooO0O0());
        OooO0oO();
        int i = this.f20653OooO0o0;
        if (i > 0) {
            int[] iArr = this.f20654OooO0oO;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jLongValue;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextName() throws IOException {
        OooO00o(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) OooO0OO()).next();
        String str = (String) entry.getKey();
        this.f20652OooO0o[this.f20653OooO0o0 - 1] = str;
        OooOOo0(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void nextNull() throws IOException {
        OooO00o(JsonToken.NULL);
        OooO0oO();
        int i = this.f20653OooO0o0;
        if (i > 0) {
            int[] iArr = this.f20654OooO0oO;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextString() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        String strOooO0O0 = ((o00Oo0) OooO0oO()).OooO0O0();
        int i = this.f20653OooO0o0;
        if (i > 0) {
            int[] iArr = this.f20654OooO0oO;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return strOooO0O0;
    }

    @Override // com.google.gson.stream.JsonReader
    public final JsonToken peek() throws IOException {
        if (this.f20653OooO0o0 == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objOooO0OO = OooO0OO();
        if (objOooO0OO instanceof Iterator) {
            boolean z = this.f20651OooO0Oo[this.f20653OooO0o0 - 2] instanceof o0OoOo0;
            Iterator it = (Iterator) objOooO0OO;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            OooOOo0(it.next());
            return peek();
        }
        if (objOooO0OO instanceof o0OoOo0) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objOooO0OO instanceof OooOo00) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (!(objOooO0OO instanceof o00Oo0)) {
            if (objOooO0OO instanceof o000oOoO) {
                return JsonToken.NULL;
            }
            if (objOooO0OO == f20649OooO) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        Serializable serializable = ((o00Oo0) objOooO0OO).f20714OooO0Oo;
        if (serializable instanceof String) {
            return JsonToken.STRING;
        }
        if (serializable instanceof Boolean) {
            return JsonToken.BOOLEAN;
        }
        if (serializable instanceof Number) {
            return JsonToken.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.stream.JsonReader
    public final void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f20652OooO0o[this.f20653OooO0o0 - 2] = "null";
        } else {
            OooO0oO();
            int i = this.f20653OooO0o0;
            if (i > 0) {
                this.f20652OooO0o[i - 1] = "null";
            }
        }
        int i2 = this.f20653OooO0o0;
        if (i2 > 0) {
            int[] iArr = this.f20654OooO0oO;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String toString() {
        return OooO0O0.class.getSimpleName() + locationString();
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPath() {
        return getPath(false);
    }
}
