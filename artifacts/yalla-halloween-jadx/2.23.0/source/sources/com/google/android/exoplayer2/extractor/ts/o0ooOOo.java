package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.TrackOutput;
import java.util.List;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<com.google.android.exoplayer2.OooOo> f12411OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TrackOutput[] f12412OooO0O0;

    public o0ooOOo(List<com.google.android.exoplayer2.OooOo> list) {
        this.f12411OooO00o = list;
        this.f12412OooO0O0 = new TrackOutput[list.size()];
    }

    public final void OooO00o(long j, o00Oo00 o00oo00) {
        if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 < 9) {
            return;
        }
        int iOooO0o = o00oo00.OooO0o();
        int iOooO0o2 = o00oo00.OooO0o();
        int iOooOo0O = o00oo00.OooOo0O();
        if (iOooO0o == 434 && iOooO0o2 == 1195456820 && iOooOo0O == 3) {
            com.google.android.exoplayer2.extractor.OooO00o.OooO0O0(j, o00oo00, this.f12412OooO0O0);
        }
    }

    public final void OooO0O0(o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        int i = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.f12412OooO0O0;
            if (i >= trackOutputArr.length) {
                return;
            }
            oooO0o.OooO00o();
            oooO0o.OooO0O0();
            TrackOutput trackOutputOooOOO = o00o0o0.OooOOO(oooO0o.f12362OooO0Oo, 3);
            com.google.android.exoplayer2.OooOo oooOo = this.f12411OooO00o.get(i);
            String str = oooOo.f11211OooOOOO;
            o00O000o.OooO0O0("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
            oooO0o.OooO0O0();
            oooO00o.f11235OooO00o = oooO0o.f12363OooO0o0;
            oooO00o.f11244OooOO0O = str;
            oooO00o.f11238OooO0Oo = oooOo.f11204OooO0oO;
            oooO00o.f11237OooO0OO = oooOo.f11202OooO0o;
            oooO00o.f11261OooOoo = oooOo.f11230Oooo00O;
            oooO00o.f11247OooOOO0 = oooOo.f11214OooOOo0;
            trackOutputOooOOO.OooO0OO(new com.google.android.exoplayer2.OooOo(oooO00o));
            trackOutputArr[i] = trackOutputOooOOO;
            i++;
        }
    }
}
