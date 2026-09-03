package p566o0oOo00O;

import android.content.Intent;
import android.view.View;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.activity.user.FollowingActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p142o00OOooO.o0000O;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p606o0oo0O.OooOo;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0000O extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45290Oooo;

    public o0O0000O(UserInfoActivity userInfoActivity) {
        this.f45290Oooo = userInfoActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoActivity userInfoActivity = this.f45290Oooo;
        if (userInfoActivity.f23457OooooOO != null) {
            if (o0000O.OooO00o(OooOOO.f41216OooO00o, userInfoActivity.f23456OooooO0)) {
                o0O00000.OooO0OO("Me_following");
                UserInfoActivity userInfoActivity2 = this.f45290Oooo;
                Objects.requireNonNull(userInfoActivity2);
                UserInfoModel userInfoModel = this.f45290Oooo.f23457OooooOO;
                Intrinsics.checkNotNull(userInfoModel);
                int followedNum = userInfoModel.getFollowedNum();
                int i = FollowingActivity.f23325OooooOO;
                Intent intent = new Intent(userInfoActivity2, (Class<?>) FollowingActivity.class);
                intent.putExtra("number", followedNum);
                userInfoActivity2.startActivity(intent);
                OooOo.OooO0O0("105013");
            }
        }
    }
}
