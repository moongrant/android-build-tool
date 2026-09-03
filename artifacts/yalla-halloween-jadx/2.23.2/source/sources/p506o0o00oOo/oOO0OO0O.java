package p506o0o00oOo;

import android.view.View;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.screen.user.FollowingScreen;
import kotlin.jvm.internal.Intrinsics;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p496o0o00Oo0.oOOO0O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OO0O extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50530OooO0oO;

    public oOO0OO0O(UserInfoActivity userInfoActivity) {
        this.f50530OooO0oO = userInfoActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoActivity userInfoActivity = this.f50530OooO0oO;
        if (userInfoActivity.f26781OooOo0o != null) {
            String str = userInfoActivity.f26780OooOo0O;
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (oOOO0O0o.OooO00o(str)) {
                FollowingScreen followingScreen = FollowingScreen.INSTANCE;
                UserInfoModel userInfoModel = userInfoActivity.f26781OooOo0o;
                Intrinsics.checkNotNull(userInfoModel);
                followingScreen.navigate(userInfoModel.getFollowedNum());
                OooO00o.OooO0O0("105013");
            }
        }
    }
}
