package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import kotlin.UByte;
import o000OOoO.Oooo000;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f8365OooO00o = new byte[10];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f8366OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f8367OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f8368OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f8369OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f8370OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f8371OooO0oO;

    public final void OooO00o(TrackOutput trackOutput, @Nullable TrackOutput.OooO00o oooO00o) {
        if (this.f8367OooO0OO > 0) {
            trackOutput.OooO0o0(this.f8368OooO0Oo, this.f8370OooO0o0, this.f8369OooO0o, this.f8371OooO0oO, oooO00o);
            this.f8367OooO0OO = 0;
        }
    }

    public final void OooO0O0(TrackOutput trackOutput, long j, int i, int i2, int i3, @Nullable TrackOutput.OooO00o oooO00o) {
        o00Oo0.OooO0o0(this.f8371OooO0oO <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f8366OooO0O0) {
            int i4 = this.f8367OooO0OO;
            int i5 = i4 + 1;
            this.f8367OooO0OO = i5;
            if (i4 == 0) {
                this.f8368OooO0Oo = j;
                this.f8370OooO0o0 = i;
                this.f8369OooO0o = 0;
            }
            this.f8369OooO0o += i2;
            this.f8371OooO0oO = i3;
            if (i5 >= 16) {
                OooO00o(trackOutput, oooO00o);
            }
        }
    }

    public final void OooO0OO(Oooo000 oooo000) throws IOException {
        if (this.f8366OooO0O0) {
            return;
        }
        int i = 0;
        byte[] bArr = this.f8365OooO00o;
        oooo000.OooO0O0(0, 10, bArr);
        oooo000.OooO0o0();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & UByte.MAX_VALUE) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.f8366OooO0O0 = true;
    }
}
