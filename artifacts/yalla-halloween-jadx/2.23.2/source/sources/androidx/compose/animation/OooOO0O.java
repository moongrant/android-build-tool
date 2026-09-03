package androidx.compose.animation;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function2;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements androidx.media3.common.OooO0OO.OooO00o {
    public static boolean OooO00o(int i, Function2 function2, Composer composer) {
        function2.invoke(composer, Integer.valueOf(i));
        return ComposerKt.isTraceInProgress();
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        androidx.media3.common.OooOOO0.OooO0OO.OooO00o oooO00o = new androidx.media3.common.OooOOO0.OooO0OO.OooO00o();
        androidx.media3.common.OooOOO0.OooO0o oooO0o = androidx.media3.common.OooOOO0.OooO0OO.f6531OooO;
        long j = bundle.getLong(androidx.media3.common.OooOOO0.OooO0OO.f6532OooOO0, oooO0o.f6538OooO0Oo);
        boolean z = true;
        o00Oo0.OooO00o(j >= 0);
        oooO00o.f6543OooO00o = j;
        long j2 = bundle.getLong(androidx.media3.common.OooOOO0.OooO0OO.f6533OooOO0O, oooO0o.f6540OooO0o0);
        if (j2 != Long.MIN_VALUE && j2 < 0) {
            z = false;
        }
        o00Oo0.OooO00o(z);
        oooO00o.f6544OooO0O0 = j2;
        oooO00o.f6545OooO0OO = bundle.getBoolean(androidx.media3.common.OooOOO0.OooO0OO.f6534OooOO0o, oooO0o.f6539OooO0o);
        oooO00o.f6546OooO0Oo = bundle.getBoolean(androidx.media3.common.OooOOO0.OooO0OO.f6536OooOOO0, oooO0o.f6541OooO0oO);
        oooO00o.f6547OooO0o0 = bundle.getBoolean(androidx.media3.common.OooOOO0.OooO0OO.f6535OooOOO, oooO0o.f6542OooO0oo);
        return new androidx.media3.common.OooOOO0.OooO0o(oooO00o);
    }
}
