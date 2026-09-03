package p677o0oooo0o;

import java.io.IOException;
import kotlin.UByte;
import oO000Oo.OooO00o;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O00 extends oO0OO0O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final byte[] f52139Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final byte[] f52136Oooo0oO = {-1};

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final byte[] f52137Oooo0oo = {0};

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final oO0O00 f52135Oooo = new oO0O00(false);

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final oO0O00 f52138OoooO00 = new oO0O00(true);

    public oO0O00(boolean z) {
        this.f52139Oooo0o = z ? f52136Oooo0oO : f52137Oooo0oo;
    }

    public oO0O00(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        if (bArr[0] == 0) {
            this.f52139Oooo0o = f52137Oooo0oo;
        } else if ((bArr[0] & UByte.MAX_VALUE) == 255) {
            this.f52139Oooo0o = f52136Oooo0oO;
        } else {
            this.f52139Oooo0o = OooO00o.OooO0OO(bArr);
        }
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        return (oo0oo0o instanceof oO0O00) && this.f52139Oooo0o[0] == ((oO0O00) oo0oo0o).f52139Oooo0o[0];
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        oo0oo00.OooO0o(1, this.f52139Oooo0o);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() {
        return 3;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        return false;
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        return this.f52139Oooo0o[0];
    }

    public final String toString() {
        return this.f52139Oooo0o[0] != 0 ? "TRUE" : "FALSE";
    }
}
