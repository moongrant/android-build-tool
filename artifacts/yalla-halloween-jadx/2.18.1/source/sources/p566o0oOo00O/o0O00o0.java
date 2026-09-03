package p566o0oOo00O;

import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;
import p391o0OOooOo.o0O00000;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00o0 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45299OooO00o;

    public o0O00o0(UserInfoActivity userInfoActivity) {
        this.f45299OooO00o = userInfoActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        super.onFinish(response);
        o0O00000.OooO0OO("Me_Me_profile_background_success");
        ToastUtil.f12567OooO00o.OooO0O0(OooOOO.OooO0OO(R.string.Change_Successfully));
        UserInfoActivity userInfoActivity = this.f45299OooO00o;
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        if (userInfoActivity.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50049OooOOO != null) {
            UserInfoActivity userInfoActivity2 = this.f45299OooO00o;
            Objects.requireNonNull(userInfoActivity2);
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(userInfoActivity2);
            oooO00o2.f48433OooO0oO = R.drawable.icon_userinfo_header_bg;
            oooO00o2.f48427OooO00o = 1;
            oooO00o2.f48441OooOOOo = R.drawable.icon_userinfo_header_bg;
            oooO00o2.OooO0o(this.f45299OooO00o.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50049OooOOO);
            UserInfoModel userInfoModel = this.f45299OooO00o.f23457OooooOO;
            Intrinsics.checkNotNull(userInfoModel);
            userInfoModel.setBackground("");
            p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0o0().postValue("");
        }
    }
}
