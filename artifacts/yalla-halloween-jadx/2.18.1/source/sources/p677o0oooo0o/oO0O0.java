package p677o0oooo0o;

import java.io.IOException;
import kotlin.jvm.internal.ByteCompanionObject;
import oO000Oo.OooO00o;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O0 extends oO0OO0O {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static oO0O0[] f52133Oooo0oO = new oO0O0[12];

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final byte[] f52134Oooo0o;

    public oO0O0(byte[] bArr) {
        if (bArr.length > 1) {
            if (bArr[0] == 0 && (bArr[1] & ByteCompanionObject.MIN_VALUE) == 0) {
                throw new IllegalArgumentException("malformed enumerated");
            }
            if (bArr[0] == -1 && (bArr[1] & ByteCompanionObject.MIN_VALUE) != 0) {
                throw new IllegalArgumentException("malformed enumerated");
            }
        }
        this.f52134Oooo0o = OooO00o.OooO0OO(bArr);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        if (oo0oo0o instanceof oO0O0) {
            return OooO00o.OooO00o(this.f52134Oooo0o, ((oO0O0) oo0oo0o).f52134Oooo0o);
        }
        return false;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        oo0oo00.OooO0o(10, this.f52134Oooo0o);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() {
        return m.OooO00o(this.f52134Oooo0o.length) + 1 + this.f52134Oooo0o.length;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        return false;
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        return OooO00o.OooO0oO(this.f52134Oooo0o);
    }
}
