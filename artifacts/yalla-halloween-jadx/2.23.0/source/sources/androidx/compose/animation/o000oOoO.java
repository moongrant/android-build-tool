package androidx.compose.animation;

import android.os.Bundle;
import com.google.android.exoplayer2.o0ooOOo;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements com.google.android.exoplayer2.OooO.OooO00o {
    public static float OooO00o(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public com.google.android.exoplayer2.OooO OooO0O0(Bundle bundle) {
        o00O000o.OooO00o(bundle.getInt(o0ooOOo.f12867OooO0Oo, -1) == 0);
        return bundle.getBoolean(com.google.android.exoplayer2.Oooo000.f11329OooO0oo, false) ? new com.google.android.exoplayer2.Oooo000(bundle.getBoolean(com.google.android.exoplayer2.Oooo000.f11328OooO, false)) : new com.google.android.exoplayer2.Oooo000();
    }
}
