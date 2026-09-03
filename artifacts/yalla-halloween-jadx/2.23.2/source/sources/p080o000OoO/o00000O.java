package p080o000OoO;

import androidx.appcompat.widget.o0000O0;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f34930OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long[] f34931OooO0O0 = new long[32];

    public final void OooO00o(long j) {
        int i = this.f34930OooO00o;
        long[] jArr = this.f34931OooO0O0;
        if (i == jArr.length) {
            this.f34931OooO0O0 = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f34931OooO0O0;
        int i2 = this.f34930OooO00o;
        this.f34930OooO00o = i2 + 1;
        jArr2[i2] = j;
    }

    public final long OooO0O0(int i) {
        if (i >= 0 && i < this.f34930OooO00o) {
            return this.f34931OooO0O0[i];
        }
        StringBuilder sbOooO0O0 = o0000O0.OooO0O0("Invalid index ", i, ", size is ");
        sbOooO0O0.append(this.f34930OooO00o);
        throw new IndexOutOfBoundsException(sbOooO0O0.toString());
    }
}
