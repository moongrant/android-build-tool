package p506o0o00oOo;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0OoOo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import com.yalla.yalla.ui.view.textView.ViewLocation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p022Oooo00O.o0O0o000;
import p473o0OoooOo.o0OOO0;
import p545o0oO0O00.OooOOO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p573o0oOoOO.o0O0o0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00000 extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0OOO0 f50517OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50518OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f50519OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00000(UserInfoActivity userInfoActivity, o0O0o000 o0o0o000, boolean z) {
        super(userInfoActivity);
        this.f50518OooO0o0 = userInfoActivity;
        this.f50517OooO0o = o0o0o000;
        this.f50519OooO0oO = z;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0O0(@NotNull String code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        super.OooO0O0(code, message);
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
        this.f50518OooO0o0.OooOooO().f45624OooO0oO.setClickable(true);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [T, java.lang.String] */
    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        OooOOO oooOOO = new OooOOO();
        oooOOO.f55758OooO00o = 19;
        UserInfoActivity userInfoActivity = this.f50518OooO0o0;
        UserInfoModel userInfoModel = userInfoActivity.f26781OooOo0o;
        Intrinsics.checkNotNull(userInfoModel);
        if (userInfoModel.getIsFollow()) {
            UserInfoModel userInfoModel2 = userInfoActivity.f26781OooOo0o;
            Intrinsics.checkNotNull(userInfoModel2);
            userInfoModel2.setFollow(false);
            oooOOO.f55759OooO0O0 = 0;
            String strOooO0OO = o0000.OooO0OO(o000000.Unfollowed);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            Observable<Object> observable = LiveEventBus.get("USER_UN_FOLLOWING");
            UserInfoModel userInfoModel3 = userInfoActivity.f26781OooOo0o;
            Intrinsics.checkNotNull(userInfoModel3);
            observable.post(Long.valueOf(userInfoModel3.getUserId()));
        } else {
            String strOooO0OO2 = o0000.OooO0OO(o000000.Following_room_profile_toast);
            if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                }
            }
            UserInfoModel userInfoModel4 = userInfoActivity.f26781OooOo0o;
            Intrinsics.checkNotNull(userInfoModel4);
            userInfoModel4.getIsFollow();
            oooOOO.f55759OooO0O0 = 1;
            o0OOO0 o0ooo1 = this.f50517OooO0o;
            if (o0ooo1 != null) {
                o0ooo1.OooO0O0();
            }
        }
        UserInfoModel userInfoModel5 = userInfoActivity.f26781OooOo0o;
        Intrinsics.checkNotNull(userInfoModel5);
        oooOOO.f55760OooO0OO = o0OoOo0.OooOOO0("", Long.valueOf(userInfoModel5.getUserId()));
        p545o0oO0O00.OooOo00.OooO00o().OooO0Oo(oooOOO);
        UserInfoLeftFragment userInfoLeftFragment = userInfoActivity.f26786OooOoo0;
        if (userInfoLeftFragment != null) {
            Intrinsics.checkNotNull(userInfoLeftFragment);
            userInfoLeftFragment.setIsFollow(oooOOO.f55759OooO0O0);
        }
        o0O0o0.OooO00o(userInfoActivity.OooOooO().f45628OooOO0o, o0000.OooO0O0(oooOOO.f55759OooO0O0 == 1 ? o0Oo0oo.icon_profile_followed : o0Oo0oo.icon_profile_follow), ViewLocation.top, p595o0oo00O.OooOo00.OooO0o0());
        userInfoActivity.OooOooO().f45628OooOO0o.setText(this.f50519OooO0oO ? o000000.Following_user : o000000.Follow);
        userInfoActivity.OooOooO().f45624OooO0oO.setClickable(true);
    }
}
