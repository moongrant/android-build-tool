package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import java.io.IOException;
import kotlin.UByte;
import p209o00o0oo0.o00O0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f11785OooO00o = new byte[10];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f11786OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f11787OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f11788OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f11789OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f11790OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f11791OooO0oO;

    public final void OooO00o(TrackOutput trackOutput, @Nullable TrackOutput.OooO00o oooO00o) {
        if (this.f11787OooO0OO > 0) {
            trackOutput.OooO0o0(this.f11788OooO0Oo, this.f11790OooO0o0, this.f11789OooO0o, this.f11791OooO0oO, oooO00o);
            this.f11787OooO0OO = 0;
        }
    }

    public final void OooO0O0(TrackOutput trackOutput, long j, int i, int i2, int i3, @Nullable TrackOutput.OooO00o oooO00o) {
        if (!(this.f11791OooO0oO <= i2 + i3)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f11786OooO0O0) {
            int i4 = this.f11787OooO0OO;
            int i5 = i4 + 1;
            this.f11787OooO0OO = i5;
            if (i4 == 0) {
                this.f11788OooO0Oo = j;
                this.f11790OooO0o0 = i;
                this.f11789OooO0o = 0;
            }
            this.f11789OooO0o += i2;
            this.f11791OooO0oO = i3;
            if (i5 >= 16) {
                OooO00o(trackOutput, oooO00o);
            }
        }
    }

    public final void OooO0OO(o00O0O00 o00o0o01) throws IOException {
        if (this.f11786OooO0O0) {
            return;
        }
        int i = 0;
        byte[] bArr = this.f11785OooO00o;
        o00o0o01.OooO0O0(0, 10, bArr);
        o00o0o01.OooO0o();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & UByte.MAX_VALUE) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.f11786OooO0O0 = true;
    }
}
