package p496o0o00o;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0OoOo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import com.yalla.yalla.ui.fragment.o000O00O;
import com.yalla.yalla.ui.view.textView.ViewLocation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p418o0OoO000.OooOo;
import p466o0Oooo0o.oOO00O;
import p576o0oOoOo0.oO000Oo;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0Ooo extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oOO00O f49115OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49116OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f49117OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0Ooo(UserInfoActivity userInfoActivity, o000O00O o000o00o2, boolean z) {
        super(userInfoActivity);
        this.f49116OooO0o0 = userInfoActivity;
        this.f49115OooO0o = o000o00o2;
        this.f49117OooO0oO = z;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0O0(@NotNull String code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        super.OooO0O0(code, message);
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
        this.f49116OooO0o0.OooOooO().f57995OooO0oO.setClickable(true);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [T, java.lang.String] */
    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        OooOo oooOo = new OooOo();
        oooOo.f45532OooO00o = 19;
        UserInfoActivity userInfoActivity = this.f49116OooO0o0;
        UserInfoModel userInfoModel = userInfoActivity.f27246OooOo0o;
        Intrinsics.checkNotNull(userInfoModel);
        if (userInfoModel.getIsFollow()) {
            UserInfoModel userInfoModel2 = userInfoActivity.f27246OooOo0o;
            Intrinsics.checkNotNull(userInfoModel2);
            userInfoModel2.setFollow(false);
            oooOo.f45533OooO0O0 = 0;
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.Unfollowed);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            Observable<Object> observable = LiveEventBus.get("USER_UN_FOLLOWING");
            UserInfoModel userInfoModel3 = userInfoActivity.f27246OooOo0o;
            Intrinsics.checkNotNull(userInfoModel3);
            observable.post(Long.valueOf(userInfoModel3.getUserId()));
        } else {
            String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.Following_room_profile_toast);
            if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                }
            }
            UserInfoModel userInfoModel4 = userInfoActivity.f27246OooOo0o;
            Intrinsics.checkNotNull(userInfoModel4);
            userInfoModel4.getIsFollow();
            oooOo.f45533OooO0O0 = 1;
            oOO00O ooo00o = this.f49115OooO0o;
            if (ooo00o != null) {
                ooo00o.OooO00o();
            }
        }
        UserInfoModel userInfoModel5 = userInfoActivity.f27246OooOo0o;
        Intrinsics.checkNotNull(userInfoModel5);
        oooOo.f45534OooO0OO = o0OoOo0.OooOOO0("", Long.valueOf(userInfoModel5.getUserId()));
        com.squareup.okhttp.OooOo.OooO0O0().OooO0Oo(oooOo);
        UserInfoLeftFragment userInfoLeftFragment = userInfoActivity.f27251OooOoo0;
        if (userInfoLeftFragment != null) {
            Intrinsics.checkNotNull(userInfoLeftFragment);
            userInfoLeftFragment.setIsFollow(oooOo.f45533OooO0O0);
        }
        oO000Oo.OooO00o(userInfoActivity.OooOooO().f57999OooOO0o, o0000.OooO0O0(oooOo.f45533OooO0O0 == 1 ? oOo00OO0.icon_profile_followed : oOo00OO0.icon_profile_follow), ViewLocation.top, OooO.OooO0o0());
        userInfoActivity.OooOooO().f57999OooOO0o.setText(this.f49117OooO0oO ? oO00OOo0.Following_user : oO00OOo0.Follow);
        userInfoActivity.OooOooO().f57995OooO0oO.setClickable(true);
    }
}
