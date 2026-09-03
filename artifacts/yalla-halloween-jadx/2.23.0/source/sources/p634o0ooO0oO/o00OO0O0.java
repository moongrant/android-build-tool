package p634o0ooO0oO;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p635o0ooO0oo.o0O000o0;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000Ooo;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OO0O0 extends oo00oO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final o00OOO0 f57221OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<String> f57222OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<String> f57223OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Charset f57224OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final ArrayList f57225OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final ArrayList f57226OooO0OO;

        @JvmOverloads
        public OooO00o() {
            this(0);
        }

        @NotNull
        public final void OooO00o(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f57225OooO0O0.add(o00OO.OooO0O0.OooO00o(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f57224OooO00o, 91));
            this.f57226OooO0OO.add(o00OO.OooO0O0.OooO00o(value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f57224OooO00o, 91));
        }

        public OooO00o(int i) {
            this.f57224OooO00o = null;
            this.f57225OooO0O0 = new ArrayList();
            this.f57226OooO0OO = new ArrayList();
        }
    }

    static {
        Pattern pattern = o00OOO0.f57234OooO0o0;
        f57221OooO0OO = o00OOO0.OooO00o.OooO00o("application/x-www-form-urlencoded");
    }

    public o00OO0O0(@NotNull ArrayList encodedNames, @NotNull ArrayList encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f57222OooO00o = o0O000o0.OooOo(encodedNames);
        this.f57223OooO0O0 = o0O000o0.OooOo(encodedValues);
    }

    @NotNull
    public final String OooO00o(int i) {
        return o00OO.OooO0O0.OooO0Oo(this.f57223OooO0O0.get(i), 0, 0, true, 3);
    }

    @Override // p634o0ooO0oO.oo00oO
    public final long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // p634o0ooO0oO.oo00oO
    @NotNull
    public final o00OOO0 contentType() {
        return f57221OooO0OO;
    }

    public final long writeOrCountBytes(o0000Ooo o0000ooo, boolean z) throws EOFException {
        o00000O o00000oOooO0O0;
        if (z) {
            o00000oOooO0O0 = new o00000O();
        } else {
            Intrinsics.checkNotNull(o0000ooo);
            o00000oOooO0O0 = o0000ooo.OooO0O0();
        }
        List<String> list = this.f57222OooO00o;
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (i > 0) {
                o00000oOooO0O0.o00O0O(38);
            }
            o00000oOooO0O0.o00000O(list.get(i));
            o00000oOooO0O0.o00O0O(61);
            o00000oOooO0O0.o00000O(this.f57223OooO0O0.get(i));
            i = i2;
        }
        if (!z) {
            return 0L;
        }
        long j = o00000oOooO0O0.f60177OooO0o0;
        o00000oOooO0O0.OooO0oO();
        return j;
    }

    @Override // p634o0ooO0oO.oo00oO
    public final void writeTo(@NotNull o0000Ooo sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        writeOrCountBytes(sink, false);
    }
}
