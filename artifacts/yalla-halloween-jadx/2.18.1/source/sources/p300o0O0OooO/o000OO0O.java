package p300o0O0OooO;

import com.google.android.exoplayer2.extractor.mp4.Track;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Track f36029OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f36030OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long[] f36031OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int[] f36032OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long[] f36033OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f36034OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int[] f36035OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f36036OooO0oo;

    public o000OO0O(Track track, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        o00000O0.OooO00o(iArr.length == jArr2.length);
        o00000O0.OooO00o(jArr.length == jArr2.length);
        o00000O0.OooO00o(iArr2.length == jArr2.length);
        this.f36029OooO00o = track;
        this.f36031OooO0OO = jArr;
        this.f36032OooO0Oo = iArr;
        this.f36034OooO0o0 = i;
        this.f36033OooO0o = jArr2;
        this.f36035OooO0oO = iArr2;
        this.f36036OooO0oo = j;
        this.f36030OooO0O0 = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int OooO00o(long j) {
        for (int iOooO0o0 = o000OOo0.OooO0o0(this.f36033OooO0o, j, false); iOooO0o0 >= 0; iOooO0o0--) {
            if ((this.f36035OooO0oO[iOooO0o0] & 1) != 0) {
                return iOooO0o0;
            }
        }
        return -1;
    }

    public final int OooO0O0(long j) {
        for (int iOooO0O0 = o000OOo0.OooO0O0(this.f36033OooO0o, j, true); iOooO0O0 < this.f36033OooO0o.length; iOooO0O0++) {
            if ((this.f36035OooO0oO[iOooO0O0] & 1) != 0) {
                return iOooO0O0;
            }
        }
        return -1;
    }
}
