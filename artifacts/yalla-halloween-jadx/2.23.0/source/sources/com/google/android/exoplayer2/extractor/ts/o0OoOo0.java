package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.TrackOutput;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;
import p245o00oo0o.o0O0000O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0OoOo0 implements o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public com.google.android.exoplayer2.OooOo f12408OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o0O0000O f12409OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TrackOutput f12410OooO0OO;

    public o0OoOo0(String str) {
        com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
        oooO00o.f11244OooOO0O = str;
        this.f12408OooO00o = new com.google.android.exoplayer2.OooOo(oooO00o);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.o00Ooo
    public final void OooO00o(o0O0000O o0o0000o2, o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        this.f12409OooO0O0 = o0o0000o2;
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        TrackOutput trackOutputOooOOO = o00o0o0.OooOOO(oooO0o.f12362OooO0Oo, 5);
        this.f12410OooO0OO = trackOutputOooOOO;
        trackOutputOooOOO.OooO0OO(this.f12408OooO00o);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.o00Ooo
    public final void OooO0O0(o00Oo00 o00oo00) {
        long jOooO0OO;
        o00O000o.OooO0o0(this.f12409OooO0O0);
        int i = o0O00.f40595OooO00o;
        o0O0000O o0o0000o2 = this.f12409OooO0O0;
        synchronized (o0o0000o2) {
            long j = o0o0000o2.f40615OooO0OO;
            jOooO0OO = j != -9223372036854775807L ? j + o0o0000o2.f40614OooO0O0 : o0o0000o2.OooO0OO();
        }
        long jOooO0Oo = this.f12409OooO0O0.OooO0Oo();
        if (jOooO0OO == -9223372036854775807L || jOooO0Oo == -9223372036854775807L) {
            return;
        }
        com.google.android.exoplayer2.OooOo oooOo = this.f12408OooO00o;
        if (jOooO0Oo != oooOo.f11215OooOOoo) {
            com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o(oooOo);
            oooO00o.f11248OooOOOO = jOooO0Oo;
            com.google.android.exoplayer2.OooOo oooOo2 = new com.google.android.exoplayer2.OooOo(oooO00o);
            this.f12408OooO00o = oooOo2;
            this.f12410OooO0OO.OooO0OO(oooOo2);
        }
        int i2 = o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0;
        this.f12410OooO0OO.OooO0O0(i2, o00oo00);
        this.f12410OooO0OO.OooO0o0(jOooO0OO, 1, i2, 0, null);
    }
}
