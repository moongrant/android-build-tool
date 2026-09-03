package p487o0o00O;

import android.view.View;
import com.yalla.yalla.model.BlackUserModel;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48883OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ BlackUserModel.DataBean f48884OooO0oo;

    public o0O0O00(BlackListActivity blackListActivity, BlackUserModel.DataBean dataBean) {
        this.f48883OooO0oO = blackListActivity;
        this.f48884OooO0oo = dataBean;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
        BlackListActivity blackListActivity = this.f48883OooO0oO;
        blackListActivity.getClass();
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, blackListActivity, this.f48884OooO0oo.userid, false, 12);
    }
}
