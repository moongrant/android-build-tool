package androidx.media3.extractor.ts;

import androidx.media3.extractor.TrackOutput;
import java.util.List;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<androidx.media3.common.OooOO0> f9178OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TrackOutput[] f9179OooO0O0;

    public o0ooOOo(List<androidx.media3.common.OooOO0> list) {
        this.f9178OooO00o = list;
        this.f9179OooO0O0 = new TrackOutput[list.size()];
    }

    public final void OooO00o(long j, o000O000 o000o001) {
        if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 < 9) {
            return;
        }
        int iOooO0o = o000o001.OooO0o();
        int iOooO0o2 = o000o001.OooO0o();
        int iOooOo0O = o000o001.OooOo0O();
        if (iOooO0o == 434 && iOooO0o2 == 1195456820 && iOooOo0O == 3) {
            androidx.media3.extractor.OooO00o.OooO0O0(j, o000o001, this.f9179OooO0O0);
        }
    }

    public final void OooO0O0(o000OOoO.Oooo0 oooo0, TsPayloadReader.OooO0o oooO0o) {
        int i = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.f9179OooO0O0;
            if (i >= trackOutputArr.length) {
                return;
            }
            oooO0o.OooO00o();
            oooO0o.OooO0O0();
            TrackOutput trackOutputOooOOOO = oooo0.OooOOOO(oooO0o.f9129OooO0Oo, 3);
            androidx.media3.common.OooOO0 oooOO1 = this.f9178OooO00o.get(i);
            String str = oooOO1.f6412OooOOOO;
            p080o000OoO.o00Oo0.OooO0O0("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o();
            oooO0o.OooO0O0();
            oooO00o.f6436OooO00o = oooO0o.f9130OooO0o0;
            oooO00o.f6445OooOO0O = str;
            oooO00o.f6439OooO0Oo = oooOO1.f6405OooO0oO;
            oooO00o.f6438OooO0OO = oooOO1.f6403OooO0o;
            oooO00o.f6462OooOoo = oooOO1.f6431Oooo00O;
            oooO00o.f6448OooOOO0 = oooOO1.f6415OooOOo0;
            trackOutputOooOOOO.OooO0O0(new androidx.media3.common.OooOO0(oooO00o));
            trackOutputArr[i] = trackOutputOooOOOO;
            i++;
        }
    }
}
