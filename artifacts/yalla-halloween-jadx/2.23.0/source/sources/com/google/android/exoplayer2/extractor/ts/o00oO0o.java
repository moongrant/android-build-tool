package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.TrackOutput;
import java.util.List;
import p209o00o0oo0.o00O0O0;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<com.google.android.exoplayer2.OooOo> f12406OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TrackOutput[] f12407OooO0O0;

    public o00oO0o(List<com.google.android.exoplayer2.OooOo> list) {
        this.f12406OooO00o = list;
        this.f12407OooO0O0 = new TrackOutput[list.size()];
    }

    public final void OooO00o(o00O0O0 o00o0o0, TsPayloadReader.OooO0o oooO0o) {
        int i = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.f12407OooO0O0;
            if (i >= trackOutputArr.length) {
                return;
            }
            oooO0o.OooO00o();
            oooO0o.OooO0O0();
            TrackOutput trackOutputOooOOO = o00o0o0.OooOOO(oooO0o.f12362OooO0Oo, 3);
            com.google.android.exoplayer2.OooOo oooOo = this.f12406OooO00o.get(i);
            String str = oooOo.f11211OooOOOO;
            o00O000o.OooO0O0("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String str2 = oooOo.f11201OooO0Oo;
            if (str2 == null) {
                oooO0o.OooO0O0();
                str2 = oooO0o.f12363OooO0o0;
            }
            com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
            oooO00o.f11235OooO00o = str2;
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
