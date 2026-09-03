package androidx.compose.ui.graphics.colorspace;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.oo0o0Oo;
import java.util.Map;
import p175o00o.OooOo;
import p209o00o0oo0.o00O0OO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO implements DoubleFunction, com.google.android.exoplayer2.OooO.OooO00o, o00O0OO0 {
    @Override // p209o00o0oo0.o00O0OO0
    public final Extractor[] OooO00o(Uri uri, Map map) {
        return OooO0OO();
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public final com.google.android.exoplayer2.OooO OooO0O0(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(oo0o0Oo.OooO0OO.f12911OooOo);
        o000oOoO o000oooo2 = bundle2 != null ? (o000oOoO) o000oOoO.f12666OooOOo0.OooO0O0(bundle2) : o000oOoO.f12659OooOO0;
        long j = bundle.getLong(oo0o0Oo.OooO0OO.f12916OooOoO0, -9223372036854775807L);
        long j2 = bundle.getLong(oo0o0Oo.OooO0OO.f12915OooOoO, -9223372036854775807L);
        long j3 = bundle.getLong(oo0o0Oo.OooO0OO.f12917OooOoOO, -9223372036854775807L);
        boolean z = bundle.getBoolean(oo0o0Oo.OooO0OO.f12919OooOoo0, false);
        boolean z2 = bundle.getBoolean(oo0o0Oo.OooO0OO.f12918OooOoo, false);
        Bundle bundle3 = bundle.getBundle(oo0o0Oo.OooO0OO.f12920OooOooO);
        o000oOoO.OooOO0 oooOO1 = bundle3 != null ? (o000oOoO.OooOO0) o000oOoO.OooOO0.f12739OooOOOO.OooO0O0(bundle3) : null;
        boolean z3 = bundle.getBoolean(oo0o0Oo.OooO0OO.f12921OooOooo, false);
        long j4 = bundle.getLong(oo0o0Oo.OooO0OO.f12923Oooo000, 0L);
        long j5 = bundle.getLong(oo0o0Oo.OooO0OO.f12924Oooo00O, -9223372036854775807L);
        int i = bundle.getInt(oo0o0Oo.OooO0OO.f12925Oooo00o, 0);
        int i2 = bundle.getInt(oo0o0Oo.OooO0OO.f12922Oooo0, 0);
        long j6 = bundle.getLong(oo0o0Oo.OooO0OO.f12926Oooo0O0, 0L);
        oo0o0Oo.OooO0OO oooO0OO = new oo0o0Oo.OooO0OO();
        oooO0OO.OooO0O0(oo0o0Oo.OooO0OO.f12913OooOo0O, o000oooo2, null, j, j2, j3, z, z2, oooOO1, j4, j5, i, i2, j6);
        oooO0OO.f12938OooOOOO = z3;
        return oooO0OO;
    }

    public final Extractor[] OooO0OO() {
        return new Extractor[]{new OooOo()};
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb.DoubleIdentity$lambda$12(d);
    }
}
