package p496o0o00o;

import android.content.Intent;
import android.view.View;
import androidx.camera.core.impl.o00OOO00;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000o extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49092OooO0oO;

    public o0OO000o(UserInfoActivity userInfoActivity) {
        this.f49092OooO0oO = userInfoActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoActivity context = this.f49092OooO0oO;
        if (context.f27246OooOo0o != null) {
            String str = context.f27245OooOo0O;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (o00OOO00.OooO0O0(str)) {
                int i = FollowerActivity.f27105OooOo0o;
                UserInfoModel userInfoModel = context.f27246OooOo0o;
                Intrinsics.checkNotNull(userInfoModel);
                int fansNum = userInfoModel.getFansNum();
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent = new Intent(context, (Class<?>) FollowerActivity.class);
                intent.putExtra("fans", fansNum);
                context.startActivity(intent);
                o0OO000.OooO00o("105014");
            }
        }
    }
}
