package p245o00oo0o;

import androidx.appcompat.widget.o0000O0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00OO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f40572OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long[] f40573OooO0O0 = new long[32];

    public final void OooO00o(long j) {
        int i = this.f40572OooO00o;
        long[] jArr = this.f40573OooO0O0;
        if (i == jArr.length) {
            this.f40573OooO0O0 = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f40573OooO0O0;
        int i2 = this.f40572OooO00o;
        this.f40572OooO00o = i2 + 1;
        jArr2[i2] = j;
    }

    public final long OooO0O0(int i) {
        if (i >= 0 && i < this.f40572OooO00o) {
            return this.f40573OooO0O0[i];
        }
        StringBuilder sbOooO00o = o0000O0.OooO00o("Invalid index ", i, ", size is ");
        sbOooO00o.append(this.f40572OooO00o);
        throw new IndexOutOfBoundsException(sbOooO00o.toString());
    }
}
