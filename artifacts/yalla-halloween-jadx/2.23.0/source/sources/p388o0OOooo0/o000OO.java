package p388o0OOooo0;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o0000OO0;
import kotlin.jvm.internal.Intrinsics;
import p101o000oo.Oooo000;
import p145o00Oo0O.o000oOoO;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00000O0;
import p409o0Oo0o0o.o000OOo;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OO extends o000oOoO {
    @Override // p145o00Oo0O.o000oOoO
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        String key = Oooo000.OooO00o("nextShowSendRewardDialog", o000000O.OooOOo0().getValue());
        o000OOo o000oooOooO0o = o00Oo0.OooO0o();
        o000oooOooO0o.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        if (o000oooOooO0o.f47687OooO00o.contains(key)) {
            o00Oo0.OooO().OooOOO0(o00Oo0.OooO0o().OooO0O0(key, false));
            o00Oo0.OooO0o().OooOO0(key);
        }
        SharedPreferences sharedPreferences = o0000OO0.OooO0O0().f47688OooO00o;
        if (sharedPreferences != null ? sharedPreferences.contains("FIRST_POST_SEND_GIFT_INFO") : false) {
            o00000O0 o00000o0OooO = o00Oo0.OooO();
            boolean z = !o0000OO0.OooO0O0().OooO0O0("FIRST_POST_SEND_GIFT_INFO", true);
            o00000o0OooO.getClass();
            o00000o0OooO.OooO0o("momentFirstSendGiftInfo" + o000000O.OooOOo0().getValue(), z);
            SharedPreferences.Editor editor = o0000OO0.OooO0O0().f47689OooO0O0;
            if (editor == null) {
                return;
            }
            editor.remove("FIRST_POST_SEND_GIFT_INFO").commit();
        }
    }
}
