package p203o00o0o0o;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.OooO;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.flac.FlacExtractor;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.oo000o;
import java.util.Map;
import p209o00o0oo0.o00O0OO0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O00o00 implements OooO.OooO00o, o00O0OO0, com.google.firebase.components.OooO {
    @Override // p209o00o0oo0.o00O0OO0
    public Extractor[] OooO00o(Uri uri, Map map) {
        return OooO0Oo();
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public OooO OooO0O0(Bundle bundle) {
        int i = bundle.getInt(oo0o0Oo.OooO0O0.f12899OooOO0O, 0);
        long j = bundle.getLong(oo0o0Oo.OooO0O0.f12900OooOO0o, -9223372036854775807L);
        long j2 = bundle.getLong(oo0o0Oo.OooO0O0.f12902OooOOO0, 0L);
        boolean z = bundle.getBoolean(oo0o0Oo.OooO0O0.f12901OooOOO, false);
        Bundle bundle2 = bundle.getBundle(oo0o0Oo.OooO0O0.f12903OooOOOO);
        AdPlaybackState adPlaybackState = bundle2 != null ? (AdPlaybackState) AdPlaybackState.f13131OooOOOo.OooO0O0(bundle2) : AdPlaybackState.f13125OooOO0;
        oo0o0Oo.OooO0O0 oooO0O0 = new oo0o0Oo.OooO0O0();
        oooO0O0.OooOO0(null, null, i, j, j2, adPlaybackState, z);
        return oooO0O0;
    }

    @Override // com.google.firebase.components.OooO
    public Object OooO0OO(oo000o oo000oVar) {
        return AbtRegistrar.lambda$getComponents$0(oo000oVar);
    }

    public Extractor[] OooO0Oo() {
        return new Extractor[]{new FlacExtractor()};
    }
}
