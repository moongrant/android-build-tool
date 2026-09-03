package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.OooOO0;
import androidx.media3.common.util.UnstableApi;
import java.io.EOFException;
import java.io.IOException;
import p069o0000ooO.o00000O0;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0O0 implements TrackOutput {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f8364OooO00o = new byte[4096];

    @Override // androidx.media3.extractor.TrackOutput
    public final int OooO00o(o00000O0 o00000o1, int i, boolean z) {
        return OooO0o(o00000o1, i, z);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void OooO0O0(OooOO0 oooOO1) {
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void OooO0OO(int i, o000O000 o000o001) {
        o000o001.Oooo00o(i);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void OooO0Oo(int i, o000O000 o000o001) {
        o000o001.Oooo00o(i);
    }

    public final int OooO0o(o00000O0 o00000o1, int i, boolean z) throws IOException {
        byte[] bArr = this.f8364OooO00o;
        int i2 = o00000o1.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void OooO0o0(long j, int i, int i2, int i3, @Nullable TrackOutput.OooO00o oooO00o) {
    }
}
