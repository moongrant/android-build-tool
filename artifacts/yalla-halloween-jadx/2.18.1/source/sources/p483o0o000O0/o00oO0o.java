package p483o0o000O0;

import OooO00o.OooO00o;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o00000O;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p252o00ooO0.o000000O;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p499o0o00OoO.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00oO0o extends o000000O {
    @Override // p252o00ooO0.o000000O
    @Nullable
    public final List<Class<? extends o000000O>> OooO00o() {
        return CollectionsKt.listOf(OooOO0.class);
    }

    @Override // p252o00ooO0.o000000O
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("nextShowSendRewardDialog");
        sbOooO0o0.append(OooOOO.f41216OooO00o.OooOo().getValue());
        String key = sbOooO0o0.toString();
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        oo0o0Oo oo0o0ooOooO0o = OooOOO0.OooO0o();
        Objects.requireNonNull(oo0o0ooOooO0o);
        Intrinsics.checkNotNullParameter(key, "key");
        if (oo0o0ooOooO0o.f32553OooO00o.contains(key)) {
            OooOOO0.OooO().OooOOO0(OooOOO0.OooO0o().OooO00o(key, false));
            OooOOO0.OooO0o().OooOO0(key);
        }
        SharedPreferences sharedPreferences = o00000O.OooO0O0().f32554OooO00o;
        if (sharedPreferences != null ? sharedPreferences.contains("FIRST_POST_SEND_GIFT_INFO") : false) {
            OooOOO0.OooO().OooOO0o(!o00000O.OooO0O0().OooO0Oo("FIRST_POST_SEND_GIFT_INFO", true));
            SharedPreferences.Editor editor = o00000O.OooO0O0().f32555OooO0O0;
            if (editor == null) {
                return;
            }
            editor.remove("FIRST_POST_SEND_GIFT_INFO").commit();
        }
    }
}
