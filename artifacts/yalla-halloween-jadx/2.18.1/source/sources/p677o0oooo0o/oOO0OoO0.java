package p677o0oooo0o;

import android.support.v4.media.OooO00o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0OoO0 extends oO0OO0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f52177Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ooOOO0Oo f52178Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public oOo0oooO f52179Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public oO0OO0O f52180Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public oO0OO0O f52181OoooO00;

    public oOO0OoO0(oO0O00oO oo0o00oo) {
        int i = 0;
        oO0OO0O oo0oo0oOooOOo0 = OooOOo0(oo0o00oo, 0);
        if (oo0oo0oOooOOo0 instanceof ooOOO0Oo) {
            this.f52178Oooo0o = (ooOOO0Oo) oo0oo0oOooOOo0;
            oo0oo0oOooOOo0 = OooOOo0(oo0o00oo, 1);
            i = 1;
        }
        if (oo0oo0oOooOOo0 instanceof oOo0oooO) {
            this.f52179Oooo0oO = (oOo0oooO) oo0oo0oOooOOo0;
            i++;
            oo0oo0oOooOOo0 = OooOOo0(oo0o00oo, i);
        }
        if (!(oo0oo0oOooOOo0 instanceof oOO0000)) {
            this.f52180Oooo0oo = oo0oo0oOooOOo0;
            i++;
            oo0oo0oOooOOo0 = OooOOo0(oo0o00oo, i);
        }
        if (oo0o00oo.OooO0OO() != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(oo0oo0oOooOOo0 instanceof oOO0000)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        oOO0000 ooo0000 = (oOO0000) oo0oo0oOooOOo0;
        int i2 = ooo0000.f52161Oooo0o;
        if (i2 < 0 || i2 > 2) {
            throw new IllegalArgumentException(OooO00o.OooO00o("invalid encoding value: ", i2));
        }
        this.f52177Oooo = i2;
        this.f52181OoooO00 = ooo0000.OooOOo0();
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        oO0OO0O oo0oo0o2;
        oOo0oooO ooo0oooo;
        ooOOO0Oo ooooo0oo;
        if (!(oo0oo0o instanceof oOO0OoO0)) {
            return false;
        }
        if (this == oo0oo0o) {
            return true;
        }
        oOO0OoO0 ooo0ooo0 = (oOO0OoO0) oo0oo0o;
        ooOOO0Oo ooooo0oo2 = this.f52178Oooo0o;
        if (ooooo0oo2 != null && ((ooooo0oo = ooo0ooo0.f52178Oooo0o) == null || !ooooo0oo.equals(ooooo0oo2))) {
            return false;
        }
        oOo0oooO ooo0oooo2 = this.f52179Oooo0oO;
        if (ooo0oooo2 != null && ((ooo0oooo = ooo0ooo0.f52179Oooo0oO) == null || !ooo0oooo.equals(ooo0oooo2))) {
            return false;
        }
        oO0OO0O oo0oo0o3 = this.f52180Oooo0oo;
        if (oo0oo0o3 == null || ((oo0oo0o2 = ooo0ooo0.f52180Oooo0oo) != null && oo0oo0o2.equals(oo0oo0o3))) {
            return this.f52181OoooO00.equals(ooo0ooo0.f52181OoooO00);
        }
        return false;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ooOOO0Oo ooooo0oo = this.f52178Oooo0o;
        if (ooooo0oo != null) {
            byteArrayOutputStream.write(ooooo0oo.OooO0oo("DER"));
        }
        oOo0oooO ooo0oooo = this.f52179Oooo0oO;
        if (ooo0oooo != null) {
            byteArrayOutputStream.write(ooo0oooo.OooO0oo("DER"));
        }
        oO0OO0O oo0oo0o = this.f52180Oooo0oo;
        if (oo0oo0o != null) {
            byteArrayOutputStream.write(oo0oo0o.OooO0oo("DER"));
        }
        byteArrayOutputStream.write(new O0000000(true, this.f52177Oooo, this.f52181OoooO00).OooO0oo("DER"));
        oo0oo00.OooO0o0(32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() throws IOException {
        return OooO0oO().length;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        return true;
    }

    public final oO0OO0O OooOOo0(oO0O00oO oo0o00oo, int i) {
        if (oo0o00oo.OooO0OO() > i) {
            return oo0o00oo.OooO0O0(i).OooO0O0();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        ooOOO0Oo ooooo0oo = this.f52178Oooo0o;
        int iHashCode = ooooo0oo != null ? ooooo0oo.hashCode() : 0;
        oOo0oooO ooo0oooo = this.f52179Oooo0oO;
        if (ooo0oooo != null) {
            iHashCode ^= ooo0oooo.hashCode();
        }
        oO0OO0O oo0oo0o = this.f52180Oooo0oo;
        if (oo0oo0o != null) {
            iHashCode ^= oo0oo0o.hashCode();
        }
        return iHashCode ^ this.f52181OoooO00.hashCode();
    }
}
