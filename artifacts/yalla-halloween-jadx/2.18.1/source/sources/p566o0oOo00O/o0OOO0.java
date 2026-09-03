package p566o0oOo00O;

import android.text.TextUtils;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApi;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f45329OooO00o;

    public static final class OooO00o extends o00000O0<AbsJavaBeanApi<String>> {
    }

    public o0OOO0(UserInfoEditActivity userInfoEditActivity) {
        this.f45329OooO00o = userInfoEditActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@Nullable String str, @Nullable String str2) {
        super.onError(str, str2);
        this.f45329OooO00o.OooOoO();
        ToastUtil.f12567OooO00o.OooO00o(R.string.Profile_photo_upload_failed);
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Object objOooO0OO = o0Oo0oo.OooO0OO(response, new OooO00o().getType());
        Intrinsics.checkNotNullExpressionValue(objOooO0OO, "fromJson(response, objec…aBeanApi<String?>?>() {})");
        AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) objOooO0OO;
        if (TextUtils.isEmpty((CharSequence) absJavaBeanApi.getData())) {
            return;
        }
        OooOOO.f41216OooO00o.OooO0oo().postValue(absJavaBeanApi.getData());
        LiveEventBus.get("UserHeaderUrl").post(absJavaBeanApi.getData());
        UserInfoEditActivity userInfoEditActivity = this.f45329OooO00o;
        userInfoEditActivity.f23499OooooOo = null;
        if (userInfoEditActivity.Oooo00O()) {
            this.f45329OooO00o.Oooo0();
            return;
        }
        LiveEventBus.get("UserInfoEditChange").post(Boolean.TRUE);
        this.f45329OooO00o.OooOoO();
        ToastUtil.f12567OooO00o.OooO00o(R.string.Userinfo_edit_success);
        this.f45329OooO00o.finish();
    }
}
