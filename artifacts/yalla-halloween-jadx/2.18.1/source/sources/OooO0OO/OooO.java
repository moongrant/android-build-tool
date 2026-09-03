package OooO0OO;

import OooO00o.OooOOO;
import OooO00o.OooOOOO;
import OooO00o.OooOo;
import android.os.Bundle;
import android.util.Log;
import com.facebook.share.internal.ShareConstants;
import com.qiniu.android.http.ResponseInfo;
import com.yallatech.support.platform.YCSDKOpenKit;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003OooO0Oo.OooOo00;
import p003OooO0Oo.Oooo000;
import p003OooO0Oo.o00O0O;
import p625o0oo0oo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends Oooo000 implements OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public OooO0O0 f90OooO0O0;

    public OooO(@NotNull OooO0O0 baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        this.f90OooO0O0 = baseClient;
    }

    @Override // OooO00o.OooO0O0
    public final void OooO00o(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        OooO0O0 oooO0O0 = this.f90OooO0O0;
        oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, message));
    }

    @Override // OooO00o.OooO0O0
    public final void OooO0O0(@Nullable OooOOOO oooOOOO) {
        if (oooOOOO == null) {
            OooO0O0 oooO0O0 = this.f90OooO0O0;
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(ResponseInfo.NetworkSlow, "Conversation Canceled"));
            return;
        }
        Bundle bundle = oooOOOO.f85OooO0OO;
        if (bundle == null) {
            OooO0O0 oooO0O1 = this.f90OooO0O0;
            oooO0O1.OooO0Oo(oooO0O1.OooO00o(-2002, "Request send success, but we received a null bundle"));
            Intrinsics.checkNotNullParameter("Request send success, but we received a null bundle", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            if (o000OO0O.f48670OooO0O0) {
                Log.d(o000OO0O.f48669OooO00o, "Request send success, but we received a null bundle");
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
        OooO0O0 oooO0O2 = this.f90OooO0O0;
        oooO0O2.OooO0Oo(oooO0O2.OooO00o(((Number) pair.getFirst()).intValue(), (String) pair.getSecond()));
    }

    @Override // OooO00o.OooO0O0
    public final void OooO0OO(@NotNull OooOOOO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.f84OooO0O0 != 6) {
            OooO0O0 oooO0O0 = this.f90OooO0O0;
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, null));
        } else {
            if (data.f85OooO0OO != null) {
                OooO0O0 oooO0O1 = this.f90OooO0O0;
                oooO0O1.OooO0Oo(oooO0O1.OooO00o(0, null));
                return;
            }
            OooO0O0 oooO0O2 = this.f90OooO0O0;
            oooO0O2.OooO0Oo(oooO0O2.OooO00o(-2002, "Request send success, but we received a null bundle"));
            Intrinsics.checkNotNullParameter("Request send success, but we received a null bundle", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            if (o000OO0O.f48670OooO0O0) {
                Log.d(o000OO0O.f48669OooO00o, "Request send success, but we received a null bundle");
            }
        }
    }

    public final void OooO0o(OooO00o.OooO oooO) {
        try {
            OooOo00.OooO00o oooO00o = this.f90OooO0O0.f112OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO00o();
            }
            OooOOO oooOOO = this.f90OooO0O0.f109OooO0o;
            Objects.requireNonNull(oooOOO);
            Intrinsics.checkNotNullParameter(this, "bizClient");
            oooOOO.f78OooO0OO = this;
            OooOOO oooOOO2 = this.f90OooO0O0.f109OooO0o;
            Bundle bundleOooO0oO = OooO0oO();
            o00O0O o00o0o2 = this.f90OooO0O0.f108OooO0Oo;
            oooOOO2.OooO0OO(oooO, 6, bundleOooO0oO, o00o0o2 == null ? null : o00o0o2.f117OooO0O0);
        } catch (Exception e) {
            OooO0O0 oooO0O0 = this.f90OooO0O0;
            String message = e.getMessage();
            if (message == null) {
                message = "launch yallachatsdk exception";
            }
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, message));
        }
    }

    @Override // p003OooO0Oo.Oooo000
    public final void OooO0o0() {
        Unit unit;
        OooOo oooOo;
        o00O0O o00o0o2 = this.f90OooO0O0.f108OooO0Oo;
        if (o00o0o2 == null || (oooOo = o00o0o2.f116OooO00o) == null) {
            unit = null;
        } else {
            if (OooO0Oo()) {
                YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new OooO00o(this, oooOo, 0));
            } else {
                OooO0o(oooOo);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            OooO0O0 oooO0O0 = this.f90OooO0O0;
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, null));
        }
    }

    public final Bundle OooO0oO() {
        if (this.f90OooO0O0.OooO0oO() == null) {
            return new Bundle();
        }
        OooO0o oooO0oOooO = this.f90OooO0O0.OooO0oO();
        Intrinsics.checkNotNull(oooO0oOooO);
        String access_token = oooO0oOooO.f94OooO0OO.getAccess_token();
        if (access_token == null) {
            access_token = "";
        }
        OooO0o oooO0oOooO2 = this.f90OooO0O0.OooO0oO();
        Intrinsics.checkNotNull(oooO0oOooO2);
        String open_id = oooO0oOooO2.f94OooO0OO.getOpen_id();
        if (open_id == null) {
            open_id = "";
        }
        OooO0o oooO0oOooO3 = this.f90OooO0O0.OooO0oO();
        Intrinsics.checkNotNull(oooO0oOooO3);
        String target_open_id = oooO0oOooO3.f94OooO0OO.getTarget_open_id();
        if (target_open_id == null) {
            target_open_id = "";
        }
        OooO0o oooO0oOooO4 = this.f90OooO0O0.OooO0oO();
        Intrinsics.checkNotNull(oooO0oOooO4);
        String third_party_nick_name = oooO0oOooO4.f94OooO0OO.getThird_party_nick_name();
        if (third_party_nick_name == null) {
            third_party_nick_name = "";
        }
        OooO0o oooO0oOooO5 = this.f90OooO0O0.OooO0oO();
        Intrinsics.checkNotNull(oooO0oOooO5);
        String target_third_party_nick_name = oooO0oOooO5.f94OooO0OO.getTarget_third_party_nick_name();
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
