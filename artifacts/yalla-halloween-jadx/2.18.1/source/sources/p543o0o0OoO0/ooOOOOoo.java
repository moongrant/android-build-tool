package p543o0o0OoO0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.ishumei.smantifraud.SmAntiFraud;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p031OoooO.o0000O;
import p168o00Ooo0.OooOOOO;
import p487o0o000oO.o0Oo0oo;
import p497o0o00Oo.OooOOO;
import p497o0o00Oo.OooOOO0;
import p499o0o00OoO.oo0o0Oo;
import p516o0o0O000.o0OoOo0;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class ooOOOOoo {

    public static final class OooO00o implements SmAntiFraud.IServerSmidCallback {
        @Override // com.ishumei.smantifraud.SmAntiFraud.IServerSmidCallback
        public final void onError(int i) {
        }

        @Override // com.ishumei.smantifraud.SmAntiFraud.IServerSmidCallback
        public final void onSuccess(@Nullable String str) {
        }
    }

    public static final void OooO00o() {
        SmAntiFraud.SmOption smOption = new SmAntiFraud.SmOption();
        smOption.setAppId(NewFriendsOld.State_Default);
        SharedUrlManager sharedUrlManager = SharedUrlManager.INSTANCE;
        smOption.setUrl(sharedUrlManager.getSmHost());
        smOption.setConfUrl(sharedUrlManager.getSmHost() + "/v3/cloudconf");
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        oo0o0Oo oo0o0ooOooO0o = OooOOO0.OooO0o();
        Objects.requireNonNull(oo0o0ooOooO0o);
        String strOooO0O0 = o0OoOo0.OooO0O0();
        String strValueOf = String.valueOf(o000O0O0.OooO00o(-30764022603280L).hashCode());
        OooOOO oooOOO = OooOOO.f41176OooO00o;
        String strOooO0O1 = OooOOOO.OooO0O0(strOooO0O0, oo0o0ooOooO0o.OooO0Oo(strValueOf, OooOOO.f41178OooO0OO));
        Intrinsics.checkNotNullExpressionValue(strOooO0O1, o000O0O0.OooO00o(-30845626981904L));
        smOption.setOrganization(strOooO0O1);
        oo0o0Oo oo0o0ooOooO0o2 = OooOOO0.OooO0o();
        Objects.requireNonNull(oo0o0ooOooO0o2);
        String strOooO0O2 = OooOOOO.OooO0O0(o0OoOo0.OooO0O0(), oo0o0ooOooO0o2.OooO0Oo(String.valueOf(o000O0O0.OooO00o(-31322368351760L).hashCode()), OooOOO.f41177OooO0O0));
        Intrinsics.checkNotNullExpressionValue(strOooO0O2, o000O0O0.OooO00o(-31391087828496L));
        smOption.setPublicKey(strOooO0O2);
        smOption.setCheckCrt(false);
        smOption.setCloudConf(false);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("platform", 2);
        p498o0o00Oo0.OooOOO oooOOO2 = p498o0o00Oo0.OooOOO.f41216OooO00o;
        jSONObject.put("id", String.valueOf(oooOOO2.OooOo().getValue()));
        jSONObject.put("idx", String.valueOf(oooOOO2.OooOoO0().getValue()));
        o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
        jSONObject.put("businessDeviceId", o0Oo0oo.OooO00o());
        smOption.setExtraInfo(jSONObject.toString());
        smOption.setServerIdCallback(new OooO00o());
        Context context = o0000O.f2657OooO00o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            context = null;
        }
        SmAntiFraud.create(context, smOption);
    }
}
