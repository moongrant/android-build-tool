package retrofit2;

import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;
import p022Oooo00O.o00O00OO;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OO0O0;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOO0O;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.oo00oO;
import p634o0ooO0oO.oo0O;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000oo {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final char[] f61118OooOO0o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final Pattern f61119OooOOO0 = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final o00OOO0O.OooO00o f61120OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f61121OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OO f61122OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public String f61123OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o00OO.OooO00o f61124OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oo0O.OooO00o f61125OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00OOOOo.OooO00o f61126OooO0o0 = new o00OOOOo.OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o00OOO0 f61127OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f61128OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final o00OO0O0.OooO00o f61129OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public oo00oO f61130OooOO0O;

    public static class OooO00o extends oo00oO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oo00oO f61131OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00OOO0 f61132OooO0O0;

        public OooO00o(oo00oO oo00oo, o00OOO0 o00ooo1) {
            this.f61131OooO00o = oo00oo;
            this.f61132OooO0O0 = o00ooo1;
        }

        @Override // p634o0ooO0oO.oo00oO
        public final long contentLength() throws IOException {
            return this.f61131OooO00o.contentLength();
        }

        @Override // p634o0ooO0oO.oo00oO
        public final o00OOO0 contentType() {
            return this.f61132OooO0O0;
        }

        @Override // p634o0ooO0oO.oo00oO
        public final void writeTo(p659o0oooO00.o0000Ooo o0000ooo) throws IOException {
            this.f61131OooO00o.writeTo(o0000ooo);
        }
    }

    public o0000oo(String str, o00OO o00oo2, @Nullable String str2, @Nullable oo0O oo0o, @Nullable o00OOO0 o00ooo1, boolean z, boolean z2, boolean z3) {
        this.f61121OooO00o = str;
        this.f61122OooO0O0 = o00oo2;
        this.f61123OooO0OO = str2;
        this.f61127OooO0oO = o00ooo1;
        this.f61128OooO0oo = z;
        if (oo0o != null) {
            this.f61125OooO0o = oo0o.OooO0Oo();
        } else {
            this.f61125OooO0o = new oo0O.OooO00o();
        }
        if (z2) {
            this.f61129OooOO0 = new o00OO0O0.OooO00o();
        } else if (z3) {
            o00OOO0O.OooO00o oooO00o = new o00OOO0O.OooO00o();
            this.f61120OooO = oooO00o;
            oooO00o.OooO0OO(o00OOO0O.f57240OooO0o);
        }
    }

    public final void OooO00o(String name, String value, boolean z) {
        o00OO0O0.OooO00o oooO00o = this.f61129OooOO0;
        if (!z) {
            oooO00o.OooO00o(name, value);
            return;
        }
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        oooO00o.f57225OooO0O0.add(o00OO.OooO0O0.OooO00o(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, oooO00o.f57224OooO00o, 83));
        oooO00o.f57226OooO0OO.add(o00OO.OooO0O0.OooO00o(value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, oooO00o.f57224OooO00o, 83));
    }

    public final void OooO0O0(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f61125OooO0o.OooO00o(str, str2);
            return;
        }
        try {
            Pattern pattern = o00OOO0.f57234OooO0o0;
            this.f61127OooO0oO = o00OOO0.OooO00o.OooO00o(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(o00O00OO.OooO00o("Malformed content type: ", str2), e);
        }
    }

    public final void OooO0OO(String str, @Nullable String str2, boolean z) {
        o00OO.OooO00o oooO00o;
        String link = this.f61123OooO0OO;
        if (link != null) {
            o00OO o00oo2 = this.f61122OooO0O0;
            o00oo2.getClass();
            Intrinsics.checkNotNullParameter(link, "link");
            try {
                oooO00o = new o00OO.OooO00o();
                oooO00o.OooO0oO(o00oo2, link);
            } catch (IllegalArgumentException unused) {
                oooO00o = null;
            }
            this.f61124OooO0Oo = oooO00o;
            if (oooO00o == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + o00oo2 + ", Relative: " + this.f61123OooO0OO);
            }
            this.f61123OooO0OO = null;
        }
        if (z) {
            this.f61124OooO0Oo.OooO00o(str, str2);
        } else {
            this.f61124OooO0Oo.OooO0O0(str, str2);
        }
    }
}
