package p101o000oo;

import kotlin.jvm.JvmField;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    public final int f35508OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    public final int f35509OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    public final boolean f35510OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    public final int f35511OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    public final int f35513OooO0o0 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    public final int f35512OooO0o = Integer.MIN_VALUE;

    public o00O000(int i, int i2, boolean z, int i3) {
        this.f35508OooO00o = i;
        this.f35509OooO0O0 = i2;
        this.f35510OooO0OO = z;
        this.f35511OooO0Oo = i3;
        if (!z && i2 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
    }
}
