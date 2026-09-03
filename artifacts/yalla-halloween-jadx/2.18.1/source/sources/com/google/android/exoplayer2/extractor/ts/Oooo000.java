package com.google.android.exoplayer2.extractor.ts;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000 f14255OooO00o = new o000(10);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public TrackOutput f14256OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f14257OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f14258OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f14259OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f14260OooO0o0;

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO00o(o000 o000Var) {
        o00000O0.OooO0o(this.f14256OooO0O0);
        if (this.f14257OooO0OO) {
            int i = o000Var.f36663OooO0OO - o000Var.f36662OooO0O0;
            int i2 = this.f14259OooO0o;
            if (i2 < 10) {
                int iMin = Math.min(i, 10 - i2);
                System.arraycopy(o000Var.f36661OooO00o, o000Var.f36662OooO0O0, this.f14255OooO00o.f36661OooO00o, this.f14259OooO0o, iMin);
                if (this.f14259OooO0o + iMin == 10) {
                    this.f14255OooO00o.OooOoOO(0);
                    if (73 != this.f14255OooO00o.OooOOo0() || 68 != this.f14255OooO00o.OooOOo0() || 51 != this.f14255OooO00o.OooOOo0()) {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f14257OooO0OO = false;
                        return;
                    } else {
                        this.f14255OooO00o.OooOoo0(3);
                        this.f14260OooO0o0 = this.f14255OooO00o.OooOOOo() + 10;
                    }
                }
            }
            int iMin2 = Math.min(i, this.f14260OooO0o0 - this.f14259OooO0o);
            this.f14256OooO0O0.OooO0OO(o000Var, iMin2);
            this.f14259OooO0o += iMin2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0() {
        this.f14257OooO0OO = false;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
        int i;
        o00000O0.OooO0o(this.f14256OooO0O0);
        if (this.f14257OooO0OO && (i = this.f14260OooO0o0) != 0 && this.f14259OooO0o == i) {
            this.f14256OooO0O0.OooO0Oo(this.f14258OooO0Oo, 1, i, 0, null);
            this.f14257OooO0OO = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f14257OooO0OO = true;
        this.f14258OooO0Oo = j;
        this.f14260OooO0o0 = 0;
        this.f14259OooO0o = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0(p296o0O0OoO0.o0OoOo0 o0oooo1, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        TrackOutput trackOutputOooO00o = o0oooo1.OooO00o(oooO0o.OooO0OO());
        this.f14256OooO0O0 = trackOutputOooO00o;
        Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
        oooO0O0.f13154OooO00o = oooO0o.OooO0O0();
        oooO0O0.f13163OooOO0O = "application/id3";
        trackOutputOooO00o.OooO0o0(new Format(oooO0O0));
    }
}
