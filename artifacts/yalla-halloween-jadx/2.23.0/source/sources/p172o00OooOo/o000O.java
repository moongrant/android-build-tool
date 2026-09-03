package p172o00OooOo;

import android.os.Bundle;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentManager;
import com.google.android.exoplayer2.OooO;
import com.google.android.exoplayer2.drm.OooO0O0;
import com.google.android.exoplayer2.o000oOoO;
import p245o00oo0o.o00O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O implements FeatureManager.Callback, OooO.OooO00o, o00O0O00 {
    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public final OooO OooO0O0(Bundle bundle) {
        return new o000oOoO.OooOO0(bundle.getLong(o000oOoO.OooOO0.f12734OooOO0, -9223372036854775807L), bundle.getLong(o000oOoO.OooOO0.f12735OooOO0O, -9223372036854775807L), bundle.getLong(o000oOoO.OooOO0.f12736OooOO0o, -9223372036854775807L), bundle.getFloat(o000oOoO.OooOO0.f12738OooOOO0, -3.4028235E38f), bundle.getFloat(o000oOoO.OooOO0.f12737OooOOO, -3.4028235E38f));
    }

    @Override // p245o00oo0o.o00O0O00
    public final void accept(Object obj) {
        ((OooO0O0.OooO00o) obj).OooO0O0();
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        InstrumentManager.m4149start$lambda2(z);
    }
}
