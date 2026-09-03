package com.google.android.exoplayer2.trackselection;

import androidx.annotation.CallSuper;
import com.google.android.exoplayer2.source.TrackGroup;
import p318o0O0oOo.o00000O;
import p319o0O0oOo0.o0000oo;
import p709oo0oOOo.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends o0000oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC0103OooO00o f14772OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00000O f14773OooO0oO;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0103OooO00o {
    }

    public static final class OooO0O0 implements InterfaceC0103OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO f14774OooO00o;

        public OooO0O0(OooO oooO) {
            this.f14774OooO00o = oooO;
        }
    }

    public static class OooO0OO implements com.google.android.exoplayer2.trackselection.OooO0OO.OooO0O0 {
    }

    public OooO00o(TrackGroup trackGroup, int[] iArr, InterfaceC0103OooO00o interfaceC0103OooO00o, o00000O o00000o) {
        super(trackGroup, iArr);
        this.f14772OooO0o = interfaceC0103OooO00o;
        this.f14773OooO0oO = o00000o;
    }

    public static void OooOO0(long[][][] jArr, int i, long[][] jArr2, int[] iArr) {
        long j = 0;
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2][i][1] = jArr2[i2][iArr[i2]];
            j += jArr[i2][i][1];
        }
        for (long[][] jArr3 : jArr) {
            jArr3[i][0] = j;
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0OO
    public final void OooO0O0() {
    }

    @Override // p319o0O0oOo0.o0000oo, com.google.android.exoplayer2.trackselection.OooO0OO
    public final void OooO0OO() {
    }

    @Override // p319o0O0oOo0.o0000oo, com.google.android.exoplayer2.trackselection.OooO0OO
    @CallSuper
    public final void OooO0o() {
    }

    @Override // p319o0O0oOo0.o0000oo, com.google.android.exoplayer2.trackselection.OooO0OO
    @CallSuper
    public final void OooO0o0() {
    }
}
