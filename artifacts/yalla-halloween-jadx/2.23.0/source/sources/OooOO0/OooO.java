package OooOO0;

import OooO0O0.OooOOO;
import OooO0O0.OooOOO0;
import OooO0O0.OooOo00;
import android.os.Bundle;
import android.util.Log;
import com.facebook.share.internal.ShareConstants;
import com.yallatech.support.platform.YCSDKOpenKit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003OooO0o0.o00Oo0;
import p003OooO0o0.o0Oo0oo;
import p003OooO0o0.oo000o;
import p605o0oo0OO0.o000O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends oo000o implements OooO0O0.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f164OooO0O0;

    public OooO(@NotNull OooO0O0 baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        this.f164OooO0O0 = baseClient;
    }

    @Override // OooO0O0.OooO00o
    public final void OooO00o(@Nullable OooOOO oooOOO) {
        OooO0O0 oooO0O0 = this.f164OooO0O0;
        if (oooOOO == null) {
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(-1008, "GroupJoin Canceled"));
            return;
        }
        Bundle bundle = oooOOO.f103OooO0OO;
        if (bundle == null) {
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, "Request send success, but we received a null bundle"));
            Intrinsics.checkNotNullParameter("Request send success, but we received a null bundle", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            if (o000O.f56902OooO0O0) {
                Log.d(o000O.f56901OooO00o, "Request send success, but we received a null bundle");
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
        oooO0O0.OooO0Oo(oooO0O0.OooO00o(((Number) pair.getFirst()).intValue(), (String) pair.getSecond()));
    }

    @Override // OooO0O0.OooO00o
    public final void OooO0O0(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        OooO0O0 oooO0O0 = this.f164OooO0O0;
        oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, message));
    }

    @Override // OooO0O0.OooO00o
    public final void OooO0OO(@NotNull OooOOO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i = data.f102OooO0O0;
        OooO0O0 oooO0O0 = this.f164OooO0O0;
        if (i != 5) {
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, null));
            return;
        }
        if (data.f103OooO0OO != null) {
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(0, null));
            return;
        }
        oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, "Request send success, but we received a null bundle"));
        Intrinsics.checkNotNullParameter("Request send success, but we received a null bundle", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        if (o000O.f56902OooO0O0) {
            Log.d(o000O.f56901OooO00o, "Request send success, but we received a null bundle");
        }
    }

    public final void OooO0o(OooO0O0.OooO0o oooO0o) {
        OooO0O0 oooO0O0 = this.f164OooO0O0;
        try {
            o00Oo0.OooO00o oooO00o = oooO0O0.f136OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO00o();
            }
            OooOOO0 oooOOO0 = oooO0O0.f133OooO0o;
            oooOOO0.getClass();
            Intrinsics.checkNotNullParameter(this, "bizClient");
            oooOOO0.f106OooO0OO = this;
            OooOOO0 oooOOO1 = oooO0O0.f133OooO0o;
            Bundle bundleOooO0oO = OooO0oO();
            o0Oo0oo o0oo0oo2 = oooO0O0.f132OooO0Oo;
            oooOOO1.OooO0O0(oooO0o, 5, bundleOooO0oO, o0oo0oo2 == null ? null : o0oo0oo2.f144OooO0O0);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "launch yallachatsdk exception";
            }
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, message));
        }
    }

    @Override // p003OooO0o0.oo000o
    public final void OooO0o0() {
        Unit unit;
        OooOo00 oooOo00;
        OooO0O0 oooO0O0 = this.f164OooO0O0;
        o0Oo0oo o0oo0oo2 = oooO0O0.f132OooO0Oo;
        if (o0oo0oo2 == null || (oooOo00 = o0oo0oo2.f143OooO00o) == null) {
            unit = null;
        } else {
            if (oo000o.OooO0Oo()) {
                YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new OooO00o(0, this, oooOo00));
            } else {
                OooO0o(oooOo00);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, null));
        }
    }

    public final Bundle OooO0oO() {
        OooO0O0 oooO0O0 = this.f164OooO0O0;
        if (oooO0O0.OooO0oO() == null) {
            return new Bundle();
        }
        OooO0o oooO0oOooO = oooO0O0.OooO0oO();
        Intrinsics.checkNotNull(oooO0oOooO);
        String access_token = oooO0oOooO.f168OooO0OO.getAccess_token();
        if (access_token == null) {
            access_token = "";
        }
        OooO0o oooO0oOooO2 = oooO0O0.OooO0oO();
        Intrinsics.checkNotNull(oooO0oOooO2);
        String open_id = oooO0oOooO2.f168OooO0OO.getOpen_id();
        if (open_id == null) {
            open_id = "";
        }
        OooO0o oooO0oOooO3 = oooO0O0.OooO0oO();
        Intrinsics.checkNotNull(oooO0oOooO3);
        String group_open_id = oooO0oOooO3.f168OooO0OO.getGroup_open_id();
        if (group_open_id == null) {
            group_open_id = "";
        }
        OooO0o oooO0oOooO4 = oooO0O0.OooO0oO();
        Intrinsics.checkNotNull(oooO0oOooO4);
        String thirdPartyMark = oooO0oOooO4.f168OooO0OO.getThirdPartyMark();
        String thirdPartyMark2 = thirdPartyMark != null ? thirdPartyMark : "";
        Intrinsics.checkNotNullParameter(access_token, "access_token");
        Intrinsics.checkNotNullParameter(open_id, "open_id");
        Intrinsics.checkNotNullParameter(group_open_id, "group_open_id");
        Intrinsics.checkNotNullParameter(thirdPartyMark2, "thirdPartyMark");
        Bundle bundle = new Bundle();
        bundle.putString("yp_accesstoken", access_token);
        bundle.putString("yp_open_id", open_id);
        bundle.putString("yp_group_open_id", group_open_id);
        bundle.putString("yl_platform_thirdparty_mark", thirdPartyMark2);
        return bundle;
    }
}
