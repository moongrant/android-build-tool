package retrofit2;

import java.io.IOException;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00O0OO;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OO0OO;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o0o0Oo;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final char[] f53850OooOO0o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final Pattern f53851OooOOO0 = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public o00OO0OO.OooO00o f53852OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f53853OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OO000 f53854OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public String f53855OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o00OO000.OooO00o f53856OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00O.OooO00o f53857OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00OOO00.OooO00o f53858OooO0o0 = new o00OOO00.OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o00OO0O0 f53859OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f53860OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o00O0OO.OooO00o f53861OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public o0o0Oo f53862OooOO0O;

    public static class OooO00o extends o0o0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0o0Oo f53863OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00OO0O0 f53864OooO0O0;

        public OooO00o(o0o0Oo o0o0oo, o00OO0O0 o00oo0o1) {
            this.f53863OooO00o = o0o0oo;
            this.f53864OooO0O0 = o00oo0o1;
        }

        @Override // p660o0ooo0o0.o0o0Oo
        public final long contentLength() throws IOException {
            return this.f53863OooO00o.contentLength();
        }

        @Override // p660o0ooo0o0.o0o0Oo
        public final o00OO0O0 contentType() {
            return this.f53864OooO0O0;
        }

        @Override // p660o0ooo0o0.o0o0Oo
        public final void writeTo(oo00oO oo00oo) throws IOException {
            this.f53863OooO00o.writeTo(oo00oo);
        }
    }

    public o0Oo0oo(String str, o00OO000 o00oo001, @Nullable String str2, @Nullable o00O o00o2, @Nullable o00OO0O0 o00oo0o1, boolean z, boolean z2, boolean z3) {
        this.f53853OooO00o = str;
        this.f53854OooO0O0 = o00oo001;
        this.f53855OooO0OO = str2;
        this.f53859OooO0oO = o00oo0o1;
        this.f53860OooO0oo = z;
        if (o00o2 != null) {
            this.f53857OooO0o = o00o2.OooO0OO();
        } else {
            this.f53857OooO0o = new o00O.OooO00o();
        }
        if (z2) {
            this.f53861OooOO0 = new o00O0OO.OooO00o();
        } else if (z3) {
            o00OO0OO.OooO00o oooO00o = new o00OO0OO.OooO00o();
            this.f53852OooO = oooO00o;
            oooO00o.OooO0OO(o00OO0OO.f51407OooO0o);
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final void OooO00o(String name, String value, boolean z) {
        if (!z) {
            this.f53861OooOO0.OooO00o(name, value);
            return;
        }
        o00O0OO.OooO00o oooO00o = this.f53861OooOO0;
        Objects.requireNonNull(oooO00o);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        oooO00o.f51311OooO00o.add(o00OO000.OooO0O0.OooO00o(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, oooO00o.f51313OooO0OO, 83));
        oooO00o.f51312OooO0O0.add(o00OO000.OooO0O0.OooO00o(value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, oooO00o.f51313OooO0OO, 83));
    }

    public final void OooO0O0(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f53857OooO0o.OooO00o(str, str2);
            return;
        }
        try {
            this.f53859OooO0oO = o00OO0O0.f51401OooO0oO.OooO00o(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(p016OooOoO0.OooOo00.OooO0Oo("Malformed content type: ", str2), e);
        }
    }

    public final void OooO0OO(String str, @Nullable String str2, boolean z) {
        String str3 = this.f53855OooO0OO;
        if (str3 != null) {
            o00OO000.OooO00o oooO00oOooO0oO = this.f53854OooO0O0.OooO0oO(str3);
            this.f53856OooO0Oo = oooO00oOooO0oO;
            if (oooO00oOooO0oO == null) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Malformed URL. Base: ");
                sbOooO0o0.append(this.f53854OooO0O0);
                sbOooO0o0.append(", Relative: ");
                sbOooO0o0.append(this.f53855OooO0OO);
                throw new IllegalArgumentException(sbOooO0o0.toString());
            }
            this.f53855OooO0OO = null;
        }
        if (z) {
            this.f53856OooO0Oo.OooO00o(str, str2);
        } else {
            this.f53856OooO0Oo.OooO0O0(str, str2);
        }
    }
}
