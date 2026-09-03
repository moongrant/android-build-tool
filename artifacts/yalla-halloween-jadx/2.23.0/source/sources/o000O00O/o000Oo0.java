package o000O00O;

import kotlin.jvm.JvmField;

/* JADX INFO: loaded from: classes.dex */
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    public final int f34563OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    public final int f34564OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    public final boolean f34565OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    public final int f34566OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    public final int f34568OooO0o0 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    public final int f34567OooO0o = Integer.MIN_VALUE;

    public o000Oo0(int i, int i2, boolean z, int i3) {
        this.f34563OooO00o = i;
        this.f34564OooO0O0 = i2;
        this.f34565OooO0OO = z;
        this.f34566OooO0Oo = i3;
        if (!z && i2 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
    }
}
