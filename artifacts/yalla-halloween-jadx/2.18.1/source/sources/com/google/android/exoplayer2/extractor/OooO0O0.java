package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;
import p318o0O0oOo.o000;
import p709oo0oOOo.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements TrackOutput {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f13734OooO00o = new byte[4096];

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void OooO00o(o000 o000Var, int i) {
        o000Var.OooOoo0(i);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int OooO0O0(OooOO0O oooOO0O, int i, boolean z) {
        return OooO0o(oooOO0O, i, z);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void OooO0OO(o000 o000Var, int i) {
        o000Var.OooOoo0(i);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void OooO0Oo(long j, int i, int i2, int i3, @Nullable TrackOutput.OooO00o oooO00o) {
    }

    public final int OooO0o(OooOO0O oooOO0O, int i, boolean z) throws IOException {
        int i2 = oooOO0O.read(this.f13734OooO00o, 0, Math.min(this.f13734OooO00o.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void OooO0o0(Format format) {
    }
}
