package p506o0o00oOo;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import p368o0OOo0Oo.Oooo000;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00o00 extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50565OooO0o0;

    public oOo00o00(UserInfoActivity userInfoActivity) {
        this.f50565OooO0o0 = userInfoActivity;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        OooO00o.OooO0O0("205012");
        String strOooO0OO = o0000.OooO0OO(o000000.Change_Successfully);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
        UserInfoActivity userInfoActivity = this.f50565OooO0o0;
        if (userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45450OooOOOO != null) {
            Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(userInfoActivity);
            int i = o0Oo0oo.icon_userinfo_header_bg;
            oooO00o2.f43130OooO0oO = i;
            oooO00o2.f43124OooO00o = 1;
            oooO00o2.f43138OooOOOo = i;
            oooO00o2.OooO0Oo(userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45450OooOOOO);
            UserInfoModel userInfoModel = userInfoActivity.f26781OooOo0o;
            Intrinsics.checkNotNull(userInfoModel);
            userInfoModel.setBackground("");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            ((MutableLiveData) o0O00oO0.f47954OooOo.getValue()).postValue("");
        }
    }
}
