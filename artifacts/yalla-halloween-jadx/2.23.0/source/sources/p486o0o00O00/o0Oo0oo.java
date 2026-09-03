package p486o0o00O00;

import android.view.View;
import com.yalla.yalla.model.BlackUserModel;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48389OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ BlackUserModel.DataBean f48390OooO0oo;

    public o0Oo0oo(BlackListActivity blackListActivity, BlackUserModel.DataBean dataBean) {
        this.f48389OooO0oO = blackListActivity;
        this.f48390OooO0oo = dataBean;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
        BlackListActivity blackListActivity = this.f48389OooO0oO;
        blackListActivity.getClass();
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, blackListActivity, this.f48390OooO0oo.userid, false, 12);
    }
}
