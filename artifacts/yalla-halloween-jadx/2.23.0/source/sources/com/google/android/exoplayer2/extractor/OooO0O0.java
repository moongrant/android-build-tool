package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import java.io.EOFException;
import java.io.IOException;
import p244o00oo0Oo.o00;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0O0 implements TrackOutput {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f11784OooO00o = new byte[4096];

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int OooO00o(o00 o00Var, int i, boolean z) {
        return OooO0o(o00Var, i, z);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void OooO0O0(int i, o00Oo00 o00oo00) {
        o00oo00.Oooo00o(i);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void OooO0OO(OooOo oooOo) {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void OooO0Oo(int i, o00Oo00 o00oo00) {
        o00oo00.Oooo00o(i);
    }

    public final int OooO0o(o00 o00Var, int i, boolean z) throws IOException {
        byte[] bArr = this.f11784OooO00o;
        int i2 = o00Var.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void OooO0o0(long j, int i, int i2, int i3, @Nullable TrackOutput.OooO00o oooO00o) {
    }
}
