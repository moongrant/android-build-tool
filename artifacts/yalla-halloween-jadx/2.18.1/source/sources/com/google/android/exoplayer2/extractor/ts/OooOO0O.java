package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.util.Collections;
import java.util.List;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<TsPayloadReader.OooO00o> f14104OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TrackOutput[] f14105OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f14106OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f14107OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f14108OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f14109OooO0o0;

    public OooOO0O(List<TsPayloadReader.OooO00o> list) {
        this.f14104OooO00o = list;
        this.f14105OooO0O0 = new TrackOutput[list.size()];
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO00o(o000 o000Var) {
        if (this.f14106OooO0OO) {
            if (this.f14107OooO0Oo != 2 || OooO0o(o000Var, 32)) {
                if (this.f14107OooO0Oo != 1 || OooO0o(o000Var, 0)) {
                    int i = o000Var.f36662OooO0O0;
                    int i2 = o000Var.f36663OooO0OO - i;
                    for (TrackOutput trackOutput : this.f14105OooO0O0) {
                        o000Var.OooOoOO(i);
                        trackOutput.OooO0OO(o000Var, i2);
                    }
                    this.f14109OooO0o0 += i2;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0() {
        this.f14106OooO0OO = false;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
        if (this.f14106OooO0OO) {
            for (TrackOutput trackOutput : this.f14105OooO0O0) {
                trackOutput.OooO0Oo(this.f14108OooO0o, 1, this.f14109OooO0o0, 0, null);
            }
            this.f14106OooO0OO = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f14106OooO0OO = true;
        this.f14108OooO0o = j;
        this.f14109OooO0o0 = 0;
        this.f14107OooO0Oo = 2;
    }

    public final boolean OooO0o(o000 o000Var, int i) {
        if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 == 0) {
            return false;
        }
        if (o000Var.OooOOo0() != i) {
            this.f14106OooO0OO = false;
        }
        this.f14107OooO0Oo--;
        return this.f14106OooO0OO;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0(p296o0O0OoO0.o0OoOo0 o0oooo1, TsPayloadReader.OooO0o oooO0o) {
        for (int i = 0; i < this.f14105OooO0O0.length; i++) {
            TsPayloadReader.OooO00o oooO00o = this.f14104OooO00o.get(i);
            oooO0o.OooO00o();
            TrackOutput trackOutputOooO00o = o0oooo1.OooO00o(oooO0o.OooO0OO());
            Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
            oooO0O0.f13154OooO00o = oooO0o.OooO0O0();
            oooO0O0.f13163OooOO0O = "application/dvbsubs";
            oooO0O0.f13166OooOOO0 = Collections.singletonList(oooO00o.f14288OooO0O0);
            oooO0O0.f13156OooO0OO = oooO00o.f14287OooO00o;
            trackOutputOooO00o.OooO0o0(new Format(oooO0O0));
            this.f14105OooO0O0[i] = trackOutputOooO00o;
        }
    }
}
