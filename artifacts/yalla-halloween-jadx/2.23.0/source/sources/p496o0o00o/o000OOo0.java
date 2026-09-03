package p496o0o00o;

import android.content.res.Resources;
import android.view.View;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo0 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoModel f48996OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f48997OooO0oo;

    public static final class OooO00o extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FollowerActivity f48998OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserInfoModel f48999OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(UserInfoModel userInfoModel, FollowerActivity followerActivity) {
            super(0);
            this.f48998OooO0Oo = followerActivity;
            this.f48999OooO0o0 = userInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            FollowerActivity.OooOo0(this.f48999OooO0o0, this.f48998OooO0Oo);
            return null;
        }
    }

    public o000OOo0(UserInfoModel userInfoModel, FollowerActivity followerActivity) {
        this.f48996OooO0oO = userInfoModel;
        this.f48997OooO0oo = followerActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoModel userInfoModel = this.f48996OooO0oO;
        boolean isFollow = userInfoModel.getIsFollow();
        FollowerActivity followerActivity = this.f48997OooO0oo;
        if (!isFollow) {
            FollowerActivity.OooOo0(userInfoModel, followerActivity);
            return;
        }
        o0OO00O o0oo00o2 = new o0OO00O(followerActivity);
        Resources resources = followerActivity.getResources();
        int i = oO00OOo0.Unfollow;
        String string = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.Unfollow)");
        o0oo00o2.OooOoO(string);
        String string2 = followerActivity.getResources().getString(oO00OOo0.unFollow_tips);
        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.unFollow_tips)");
        o0oo00o2.OooOo00(string2);
        String string3 = followerActivity.getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.Unfollow)");
        o0oo00o2.OooOOOo(string3);
        o0oo00o2.OooOo0(new OooO00o(userInfoModel, followerActivity));
        o0oo00o2.OooOo(true);
        o0oo00o2.OooOO0o();
    }
}
