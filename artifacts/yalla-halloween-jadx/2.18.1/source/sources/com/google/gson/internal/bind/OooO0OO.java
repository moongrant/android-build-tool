package com.google.gson.internal.bind;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p386o0OOoo0O.o00O00;
import p386o0OOoo0O.o00O000o;
import p386o0OOoo0O.o00O00O;
import p386o0OOoo0O.o0O0ooO;
import p386o0OOoo0O.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends JsonWriter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final OooO00o f19255Oooo = new OooO00o();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final oOO00O f19256OoooO00 = new oOO00O("closed");

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<o00O000o> f19257Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f19258Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o00O000o f19259Oooo0oo;

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
        super(f19255Oooo);
        this.f19257Oooo0o = new ArrayList();
        this.f19259Oooo0oo = o00O00.f38884OooO00o;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0OOoo0O.o00O000o>] */
    public final o00O000o OooO00o() {
        if (this.f19257Oooo0o.isEmpty()) {
            return this.f19259Oooo0oo;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected one JSON element but was ");
        sbOooO0o0.append(this.f19257Oooo0o);
        throw new IllegalStateException(sbOooO0o0.toString());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0OOoo0O.o00O000o>] */
    public final o00O000o OooO0O0() {
        ?? r0 = this.f19257Oooo0o;
        return (o00O000o) r0.get(r0.size() - 1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o0OOoo0O.o00O000o>] */
    public final void OooO0Oo(o00O000o o00o000o2) {
        if (this.f19258Oooo0oO != null) {
            if (!(o00o000o2 instanceof o00O00) || getSerializeNulls()) {
                ((o00O00O) OooO0O0()).OooO0o0(this.f19258Oooo0oO, o00o000o2);
            }
            this.f19258Oooo0oO = null;
            return;
        }
        if (this.f19257Oooo0o.isEmpty()) {
            this.f19259Oooo0oo = o00o000o2;
            return;
        }
        o00O000o o00o000oOooO0O0 = OooO0O0();
        if (!(o00o000oOooO0O0 instanceof o0O0ooO)) {
            throw new IllegalStateException();
        }
        ((o0O0ooO) o00o000oOooO0O0).OooO0o0(o00o000o2);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginArray() throws IOException {
        o0O0ooO o0o0ooo = new o0O0ooO();
        OooO0Oo(o0o0ooo);
        this.f19257Oooo0o.add(o0o0ooo);
        return this;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginObject() throws IOException {
        o00O00O o00o00o2 = new o00O00O();
        OooO0Oo(o00o00o2);
        this.f19257Oooo0o.add(o00o00o2);
        return this;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f19257Oooo0o.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f19257Oooo0o.add(f19256OoooO00);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0OOoo0O.o00O000o>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<o0OOoo0O.o00O000o>] */
    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endArray() throws IOException {
        if (this.f19257Oooo0o.isEmpty() || this.f19258Oooo0oO != null) {
            throw new IllegalStateException();
        }
        if (!(OooO0O0() instanceof o0O0ooO)) {
            throw new IllegalStateException();
        }
        ?? r0 = this.f19257Oooo0o;
        r0.remove(r0.size() - 1);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0OOoo0O.o00O000o>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<o0OOoo0O.o00O000o>] */
    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endObject() throws IOException {
        if (this.f19257Oooo0o.isEmpty() || this.f19258Oooo0oO != null) {
            throw new IllegalStateException();
        }
        if (!(OooO0O0() instanceof o00O00O)) {
            throw new IllegalStateException();
        }
        ?? r0 = this.f19257Oooo0o;
        r0.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public final void flush() throws IOException {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o0OOoo0O.o00O000o>] */
    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f19257Oooo0o.isEmpty() || this.f19258Oooo0oO != null) {
            throw new IllegalStateException();
        }
        if (!(OooO0O0() instanceof o00O00O)) {
            throw new IllegalStateException();
        }
        this.f19258Oooo0oO = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter nullValue() throws IOException {
        OooO0Oo(o00O00.f38884OooO00o);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            OooO0Oo(o00O00.f38884OooO00o);
            return this;
        }
        OooO0Oo(new oOO00O(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Number number) throws IOException {
        if (number == null) {
            OooO0Oo(o00O00.f38884OooO00o);
            return this;
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        OooO0Oo(new oOO00O(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(String str) throws IOException {
        if (str == null) {
            OooO0Oo(o00O00.f38884OooO00o);
            return this;
        }
        OooO0Oo(new oOO00O(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(boolean z) throws IOException {
        OooO0Oo(new oOO00O(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(double d) throws IOException {
        if (!isLenient() && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
        OooO0Oo(new oOO00O(Double.valueOf(d)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(long j) throws IOException {
        OooO0Oo(new oOO00O(Long.valueOf(j)));
        return this;
    }
}
