package p080o000OoO;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o000O0<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long[] f34955OooO00o = new long[10];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public V[] f34956OooO0O0 = (V[]) new Object[10];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f34957OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34958OooO0Oo;

    public final synchronized void OooO00o(long j, V v) {
        int i = this.f34958OooO0Oo;
        if (i > 0) {
            if (j <= this.f34955OooO00o[((this.f34957OooO0OO + i) - 1) % this.f34956OooO0O0.length]) {
                OooO0O0();
            }
        }
        OooO0OO();
        int i2 = this.f34957OooO0OO;
        int i3 = this.f34958OooO0Oo;
        V[] vArr = this.f34956OooO0O0;
        int length = (i2 + i3) % vArr.length;
        this.f34955OooO00o[length] = j;
        vArr[length] = v;
        this.f34958OooO0Oo = i3 + 1;
    }

    public final synchronized void OooO0O0() {
        this.f34957OooO0OO = 0;
        this.f34958OooO0Oo = 0;
        Arrays.fill(this.f34956OooO0O0, (Object) null);
    }

    public final void OooO0OO() {
        int length = this.f34956OooO0O0.length;
        if (this.f34958OooO0Oo < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) new Object[i];
        int i2 = this.f34957OooO0OO;
        int i3 = length - i2;
        System.arraycopy(this.f34955OooO00o, i2, jArr, 0, i3);
        System.arraycopy(this.f34956OooO0O0, this.f34957OooO0OO, vArr, 0, i3);
        int i4 = this.f34957OooO0OO;
        if (i4 > 0) {
            System.arraycopy(this.f34955OooO00o, 0, jArr, i3, i4);
            System.arraycopy(this.f34956OooO0O0, 0, vArr, i3, this.f34957OooO0OO);
        }
        this.f34955OooO00o = jArr;
        this.f34956OooO0O0 = vArr;
        this.f34957OooO0OO = 0;
    }

    @Nullable
    public final V OooO0Oo(long j, boolean z) {
        V vOooO0o = null;
        long j2 = LongCompanionObject.MAX_VALUE;
        while (this.f34958OooO0Oo > 0) {
            long j3 = j - this.f34955OooO00o[this.f34957OooO0OO];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            vOooO0o = OooO0o();
            j2 = j3;
        }
        return vOooO0o;
    }

    @Nullable
    public final V OooO0o() {
        o00Oo0.OooO0Oo(this.f34958OooO0Oo > 0);
        V[] vArr = this.f34956OooO0O0;
        int i = this.f34957OooO0OO;
        V v = vArr[i];
        vArr[i] = null;
        this.f34957OooO0OO = (i + 1) % vArr.length;
        this.f34958OooO0Oo--;
        return v;
    }

    @Nullable
    public final synchronized V OooO0o0(long j) {
        return OooO0Oo(j, true);
    }
}
