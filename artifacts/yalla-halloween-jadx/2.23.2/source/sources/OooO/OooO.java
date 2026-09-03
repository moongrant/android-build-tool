package OooO;

import OooO0O0.OooOOO;
import OooO0O0.OooOOO0;
import OooO0O0.OooOo00;
import android.os.Bundle;
import android.util.Log;
import com.facebook.share.internal.ShareConstants;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.group.create.bean.GroupCreateRequest;
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
public final class OooO extends oo000o implements OooO0O0.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f30OooO0O0;

    public OooO(@NotNull OooO0O0 baseClient) {
        Intrinsics.checkNotNullParameter(baseClient, "baseClient");
        this.f30OooO0O0 = baseClient;
    }

    @Override // OooO0O0.OooO00o
    public final void OooO00o(@Nullable OooOOO oooOOO) {
        OooO0O0 oooO0O0 = this.f30OooO0O0;
        if (oooOOO == null) {
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(-1007, "GroupCreate Canceled"));
            return;
        }
        Bundle bundle = oooOOO.f102OooO0OO;
        if (bundle == null) {
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, "Request send success, but we received a null bundle"));
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
        oooO0O0.OooO0Oo(oooO0O0.OooO00o(((Number) pair.getFirst()).intValue(), (String) pair.getSecond()));
    }

    @Override // OooO0O0.OooO00o
    public final void OooO0O0(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        OooO0O0 oooO0O0 = this.f30OooO0O0;
        oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, message));
    }

    @Override // OooO0O0.OooO00o
    public final void OooO0OO(@NotNull OooOOO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i = data.f101OooO0O0;
        OooO0O0 oooO0O0 = this.f30OooO0O0;
        if (i != 4) {
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, null));
            return;
        }
        if (data.f102OooO0OO != null) {
            oooO0O0.OooO0Oo(oooO0O0.OooO00o(0, null));
            return;
        }
        oooO0O0.OooO0Oo(oooO0O0.OooO00o(-2002, "Request send success, but we received a null bundle"));
        Intrinsics.checkNotNullParameter("Request send success, but we received a null bundle", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        if (h5.f57416OooO0O0) {
            Log.d(h5.f57415OooO00o, "Request send success, but we received a null bundle");
        }
    }

    public final void OooO0o(OooO0O0.OooO0o oooO0o) {
        OooO0O0 oooO0O0 = this.f30OooO0O0;
        try {
            o00Oo0.OooO00o oooO00o = oooO0O0.f134OooO0oo;
            if (oooO00o != null) {
                oooO00o.OooO00o();
            }
            OooOOO0 oooOOO0 = oooO0O0.f131OooO0o;
            oooOOO0.getClass();
            Intrinsics.checkNotNullParameter(this, "bizClient");
            oooOOO0.f105OooO0OO = this;
            OooOOO0 oooOOO1 = oooO0O0.f131OooO0o;
            Bundle bundleOooO0oO = OooO0oO();
            o0Oo0oo o0oo0oo2 = oooO0O0.f130OooO0Oo;
            oooOOO1.OooO0O0(oooO0o, 4, bundleOooO0oO, o0oo0oo2 == null ? null : o0oo0oo2.f142OooO0O0);
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
        OooO0O0 oooO0O0 = this.f30OooO0O0;
        o0Oo0oo o0oo0oo2 = oooO0O0.f130OooO0Oo;
        if (o0oo0oo2 == null || (oooOo00 = o0oo0oo2.f141OooO00o) == null) {
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
        OooO0O0 oooO0O0 = this.f30OooO0O0;
        if (oooO0O0.OooO0oO() == null) {
            return new Bundle();
        }
        OooO0o request = oooO0O0.OooO0oO();
        Intrinsics.checkNotNull(request);
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle bundle = new Bundle();
        String access_token = request.f34OooO0OO.getAccess_token();
        if (access_token == null) {
            access_token = "";
        }
        bundle.putString("yp_accesstoken", access_token);
        GroupCreateRequest groupCreateRequest = request.f34OooO0OO;
        String open_id = groupCreateRequest.getOpen_id();
        if (open_id == null) {
            open_id = "";
        }
        bundle.putString("yp_open_id", open_id);
        String members = groupCreateRequest.getMembers();
        if (members == null) {
            members = "";
        }
        bundle.putString("yp_open_members", members);
        String groupName = groupCreateRequest.getGroupName();
        if (groupName == null) {
            groupName = "";
        }
        bundle.putString("yl_platform_group_name", groupName);
        String thirdPartyMark = groupCreateRequest.getThirdPartyMark();
        bundle.putString("yl_platform_thirdparty_mark", thirdPartyMark != null ? thirdPartyMark : "");
        return bundle;
    }
}
