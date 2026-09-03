package androidx.media3.extractor.ts;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import java.util.Collections;
import java.util.List;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOO0O implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<TsPayloadReader.OooO00o> f8941OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TrackOutput[] f8942OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f8943OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f8944OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f8945OooO0o = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f8946OooO0o0;

    public OooOO0O(List<TsPayloadReader.OooO00o> list) {
        this.f8941OooO00o = list;
        this.f8942OooO0O0 = new TrackOutput[list.size()];
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0O0() {
        this.f8943OooO0OO = false;
        this.f8945OooO0o = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0OO(o000O000 o000o001) {
        boolean z;
        boolean z2;
        if (this.f8943OooO0OO) {
            if (this.f8944OooO0Oo == 2) {
                if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 == 0) {
                    z2 = false;
                } else {
                    if (o000o001.OooOo0O() != 32) {
                        this.f8943OooO0OO = false;
                    }
                    this.f8944OooO0Oo--;
                    z2 = this.f8943OooO0OO;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.f8944OooO0Oo == 1) {
                if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 == 0) {
                    z = false;
                } else {
                    if (o000o001.OooOo0O() != 0) {
                        this.f8943OooO0OO = false;
                    }
                    this.f8944OooO0Oo--;
                    z = this.f8943OooO0OO;
                }
                if (!z) {
                    return;
                }
            }
            int i = o000o001.f34963OooO0O0;
            int i2 = o000o001.f34964OooO0OO - i;
            for (TrackOutput trackOutput : this.f8942OooO0O0) {
                o000o001.Oooo00O(i);
                trackOutput.OooO0OO(i2, o000o001);
            }
            this.f8946OooO0o0 += i2;
        }
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0Oo() {
        if (this.f8943OooO0OO) {
            if (this.f8945OooO0o != -9223372036854775807L) {
                for (TrackOutput trackOutput : this.f8942OooO0O0) {
                    trackOutput.OooO0o0(this.f8945OooO0o, 1, this.f8946OooO0o0, 0, null);
                }
            }
            this.f8943OooO0OO = false;
        }
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o(o000OOoO.Oooo0 oooo0, TsPayloadReader.OooO0o oooO0o) {
        int i = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.f8942OooO0O0;
            if (i >= trackOutputArr.length) {
                return;
            }
            TsPayloadReader.OooO00o oooO00o = this.f8941OooO00o.get(i);
            oooO0o.OooO00o();
            oooO0o.OooO0O0();
            TrackOutput trackOutputOooOOOO = oooo0.OooOOOO(oooO0o.f9129OooO0Oo, 3);
            androidx.media3.common.OooOO0.OooO00o oooO00o2 = new androidx.media3.common.OooOO0.OooO00o();
            oooO0o.OooO0O0();
            oooO00o2.f6436OooO00o = oooO0o.f9130OooO0o0;
            oooO00o2.f6445OooOO0O = "application/dvbsubs";
            oooO00o2.f6448OooOOO0 = Collections.singletonList(oooO00o.f9122OooO0O0);
            oooO00o2.f6438OooO0OO = oooO00o.f9121OooO00o;
            trackOutputOooOOOO.OooO0O0(new androidx.media3.common.OooOO0(oooO00o2));
            trackOutputArr[i] = trackOutputOooOOOO;
            i++;
        }
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o0(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.f8943OooO0OO = true;
        if (j != -9223372036854775807L) {
            this.f8945OooO0o = j;
        }
        this.f8946OooO0o0 = 0;
        this.f8944OooO0Oo = 2;
    }
}
