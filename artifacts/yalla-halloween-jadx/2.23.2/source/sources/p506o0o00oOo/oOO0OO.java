package p506o0o00oOo;

import android.content.Intent;
import android.view.View;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.jvm.internal.Intrinsics;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p496o0o00Oo0.oOOO0O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OO extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50529OooO0oO;

    public oOO0OO(UserInfoActivity userInfoActivity) {
        this.f50529OooO0oO = userInfoActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoActivity context = this.f50529OooO0oO;
        if (context.f26781OooOo0o != null) {
            String str = context.f26780OooOo0O;
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (oOOO0O0o.OooO00o(str)) {
                int i = FollowerActivity.f26638OooOo0o;
                UserInfoModel userInfoModel = context.f26781OooOo0o;
                Intrinsics.checkNotNull(userInfoModel);
                int fansNum = userInfoModel.getFansNum();
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent = new Intent(context, (Class<?>) FollowerActivity.class);
                intent.putExtra("fans", fansNum);
                context.startActivity(intent);
                OooO00o.OooO0O0("105014");
            }
        }
    }
}
