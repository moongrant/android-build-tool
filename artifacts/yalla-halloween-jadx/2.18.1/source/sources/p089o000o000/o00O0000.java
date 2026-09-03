package p089o000o000;

import kotlin.jvm.JvmField;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    public final int f28925OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    public final int f28926OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    public final boolean f28927OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    public final int f28928OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    public final int f28929OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    public final int f28930OooO0o0;

    public o00O0000(int i, int i2, boolean z, int i3, int i4) {
        i2 = (i4 & 2) != 0 ? i : i2;
        boolean z2 = true;
        z = (i4 & 4) != 0 ? true : z;
        i3 = (i4 & 8) != 0 ? i * 3 : i3;
        int i5 = (i4 & 16) != 0 ? Integer.MAX_VALUE : 0;
        int i6 = (i4 & 32) != 0 ? Integer.MIN_VALUE : 0;
        this.f28925OooO00o = i;
        this.f28926OooO0O0 = i2;
        this.f28927OooO0OO = z;
        this.f28928OooO0Oo = i3;
        this.f28930OooO0o0 = i5;
        this.f28929OooO0o = i6;
        if (!z && i2 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if (i5 != Integer.MAX_VALUE && i5 < (i2 * 2) + i) {
            StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=", i, ", prefetchDist=", i2, ", maxSize=");
            sbOooO0O0.append(i5);
            throw new IllegalArgumentException(sbOooO0O0.toString());
        }
        if (i6 != Integer.MIN_VALUE && i6 <= 0) {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.".toString());
        }
    }
}
