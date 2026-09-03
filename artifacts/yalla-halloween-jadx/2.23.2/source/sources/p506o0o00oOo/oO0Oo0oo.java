package p506o0o00oOo;

import android.content.res.Resources;
import android.view.View;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo0oo extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoModel f50501OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f50502OooO0oo;

    public static final class OooO00o extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FollowerActivity f50503OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserInfoModel f50504OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(UserInfoModel userInfoModel, FollowerActivity followerActivity) {
            super(0);
            this.f50503OooO0Oo = followerActivity;
            this.f50504OooO0o0 = userInfoModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            FollowerActivity.OooOo0(this.f50504OooO0o0, this.f50503OooO0Oo);
            return null;
        }
    }

    public oO0Oo0oo(UserInfoModel userInfoModel, FollowerActivity followerActivity) {
        this.f50501OooO0oO = userInfoModel;
        this.f50502OooO0oo = followerActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoModel userInfoModel = this.f50501OooO0oO;
        boolean isFollow = userInfoModel.getIsFollow();
        FollowerActivity followerActivity = this.f50502OooO0oo;
        if (!isFollow) {
            FollowerActivity.OooOo0(userInfoModel, followerActivity);
            return;
        }
        o000O o000o = new o000O(followerActivity);
        Resources resources = followerActivity.getResources();
        int i = o000000.Unfollow;
        String string = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        o000o.OooOoO(string);
        String string2 = followerActivity.getResources().getString(o000000.unFollow_tips);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        o000o.OooOo00(string2);
        String string3 = followerActivity.getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        o000o.OooOOOo(string3);
        o000o.OooOo0(new OooO00o(userInfoModel, followerActivity));
        o000o.OooOo(true);
        o000o.OooOO0o();
    }
}
