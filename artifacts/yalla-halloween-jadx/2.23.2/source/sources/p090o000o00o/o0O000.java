package p090o000o00o;

import androidx.media3.extractor.mp4.Track;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Track f35049OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f35050OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long[] f35051OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int[] f35052OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long[] f35053OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f35054OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int[] f35055OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f35056OooO0oo;

    public o0O000(Track track, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        o00Oo0.OooO00o(iArr.length == jArr2.length);
        o00Oo0.OooO00o(jArr.length == jArr2.length);
        o00Oo0.OooO00o(iArr2.length == jArr2.length);
        this.f35049OooO00o = track;
        this.f35051OooO0OO = jArr;
        this.f35052OooO0Oo = iArr;
        this.f35054OooO0o0 = i;
        this.f35053OooO0o = jArr2;
        this.f35055OooO0oO = iArr2;
        this.f35056OooO0oo = j;
        this.f35050OooO0O0 = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int OooO00o(long j) {
        long[] jArr = this.f35053OooO0o;
        for (int iOooO0O0 = o00.OooO0O0(jArr, j, true); iOooO0O0 < jArr.length; iOooO0O0++) {
            if ((this.f35055OooO0oO[iOooO0O0] & 1) != 0) {
                return iOooO0O0;
            }
        }
        return -1;
    }
}
