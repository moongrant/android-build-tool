package p496o0o00o;

import android.os.Looper;
import android.text.TextUtils;
import androidx.compose.runtime.Oooo0;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import com.yalla.yalla.model.bean.AbsJavaBeanApi;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p136o00OOOo0.OooO0OO;
import p139o00OOooO.OooO0o;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p464o0Oooo.o000000O;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends Lambda implements Function1<OooO0OO, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f48977OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(UserInfoActivity userInfoActivity) {
        super(1);
        this.f48977OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooO0OO oooO0OO) {
        OooO0OO oooO0OO2 = oooO0OO;
        boolean z = true;
        boolean z2 = oooO0OO2 != null;
        final UserInfoActivity userInfoActivity = this.f48977OooO0Oo;
        if (z2) {
            Intrinsics.checkNotNull(oooO0OO2);
            String strOooO00o = oooO0OO2.OooO00o();
            int i = oooO0OO2.f37355OooO0OO.f37395OooO00o;
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
            userInfoActivity.getClass();
            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            String strOooO00o2 = Oooo0.OooO00o();
            String strOooO0o = OooO0o.OooO0o(strOooO00o);
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.activity.user.UserInfoActivity$saveCoverUrl$1
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
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }

                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0o0(@NotNull String response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    Object objOooO0O0 = oOo00OO0.OooO0O0(response, new TypeToken<AbsJavaBeanApi<String>>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoActivity$saveCoverUrl$1$onFinish$result$1
                    }.getType());
                    Intrinsics.checkNotNullExpressionValue(objOooO0O0, "fromJson(response, objec…aBeanApi<String?>?>() {})");
                    AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) objOooO0O0;
                    boolean zIsEmpty = TextUtils.isEmpty((CharSequence) absJavaBeanApi.getData());
                    UserInfoActivity userInfoActivity2 = userInfoActivity;
                    if (zIsEmpty) {
                        UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f27240Oooo0o;
                        userInfoActivity2.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57686OooOOOO.setBackground(o0000.OooO0O0(p584o0oOooO0.oOo00OO0.icon_userinfo_header_bg));
                        return;
                    }
                    o0OO000.OooO00o("205012");
                    userInfoActivity2.getClass();
                    o0OOo0O.OooOO0.OooO00o oooO00o3 = new o0OOo0O.OooOO0.OooO00o(userInfoActivity2);
                    oooO00o3.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo((String) absJavaBeanApi.getData());
                    oooO00o3.f43909OooO00o = 0;
                    oooO00o3.f43925OooOOo0 = userInfoActivity2.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57686OooOOOO.getDrawable();
                    oooO00o3.OooO0Oo(userInfoActivity2.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57686OooOOOO);
                    UserInfoModel userInfoModel = userInfoActivity2.f27246OooOo0o;
                    Intrinsics.checkNotNull(userInfoModel);
                    userInfoModel.setBackground(p139o00OOooO.OooO0o.OooO0Oo((String) absJavaBeanApi.getData()));
                    o000000O o000000o3 = o000000O.f46674OooO00o;
                    ((MutableLiveData) o000000O.f46692OooOo.getValue()).postValue(p139o00OOooO.OooO0o.OooO0Oo((String) absJavaBeanApi.getData()));
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.Change_Successfully);
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                    userInfoActivity2.OooOo0();
                }
            };
            LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
            linkedHashMapOooO00o.put("type", CloudFileType.USER_BACKGROUND.getCode() + "");
            linkedHashMapOooO00o.put("id", strOooO00o2);
            linkedHashMapOooO00o.put("imgUpType", i + "");
            linkedHashMapOooO00o.put("imageurl", strOooO0o);
            new com.yalla.yalla.util.Function.OooO0OO(userInfoActivity).OooO00o(o0000O.f44100OooOoo, o0000O.f44121OoooOOo, linkedHashMapOooO00o, oooO0O0);
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
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
