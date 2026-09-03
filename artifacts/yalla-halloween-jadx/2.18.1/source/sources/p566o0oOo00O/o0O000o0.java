package p566o0oOo00O;

import android.text.TextUtils;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApi;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p391o0OOooOo.o0O00000;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000o0 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45293OooO00o;

    public static final class OooO00o extends o00000O0<AbsJavaBeanApi<String>> {
    }

    public o0O000o0(UserInfoActivity userInfoActivity) {
        this.f45293OooO00o = userInfoActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@NotNull String code2, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code2, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f45293OooO00o.OooOoO();
        ToastUtil.f12567OooO00o.OooO00o(R.string.Profile_photo_upload_failed);
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Object objOooO0OO = o0Oo0oo.OooO0OO(response, new OooO00o().getType());
        Intrinsics.checkNotNullExpressionValue(objOooO0OO, "fromJson(response, objec…aBeanApi<String?>?>() {})");
        AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) objOooO0OO;
        if (TextUtils.isEmpty((CharSequence) absJavaBeanApi.getData())) {
            UserInfoActivity userInfoActivity = this.f45293OooO00o;
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
            userInfoActivity.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50049OooOOO.setBackground(OooOOO.OooO0O0(R.drawable.icon_userinfo_header_bg));
            return;
        }
        o0O00000.OooO0OO("Me_Me_profile_background_success");
        UserInfoActivity userInfoActivity2 = this.f45293OooO00o;
        Objects.requireNonNull(userInfoActivity2);
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(userInfoActivity2);
        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat((String) absJavaBeanApi.getData());
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.f48443OooOOo0 = this.f45293OooO00o.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50049OooOOO.getDrawable();
        oooO00o2.OooO0o(this.f45293OooO00o.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50049OooOOO);
        UserInfoModel userInfoModel = this.f45293OooO00o.f23457OooooOO;
        Intrinsics.checkNotNull(userInfoModel);
        userInfoModel.setBackground(CloudImageUtilKt.imgFormat((String) absJavaBeanApi.getData()));
        p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0o0().postValue(CloudImageUtilKt.imgFormat((String) absJavaBeanApi.getData()));
        ToastUtil.f12567OooO00o.OooO0O0(OooOOO.OooO0OO(R.string.Change_Successfully));
        this.f45293OooO00o.OooOoO();
    }
}
