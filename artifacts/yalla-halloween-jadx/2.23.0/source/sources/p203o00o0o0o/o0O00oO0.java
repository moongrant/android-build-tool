package p203o00o0o0o;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.OooO;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.o0O0O00;
import com.google.common.base.OooOo;
import com.google.firebase.components.oo000o;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Map;
import p209o00o0oo0.o00O0OO0;
import p226o00oOo00.o000O00;
import p226o00oOo00.o000O00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O00oO0 implements OooO.OooO00o, o00O0OO0, com.google.firebase.components.OooO {
    @Override // p209o00o0oo0.o00O0OO0
    public Extractor[] OooO00o(Uri uri, Map map) {
        return OooO0Oo();
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public OooO OooO0O0(Bundle bundle) {
        o000O00 o000o01 = o000O00O.f39872OooOO0O;
        Bundle bundle2 = bundle.getBundle(o0O0O00.OooO00o.f12833OooO);
        bundle2.getClass();
        o000O00O o000o00o2 = (o000O00O) o000o01.OooO0O0(bundle2);
        return new o0O0O00.OooO00o(o000o00o2, bundle.getBoolean(o0O0O00.OooO00o.f12836OooOO0o, false), (int[]) OooOo.OooO00o(bundle.getIntArray(o0O0O00.OooO00o.f12834OooOO0), new int[o000o00o2.f39873OooO0Oo]), (boolean[]) OooOo.OooO00o(bundle.getBooleanArray(o0O0O00.OooO00o.f12835OooOO0O), new boolean[o000o00o2.f39873OooO0Oo]));
    }

    @Override // com.google.firebase.components.OooO
    public Object OooO0OO(oo000o oo000oVar) {
        return ExecutorsRegistrar.f19854OooO00o.get();
    }

    public Extractor[] OooO0Oo() {
        return new Extractor[]{new Mp3Extractor()};
    }
}
