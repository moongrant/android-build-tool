package retrofit2;

import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;
import p022Oooo00O.o00O00OO;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O00000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O000o0;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0oO0Ooo;
import p662o0oooO0O.o0O0o00O;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O00 {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final char[] f60549OooOO0o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final Pattern f60550OooOOO0 = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final o0O000o0.OooO00o f60551OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f60552OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O000O f60553OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public String f60554OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o0O000O.OooO00o f60555OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O000.OooO00o f60556OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0O00O0o.OooO00o f60557OooO0o0 = new o0O00O0o.OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o0O000Oo f60558OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f60559OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final o0O00000.OooO00o f60560OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public o0oO0Ooo f60561OooOO0O;

    public static class OooO00o extends o0oO0Ooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0oO0Ooo f60562OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0O000Oo f60563OooO0O0;

        public OooO00o(o0oO0Ooo o0oo0ooo2, o0O000Oo o0o000oo2) {
            this.f60562OooO00o = o0oo0ooo2;
            this.f60563OooO0O0 = o0o000oo2;
        }

        @Override // p641o0ooOO0o.o0oO0Ooo
        public final long contentLength() throws IOException {
            return this.f60562OooO00o.contentLength();
        }

        @Override // p641o0ooOO0o.o0oO0Ooo
        public final o0O000Oo contentType() {
            return this.f60563OooO0O0;
        }

        @Override // p641o0ooOO0o.o0oO0Ooo
        public final void writeTo(o0O0o00O o0o0o00o) throws IOException {
            this.f60562OooO00o.writeTo(o0o0o00o);
        }
    }

    public o0000O00(String str, o0O000O o0o000o, @Nullable String str2, @Nullable o0O000 o0o001, @Nullable o0O000Oo o0o000oo2, boolean z, boolean z2, boolean z3) {
        this.f60552OooO00o = str;
        this.f60553OooO0O0 = o0o000o;
        this.f60554OooO0OO = str2;
        this.f60558OooO0oO = o0o000oo2;
        this.f60559OooO0oo = z;
        if (o0o001 != null) {
            this.f60556OooO0o = o0o001.OooO0Oo();
        } else {
            this.f60556OooO0o = new o0O000.OooO00o();
        }
        if (z2) {
            this.f60560OooOO0 = new o0O00000.OooO00o();
        } else if (z3) {
            o0O000o0.OooO00o oooO00o = new o0O000o0.OooO00o();
            this.f60551OooO = oooO00o;
            oooO00o.OooO0OO(o0O000o0.f57813OooO0o);
        }
    }

    public final void OooO00o(String name, String value, boolean z) {
        o0O00000.OooO00o oooO00o = this.f60560OooOO0;
        if (!z) {
            oooO00o.OooO00o(name, value);
            return;
        }
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        oooO00o.f57779OooO0O0.add(o0O000O.OooO0O0.OooO00o(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, oooO00o.f57778OooO00o, 83));
        oooO00o.f57780OooO0OO.add(o0O000O.OooO0O0.OooO00o(value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, oooO00o.f57778OooO00o, 83));
    }

    public final void OooO0O0(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f60556OooO0o.OooO00o(str, str2);
            return;
        }
        try {
            Pattern pattern = o0O000Oo.f57807OooO0o0;
            this.f60558OooO0oO = o0O000Oo.OooO00o.OooO00o(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(o00O00OO.OooO00o("Malformed content type: ", str2), e);
        }
    }

    public final void OooO0OO(String str, @Nullable String str2, boolean z) {
        o0O000O.OooO00o oooO00o;
        String link = this.f60554OooO0OO;
        if (link != null) {
            o0O000O o0o000o = this.f60553OooO0O0;
            o0o000o.getClass();
            Intrinsics.checkNotNullParameter(link, "link");
            try {
                oooO00o = new o0O000O.OooO00o();
                oooO00o.OooO0oO(o0o000o, link);
            } catch (IllegalArgumentException unused) {
                oooO00o = null;
            }
            this.f60555OooO0Oo = oooO00o;
            if (oooO00o == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + o0o000o + ", Relative: " + this.f60554OooO0OO);
            }
            this.f60554OooO0OO = null;
        }
        if (z) {
            this.f60555OooO0Oo.OooO00o(str, str2);
        } else {
            this.f60555OooO0Oo.OooO0O0(str, str2);
        }
    }
}
