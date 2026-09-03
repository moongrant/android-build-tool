package p227o00oOo0O;

import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleStream;
import java.io.IOException;
import p203o00o0o0o.o00OOO0O;
import p219o00oOOO0.o0000Ooo;
import p228o00oOo0o.o0ooOOo;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 implements SampleStream {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f39909OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOo f39910OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long[] f39911OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f39913OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o0ooOOo f39914OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f39915OooOO0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000Ooo f39912OooO0o0 = new o0000Ooo();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f39916OooOO0O = -9223372036854775807L;

    public o0OoOo0(o0ooOOo o0ooooo, OooOo oooOo, boolean z) {
        this.f39910OooO0Oo = oooOo;
        this.f39914OooO0oo = o0ooooo;
        this.f39911OooO0o = o0ooooo.f39986OooO0O0;
        OooO0Oo(o0ooooo, z);
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final void OooO00o() throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final boolean OooO0O0() {
        return true;
    }

    public final void OooO0OO(long j) {
        int iOooO0O0 = o0O00.OooO0O0(this.f39911OooO0o, j, true);
        this.f39915OooOO0 = iOooO0O0;
        if (!(this.f39913OooO0oO && iOooO0O0 == this.f39911OooO0o.length)) {
            j = -9223372036854775807L;
        }
        this.f39916OooOO0O = j;
    }

    public final void OooO0Oo(o0ooOOo o0ooooo, boolean z) {
        int i = this.f39915OooOO0;
        long j = i == 0 ? -9223372036854775807L : this.f39911OooO0o[i - 1];
        this.f39913OooO0oO = z;
        this.f39914OooO0oo = o0ooooo;
        long[] jArr = o0ooooo.f39986OooO0O0;
        this.f39911OooO0o = jArr;
        long j2 = this.f39916OooOO0O;
        if (j2 != -9223372036854775807L) {
            OooO0OO(j2);
        } else if (j != -9223372036854775807L) {
            this.f39915OooOO0 = o0O00.OooO0O0(jArr, j, false);
        }
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final int OooOOO(o00OOO0O o00ooo0o, DecoderInputBuffer decoderInputBuffer, int i) {
        int i2 = this.f39915OooOO0;
        boolean z = i2 == this.f39911OooO0o.length;
        if (z && !this.f39913OooO0oO) {
            decoderInputBuffer.f39410OooO0Oo = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.f39909OooO) {
            o00ooo0o.f39211OooO0O0 = this.f39910OooO0Oo;
            this.f39909OooO = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.f39915OooOO0 = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrOooO00o = this.f39912OooO0o0.OooO00o(this.f39914OooO0oo.f39985OooO00o[i2]);
            decoderInputBuffer.OooOO0(bArrOooO00o.length);
            decoderInputBuffer.f11674OooO0o.put(bArrOooO00o);
        }
        decoderInputBuffer.f11677OooO0oo = this.f39911OooO0o[i2];
        decoderInputBuffer.f39410OooO0Oo = 1;
        return -4;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public final int OooOOOo(long j) {
        int iMax = Math.max(this.f39915OooOO0, o0O00.OooO0O0(this.f39911OooO0o, j, true));
        int i = iMax - this.f39915OooOO0;
        this.f39915OooOO0 = iMax;
        return i;
    }
}
