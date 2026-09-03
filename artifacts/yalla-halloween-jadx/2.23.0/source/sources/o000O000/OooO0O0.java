package o000O000;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooO0O0<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long[] f34419OooO00o = new long[10];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final V[] f34420OooO0O0 = (V[]) new Object[10];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f34421OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34422OooO0Oo;

    @Nullable
    public final V OooO00o(long j, boolean z) {
        long j2 = LongCompanionObject.MAX_VALUE;
        V v = null;
        while (true) {
            int i = this.f34422OooO0Oo;
            if (i <= 0) {
                break;
            }
            long j3 = j - this.f34419OooO00o[this.f34421OooO0OO];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            OooO00o.OooO0O0(i > 0);
            int i2 = this.f34421OooO0OO;
            V[] vArr = this.f34420OooO0O0;
            V v2 = vArr[i2];
            vArr[i2] = null;
            this.f34421OooO0OO = (i2 + 1) % vArr.length;
            this.f34422OooO0Oo--;
            v = v2;
            j2 = j3;
        }
        return v;
    }

    @Nullable
    public final synchronized V OooO0O0(long j) {
        return OooO00o(j, true);
    }
}
