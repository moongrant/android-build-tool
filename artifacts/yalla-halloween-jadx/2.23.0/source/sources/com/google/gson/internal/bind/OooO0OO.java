package com.google.gson.internal.bind;

import com.google.gson.OooOo00;
import com.google.gson.Oooo0;
import com.google.gson.o000oOoO;
import com.google.gson.o00Oo0;
import com.google.gson.o0OoOo0;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends JsonWriter {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f20655OooO0oO = new OooO00o();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o00Oo0 f20656OooO0oo = new o00Oo0("closed");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f20657OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Oooo0 f20658OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f20659OooO0o0;

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
        super(f20655OooO0oO);
        this.f20657OooO0Oo = new ArrayList();
        this.f20658OooO0o = o000oOoO.f20713OooO0Oo;
    }

    public final Oooo0 OooO00o() {
        ArrayList arrayList = this.f20657OooO0Oo;
        if (arrayList.isEmpty()) {
            return this.f20658OooO0o;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final Oooo0 OooO0OO() {
        ArrayList arrayList = this.f20657OooO0Oo;
        return (Oooo0) arrayList.get(arrayList.size() - 1);
    }

    public final void OooO0oO(Oooo0 oooo0) {
        if (this.f20659OooO0o0 != null) {
            oooo0.getClass();
            if (!(oooo0 instanceof o000oOoO) || getSerializeNulls()) {
                ((o0OoOo0) OooO0OO()).OooO0OO(this.f20659OooO0o0, oooo0);
            }
            this.f20659OooO0o0 = null;
            return;
        }
        if (this.f20657OooO0Oo.isEmpty()) {
            this.f20658OooO0o = oooo0;
            return;
        }
        Oooo0 oooo0OooO0OO = OooO0OO();
        if (!(oooo0OooO0OO instanceof OooOo00)) {
            throw new IllegalStateException();
        }
        OooOo00 oooOo00 = (OooOo00) oooo0OooO0OO;
        if (oooo0 == null) {
            oooOo00.getClass();
            oooo0 = o000oOoO.f20713OooO0Oo;
        }
        oooOo00.f20602OooO0Oo.add(oooo0);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginArray() throws IOException {
        OooOo00 oooOo00 = new OooOo00();
        OooO0oO(oooOo00);
        this.f20657OooO0Oo.add(oooOo00);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginObject() throws IOException {
        o0OoOo0 o0oooo0 = new o0OoOo0();
        OooO0oO(o0oooo0);
        this.f20657OooO0Oo.add(o0oooo0);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f20657OooO0Oo;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f20656OooO0oo);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endArray() throws IOException {
        ArrayList arrayList = this.f20657OooO0Oo;
        if (arrayList.isEmpty() || this.f20659OooO0o0 != null) {
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
        ArrayList arrayList = this.f20657OooO0Oo;
        if (arrayList.isEmpty() || this.f20659OooO0o0 != null) {
            throw new IllegalStateException();
        }
        if (!(OooO0OO() instanceof o0OoOo0)) {
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
        if (this.f20657OooO0Oo.isEmpty() || this.f20659OooO0o0 != null) {
            throw new IllegalStateException();
        }
        if (!(OooO0OO() instanceof o0OoOo0)) {
            throw new IllegalStateException();
        }
        this.f20659OooO0o0 = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter nullValue() throws IOException {
        OooO0oO(o000oOoO.f20713OooO0Oo);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            OooO0oO(o000oOoO.f20713OooO0Oo);
            return this;
        }
        OooO0oO(new o00Oo0(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Number number) throws IOException {
        if (number == null) {
            OooO0oO(o000oOoO.f20713OooO0Oo);
            return this;
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        OooO0oO(new o00Oo0(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(String str) throws IOException {
        if (str == null) {
            OooO0oO(o000oOoO.f20713OooO0Oo);
            return this;
        }
        OooO0oO(new o00Oo0(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(boolean z) throws IOException {
        OooO0oO(new o00Oo0(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(double d) throws IOException {
        if (!isLenient() && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
        OooO0oO(new o00Oo0(Double.valueOf(d)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(long j) throws IOException {
        OooO0oO(new o00Oo0(Long.valueOf(j)));
        return this;
    }
}
