package oO000OOo;

import com.zego.zegoliveroom.constants.ZegoConstants;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OO extends p696oO0OO0oo.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long[] f52628OooO0Oo;

    public o00O0OO() {
        this.f52628OooO0Oo = new long[5];
    }

    public o00O0OO(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 320) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[5];
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArr[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        long j = jArr[4];
        long j2 = j >>> 27;
        jArr[0] = ((j2 << 12) ^ (((j2 << 5) ^ j2) ^ (j2 << 7))) ^ jArr[0];
        jArr[4] = j & 134217727;
        this.f52628OooO0Oo = jArr;
    }

    public o00O0OO(long[] jArr) {
        this.f52628OooO0Oo = jArr;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO() {
        long[] jArr = this.f52628OooO0Oo;
        for (int i = 0; i < 5; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO00o(p696oO0OO0oo.OooOOO0 oooOOO0) {
        long[] jArr = this.f52628OooO0Oo;
        long[] jArr2 = ((o00O0OO) oooOOO0).f52628OooO0Oo;
        return new o00O0OO(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3], jArr[4] ^ jArr2[4]});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0O0() {
        long[] jArr = this.f52628OooO0Oo;
        return new o00O0OO(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4]});
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0Oo(p696oO0OO0oo.OooOOO0 oooOOO0) {
        return OooOO0(oooOOO0.OooO0oO());
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final int OooO0o() {
        return 283;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooO0oO() {
        long[] jArr = new long[5];
        long[] jArr2 = this.f52628OooO0Oo;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 5) {
                z = true;
                break;
            }
            if (jArr2[i] != 0) {
                break;
            }
            i++;
        }
        if (z) {
            throw new IllegalStateException();
        }
        long[] jArr3 = new long[5];
        long[] jArr4 = new long[5];
        p137o00OO0oo.OooOO0O.OooO(jArr2, jArr3);
        p137o00OO0oo.OooOO0O.OooO0o(jArr3, jArr2, jArr3);
        p137o00OO0oo.OooOO0O.OooOO0(jArr3, 2, jArr4);
        p137o00OO0oo.OooOO0O.OooO0o(jArr4, jArr3, jArr4);
        p137o00OO0oo.OooOO0O.OooOO0(jArr4, 4, jArr3);
        p137o00OO0oo.OooOO0O.OooO0o(jArr3, jArr4, jArr3);
        p137o00OO0oo.OooOO0O.OooOO0(jArr3, 8, jArr4);
        p137o00OO0oo.OooOO0O.OooO0o(jArr4, jArr3, jArr4);
        p137o00OO0oo.OooOO0O.OooO(jArr4, jArr4);
        p137o00OO0oo.OooOO0O.OooO0o(jArr4, jArr2, jArr4);
        p137o00OO0oo.OooOO0O.OooOO0(jArr4, 17, jArr3);
        p137o00OO0oo.OooOO0O.OooO0o(jArr3, jArr4, jArr3);
        p137o00OO0oo.OooOO0O.OooO(jArr3, jArr3);
        p137o00OO0oo.OooOO0O.OooO0o(jArr3, jArr2, jArr3);
        p137o00OO0oo.OooOO0O.OooOO0(jArr3, 35, jArr4);
        p137o00OO0oo.OooOO0O.OooO0o(jArr4, jArr3, jArr4);
        p137o00OO0oo.OooOO0O.OooOO0(jArr4, 70, jArr3);
        p137o00OO0oo.OooOO0O.OooO0o(jArr3, jArr4, jArr3);
        p137o00OO0oo.OooOO0O.OooO(jArr3, jArr3);
        p137o00OO0oo.OooOO0O.OooO0o(jArr3, jArr2, jArr3);
        p137o00OO0oo.OooOO0O.OooOO0(jArr3, ZegoConstants.RoomError.SessionError, jArr4);
        p137o00OO0oo.OooOO0O.OooO0o(jArr4, jArr3, jArr4);
        p137o00OO0oo.OooOO0O.OooO(jArr4, jArr);
        return new o00O0OO(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooO0oo() {
        long[] jArr = this.f52628OooO0Oo;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        long[] jArr = new long[5];
        p137o00OO0oo.OooOO0O.OooO0o(this.f52628OooO0Oo, ((o00O0OO) oooOOO0).f52628OooO0Oo, jArr);
        return new o00O0OO(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0O(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0 oooOOO2) {
        return OooOO0o(oooOOO0, oooOOO1, oooOOO2);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOO0o(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1, p696oO0OO0oo.OooOOO0 oooOOO2) {
        long[] jArr = this.f52628OooO0Oo;
        long[] jArr2 = ((o00O0OO) oooOOO0).f52628OooO0Oo;
        long[] jArr3 = ((o00O0OO) oooOOO1).f52628OooO0Oo;
        long[] jArr4 = ((o00O0OO) oooOOO2).f52628OooO0Oo;
        long[] jArr5 = new long[9];
        p137o00OO0oo.OooOO0O.OooO0oO(jArr, jArr2, jArr5);
        p137o00OO0oo.OooOO0O.OooO0oO(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[5];
        p137o00OO0oo.OooOO0O.OooO0oo(jArr5, jArr6);
        return new o00O0OO(jArr6);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO() {
        long[] jArr = new long[5];
        long[] jArr2 = this.f52628OooO0Oo;
        long jOooO0Oo = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[0]);
        long jOooO0Oo2 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[1]);
        long j = (jOooO0Oo & 4294967295L) | (jOooO0Oo2 << 32);
        long jOooO0Oo3 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[2]);
        long jOooO0Oo4 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[3]);
        long j2 = (jOooO0Oo3 & 4294967295L) | (jOooO0Oo4 << 32);
        long jOooO0Oo5 = p029Oooo0oO.o0o0Oo.OooO0Oo(jArr2[4]);
        p137o00OO0oo.OooOO0O.OooO0o(new long[]{(jOooO0Oo >>> 32) | (jOooO0Oo2 & (-4294967296L)), (jOooO0Oo3 >>> 32) | (jOooO0Oo4 & (-4294967296L)), jOooO0Oo5 >>> 32, 0, 0}, p137o00OO0oo.OooOO0O.f31660OooO0oO, jArr);
        jArr[0] = jArr[0] ^ j;
        jArr[1] = jArr[1] ^ j2;
        jArr[2] = jArr[2] ^ (4294967295L & jOooO0Oo5);
        return new o00O0OO(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOO0() {
        return this;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOO() {
        long[] jArr = new long[5];
        p137o00OO0oo.OooOO0O.OooO(this.f52628OooO0Oo, jArr);
        return new o00O0OO(jArr);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOOo(p696oO0OO0oo.OooOOO0 oooOOO0, p696oO0OO0oo.OooOOO0 oooOOO1) {
        long[] jArr = this.f52628OooO0Oo;
        long[] jArr2 = ((o00O0OO) oooOOO0).f52628OooO0Oo;
        long[] jArr3 = ((o00O0OO) oooOOO1).f52628OooO0Oo;
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        p137o00OO0oo.OooOO0O.OooO0o0(jArr, jArr5);
        p137o00OO0oo.OooOO0O.OooO00o(jArr4, jArr5, jArr4);
        p137o00OO0oo.OooOO0O.OooO0oO(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[5];
        p137o00OO0oo.OooOO0O.OooO0oo(jArr4, jArr6);
        return new o00O0OO(jArr6);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final boolean OooOOo() {
        return (this.f52628OooO0Oo[0] & 1) != 0;
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final p696oO0OO0oo.OooOOO0 OooOOo0(p696oO0OO0oo.OooOOO0 oooOOO0) {
        return OooO00o(oooOOO0);
    }

    @Override // p696oO0OO0oo.OooOOO0
    public final BigInteger OooOOoo() {
        long[] jArr = this.f52628OooO0Oo;
        byte[] bArr = new byte[40];
        for (int i = 0; i < 5; i++) {
            long j = jArr[i];
            if (j != 0) {
                p684oO0000o.OooOO0.OooO0Oo(j, bArr, (4 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00O0OO)) {
            return false;
        }
        long[] jArr = this.f52628OooO0Oo;
        long[] jArr2 = ((o00O0OO) obj).f52628OooO0Oo;
        for (int i = 4; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return oO000Oo.OooO00o.OooOO0(this.f52628OooO0Oo, 5) ^ 2831275;
    }
}
