package OooO;

import OooO00o.OooOOO;
import OooO00o.OooOOOO;
import OooO00o.OooOo;
import android.os.Bundle;
import android.util.Log;
import com.facebook.share.internal.ShareConstants;
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
    public OooO0O0 f4OooO0O0;

    public OooO(@NotNull OooO0O0 baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        this.f4OooO0O0 = baseClient;
    }

    @Override // OooO00o.OooO0O0
    public final void OooO00o(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        OooO0O0 oooO0O0 = this.f4OooO0O0;
        oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, message));
    }

    @Override // OooO00o.OooO0O0
    public final void OooO0O0(@Nullable OooOOOO oooOOOO) {
        if (oooOOOO == null) {
            OooO0O0 oooO0O0 = this.f4OooO0O0;
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(-1008, "GroupJoin Canceled"));
            return;
        }
        Bundle bundle = oooOOOO.f85OooO0OO;
        if (bundle == null) {
            OooO0O0 oooO0O1 = this.f4OooO0O0;
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
        OooO0O0 oooO0O2 = this.f4OooO0O0;
        oooO0O2.OooO0Oo(oooO0O2.OooO00o(((Number) pair.getFirst()).intValue(), (String) pair.getSecond()));
    }

    @Override // OooO00o.OooO0O0
    public final void OooO0OO(@NotNull OooOOOO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.f84OooO0O0 != 5) {
            OooO0O0 oooO0O0 = this.f4OooO0O0;
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, null));
        } else {
            if (data.f85OooO0OO != null) {
                OooO0O0 oooO0O1 = this.f4OooO0O0;
                oooO0O1.OooO0Oo(oooO0O1.OooO00o(0, null));
                return;
            }
            OooO0O0 oooO0O2 = this.f4OooO0O0;
            oooO0O2.OooO0Oo(oooO0O2.OooO00o(-2002, "Request send success, but we received a null bundle"));
            Intrinsics.checkNotNullParameter("Request send success, but we received a null bundle", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            if (o000OO0O.f48670OooO0O0) {
                Log.d(o000OO0O.f48669OooO00o, "Request send success, but we received a null bundle");
            }
        }
    }

    public final void OooO0o(OooO00o.OooO oooO) {
        try {
            OooOo00.OooO00o oooO00o = this.f4OooO0O0.f112OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO00o();
            }
            OooOOO oooOOO = this.f4OooO0O0.f109OooO0o;
            Objects.requireNonNull(oooOOO);
            Intrinsics.checkNotNullParameter(this, "bizClient");
            oooOOO.f78OooO0OO = this;
            OooOOO oooOOO2 = this.f4OooO0O0.f109OooO0o;
            Bundle bundleOooO0oO = OooO0oO();
            o00O0O o00o0o2 = this.f4OooO0O0.f108OooO0Oo;
            oooOOO2.OooO0OO(oooO, 5, bundleOooO0oO, o00o0o2 == null ? null : o00o0o2.f117OooO0O0);
        } catch (Exception e) {
            OooO0O0 oooO0O0 = this.f4OooO0O0;
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
        final OooOo oooOo;
        o00O0O o00o0o2 = this.f4OooO0O0.f108OooO0Oo;
        if (o00o0o2 == null || (oooOo = o00o0o2.f116OooO00o) == null) {
            unit = null;
        } else {
            if (OooO0Oo()) {
                YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new Runnable() { // from class: OooO.OooO00o
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooO this$0 = this.f5Oooo0o;
                        OooO00o.OooO nativeAppInfo = oooOo;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(nativeAppInfo, "$nativeAppInfo");
                        this$0.OooO0o(nativeAppInfo);
                    }
                });
            } else {
                OooO0o(oooOo);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            OooO0O0 oooO0O0 = this.f4OooO0O0;
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, null));
        }
    }

    public final Bundle OooO0oO() {
        if (this.f4OooO0O0.OooO0oO() == null) {
            return new Bundle();
        }
        OooO0o oooO0oOooO = this.f4OooO0O0.OooO0oO();
        Intrinsics.checkNotNull(oooO0oOooO);
        String access_token = oooO0oOooO.f7OooO0OO.getAccess_token();
        if (access_token == null) {
            access_token = "";
        }
        OooO0o oooO0oOooO2 = this.f4OooO0O0.OooO0oO();
        Intrinsics.checkNotNull(oooO0oOooO2);
        String open_id = oooO0oOooO2.f7OooO0OO.getOpen_id();
        if (open_id == null) {
            open_id = "";
        }
        OooO0o oooO0oOooO3 = this.f4OooO0O0.OooO0oO();
        Intrinsics.checkNotNull(oooO0oOooO3);
        String group_open_id = oooO0oOooO3.f7OooO0OO.getGroup_open_id();
        if (group_open_id == null) {
            group_open_id = "";
        }
        OooO0o oooO0oOooO4 = this.f4OooO0O0.OooO0oO();
        Intrinsics.checkNotNull(oooO0oOooO4);
        String thirdPartyMark = oooO0oOooO4.f7OooO0OO.getThirdPartyMark();
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
