package p006OooO0oo;

import OooO00o.OooO;
import OooO00o.OooO0O0;
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
public final class o00000O0 extends Oooo000 implements OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public o000000 f140OooO0O0;

    public o00000O0(@NotNull o000000 baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        this.f140OooO0O0 = baseClient;
    }

    @Override // OooO00o.OooO0O0
    public final void OooO00o(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        o000000 o000000Var = this.f140OooO0O0;
        o000000Var.OooO0Oo(o000000Var.OooO00o(-2002, message));
    }

    @Override // OooO00o.OooO0O0
    public final void OooO0O0(@Nullable OooOOOO oooOOOO) {
        if (oooOOOO == null) {
            o000000 o000000Var = this.f140OooO0O0;
            o000000Var.OooO0Oo(o000000Var.OooO00o(-1007, "GroupCreate Canceled"));
            return;
        }
        Bundle bundle = oooOOOO.f85OooO0OO;
        if (bundle == null) {
            o000000 o000000Var2 = this.f140OooO0O0;
            o000000Var2.OooO0Oo(o000000Var2.OooO00o(-2002, "Request send success, but we received a null bundle"));
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
        o000000 o000000Var3 = this.f140OooO0O0;
        o000000Var3.OooO0Oo(o000000Var3.OooO00o(((Number) pair.getFirst()).intValue(), (String) pair.getSecond()));
    }

    @Override // OooO00o.OooO0O0
    public final void OooO0OO(@NotNull OooOOOO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.f84OooO0O0 != 4) {
            o000000 o000000Var = this.f140OooO0O0;
            o000000Var.OooO0Oo(o000000Var.OooO00o(-2002, null));
        } else {
            if (data.f85OooO0OO != null) {
                o000000 o000000Var2 = this.f140OooO0O0;
                o000000Var2.OooO0Oo(o000000Var2.OooO00o(0, null));
                return;
            }
            o000000 o000000Var3 = this.f140OooO0O0;
            o000000Var3.OooO0Oo(o000000Var3.OooO00o(-2002, "Request send success, but we received a null bundle"));
            Intrinsics.checkNotNullParameter("Request send success, but we received a null bundle", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            if (o000OO0O.f48670OooO0O0) {
                Log.d(o000OO0O.f48669OooO00o, "Request send success, but we received a null bundle");
            }
        }
    }

    public final void OooO0o(OooO oooO) {
        try {
            OooOo00.OooO00o oooO00o = this.f140OooO0O0.f112OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO00o();
            }
            OooOOO oooOOO = this.f140OooO0O0.f109OooO0o;
            Objects.requireNonNull(oooOOO);
            Intrinsics.checkNotNullParameter(this, "bizClient");
            oooOOO.f78OooO0OO = this;
            OooOOO oooOOO2 = this.f140OooO0O0.f109OooO0o;
            Bundle bundleOooO0oO = OooO0oO();
            o00O0O o00o0o2 = this.f140OooO0O0.f108OooO0Oo;
            oooOOO2.OooO0OO(oooO, 4, bundleOooO0oO, o00o0o2 == null ? null : o00o0o2.f117OooO0O0);
        } catch (Exception e) {
            o000000 o000000Var = this.f140OooO0O0;
            String message = e.getMessage();
            if (message == null) {
                message = "launch yallachatsdk exception";
            }
            o000000Var.OooO0Oo(o000000Var.OooO00o(-2002, message));
        }
    }

    @Override // p003OooO0Oo.Oooo000
    public final void OooO0o0() {
        Unit unit;
        final OooOo oooOo;
        o00O0O o00o0o2 = this.f140OooO0O0.f108OooO0Oo;
        if (o00o0o2 == null || (oooOo = o00o0o2.f116OooO00o) == null) {
            unit = null;
        } else {
            if (OooO0Oo()) {
                YCSDKOpenKit.INSTANCE.dispatchToIO$lib_release(new Runnable() { // from class: OooO0oo.o000OOo
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00000O0 this$0 = this.f141Oooo0o;
                        OooO nativeAppInfo = oooOo;
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
            o000000 o000000Var = this.f140OooO0O0;
            o000000Var.OooO0Oo(o000000Var.OooO00o(-2002, null));
        }
    }

    public final Bundle OooO0oO() {
        if (this.f140OooO0O0.OooO0oO() == null) {
            return new Bundle();
        }
        o00000 request = this.f140OooO0O0.OooO0oO();
        Intrinsics.checkNotNull(request);
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle bundle = new Bundle();
        String access_token = request.f139OooO0OO.getAccess_token();
        if (access_token == null) {
            access_token = "";
        }
        bundle.putString("yp_accesstoken", access_token);
        String open_id = request.f139OooO0OO.getOpen_id();
        if (open_id == null) {
            open_id = "";
        }
        bundle.putString("yp_open_id", open_id);
        String members = request.f139OooO0OO.getMembers();
        if (members == null) {
            members = "";
        }
        bundle.putString("yp_open_members", members);
        String groupName = request.f139OooO0OO.getGroupName();
        if (groupName == null) {
            groupName = "";
        }
        bundle.putString("yl_platform_group_name", groupName);
        String thirdPartyMark = request.f139OooO0OO.getThirdPartyMark();
        bundle.putString("yl_platform_thirdparty_mark", thirdPartyMark != null ? thirdPartyMark : "");
        return bundle;
    }
}
