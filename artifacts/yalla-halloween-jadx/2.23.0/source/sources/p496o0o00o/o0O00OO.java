package p496o0o00o;

import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p362o0OOo0O.OooOO0;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OO extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49066OooO0o0;

    public o0O00OO(UserInfoActivity userInfoActivity) {
        this.f49066OooO0o0 = userInfoActivity;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        o0OO000.OooO00o("205012");
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.Change_Successfully);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
        UserInfoActivity userInfoActivity = this.f49066OooO0o0;
        if (userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57686OooOOOO != null) {
            OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(userInfoActivity);
            int i = oOo00OO0.icon_userinfo_header_bg;
            oooO00o2.f43915OooO0oO = i;
            oooO00o2.f43909OooO00o = 1;
            oooO00o2.f43923OooOOOo = i;
            oooO00o2.OooO0Oo(userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57686OooOOOO);
            UserInfoModel userInfoModel = userInfoActivity.f27246OooOo0o;
            Intrinsics.checkNotNull(userInfoModel);
            userInfoModel.setBackground("");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            ((MutableLiveData) o000000O.f46692OooOo.getValue()).postValue("");
        }
    }
}
