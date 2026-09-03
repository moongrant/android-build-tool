package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Log;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Oooo000 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public TrackOutput f12326OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f12327OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f12329OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f12330OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo00 f12325OooO00o = new o00Oo00(10);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f12328OooO0Oo = -9223372036854775807L;

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0(o00Oo00 o00oo00) {
        o00O000o.OooO0o0(this.f12326OooO0O0);
        if (this.f12327OooO0OO) {
            int i = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
            int i2 = this.f12329OooO0o;
            if (i2 < 10) {
                int iMin = Math.min(i, 10 - i2);
                byte[] bArr = o00oo00.f40591OooO00o;
                int i3 = o00oo00.f40592OooO0O0;
                o00Oo00 o00oo01 = this.f12325OooO00o;
                System.arraycopy(bArr, i3, o00oo01.f40591OooO00o, this.f12329OooO0o, iMin);
                if (this.f12329OooO0o + iMin == 10) {
                    o00oo01.Oooo00O(0);
                    if (73 != o00oo01.OooOo0O() || 68 != o00oo01.OooOo0O() || 51 != o00oo01.OooOo0O()) {
                        Log.OooO0o("Id3Reader", "Discarding invalid ID3 tag");
                        this.f12327OooO0OO = false;
                        return;
                    } else {
                        o00oo01.Oooo00o(3);
                        this.f12330OooO0o0 = o00oo01.OooOo0() + 10;
                    }
                }
            }
            int iMin2 = Math.min(i, this.f12330OooO0o0 - this.f12329OooO0o);
            this.f12326OooO0O0.OooO0O0(iMin2, o00oo00);
            this.f12329OooO0o += iMin2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
        this.f12327OooO0OO = false;
        this.f12328OooO0Oo = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        TrackOutput trackOutputOooOOO = o00o0o0.OooOOO(oooO0o.f12362OooO0Oo, 5);
        this.f12326OooO0O0 = trackOutputOooOOO;
        com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
        oooO0o.OooO0O0();
        oooO00o.f11235OooO00o = oooO0o.f12363OooO0o0;
        oooO00o.f11244OooOO0O = "application/id3";
        trackOutputOooOOO.OooO0OO(new com.google.android.exoplayer2.OooOo(oooO00o));
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.f12327OooO0OO = true;
        if (j != -9223372036854775807L) {
            this.f12328OooO0Oo = j;
        }
        this.f12330OooO0o0 = 0;
        this.f12329OooO0o = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0() {
        int i;
        o00O000o.OooO0o0(this.f12326OooO0O0);
        if (this.f12327OooO0OO && (i = this.f12330OooO0o0) != 0 && this.f12329OooO0o == i) {
            long j = this.f12328OooO0Oo;
            if (j != -9223372036854775807L) {
                this.f12326OooO0O0.OooO0o0(j, 1, i, 0, null);
            }
            this.f12327OooO0OO = false;
        }
    }
}
