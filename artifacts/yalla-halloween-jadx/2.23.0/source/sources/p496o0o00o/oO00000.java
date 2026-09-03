package p496o0o00o;

import android.os.Looper;
import android.text.TextUtils;
import androidx.compose.runtime.Oooo0;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.bean.AbsJavaBeanApi;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p136o00OOOo0.OooO0OO;
import p139o00OOooO.OooO0o;
import p377o0OOoOo.o000O0;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p464o0Oooo.o000000O;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00000 extends Lambda implements Function1<OooO0OO, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49127OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000(UserInfoActivity userInfoActivity) {
        super(1);
        this.f49127OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooO0OO oooO0OO) {
        OooO0OO oooO0OO2 = oooO0OO;
        boolean z = true;
        boolean z2 = oooO0OO2 != null;
        final UserInfoActivity userInfoActivity = this.f49127OooO0Oo;
        if (z2) {
            Intrinsics.checkNotNull(oooO0OO2);
            String strOooO00o = oooO0OO2.OooO00o();
            int i = oooO0OO2.f37355OooO0OO.f37395OooO00o;
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
            userInfoActivity.getClass();
            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000O0.OooO00o(userInfoActivity, Oooo0.OooO00o(), i, OooO0o.OooO0o(strOooO00o), new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.activity.user.UserInfoActivity$saveHeaderUrl$1
                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0O0(@NotNull String code, @NotNull String message) {
                    Intrinsics.checkNotNullParameter(code, "code");
                    Intrinsics.checkNotNullParameter(message, "message");
                    userInfoActivity.OooOo0();
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.Profile_photo_upload_failed);
                    if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                        return;
                    }
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }

                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0o0(@NotNull String response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    Object objOooO0O0 = oOo00OO0.OooO0O0(response, new TypeToken<AbsJavaBeanApi<String>>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoActivity$saveHeaderUrl$1$onFinish$result$1
                    }.getType());
                    Intrinsics.checkNotNullExpressionValue(objOooO0O0, "fromJson(response, objec…aBeanApi<String?>?>() {})");
                    AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) objOooO0O0;
                    if (TextUtils.isEmpty((CharSequence) absJavaBeanApi.getData())) {
                        return;
                    }
                    UserInfoActivity userInfoActivity2 = userInfoActivity;
                    userInfoActivity2.getClass();
                    o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(userInfoActivity2);
                    oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO0OO());
                    oooO00o2.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo((String) absJavaBeanApi.getData());
                    oooO00o2.f43909OooO00o = 0;
                    oooO00o2.f43925OooOOo0 = userInfoActivity2.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57687OooOOOo.getDrawable();
                    oooO00o2.OooO0Oo(userInfoActivity2.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57687OooOOOo);
                    UserInfoModel userInfoModel = userInfoActivity2.f27246OooOo0o;
                    Intrinsics.checkNotNull(userInfoModel);
                    Object data = absJavaBeanApi.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "result.getData()");
                    userInfoModel.setUserHeader((String) data);
                    o000000O o000000o3 = o000000O.f46674OooO00o;
                    o000000O.OooO().postValue(absJavaBeanApi.getData());
                    LiveEventBus.get("UserHeaderUrl").post(absJavaBeanApi.getData());
                    userInfoActivity2.OooOo0();
                }
            });
        } else {
            userInfoActivity.OooOo0();
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.Profile_photo_upload_failed);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
