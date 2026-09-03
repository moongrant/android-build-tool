package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.util.List;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<Format> f14339OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TrackOutput[] f14340OooO0O0;

    public o00oO0o(List<Format> list) {
        this.f14339OooO00o = list;
        this.f14340OooO0O0 = new TrackOutput[list.size()];
    }

    public final void OooO00o(long j, o000 o000Var) {
        com.google.android.exoplayer2.extractor.OooO00o.OooO00o(j, o000Var, this.f14340OooO0O0);
    }

    public final void OooO0O0(p296o0O0OoO0.o0OoOo0 o0oooo1, TsPayloadReader.OooO0o oooO0o) {
        for (int i = 0; i < this.f14340OooO0O0.length; i++) {
            oooO0o.OooO00o();
            TrackOutput trackOutputOooO00o = o0oooo1.OooO00o(oooO0o.OooO0OO());
            Format format = this.f14339OooO00o.get(i);
            String str = format.f13131OoooOOo;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String strValueOf = String.valueOf(str);
            o00000O0.OooO0O0(z, strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "));
            String strOooO0O0 = format.f13122Oooo0o;
            if (strOooO0O0 == null) {
                strOooO0O0 = oooO0o.OooO0O0();
            }
            Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
            oooO0O0.f13154OooO00o = strOooO0O0;
            oooO0O0.f13163OooOO0O = str;
            oooO0O0.f13157OooO0Oo = format.f13121Oooo;
            oooO0O0.f13156OooO0OO = format.f13124Oooo0oo;
            oooO0O0.f13180OooOoo = format.f13148o00o0O;
            oooO0O0.f13166OooOOO0 = format.f13133OoooOoO;
            trackOutputOooO00o.OooO0o0(new Format(oooO0O0));
            this.f14340OooO0O0[i] = trackOutputOooO00o;
        }
    }
}
