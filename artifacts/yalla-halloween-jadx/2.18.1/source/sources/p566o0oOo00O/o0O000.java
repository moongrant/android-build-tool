package p566o0oOo00O;

import android.content.Intent;
import android.view.View;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
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
public final class o0O000 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45288Oooo;

    public o0O000(UserInfoActivity userInfoActivity) {
        this.f45288Oooo = userInfoActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoActivity userInfoActivity = this.f45288Oooo;
        if (userInfoActivity.f23457OooooOO != null) {
            if (o0000O.OooO00o(OooOOO.f41216OooO00o, userInfoActivity.f23456OooooO0)) {
                o0O00000.OooO0OO("Me_follower");
                UserInfoActivity userInfoActivity2 = this.f45288Oooo;
                Objects.requireNonNull(userInfoActivity2);
                UserInfoModel userInfoModel = this.f45288Oooo.f23457OooooOO;
                Intrinsics.checkNotNull(userInfoModel);
                int fansNum = userInfoModel.getFansNum();
                int i = FollowerActivity.f23316OooooOO;
                Intent intent = new Intent(userInfoActivity2, (Class<?>) FollowerActivity.class);
                intent.putExtra("fans", fansNum);
                userInfoActivity2.startActivity(intent);
                OooOo.OooO0O0("105014");
            }
        }
    }
}
