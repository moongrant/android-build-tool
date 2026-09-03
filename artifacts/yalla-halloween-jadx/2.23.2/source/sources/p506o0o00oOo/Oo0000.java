package p506o0o00oOo;

import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
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
import p004OooO0oO.o0OoOo0;
import p182o00o000O.OooO0o;
import p184o00o00O0.OooO0OO;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p384o0OOoo0O.o0ooOOo;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOOO00;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class Oo0000 extends Lambda implements Function1<OooO0o, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50389OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oo0000(UserInfoActivity userInfoActivity) {
        super(1);
        this.f50389OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooO0o oooO0o) {
        OooO0o oooO0o2 = oooO0o;
        boolean z = true;
        boolean z2 = oooO0o2 != null;
        final UserInfoActivity userInfoActivity = this.f50389OooO0Oo;
        if (z2) {
            Intrinsics.checkNotNull(oooO0o2);
            String strOooO00o = oooO0o2.OooO00o();
            int i = oooO0o2.f38405OooO0OO.f38464OooO00o;
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
            userInfoActivity.getClass();
            o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0ooOOo.OooO00o(userInfoActivity, o0OoOo0.OooO00o(), i, OooO0OO.OooO0o(strOooO00o), new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.activity.user.UserInfoActivity$saveHeaderUrl$1
                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0O0(@NotNull String code, @NotNull String message) {
                    Intrinsics.checkNotNullParameter(code, "code");
                    Intrinsics.checkNotNullParameter(message, "message");
                    userInfoActivity.OooOo0();
                    String strOooO0OO = o0000.OooO0OO(o000000.Profile_photo_upload_failed);
                    if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                        return;
                    }
                    o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }

                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0o0(@NotNull String response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    Object objOooO0O0 = oOOO00.OooO0O0(response, new TypeToken<AbsJavaBeanApi<String>>() { // from class: com.yalla.yalla.ui.activity.user.UserInfoActivity$saveHeaderUrl$1$onFinish$result$1
                    }.getType());
                    Intrinsics.checkNotNullExpressionValue(objOooO0O0, "fromJson(...)");
                    AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) objOooO0O0;
                    if (TextUtils.isEmpty((CharSequence) absJavaBeanApi.getData())) {
                        return;
                    }
                    UserInfoActivity userInfoActivity2 = userInfoActivity;
                    userInfoActivity2.getClass();
                    o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(userInfoActivity2);
                    oooO00o2.OooO00o(d1.OooO0OO());
                    oooO00o2.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo((String) absJavaBeanApi.getData());
                    oooO00o2.f43124OooO00o = 0;
                    oooO00o2.f43140OooOOo0 = userInfoActivity2.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45451OooOOOo.getDrawable();
                    oooO00o2.OooO0Oo(userInfoActivity2.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45451OooOOOo);
                    UserInfoModel userInfoModel = userInfoActivity2.f26781OooOo0o;
                    Intrinsics.checkNotNull(userInfoModel);
                    Object data = absJavaBeanApi.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                    userInfoModel.setUserHeader((String) data);
                    o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                    o0O00oO0.OooO().postValue(absJavaBeanApi.getData());
                    LiveEventBus.get("UserHeaderUrl").post(absJavaBeanApi.getData());
                    userInfoActivity2.OooOo0();
                }
            });
        } else {
            userInfoActivity.OooOo0();
            String strOooO0OO = o0000.OooO0OO(o000000.Profile_photo_upload_failed);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
