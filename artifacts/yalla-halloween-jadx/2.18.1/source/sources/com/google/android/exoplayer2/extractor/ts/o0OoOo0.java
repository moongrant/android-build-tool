package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000O0O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 implements o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Format f14341OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o000O0O0 f14342OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TrackOutput f14343OooO0OO;

    public o0OoOo0(String str) {
        Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
        oooO0O0.f13163OooOO0O = str;
        this.f14341OooO00o = new Format(oooO0O0);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.o00Ooo
    public final void OooO00o(o000 o000Var) {
        long j;
        o00000O0.OooO0o(this.f14342OooO0O0);
        int i = o000OOo0.f36740OooO00o;
        long jOooO0OO = this.f14342OooO0O0.OooO0OO();
        long j2 = -9223372036854775807L;
        if (jOooO0OO == -9223372036854775807L) {
            return;
        }
        Format format = this.f14341OooO00o;
        if (jOooO0OO != format.f13135Ooooo00) {
            Format.OooO0O0 oooO0O0 = new Format.OooO0O0(format);
            oooO0O0.f13167OooOOOO = jOooO0OO;
            Format format2 = new Format(oooO0O0);
            this.f14341OooO00o = format2;
            this.f14343OooO0OO.OooO0o0(format2);
        }
        int i2 = o000Var.f36663OooO0OO - o000Var.f36662OooO0O0;
        this.f14343OooO0OO.OooO0OO(o000Var, i2);
        TrackOutput trackOutput = this.f14343OooO0OO;
        o000O0O0 o000o0o1 = this.f14342OooO0O0;
        if (o000o0o1.f36727OooO0OO == -9223372036854775807L) {
            long j3 = o000o0o1.f36725OooO00o;
            if (j3 != Long.MAX_VALUE) {
                j = j3;
            }
            trackOutput.OooO0Oo(j, 1, i2, 0, null);
        }
        j2 = o000o0o1.f36726OooO0O0 + o000o0o1.f36727OooO0OO;
        j = j2;
        trackOutput.OooO0Oo(j, 1, i2, 0, null);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.o00Ooo
    public final void OooO0OO(o000O0O0 o000o0o1, p296o0O0OoO0.o0OoOo0 o0oooo1, TsPayloadReader.OooO0o oooO0o) {
        this.f14342OooO0O0 = o000o0o1;
        oooO0o.OooO00o();
        TrackOutput trackOutputOooO00o = o0oooo1.OooO00o(oooO0o.OooO0OO());
        this.f14343OooO0OO = trackOutputOooO00o;
        trackOutputOooO00o.OooO0o0(this.f14341OooO00o);
    }
}
