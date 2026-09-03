package p496o0o00o;

import android.view.View;
import androidx.camera.core.impl.o00OOO00;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.screen.user.FollowingScreen;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49091OooO0oO;

    public o0OO000(UserInfoActivity userInfoActivity) {
        this.f49091OooO0oO = userInfoActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoActivity userInfoActivity = this.f49091OooO0oO;
        if (userInfoActivity.f27246OooOo0o != null) {
            String str = userInfoActivity.f27245OooOo0O;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (o00OOO00.OooO0O0(str)) {
                FollowingScreen followingScreen = FollowingScreen.INSTANCE;
                UserInfoModel userInfoModel = userInfoActivity.f27246OooOo0o;
                Intrinsics.checkNotNull(userInfoModel);
                followingScreen.navigate(userInfoModel.getFollowedNum());
                p587o0oOooo.o0OO000.OooO00o("105013");
            }
        }
    }
}
