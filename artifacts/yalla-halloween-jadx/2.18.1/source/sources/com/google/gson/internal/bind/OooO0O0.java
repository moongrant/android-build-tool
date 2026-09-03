package com.google.gson.internal.bind;

import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Typography;
import p028Oooo0o0.o00O0O0O;
import p386o0OOoo0O.o00O00;
import p386o0OOoo0O.o00O000o;
import p386o0OOoo0O.o00O00O;
import p386o0OOoo0O.o0O0ooO;
import p386o0OOoo0O.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends JsonReader {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int[] f19251Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Object[] f19252Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f19253Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public String[] f19254Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final OooO00o f19250OoooO00 = new OooO00o();

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final Object f19249OoooO0 = new Object();

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

    public OooO0O0(o00O000o o00o000o2) {
        super(f19250OoooO00);
        this.f19252Oooo0o = new Object[32];
        this.f19253Oooo0oO = 0;
        this.f19254Oooo0oo = new String[32];
        this.f19251Oooo = new int[32];
        OooO0o(o00o000o2);
    }

    private String locationString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(" at path ");
        sbOooO0o0.append(getPath(false));
        return sbOooO0o0.toString();
    }

    public final void OooO00o(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    public final Object OooO0O0() {
        return this.f19252Oooo0o[this.f19253Oooo0oO - 1];
    }

    public final Object OooO0Oo() {
        Object[] objArr = this.f19252Oooo0o;
        int i = this.f19253Oooo0oO - 1;
        this.f19253Oooo0oO = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void OooO0o(Object obj) {
        int i = this.f19253Oooo0oO;
        Object[] objArr = this.f19252Oooo0o;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f19252Oooo0o = Arrays.copyOf(objArr, i2);
            this.f19251Oooo = Arrays.copyOf(this.f19251Oooo, i2);
            this.f19254Oooo0oo = (String[]) Arrays.copyOf(this.f19254Oooo0oo, i2);
        }
        Object[] objArr2 = this.f19252Oooo0o;
        int i3 = this.f19253Oooo0oO;
        this.f19253Oooo0oO = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginArray() throws IOException {
        OooO00o(JsonToken.BEGIN_ARRAY);
        OooO0o(((o0O0ooO) OooO0O0()).iterator());
        this.f19251Oooo[this.f19253Oooo0oO - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginObject() throws IOException {
        OooO00o(JsonToken.BEGIN_OBJECT);
        OooO0o(new LinkedTreeMap.OooO0O0.OooO00o((LinkedTreeMap.OooO0O0) ((o00O00O) OooO0O0()).entrySet()));
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f19252Oooo0o = new Object[]{f19249OoooO0};
        this.f19253Oooo0oO = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endArray() throws IOException {
        OooO00o(JsonToken.END_ARRAY);
        OooO0Oo();
        OooO0Oo();
        int i = this.f19253Oooo0oO;
        if (i > 0) {
            int[] iArr = this.f19251Oooo;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endObject() throws IOException {
        OooO00o(JsonToken.END_OBJECT);
        OooO0Oo();
        OooO0Oo();
        int i = this.f19253Oooo0oO;
        if (i > 0) {
            int[] iArr = this.f19251Oooo;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final String getPath(boolean z) {
        StringBuilder sbOooO00o = o00O0O0O.OooO00o(Typography.dollar);
        int i = 0;
        while (true) {
            int i2 = this.f19253Oooo0oO;
            if (i >= i2) {
                return sbOooO00o.toString();
            }
            Object[] objArr = this.f19252Oooo0o;
            if (objArr[i] instanceof o0O0ooO) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.f19251Oooo[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sbOooO00o.append('[');
                    sbOooO00o.append(i3);
                    sbOooO00o.append(']');
                }
            } else if ((objArr[i] instanceof o00O00O) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sbOooO00o.append('.');
                String[] strArr = this.f19254Oooo0oo;
                if (strArr[i] != null) {
                    sbOooO00o.append(strArr[i]);
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
        boolean zOooO0o0 = ((oOO00O) OooO0Oo()).OooO0o0();
        int i = this.f19253Oooo0oO;
        if (i > 0) {
            int[] iArr = this.f19251Oooo;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zOooO0o0;
    }

    @Override // com.google.gson.stream.JsonReader
    public final double nextDouble() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        oOO00O ooo00o = (oOO00O) OooO0O0();
        double dDoubleValue = ooo00o.f38887OooO00o instanceof Number ? ooo00o.OooO0oO().doubleValue() : Double.parseDouble(ooo00o.OooO0OO());
        if (!isLenient() && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        OooO0Oo();
        int i = this.f19253Oooo0oO;
        if (i > 0) {
            int[] iArr = this.f19251Oooo;
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
        oOO00O ooo00o = (oOO00O) OooO0O0();
        int iIntValue = ooo00o.f38887OooO00o instanceof Number ? ooo00o.OooO0oO().intValue() : Integer.parseInt(ooo00o.OooO0OO());
        OooO0Oo();
        int i = this.f19253Oooo0oO;
        if (i > 0) {
            int[] iArr = this.f19251Oooo;
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
        oOO00O ooo00o = (oOO00O) OooO0O0();
        long jLongValue = ooo00o.f38887OooO00o instanceof Number ? ooo00o.OooO0oO().longValue() : Long.parseLong(ooo00o.OooO0OO());
        OooO0Oo();
        int i = this.f19253Oooo0oO;
        if (i > 0) {
            int[] iArr = this.f19251Oooo;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jLongValue;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextName() throws IOException {
        OooO00o(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) OooO0O0()).next();
        String str = (String) entry.getKey();
        this.f19254Oooo0oo[this.f19253Oooo0oO - 1] = str;
        OooO0o(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void nextNull() throws IOException {
        OooO00o(JsonToken.NULL);
        OooO0Oo();
        int i = this.f19253Oooo0oO;
        if (i > 0) {
            int[] iArr = this.f19251Oooo;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextString() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenPeek == jsonToken || jsonTokenPeek == JsonToken.NUMBER) {
            String strOooO0OO = ((oOO00O) OooO0Oo()).OooO0OO();
            int i = this.f19253Oooo0oO;
            if (i > 0) {
                int[] iArr = this.f19251Oooo;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return strOooO0OO;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
    }

    @Override // com.google.gson.stream.JsonReader
    public final JsonToken peek() throws IOException {
        if (this.f19253Oooo0oO == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objOooO0O0 = OooO0O0();
        if (objOooO0O0 instanceof Iterator) {
            boolean z = this.f19252Oooo0o[this.f19253Oooo0oO - 2] instanceof o00O00O;
            Iterator it = (Iterator) objOooO0O0;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            OooO0o(it.next());
            return peek();
        }
        if (objOooO0O0 instanceof o00O00O) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objOooO0O0 instanceof o0O0ooO) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (!(objOooO0O0 instanceof oOO00O)) {
            if (objOooO0O0 instanceof o00O00) {
                return JsonToken.NULL;
            }
            if (objOooO0O0 == f19249OoooO0) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        Serializable serializable = ((oOO00O) objOooO0O0).f38887OooO00o;
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
            this.f19254Oooo0oo[this.f19253Oooo0oO - 2] = "null";
        } else {
            OooO0Oo();
            int i = this.f19253Oooo0oO;
            if (i > 0) {
                this.f19254Oooo0oo[i - 1] = "null";
            }
        }
        int i2 = this.f19253Oooo0oO;
        if (i2 > 0) {
            int[] iArr = this.f19251Oooo;
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
