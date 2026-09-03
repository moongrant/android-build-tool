package p002OooO0Oo;

import OooO0O0.OooO00o;
import OooO0O0.OooO0o;
import OooO0O0.OooOOO;
import OooO0O0.OooOOO0;
import OooO0O0.OooOo00;
import android.os.Bundle;
import android.util.Log;
import com.facebook.share.internal.ShareConstants;
import com.qiniu.android.http.ResponseInfo;
import com.yallatech.support.platform.YCSDKOpenKit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003OooO0o0.o00Oo0;
import p003OooO0o0.o0Oo0oo;
import p003OooO0o0.oo000o;
import p609o0oo0OOO.h5;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends oo000o implements OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOOO f113OooO0O0;

    public OooOo(@NotNull OooOOO baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        this.f113OooO0O0 = baseClient;
    }

    @Override // OooO0O0.OooO00o
    public final void OooO00o(@Nullable OooOOO oooOOO) {
        OooOOO oooOOO2 = this.f113OooO0O0;
        if (oooOOO == null) {
            oooOOO2.OooO0Oo(oooOOO2.OooO00o(ResponseInfo.NetworkSlow, "Conversation Canceled"));
            return;
        }
        Bundle bundle = oooOOO.f102OooO0OO;
        if (bundle == null) {
            oooOOO2.OooO0Oo(oooOOO2.OooO00o(-2002, "Request send success, but we received a null bundle"));
            Intrinsics.checkNotNullParameter("Request send success, but we received a null bundle", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            if (h5.f57416OooO0O0) {
                Log.d(h5.f57415OooO00o, "Request send success, but we received a null bundle");
                return;
            }
            return;
        }
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        int i = bundle.getInt("yp_biz_response_code");
        String string = bundle.getString("yp_biz_response_msg");
        if (string == null) {
            string = "";
        }
        Pair pair = new Pair(Integer.valueOf(i), string);
        oooOOO2.OooO0Oo(oooOOO2.OooO00o(((Number) pair.getFirst()).intValue(), (String) pair.getSecond()));
    }

    @Override // OooO0O0.OooO00o
    public final void OooO0O0(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        OooOOO oooOOO = this.f113OooO0O0;
        oooOOO.OooO0Oo(oooOOO.OooO00o(-2002, message));
    }

    @Override // OooO0O0.OooO00o
    public final void OooO0OO(@NotNull OooOOO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i = data.f101OooO0O0;
        OooOOO oooOOO = this.f113OooO0O0;
        if (i != 6) {
            oooOOO.OooO0Oo(oooOOO.OooO00o(-2002, null));
            return;
        }
        if (data.f102OooO0OO != null) {
            oooOOO.OooO0Oo(oooOOO.OooO00o(0, null));
            return;
        }
        oooOOO.OooO0Oo(oooOOO.OooO00o(-2002, "Request send success, but we received a null bundle"));
        Intrinsics.checkNotNullParameter("Request send success, but we received a null bundle", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        if (h5.f57416OooO0O0) {
            Log.d(h5.f57415OooO00o, "Request send success, but we received a null bundle");
        }
    }

    public final void OooO0o(OooO0o oooO0o) {
        OooOOO oooOOO = this.f113OooO0O0;
        try {
            o00Oo0.OooO00o oooO00o = oooOOO.f134OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO00o();
            }
            OooOOO0 oooOOO0 = oooOOO.f131OooO0o;
            oooOOO0.getClass();
            Intrinsics.checkNotNullParameter(this, "bizClient");
            oooOOO0.f105OooO0OO = this;
            OooOOO0 oooOOO1 = oooOOO.f131OooO0o;
            Bundle bundleOooO0oO = OooO0oO();
            o0Oo0oo o0oo0oo2 = oooOOO.f130OooO0Oo;
            oooOOO1.OooO0O0(oooO0o, 6, bundleOooO0oO, o0oo0oo2 == null ? null : o0oo0oo2.f142OooO0O0);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "launch yallachatsdk exception";
            }
            oooOOO.OooO0Oo(oooOOO.OooO00o(-2002, message));
        }
    }

    @Override // p003OooO0o0.oo000o
    public final void OooO0o0() {
        Unit unit;
        OooOo00 oooOo00;
        OooOOO oooOOO = this.f113OooO0O0;
        o0Oo0oo o0oo0oo2 = oooOOO.f130OooO0Oo;
        if (o0oo0oo2 == null || (oooOo00 = o0oo0oo2.f141OooO00o) == null) {
            unit = null;
        } else {
            if (oo000o.OooO0Oo()) {
                YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new OooOOO0(0, this, oooOo00));
            } else {
                OooO0o(oooOo00);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            oooOOO.OooO0Oo(oooOOO.OooO00o(-2002, null));
        }
    }

    public final Bundle OooO0oO() {
        OooOOO oooOOO = this.f113OooO0O0;
        if (oooOOO.OooO0oO() == null) {
            return new Bundle();
        }
        OooOo00 oooOo00OooO = oooOOO.OooO0oO();
        Intrinsics.checkNotNull(oooOo00OooO);
        String access_token = oooOo00OooO.f114OooO0OO.getAccess_token();
        if (access_token == null) {
            access_token = "";
        }
        OooOo00 oooOo00OooO2 = oooOOO.OooO0oO();
        Intrinsics.checkNotNull(oooOo00OooO2);
        String open_id = oooOo00OooO2.f114OooO0OO.getOpen_id();
        if (open_id == null) {
            open_id = "";
        }
        OooOo00 oooOo00OooO3 = oooOOO.OooO0oO();
        Intrinsics.checkNotNull(oooOo00OooO3);
        String target_open_id = oooOo00OooO3.f114OooO0OO.getTarget_open_id();
        if (target_open_id == null) {
            target_open_id = "";
        }
        OooOo00 oooOo00OooO4 = oooOOO.OooO0oO();
        Intrinsics.checkNotNull(oooOo00OooO4);
        String third_party_nick_name = oooOo00OooO4.f114OooO0OO.getThird_party_nick_name();
        if (third_party_nick_name == null) {
            third_party_nick_name = "";
        }
        OooOo00 oooOo00OooO5 = oooOOO.OooO0oO();
        Intrinsics.checkNotNull(oooOo00OooO5);
        String target_third_party_nick_name = oooOo00OooO5.f114OooO0OO.getTarget_third_party_nick_name();
        String target_third_party_nick_name2 = target_third_party_nick_name != null ? target_third_party_nick_name : "";
        Intrinsics.checkNotNullParameter(access_token, "access_token");
        Intrinsics.checkNotNullParameter(open_id, "open_id");
        Intrinsics.checkNotNullParameter(target_open_id, "target_open_id");
        Intrinsics.checkNotNullParameter(third_party_nick_name, "third_party_nick_name");
        Intrinsics.checkNotNullParameter(target_third_party_nick_name2, "target_third_party_nick_name");
        Bundle bundle = new Bundle();
        bundle.putString("yp_accesstoken", access_token);
        bundle.putString("yp_open_id", open_id);
        bundle.putString("yp_target_open_id", target_open_id);
        bundle.putString("yp_third_party_nick_name", third_party_nick_name);
        bundle.putString("yp_target_third_party_nick_name", target_third_party_nick_name2);
        return bundle;
    }
}
