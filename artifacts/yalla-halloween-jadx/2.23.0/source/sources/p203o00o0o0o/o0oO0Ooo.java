package p203o00o0o0o;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.OooO;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.exoplayer2.o0OO00O;
import com.google.android.exoplayer2.o0ooOOo;
import java.util.Map;
import p209o00o0oo0.o00O0OO0;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0oO0Ooo implements OooO.OooO00o, o00O0OO0 {
    @Override // p209o00o0oo0.o00O0OO0
    public final Extractor[] OooO00o(Uri uri, Map map) {
        return OooO0OO();
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public final OooO OooO0O0(Bundle bundle) {
        o00O000o.OooO00o(bundle.getInt(o0ooOOo.f12867OooO0Oo, -1) == 3);
        return bundle.getBoolean(o0OO00O.f12843OooO0oo, false) ? new o0OO00O(bundle.getBoolean(o0OO00O.f12842OooO, false)) : new o0OO00O();
    }

    public final Extractor[] OooO0OO() {
        return new Extractor[]{new AmrExtractor()};
    }
}
