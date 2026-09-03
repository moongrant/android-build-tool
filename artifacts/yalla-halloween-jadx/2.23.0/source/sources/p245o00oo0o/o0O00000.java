package p245o00oo0o;

import androidx.annotation.Nullable;
import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0O00000<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long[] f40609OooO00o = new long[10];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public V[] f40610OooO0O0 = (V[]) new Object[10];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f40611OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f40612OooO0Oo;

    public final synchronized void OooO00o(long j, V v) {
        int i = this.f40612OooO0Oo;
        if (i > 0) {
            if (j <= this.f40609OooO00o[((this.f40611OooO0OO + i) - 1) % this.f40610OooO0O0.length]) {
                OooO0O0();
            }
        }
        OooO0OO();
        int i2 = this.f40611OooO0OO;
        int i3 = this.f40612OooO0Oo;
        V[] vArr = this.f40610OooO0O0;
        int length = (i2 + i3) % vArr.length;
        this.f40609OooO00o[length] = j;
        vArr[length] = v;
        this.f40612OooO0Oo = i3 + 1;
    }

    public final synchronized void OooO0O0() {
        this.f40611OooO0OO = 0;
        this.f40612OooO0Oo = 0;
        Arrays.fill(this.f40610OooO0O0, (Object) null);
    }

    public final void OooO0OO() {
        int length = this.f40610OooO0O0.length;
        if (this.f40612OooO0Oo < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) new Object[i];
        int i2 = this.f40611OooO0OO;
        int i3 = length - i2;
        System.arraycopy(this.f40609OooO00o, i2, jArr, 0, i3);
        System.arraycopy(this.f40610OooO0O0, this.f40611OooO0OO, vArr, 0, i3);
        int i4 = this.f40611OooO0OO;
        if (i4 > 0) {
            System.arraycopy(this.f40609OooO00o, 0, jArr, i3, i4);
            System.arraycopy(this.f40610OooO0O0, 0, vArr, i3, this.f40611OooO0OO);
        }
        this.f40609OooO00o = jArr;
        this.f40610OooO0O0 = vArr;
        this.f40611OooO0OO = 0;
    }

    @Nullable
    public final V OooO0Oo(long j, boolean z) {
        V vOooO0o = null;
        long j2 = LongCompanionObject.MAX_VALUE;
        while (this.f40612OooO0Oo > 0) {
            long j3 = j - this.f40609OooO00o[this.f40611OooO0OO];
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
        o00O000o.OooO0Oo(this.f40612OooO0Oo > 0);
        V[] vArr = this.f40610OooO0O0;
        int i = this.f40611OooO0OO;
        V v = vArr[i];
        vArr[i] = null;
        this.f40611OooO0OO = (i + 1) % vArr.length;
        this.f40612OooO0Oo--;
        return v;
    }

    @Nullable
    public final synchronized V OooO0o0(long j) {
        return OooO0Oo(j, true);
    }
}
