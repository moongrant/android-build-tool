package p566o0oOo00O;

import android.text.TextUtils;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApi;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p498o0o00Oo0.OooOOO;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45287OooO00o;

    public static final class OooO00o extends o00000O0<AbsJavaBeanApi<String>> {
    }

    public o0O00(UserInfoActivity userInfoActivity) {
        this.f45287OooO00o = userInfoActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@NotNull String code2, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code2, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f45287OooO00o.OooOoO();
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
        UserInfoActivity userInfoActivity = this.f45287OooO00o;
        Objects.requireNonNull(userInfoActivity);
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(userInfoActivity);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat((String) absJavaBeanApi.getData());
        oooO00o.f48427OooO00o = 0;
        oooO00o.f48443OooOOo0 = this.f45287OooO00o.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50051OooOOOO.getDrawable();
        oooO00o.OooO0o(this.f45287OooO00o.Oooo00o().f50399OooO0Oo.f49988OooO0Oo.f50051OooOOOO);
        UserInfoModel userInfoModel = this.f45287OooO00o.f23457OooooOO;
        Intrinsics.checkNotNull(userInfoModel);
        Object data = absJavaBeanApi.getData();
        Intrinsics.checkNotNullExpressionValue(data, "result.getData()");
        userInfoModel.setUserHeader((String) data);
        OooOOO.f41216OooO00o.OooO0oo().postValue(absJavaBeanApi.getData());
        LiveEventBus.get("UserHeaderUrl").post(absJavaBeanApi.getData());
        this.f45287OooO00o.OooOoO();
    }
}
