package androidx.media3.session;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.Player;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00O0 implements androidx.media3.common.OooO0OO.OooO00o, o0O0Oo.OooO0O0.OooO00o {
    public static Modifier OooO00o(float f, Modifier.Companion companion, Composer composer, int i) {
        Modifier modifierM525size3ABfNKs = SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f));
        composer.startReplaceableGroup(i);
        return modifierM525size3ABfNKs;
    }

    @Override // o0O0Oo.OooO0O0.OooO00o
    public Object OooO0O0(JsonReader jsonReader) {
        return p288o0O0Oo.OooO0O0.OooO00o(jsonReader);
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(o00O0O00.f9435OooOOOo);
        return new o00O0O00(bundle2 == null ? o00O0O00.f9433OooOOO : (Player.OooO0o) Player.OooO0o.f6714OooOo00.OooO0OO(bundle2), bundle.getBoolean(o00O0O00.f9437OooOOo0, false), bundle.getLong(o00O0O00.f9436OooOOo, -9223372036854775807L), bundle.getLong(o00O0O00.f9438OooOOoo, -9223372036854775807L), bundle.getLong(o00O0O00.f9441OooOo00, 0L), bundle.getInt(o00O0O00.f9440OooOo0, 0), bundle.getLong(o00O0O00.f9442OooOo0O, 0L), bundle.getLong(o00O0O00.f9443OooOo0o, -9223372036854775807L), bundle.getLong(o00O0O00.f9439OooOo, -9223372036854775807L), bundle.getLong(o00O0O00.f9445OooOoO0, 0L));
    }
}
