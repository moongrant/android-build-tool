package p396o0Oo00o0;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.session.o00O0O0;
import kotlin.jvm.internal.Intrinsics;
import p191o00o0O0.o00Oo0;
import p269o00oooo0.o0O0oo0o;
import p414o0Oo0oO.oO000Oo0;
import p414o0Oo0oO.oO00O0o0;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oo0o0Oo extends o00Oo0 {
    @Override // p191o00o0O0.o00Oo0
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        String key = o00O0O0.OooO0O0("nextShowSendRewardDialog", o0O00oO0.OooOOo0().getValue());
        oO000Oo0 oo000oo0OooO0o = o00Ooo.OooO0o();
        oo000oo0OooO0o.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        if (oo000oo0OooO0o.f48376OooO00o.contains(key)) {
            o00Ooo.OooO().OooOOO0(o00Ooo.OooO0o().OooO0O0(key, false));
            o00Ooo.OooO0o().OooOO0(key);
        }
        SharedPreferences sharedPreferences = o0O0oo0o.OooO00o().f48377OooO00o;
        if (sharedPreferences != null ? sharedPreferences.contains("FIRST_POST_SEND_GIFT_INFO") : false) {
            oO00O0o0 oo00o0o0OooO = o00Ooo.OooO();
            boolean z = !o0O0oo0o.OooO00o().OooO0O0("FIRST_POST_SEND_GIFT_INFO", true);
            oo00o0o0OooO.getClass();
            oo00o0o0OooO.OooO0o("momentFirstSendGiftInfo" + o0O00oO0.OooOOo0().getValue(), z);
            SharedPreferences.Editor editor = o0O0oo0o.OooO00o().f48378OooO0O0;
            if (editor == null) {
                return;
            }
            editor.remove("FIRST_POST_SEND_GIFT_INFO").commit();
        }
    }
}
