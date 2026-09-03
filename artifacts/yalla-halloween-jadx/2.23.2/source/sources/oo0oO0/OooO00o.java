package oo0oO0;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f60349OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f60350OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f60351OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f60352OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f60353OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f60354OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f60344OooO0oO = new OooO00o(4201, 4096, 1);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO00o f60345OooO0oo = new OooO00o(1033, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 1);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO00o f60343OooO = new OooO00o(67, 64, 1);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO00o f60346OooOO0 = new OooO00o(19, 16, 1);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooO00o f60347OooOO0O = new OooO00o(285, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final OooO00o f60348OooOO0o = new OooO00o(301, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 1);

    public OooO00o(int i, int i2, int i3) {
        this.f60354OooO0o0 = i;
        this.f60352OooO0Oo = i2;
        this.f60353OooO0o = i3;
        this.f60349OooO00o = new int[i2];
        this.f60350OooO0O0 = new int[i2];
        int i4 = 1;
        int i5 = 1;
        for (int i6 = 0; i6 < i2; i6++) {
            this.f60349OooO00o[i6] = i5;
            i5 <<= 1;
            if (i5 >= i2) {
                i5 = (i5 ^ i) & (i2 - 1);
            }
        }
        for (int i7 = 0; i7 < i2 - 1; i7++) {
            this.f60350OooO0O0[this.f60349OooO00o[i7]] = i7;
        }
        this.f60351OooO0OO = new OooO0O0(this, new int[]{0});
        int[] iArr = {1};
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            return;
        }
        while (i4 < length && iArr[i4] == 0) {
            i4++;
        }
        if (i4 == length) {
            return;
        }
        int[] iArr2 = new int[length - i4];
        System.arraycopy(iArr, i4, iArr2, 0, iArr2.length);
    }

    public final int OooO00o(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f60350OooO0O0;
        return this.f60349OooO00o[(iArr[i] + iArr[i2]) % (this.f60352OooO0Oo - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f60354OooO0o0));
        sb.append(',');
        return androidx.compose.foundation.layout.OooO0O0.OooO00o(sb, this.f60352OooO0Oo, ')');
    }
}
