package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.TrackOutput;
import java.util.Collections;
import java.util.List;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOO0O implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<TsPayloadReader.OooO00o> f12174OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TrackOutput[] f12175OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f12176OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f12177OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f12178OooO0o = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f12179OooO0o0;

    public OooOO0O(List<TsPayloadReader.OooO00o> list) {
        this.f12174OooO00o = list;
        this.f12175OooO0O0 = new TrackOutput[list.size()];
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0O0(o00Oo00 o00oo00) {
        boolean z;
        boolean z2;
        if (this.f12176OooO0OO) {
            if (this.f12177OooO0Oo == 2) {
                if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 == 0) {
                    z2 = false;
                } else {
                    if (o00oo00.OooOo0O() != 32) {
                        this.f12176OooO0OO = false;
                    }
                    this.f12177OooO0Oo--;
                    z2 = this.f12176OooO0OO;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.f12177OooO0Oo == 1) {
                if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 == 0) {
                    z = false;
                } else {
                    if (o00oo00.OooOo0O() != 0) {
                        this.f12176OooO0OO = false;
                    }
                    this.f12177OooO0Oo--;
                    z = this.f12176OooO0OO;
                }
                if (!z) {
                    return;
                }
            }
            int i = o00oo00.f40592OooO0O0;
            int i2 = o00oo00.f40593OooO0OO - i;
            for (TrackOutput trackOutput : this.f12175OooO0O0) {
                o00oo00.Oooo00O(i);
                trackOutput.OooO0O0(i2, o00oo00);
            }
            this.f12179OooO0o0 += i2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0OO() {
        this.f12176OooO0OO = false;
        this.f12178OooO0o = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0Oo(o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        int i = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.f12175OooO0O0;
            if (i >= trackOutputArr.length) {
                return;
            }
            TsPayloadReader.OooO00o oooO00o = this.f12174OooO00o.get(i);
            oooO0o.OooO00o();
            oooO0o.OooO0O0();
            TrackOutput trackOutputOooOOO = o00o0o0.OooOOO(oooO0o.f12362OooO0Oo, 3);
            com.google.android.exoplayer2.OooOo.OooO00o oooO00o2 = new com.google.android.exoplayer2.OooOo.OooO00o();
            oooO0o.OooO0O0();
            oooO00o2.f11235OooO00o = oooO0o.f12363OooO0o0;
            oooO00o2.f11244OooOO0O = "application/dvbsubs";
            oooO00o2.f11247OooOOO0 = Collections.singletonList(oooO00o.f12355OooO0O0);
            oooO00o2.f11237OooO0OO = oooO00o.f12354OooO00o;
            trackOutputOooOOO.OooO0OO(new com.google.android.exoplayer2.OooOo(oooO00o2));
            trackOutputArr[i] = trackOutputOooOOO;
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.f12176OooO0OO = true;
        if (j != -9223372036854775807L) {
            this.f12178OooO0o = j;
        }
        this.f12179OooO0o0 = 0;
        this.f12177OooO0Oo = 2;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.OooOOO0
    public final void OooO0o0() {
        if (this.f12176OooO0OO) {
            if (this.f12178OooO0o != -9223372036854775807L) {
                for (TrackOutput trackOutput : this.f12175OooO0O0) {
                    trackOutput.OooO0o0(this.f12178OooO0o, 1, this.f12179OooO0o0, 0, null);
                }
            }
            this.f12176OooO0OO = false;
        }
    }
}
