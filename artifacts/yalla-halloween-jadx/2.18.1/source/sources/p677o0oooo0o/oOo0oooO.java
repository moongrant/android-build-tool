package p677o0oooo0o;

import java.io.IOException;
import java.math.BigInteger;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import oO000Oo.OooO00o;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo0oooO extends oO0OO0O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final byte[] f52193Oooo0o;

    public oOo0oooO(long j) {
        this.f52193Oooo0o = BigInteger.valueOf(j).toByteArray();
    }

    public oOo0oooO(BigInteger bigInteger) {
        this.f52193Oooo0o = bigInteger.toByteArray();
    }

    public oOo0oooO(byte[] bArr, boolean z) {
        if (bArr.length > 1) {
            if (bArr[0] == 0 && (bArr[1] & ByteCompanionObject.MIN_VALUE) == 0) {
                throw new IllegalArgumentException("malformed integer");
            }
            if (bArr[0] == -1 && (bArr[1] & ByteCompanionObject.MIN_VALUE) != 0) {
                throw new IllegalArgumentException("malformed integer");
            }
        }
        this.f52193Oooo0o = z ? OooO00o.OooO0OO(bArr) : bArr;
    }

    public static oOo0oooO OooOOo0(Object obj) {
        if (obj == null || (obj instanceof oOo0oooO)) {
            return (oOo0oooO) obj;
        }
        if (!(obj instanceof byte[])) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("illegal object in getInstance: ");
            sbOooO0o0.append(obj.getClass().getName());
            throw new IllegalArgumentException(sbOooO0o0.toString());
        }
        try {
            return (oOo0oooO) oO0OO0O.OooOO0o((byte[]) obj);
        } catch (Exception e) {
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("encoding error in getInstance: ");
            sbOooO0o1.append(e.toString());
            throw new IllegalArgumentException(sbOooO0o1.toString());
        }
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        if (oo0oo0o instanceof oOo0oooO) {
            return OooO00o.OooO00o(this.f52193Oooo0o, ((oOo0oooO) oo0oo0o).f52193Oooo0o);
        }
        return false;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        oo0oo00.OooO0o(2, this.f52193Oooo0o);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() {
        return m.OooO00o(this.f52193Oooo0o.length) + 1 + this.f52193Oooo0o.length;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        return false;
    }

    public final BigInteger OooOOoo() {
        return new BigInteger(1, this.f52193Oooo0o);
    }

    public final BigInteger OooOo00() {
        return new BigInteger(this.f52193Oooo0o);
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f52193Oooo0o;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & UByte.MAX_VALUE) << (i % 4);
            i++;
        }
    }

    public final String toString() {
        return OooOo00().toString();
    }
}
