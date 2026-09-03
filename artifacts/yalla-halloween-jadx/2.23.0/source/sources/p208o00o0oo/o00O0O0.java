package p208o00o0oo;

import com.google.android.exoplayer2.extractor.TrackOutput;
import kotlin.io.ConstantsKt;
import p209o00o0oo0.o00OO0OO;
import p209o00o0oo0.oo0O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f39456OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TrackOutput f39457OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39458OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f39459OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f39460OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f39461OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f39462OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f39463OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f39464OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f39465OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long[] f39466OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int[] f39467OooOO0o;

    public o00O0O0(int i, int i2, long j, int i3, TrackOutput trackOutput) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        o00O000o.OooO00o(z);
        this.f39460OooO0Oo = j;
        this.f39462OooO0o0 = i3;
        this.f39457OooO00o = trackOutput;
        int i4 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f39458OooO0O0 = (i2 == 2 ? 1667497984 : 1651965952) | i4;
        this.f39459OooO0OO = i2 == 2 ? i4 | 1650720768 : -1;
        this.f39466OooOO0O = new long[ConstantsKt.MINIMUM_BLOCK_SIZE];
        this.f39467OooOO0o = new int[ConstantsKt.MINIMUM_BLOCK_SIZE];
    }

    public final oo0O OooO00o(int i) {
        return new oo0O(((this.f39460OooO0Oo * ((long) 1)) / ((long) this.f39462OooO0o0)) * ((long) this.f39467OooOO0o[i]), this.f39466OooOO0O[i]);
    }

    public final o00OO0OO.OooO00o OooO0O0(long j) {
        int i = (int) (j / ((this.f39460OooO0Oo * ((long) 1)) / ((long) this.f39462OooO0o0)));
        int iOooO0o0 = o0O00.OooO0o0(this.f39467OooOO0o, i, true, true);
        if (this.f39467OooOO0o[iOooO0o0] == i) {
            oo0O oo0oOooO00o = OooO00o(iOooO0o0);
            return new o00OO0OO.OooO00o(oo0oOooO00o, oo0oOooO00o);
        }
        oo0O oo0oOooO00o2 = OooO00o(iOooO0o0);
        int i2 = iOooO0o0 + 1;
        return i2 < this.f39466OooOO0O.length ? new o00OO0OO.OooO00o(oo0oOooO00o2, OooO00o(i2)) : new o00OO0OO.OooO00o(oo0oOooO00o2, oo0oOooO00o2);
    }
}
