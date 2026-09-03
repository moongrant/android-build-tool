package p318o0O0oOo;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO0O<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long[] f36735OooO00o = new long[10];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public V[] f36736OooO0O0 = (V[]) new Object[10];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f36737OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f36738OooO0Oo;

    public final void OooO00o(long j) {
        int i = this.f36738OooO0Oo;
        if (i > 0) {
            if (j <= this.f36735OooO00o[((this.f36737OooO0OO + i) - 1) % this.f36736OooO0O0.length]) {
                synchronized (this) {
                    this.f36737OooO0OO = 0;
                    this.f36738OooO0Oo = 0;
                    Arrays.fill(this.f36736OooO0O0, (Object) null);
                }
            }
        }
    }

    public final void OooO0O0() {
        int length = this.f36736OooO0O0.length;
        if (this.f36738OooO0Oo < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) new Object[i];
        int i2 = this.f36737OooO0OO;
        int i3 = length - i2;
        System.arraycopy(this.f36735OooO00o, i2, jArr, 0, i3);
        System.arraycopy(this.f36736OooO0O0, this.f36737OooO0OO, vArr, 0, i3);
        int i4 = this.f36737OooO0OO;
        if (i4 > 0) {
            System.arraycopy(this.f36735OooO00o, 0, jArr, i3, i4);
            System.arraycopy(this.f36736OooO0O0, 0, vArr, i3, this.f36737OooO0OO);
        }
        this.f36735OooO00o = jArr;
        this.f36736OooO0O0 = vArr;
        this.f36737OooO0OO = 0;
    }

    @Nullable
    public final V OooO0OO() {
        o00000O0.OooO0Oo(this.f36738OooO0Oo > 0);
        V[] vArr = this.f36736OooO0O0;
        int i = this.f36737OooO0OO;
        V v = vArr[i];
        vArr[i] = null;
        this.f36737OooO0OO = (i + 1) % vArr.length;
        this.f36738OooO0Oo--;
        return v;
    }
}
