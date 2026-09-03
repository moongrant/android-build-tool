package p709oo0oOOo;

import java.util.Arrays;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO implements OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f53389OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f53391OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f53386OooO00o = true;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f53387OooO0O0 = 65536;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f53390OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooO0O0[] f53392OooO0oO = new OooO0O0[100];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0[] f53388OooO0OO = new OooO0O0[1];

    public final synchronized void OooO00o(OooO0O0[] oooO0O0Arr) {
        int i = this.f53390OooO0o;
        int length = oooO0O0Arr.length + i;
        OooO0O0[] oooO0O0Arr2 = this.f53392OooO0oO;
        if (length >= oooO0O0Arr2.length) {
            this.f53392OooO0oO = (OooO0O0[]) Arrays.copyOf(oooO0O0Arr2, Math.max(oooO0O0Arr2.length * 2, i + oooO0O0Arr.length));
        }
        for (OooO0O0 oooO0O0 : oooO0O0Arr) {
            OooO0O0[] oooO0O0Arr3 = this.f53392OooO0oO;
            int i2 = this.f53390OooO0o;
            this.f53390OooO0o = i2 + 1;
            oooO0O0Arr3[i2] = oooO0O0;
        }
        this.f53391OooO0o0 -= oooO0O0Arr.length;
        notifyAll();
    }

    public final synchronized void OooO0O0() {
        int i = this.f53389OooO0Oo;
        int i2 = this.f53387OooO0O0;
        int i3 = o000OOo0.f36740OooO00o;
        int iMax = Math.max(0, (((i + i2) - 1) / i2) - this.f53391OooO0o0);
        int i4 = this.f53390OooO0o;
        if (iMax >= i4) {
            return;
        }
        Arrays.fill(this.f53392OooO0oO, iMax, i4, (Object) null);
        this.f53390OooO0o = iMax;
    }
}
