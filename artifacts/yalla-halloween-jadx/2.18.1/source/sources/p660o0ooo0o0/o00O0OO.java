package p660o0ooo0o0;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p659o0ooo0o.o00OOO00;
import p674o0oooo0.o0oOO;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OO extends o0o0Oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o00OO0O0 f51308OooO0OO = o00OO0O0.f51401OooO0oO.OooO00o("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<String> f51309OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<String> f51310OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<String> f51311OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<String> f51312OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Charset f51313OooO0OO;

        @JvmOverloads
        public OooO00o() {
            this(null, 1, null);
        }

        public OooO00o(Charset charset, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this.f51313OooO0OO = null;
            this.f51311OooO00o = new ArrayList();
            this.f51312OooO0O0 = new ArrayList();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        @NotNull
        public final OooO00o OooO00o(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f51311OooO00o.add(o00OO000.OooO0O0.OooO00o(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f51313OooO0OO, 91));
            this.f51312OooO0O0.add(o00OO000.OooO0O0.OooO00o(value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f51313OooO0OO, 91));
            return this;
        }

        @NotNull
        public final o00O0OO OooO0O0() {
            return new o00O0OO(this.f51311OooO00o, this.f51312OooO0O0);
        }
    }

    public o00O0OO(@NotNull List<String> encodedNames, @NotNull List<String> encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f51309OooO00o = o00OOO00.OooOoO(encodedNames);
        this.f51310OooO0O0 = o00OOO00.OooOoO(encodedValues);
    }

    @NotNull
    public final String OooO00o(int i) {
        return o00OO000.OooO0O0.OooO0Oo(this.f51309OooO00o.get(i), 0, 0, true, 3);
    }

    @NotNull
    public final String OooO0O0(int i) {
        return o00OO000.OooO0O0.OooO0Oo(this.f51310OooO0O0.get(i), 0, 0, true, 3);
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public final long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // p660o0ooo0o0.o0o0Oo
    @NotNull
    public final o00OO0O0 contentType() {
        return f51308OooO0OO;
    }

    @JvmName(name = "size")
    public final int size() {
        return this.f51309OooO00o.size();
    }

    public final long writeOrCountBytes(oo00oO oo00oo, boolean z) throws EOFException {
        o0oOO o0oooOooO0o0;
        if (z) {
            o0oooOooO0o0 = new o0oOO();
        } else {
            Intrinsics.checkNotNull(oo00oo);
            o0oooOooO0o0 = oo00oo.OooO0o0();
        }
        int size = this.f51309OooO00o.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                o0oooOooO0o0.Ooooo0o(38);
            }
            o0oooOooO0o0.o00oO0o(this.f51309OooO00o.get(i));
            o0oooOooO0o0.Ooooo0o(61);
            o0oooOooO0o0.o00oO0o(this.f51310OooO0O0.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = o0oooOooO0o0.f52099Oooo0oO;
        o0oooOooO0o0.OooO0Oo();
        return j;
    }

    @Override // p660o0ooo0o0.o0o0Oo
    public final void writeTo(@NotNull oo00oO sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        writeOrCountBytes(sink, false);
    }
}
