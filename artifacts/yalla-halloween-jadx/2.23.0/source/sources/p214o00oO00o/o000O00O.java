package p214o00oO00o;

import com.google.android.exoplayer2.extractor.mp4.Track;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Track f39687OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39688OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long[] f39689OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int[] f39690OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long[] f39691OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f39692OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int[] f39693OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f39694OooO0oo;

    public o000O00O(Track track, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        o00O000o.OooO00o(iArr.length == jArr2.length);
        o00O000o.OooO00o(jArr.length == jArr2.length);
        o00O000o.OooO00o(iArr2.length == jArr2.length);
        this.f39687OooO00o = track;
        this.f39689OooO0OO = jArr;
        this.f39690OooO0Oo = iArr;
        this.f39692OooO0o0 = i;
        this.f39691OooO0o = jArr2;
        this.f39693OooO0oO = iArr2;
        this.f39694OooO0oo = j;
        this.f39688OooO0O0 = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int OooO00o(long j) {
        long[] jArr = this.f39691OooO0o;
        for (int iOooO0O0 = o0O00.OooO0O0(jArr, j, true); iOooO0O0 < jArr.length; iOooO0O0++) {
            if ((this.f39693OooO0oO[iOooO0O0] & 1) != 0) {
                return iOooO0O0;
            }
        }
        return -1;
    }
}
