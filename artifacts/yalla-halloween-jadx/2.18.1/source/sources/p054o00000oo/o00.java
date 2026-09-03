package p054o00000oo;

import androidx.appcompat.widget.o00000O0;
import kotlin.jvm.internal.Intrinsics;
import o00000O.OooO00o;
import o00000O.o0OO00O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042Ooooo0o.o000O0O0;
import p100o000oOoO.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O0O0 f27156OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f27157OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f27158OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f27159OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f27160OooO0o0 = -1;

    public o00(OooO00o oooO00o, long j) {
        this.f27156OooO00o = new o00O0O0(oooO00o.f26756Oooo0o);
        this.f27157OooO0O0 = o0OO00O.OooO0oO(j);
        this.f27158OooO0OO = o0OO00O.OooO0o(j);
        int iOooO0oO = o0OO00O.OooO0oO(j);
        int iOooO0o = o0OO00O.OooO0o(j);
        if (iOooO0oO < 0 || iOooO0oO > oooO00o.length()) {
            StringBuilder sbOooO00o = o00000O0.OooO00o("start (", iOooO0oO, ") offset is outside of text region ");
            sbOooO00o.append(oooO00o.length());
            throw new IndexOutOfBoundsException(sbOooO00o.toString());
        }
        if (iOooO0o < 0 || iOooO0o > oooO00o.length()) {
            StringBuilder sbOooO00o2 = o00000O0.OooO00o("end (", iOooO0o, ") offset is outside of text region ");
            sbOooO00o2.append(oooO00o.length());
            throw new IndexOutOfBoundsException(sbOooO00o2.toString());
        }
        if (iOooO0oO > iOooO0o) {
            throw new IllegalArgumentException(o00O00OO.OooO00o("Do not set reversed range: ", iOooO0oO, " > ", iOooO0o));
        }
    }

    public final void OooO(int i, int i2) {
        if (i < 0 || i > this.f27156OooO00o.OooO00o()) {
            StringBuilder sbOooO00o = o00000O0.OooO00o("start (", i, ") offset is outside of text region ");
            sbOooO00o.append(this.f27156OooO00o.OooO00o());
            throw new IndexOutOfBoundsException(sbOooO00o.toString());
        }
        if (i2 < 0 || i2 > this.f27156OooO00o.OooO00o()) {
            StringBuilder sbOooO00o2 = o00000O0.OooO00o("end (", i2, ") offset is outside of text region ");
            sbOooO00o2.append(this.f27156OooO00o.OooO00o());
            throw new IndexOutOfBoundsException(sbOooO00o2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(o00O00OO.OooO00o("Do not set reversed range: ", i, " > ", i2));
        }
        this.f27157OooO0O0 = i;
        this.f27158OooO0OO = i2;
    }

    public final void OooO00o() {
        this.f27159OooO0Oo = -1;
        this.f27160OooO0o0 = -1;
    }

    public final void OooO0O0(int i, int i2) {
        long jOooO00o = o000O0O0.OooO00o(i, i2);
        this.f27156OooO00o.OooO0O0(i, i2, "");
        long jOooO00o2 = o00O0000.OooO00o(o000O0O0.OooO00o(this.f27157OooO0O0, this.f27158OooO0OO), jOooO00o);
        this.f27157OooO0O0 = o0OO00O.OooO0oO(jOooO00o2);
        this.f27158OooO0OO = o0OO00O.OooO0o(jOooO00o2);
        if (OooO0o()) {
            long jOooO00o3 = o00O0000.OooO00o(o000O0O0.OooO00o(this.f27159OooO0Oo, this.f27160OooO0o0), jOooO00o);
            if (o0OO00O.OooO0OO(jOooO00o3)) {
                OooO00o();
            } else {
                this.f27159OooO0Oo = o0OO00O.OooO0oO(jOooO00o3);
                this.f27160OooO0o0 = o0OO00O.OooO0o(jOooO00o3);
            }
        }
    }

    public final char OooO0OO(int i) {
        o00O0O0 o00o0o0 = this.f27156OooO00o;
        o00oOoo o00oooo2 = o00o0o0.f27180OooO0O0;
        if (o00oooo2 == null) {
            return o00o0o0.f27179OooO00o.charAt(i);
        }
        if (i < o00o0o0.f27181OooO0OO) {
            return o00o0o0.f27179OooO00o.charAt(i);
        }
        int iOooO00o = o00oooo2.OooO00o();
        int i2 = o00o0o0.f27181OooO0OO;
        if (i >= iOooO00o + i2) {
            return o00o0o0.f27179OooO00o.charAt(i - ((iOooO00o - o00o0o0.f27182OooO0Oo) + i2));
        }
        int i3 = i - i2;
        int i4 = o00oooo2.f27227OooO0OO;
        return i3 < i4 ? o00oooo2.f27226OooO0O0[i3] : o00oooo2.f27226OooO0O0[(i3 - i4) + o00oooo2.f27228OooO0Oo];
    }

    @Nullable
    public final o0OO00O OooO0Oo() {
        if (OooO0o()) {
            return new o0OO00O(o000O0O0.OooO00o(this.f27159OooO0Oo, this.f27160OooO0o0));
        }
        return null;
    }

    public final boolean OooO0o() {
        return this.f27159OooO0Oo != -1;
    }

    public final int OooO0o0() {
        return this.f27156OooO00o.OooO00o();
    }

    public final void OooO0oO(int i, int i2, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (i < 0 || i > this.f27156OooO00o.OooO00o()) {
            StringBuilder sbOooO00o = o00000O0.OooO00o("start (", i, ") offset is outside of text region ");
            sbOooO00o.append(this.f27156OooO00o.OooO00o());
            throw new IndexOutOfBoundsException(sbOooO00o.toString());
        }
        if (i2 < 0 || i2 > this.f27156OooO00o.OooO00o()) {
            StringBuilder sbOooO00o2 = o00000O0.OooO00o("end (", i2, ") offset is outside of text region ");
            sbOooO00o2.append(this.f27156OooO00o.OooO00o());
            throw new IndexOutOfBoundsException(sbOooO00o2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(o00O00OO.OooO00o("Do not set reversed range: ", i, " > ", i2));
        }
        this.f27156OooO00o.OooO0O0(i, i2, text);
        this.f27157OooO0O0 = text.length() + i;
        this.f27158OooO0OO = text.length() + i;
        this.f27159OooO0Oo = -1;
        this.f27160OooO0o0 = -1;
    }

    public final void OooO0oo(int i, int i2) {
        if (i < 0 || i > this.f27156OooO00o.OooO00o()) {
            StringBuilder sbOooO00o = o00000O0.OooO00o("start (", i, ") offset is outside of text region ");
            sbOooO00o.append(this.f27156OooO00o.OooO00o());
            throw new IndexOutOfBoundsException(sbOooO00o.toString());
        }
        if (i2 < 0 || i2 > this.f27156OooO00o.OooO00o()) {
            StringBuilder sbOooO00o2 = o00000O0.OooO00o("end (", i2, ") offset is outside of text region ");
            sbOooO00o2.append(this.f27156OooO00o.OooO00o());
            throw new IndexOutOfBoundsException(sbOooO00o2.toString());
        }
        if (i >= i2) {
            throw new IllegalArgumentException(o00O00OO.OooO00o("Do not set reversed or empty range: ", i, " > ", i2));
        }
        this.f27159OooO0Oo = i;
        this.f27160OooO0o0 = i2;
    }

    @NotNull
    public final String toString() {
        return this.f27156OooO00o.toString();
    }
}
