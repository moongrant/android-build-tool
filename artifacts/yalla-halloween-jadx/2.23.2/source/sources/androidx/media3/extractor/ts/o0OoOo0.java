package androidx.media3.extractor.ts;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0OoOo0 implements o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public androidx.media3.common.OooOO0 f9175OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o000O0Oo f9176OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TrackOutput f9177OooO0OO;

    public o0OoOo0(String str) {
        androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o();
        oooO00o.f6445OooOO0O = str;
        this.f9175OooO00o = new androidx.media3.common.OooOO0(oooO00o);
    }

    @Override // androidx.media3.extractor.ts.o00Ooo
    public final void OooO00o(o000O0Oo o000o0oo2, o000OOoO.Oooo0 oooo0, TsPayloadReader.OooO0o oooO0o) {
        this.f9176OooO0O0 = o000o0oo2;
        oooO0o.OooO00o();
        oooO0o.OooO0O0();
        TrackOutput trackOutputOooOOOO = oooo0.OooOOOO(oooO0o.f9129OooO0Oo, 5);
        this.f9177OooO0OO = trackOutputOooOOOO;
        trackOutputOooOOOO.OooO0O0(this.f9175OooO00o);
    }

    @Override // androidx.media3.extractor.ts.o00Ooo
    public final void OooO0OO(o000O000 o000o001) {
        long jOooO0OO;
        p080o000OoO.o00Oo0.OooO0o(this.f9176OooO0O0);
        int i = o00.f34910OooO00o;
        o000O0Oo o000o0oo2 = this.f9176OooO0O0;
        synchronized (o000o0oo2) {
            long j = o000o0oo2.f34970OooO0OO;
            jOooO0OO = j != -9223372036854775807L ? j + o000o0oo2.f34969OooO0O0 : o000o0oo2.OooO0OO();
        }
        long jOooO0Oo = this.f9176OooO0O0.OooO0Oo();
        if (jOooO0OO == -9223372036854775807L || jOooO0Oo == -9223372036854775807L) {
            return;
        }
        androidx.media3.common.OooOO0 oooOO1 = this.f9175OooO00o;
        if (jOooO0Oo != oooOO1.f6416OooOOoo) {
            androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o(oooOO1);
            oooO00o.f6449OooOOOO = jOooO0Oo;
            androidx.media3.common.OooOO0 oooOO2 = new androidx.media3.common.OooOO0(oooO00o);
            this.f9175OooO00o = oooOO2;
            this.f9177OooO0OO.OooO0O0(oooOO2);
        }
        int i2 = o000o001.f34964OooO0OO - o000o001.f34963OooO0O0;
        this.f9177OooO0OO.OooO0OO(i2, o000o001);
        this.f9177OooO0OO.OooO0o0(jOooO0OO, 1, i2, 0, null);
    }
}
