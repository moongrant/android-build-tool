package p496o0o00o;

import android.os.Looper;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.CommonModel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoModel f48982OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f48983OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(UserInfoModel userInfoModel, FollowerActivity followerActivity) {
        super(followerActivity);
        this.f48983OooO0o0 = followerActivity;
        this.f48982OooO0o = userInfoModel;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        CommonModel commonModel = (CommonModel) oOo00OO0.OooO00o(response, CommonModel.class);
        if (commonModel == null || !Intrinsics.areEqual(commonModel.code, "1000")) {
            return;
        }
        UserInfoModel userInfoModel = this.f48982OooO0o;
        boolean isFollow = userInfoModel.getIsFollow();
        FollowerActivity followerActivity = this.f48983OooO0o0;
        boolean z = true;
        if (isFollow) {
            userInfoModel.setFollow(false);
            String string = followerActivity.getResources().getString(oO00OOo0.Unfollowed);
            if (string != null && !StringsKt.isBlank(string)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else {
            userInfoModel.setFollow(true);
            String string2 = followerActivity.getResources().getString(oO00OOo0.topic_following);
            if (string2 != null && !StringsKt.isBlank(string2)) {
                z = false;
            }
            if (!z) {
                o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(string2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                }
            }
        }
        o00 o00Var = followerActivity.f27109OooOo0;
        if (o00Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00Var = null;
        }
        o00Var.notifyDataSetChanged();
    }
}
