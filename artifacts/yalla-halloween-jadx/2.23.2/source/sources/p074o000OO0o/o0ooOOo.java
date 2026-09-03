package p074o000OO0o;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0ooOOo implements o00Oo0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f34468OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34469OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f34466OooO00o = true;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f34467OooO0O0 = 65536;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f34471OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00O0O[] f34470OooO0o = new o00O0O[100];

    public final synchronized void OooO00o(int i) {
        boolean z = i < this.f34468OooO0OO;
        this.f34468OooO0OO = i;
        if (z) {
            OooO0O0();
        }
    }

    public final synchronized void OooO0O0() {
        int i = this.f34468OooO0OO;
        int i2 = this.f34467OooO0O0;
        int i3 = o00.f34910OooO00o;
        int iMax = Math.max(0, (((i + i2) - 1) / i2) - this.f34469OooO0Oo);
        int i4 = this.f34471OooO0o0;
        if (iMax >= i4) {
            return;
        }
        Arrays.fill(this.f34470OooO0o, iMax, i4, (Object) null);
        this.f34471OooO0o0 = iMax;
    }
}
