package androidx.media3.session;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.Dp;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00O0O0 implements androidx.media3.common.OooO0OO.OooO00o {
    public static Modifier OooO00o(float f, Modifier modifier) {
        return ClipKt.clip(modifier, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f)));
    }

    public static String OooO0O0(String str, Object obj) {
        return str + obj;
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        int i = bundle.getInt(SessionResult.f9272OooO0oO, -1);
        Bundle bundle2 = bundle.getBundle(SessionResult.f9273OooO0oo);
        long j = bundle.getLong(SessionResult.f9271OooO, SystemClock.elapsedRealtime());
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new SessionResult(bundle2, i, j);
    }
}
