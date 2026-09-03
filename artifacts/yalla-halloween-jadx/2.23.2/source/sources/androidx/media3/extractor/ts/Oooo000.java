package androidx.media3.extractor.ts;

import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class Oooo000 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public TrackOutput f9093OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f9094OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f9096OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f9097OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O000 f9092OooO00o = new o000O000(10);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f9095OooO0Oo = -9223372036854775807L;

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0O0() {
        this.f9094OooO0OO = false;
        this.f9095OooO0Oo = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0OO(o000O000 o000o001) {
        p080o000OoO.o00Oo0.OooO0o(this.f9093OooO0O0);
        if (this.f9094OooO0OO) {
            int i = o000o001.f34964OooO0OO - o000o001.f34963OooO0O0;
            int i2 = this.f9096OooO0o;
            if (i2 < 10) {
                int iMin = Math.min(i, 10 - i2);
                byte[] bArr = o000o001.f34962OooO00o;
                int i3 = o000o001.f34963OooO0O0;
                o000O000 o000o002 = this.f9092OooO00o;
                System.arraycopy(bArr, i3, o000o002.f34962OooO00o, this.f9096OooO0o, iMin);
                if (this.f9096OooO0o + iMin == 10) {
                    o000o002.Oooo00O(0);
                    if (73 != o000o002.OooOo0O() || 68 != o000o002.OooOo0O() || 51 != o000o002.OooOo0O()) {
                        Log.OooO0o("Id3Reader", "Discarding invalid ID3 tag");
                        this.f9094OooO0OO = false;
                        return;
                    } else {
                        o000o002.Oooo00o(3);
                        this.f9097OooO0o0 = o000o002.OooOo0() + 10;
                    }
                }
            }
            int iMin2 = Math.min(i, this.f9097OooO0o0 - this.f9096OooO0o);
            this.f9093OooO0O0.OooO0OO(iMin2, o000o001);
            this.f9096OooO0o += iMin2;
        }
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0Oo() {
        int i;
        p080o000OoO.o00Oo0.OooO0o(this.f9093OooO0O0);
        if (this.f9094OooO0OO && (i = this.f9097OooO0o0) != 0 && this.f9096OooO0o == i) {
            long j = this.f9095OooO0Oo;
            if (j != -9223372036854775807L) {
                this.f9093OooO0O0.OooO0o0(j, 1, i, 0, null);
            }
            this.f9094OooO0OO = false;
        }
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o(o000OOoO.Oooo0 oooo0, TsPayloadReader.OooO0o oooO0o) {
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        TrackOutput trackOutputOooOOOO = oooo0.OooOOOO(oooO0o.f9129OooO0Oo, 5);
        this.f9093OooO0O0 = trackOutputOooOOOO;
        androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o();
        oooO0o.OooO0O0();
        oooO00o.f6436OooO00o = oooO0o.f9130OooO0o0;
        oooO00o.f6445OooOO0O = "application/id3";
        trackOutputOooOOOO.OooO0O0(new androidx.media3.common.OooOO0(oooO00o));
    }

    @Override // androidx.media3.extractor.ts.OooOOO0
    public final void OooO0o0(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.f9094OooO0OO = true;
        if (j != -9223372036854775807L) {
            this.f9095OooO0Oo = j;
        }
        this.f9097OooO0o0 = 0;
        this.f9096OooO0o = 0;
    }
}
