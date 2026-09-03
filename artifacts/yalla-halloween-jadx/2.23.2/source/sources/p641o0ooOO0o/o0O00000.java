package p641o0ooOO0o;

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
import p648o0ooOoo.oO000o00;
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O00000 extends o0oO0Ooo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final o0O000Oo f57775OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<String> f57776OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<String> f57777OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Charset f57778OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final ArrayList f57779OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final ArrayList f57780OooO0OO;

        @JvmOverloads
        public OooO00o() {
            this(0);
        }

        @NotNull
        public final void OooO00o(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f57779OooO0O0.add(o0O000O.OooO0O0.OooO00o(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f57778OooO00o, 91));
            this.f57780OooO0OO.add(o0O000O.OooO0O0.OooO00o(value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f57778OooO00o, 91));
        }

        public OooO00o(int i) {
            this.f57778OooO00o = null;
            this.f57779OooO0O0 = new ArrayList();
            this.f57780OooO0OO = new ArrayList();
        }
    }

    static {
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        f57775OooO0OO = o0O000Oo.OooO00o.OooO00o("application/x-www-form-urlencoded");
    }

    public o0O00000(@NotNull ArrayList encodedNames, @NotNull ArrayList encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f57776OooO00o = oO000o00.OooOo(encodedNames);
        this.f57777OooO0O0 = oO000o00.OooOo(encodedValues);
    }

    @NotNull
    public final String OooO00o(int i) {
        return o0O000O.OooO0O0.OooO0Oo(this.f57777OooO0O0.get(i), 0, 0, true, 3);
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public final long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    @NotNull
    public final o0O000Oo contentType() {
        return f57775OooO0OO;
    }

    public final long writeOrCountBytes(o0O0o00O o0o0o00o, boolean z) throws EOFException {
        oo0OOoo oo0ooooOooO0O0;
        if (z) {
            oo0ooooOooO0O0 = new oo0OOoo();
        } else {
            Intrinsics.checkNotNull(o0o0o00o);
            oo0ooooOooO0O0 = o0o0o00o.OooO0O0();
        }
        List<String> list = this.f57776OooO00o;
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (i > 0) {
                oo0ooooOooO0O0.o00o0O(38);
            }
            oo0ooooOooO0O0.o00000OO(list.get(i));
            oo0ooooOooO0O0.o00o0O(61);
            oo0ooooOooO0O0.o00000OO(this.f57777OooO0O0.get(i));
            i = i2;
        }
        if (!z) {
            return 0L;
        }
        long j = oo0ooooOooO0O0.f59828OooO0o0;
        oo0ooooOooO0O0.OooO0oO();
        return j;
    }

    @Override // p641o0ooOO0o.o0oO0Ooo
    public final void writeTo(@NotNull o0O0o00O sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        writeOrCountBytes(sink, false);
    }
}
