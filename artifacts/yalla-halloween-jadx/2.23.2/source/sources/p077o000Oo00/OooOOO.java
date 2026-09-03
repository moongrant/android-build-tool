package p077o000Oo00;

import androidx.media3.extractor.TrackOutput;
import kotlin.io.ConstantsKt;
import o000OOoO.o000000;
import o000OOoO.o000000O;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f34866OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TrackOutput f34867OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f34868OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f34869OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f34870OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f34871OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f34872OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f34873OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f34874OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f34875OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long[] f34876OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int[] f34877OooOO0o;

    public OooOOO(int i, int i2, long j, int i3, TrackOutput trackOutput) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        o00Oo0.OooO00o(z);
        this.f34870OooO0Oo = j;
        this.f34872OooO0o0 = i3;
        this.f34867OooO00o = trackOutput;
        int i4 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f34868OooO0O0 = (i2 == 2 ? 1667497984 : 1651965952) | i4;
        this.f34869OooO0OO = i2 == 2 ? i4 | 1650720768 : -1;
        this.f34876OooOO0O = new long[ConstantsKt.MINIMUM_BLOCK_SIZE];
        this.f34877OooOO0o = new int[ConstantsKt.MINIMUM_BLOCK_SIZE];
    }

    public final o000000O OooO00o(int i) {
        return new o000000O(((this.f34870OooO0Oo * ((long) 1)) / ((long) this.f34872OooO0o0)) * ((long) this.f34877OooOO0o[i]), this.f34876OooOO0O[i]);
    }

    public final o000000.OooO00o OooO0O0(long j) {
        int i = (int) (j / ((this.f34870OooO0Oo * ((long) 1)) / ((long) this.f34872OooO0o0)));
        int iOooO0o0 = o00.OooO0o0(this.f34877OooOO0o, i, true, true);
        if (this.f34877OooOO0o[iOooO0o0] == i) {
            o000000O o000000oOooO00o = OooO00o(iOooO0o0);
            return new o000000.OooO00o(o000000oOooO00o, o000000oOooO00o);
        }
        o000000O o000000oOooO00o2 = OooO00o(iOooO0o0);
        int i2 = iOooO0o0 + 1;
        return i2 < this.f34876OooOO0O.length ? new o000000.OooO00o(o000000oOooO00o2, OooO00o(i2)) : new o000000.OooO00o(o000000oOooO00o2, o000000oOooO00o2);
    }
}
