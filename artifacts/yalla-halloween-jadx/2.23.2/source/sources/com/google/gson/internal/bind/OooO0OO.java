package com.google.gson.internal.bind;

import com.google.gson.OooOo00;
import com.google.gson.o000oOoO;
import com.google.gson.o00O0O;
import com.google.gson.o00Ooo;
import com.google.gson.o0OoOo0;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends JsonWriter {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f20182OooO0oO = new OooO00o();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o00Ooo f20183OooO0oo = new o00Ooo("closed");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f20184OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o000oOoO f20185OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f20186OooO0o0;

    public class OooO00o extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public OooO0OO() {
        super(f20182OooO0oO);
        this.f20184OooO0Oo = new ArrayList();
        this.f20185OooO0o = o0OoOo0.f20242OooO0Oo;
    }

    public final o000oOoO OooO00o() {
        ArrayList arrayList = this.f20184OooO0Oo;
        if (arrayList.isEmpty()) {
            return this.f20185OooO0o;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final o000oOoO OooO0OO() {
        ArrayList arrayList = this.f20184OooO0Oo;
        return (o000oOoO) arrayList.get(arrayList.size() - 1);
    }

    public final void OooO0oO(o000oOoO o000oooo2) {
        if (this.f20186OooO0o0 != null) {
            o000oooo2.getClass();
            if (!(o000oooo2 instanceof o0OoOo0) || getSerializeNulls()) {
                ((o00O0O) OooO0OO()).OooO0OO(this.f20186OooO0o0, o000oooo2);
            }
            this.f20186OooO0o0 = null;
            return;
        }
        if (this.f20184OooO0Oo.isEmpty()) {
            this.f20185OooO0o = o000oooo2;
            return;
        }
        o000oOoO o000ooooOooO0OO = OooO0OO();
        if (!(o000ooooOooO0OO instanceof OooOo00)) {
            throw new IllegalStateException();
        }
        OooOo00 oooOo00 = (OooOo00) o000ooooOooO0OO;
        if (o000oooo2 == null) {
            oooOo00.getClass();
            o000oooo2 = o0OoOo0.f20242OooO0Oo;
        }
        oooOo00.f20129OooO0Oo.add(o000oooo2);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginArray() throws IOException {
        OooOo00 oooOo00 = new OooOo00();
        OooO0oO(oooOo00);
        this.f20184OooO0Oo.add(oooOo00);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginObject() throws IOException {
        o00O0O o00o0o2 = new o00O0O();
        OooO0oO(o00o0o2);
        this.f20184OooO0Oo.add(o00o0o2);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f20184OooO0Oo;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f20183OooO0oo);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endArray() throws IOException {
        ArrayList arrayList = this.f20184OooO0Oo;
        if (arrayList.isEmpty() || this.f20186OooO0o0 != null) {
            throw new IllegalStateException();
        }
        if (!(OooO0OO() instanceof OooOo00)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endObject() throws IOException {
        ArrayList arrayList = this.f20184OooO0Oo;
        if (arrayList.isEmpty() || this.f20186OooO0o0 != null) {
            throw new IllegalStateException();
        }
        if (!(OooO0OO() instanceof o00O0O)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter name(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f20184OooO0Oo.isEmpty() || this.f20186OooO0o0 != null) {
            throw new IllegalStateException();
        }
        if (!(OooO0OO() instanceof o00O0O)) {
            throw new IllegalStateException();
        }
        this.f20186OooO0o0 = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter nullValue() throws IOException {
        OooO0oO(o0OoOo0.f20242OooO0Oo);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            OooO0oO(o0OoOo0.f20242OooO0Oo);
            return this;
        }
        OooO0oO(new o00Ooo(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Number number) throws IOException {
        if (number == null) {
            OooO0oO(o0OoOo0.f20242OooO0Oo);
            return this;
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        OooO0oO(new o00Ooo(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(String str) throws IOException {
        if (str == null) {
            OooO0oO(o0OoOo0.f20242OooO0Oo);
            return this;
        }
        OooO0oO(new o00Ooo(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(boolean z) throws IOException {
        OooO0oO(new o00Ooo(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(double d) throws IOException {
        if (!isLenient() && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
        OooO0oO(new o00Ooo(Double.valueOf(d)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(long j) throws IOException {
        OooO0oO(new o00Ooo(Long.valueOf(j)));
        return this;
    }
}
