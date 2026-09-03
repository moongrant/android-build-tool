package p506o0o00oOo;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.CommonModel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OoOO0 extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoModel f50505OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f50506OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OoOO0(UserInfoModel userInfoModel, FollowerActivity followerActivity) {
        super(followerActivity);
        this.f50506OooO0o0 = followerActivity;
        this.f50505OooO0o = userInfoModel;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        CommonModel commonModel = (CommonModel) oOOO00.OooO00o(response, CommonModel.class);
        if (commonModel == null || !Intrinsics.areEqual(commonModel.code, "1000")) {
            return;
        }
        UserInfoModel userInfoModel = this.f50505OooO0o;
        boolean isFollow = userInfoModel.getIsFollow();
        FollowerActivity followerActivity = this.f50506OooO0o0;
        boolean z = true;
        if (isFollow) {
            userInfoModel.setFollow(false);
            String string = followerActivity.getResources().getString(o000000.Unfollowed);
            if (string != null && !StringsKt.isBlank(string)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else {
            userInfoModel.setFollow(true);
            String string2 = followerActivity.getResources().getString(o000000.topic_following);
            if (string2 != null && !StringsKt.isBlank(string2)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(string2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                }
            }
        }
        oO000OOo oo000ooo = followerActivity.f26642OooOo0;
        if (oo000ooo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo000ooo = null;
        }
        oo000ooo.notifyDataSetChanged();
    }
}
