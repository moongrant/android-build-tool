package p172o00OooOo;

import android.os.Bundle;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentManager;
import com.google.android.exoplayer2.OooO;
import com.google.android.exoplayer2.o000oOoO;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000OO0O implements FeatureManager.Callback, OooO.OooO00o {
    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public final OooO OooO0O0(Bundle bundle) {
        o000oOoO.OooO0OO.OooO00o oooO00o = new o000oOoO.OooO0OO.OooO00o();
        o000oOoO.OooO0o oooO0o = o000oOoO.OooO0OO.f12715OooO;
        long j = bundle.getLong(o000oOoO.OooO0OO.f12716OooOO0, oooO0o.f12722OooO0Oo);
        boolean z = true;
        o00O000o.OooO00o(j >= 0);
        oooO00o.f12727OooO00o = j;
        long j2 = bundle.getLong(o000oOoO.OooO0OO.f12717OooOO0O, oooO0o.f12724OooO0o0);
        if (j2 != Long.MIN_VALUE && j2 < 0) {
            z = false;
        }
        o00O000o.OooO00o(z);
        oooO00o.f12728OooO0O0 = j2;
        oooO00o.f12729OooO0OO = bundle.getBoolean(o000oOoO.OooO0OO.f12718OooOO0o, oooO0o.f12723OooO0o);
        oooO00o.f12730OooO0Oo = bundle.getBoolean(o000oOoO.OooO0OO.f12720OooOOO0, oooO0o.f12725OooO0oO);
        oooO00o.f12731OooO0o0 = bundle.getBoolean(o000oOoO.OooO0OO.f12719OooOOO, oooO0o.f12726OooO0oo);
        return new o000oOoO.OooO0o(oooO00o);
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        InstrumentManager.m4147start$lambda0(z);
    }
}
