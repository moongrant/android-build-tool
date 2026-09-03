package p535o0o0OOoO;

import android.view.View;
import com.app.base.model.BlackUserModel;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.Objects;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00o000 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ BlackUserModel.DataBean f43641Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ oO0OOO00 f43642OoooO00;

    public oO00o000(oO0OOO00 oo0ooo00, BlackUserModel.DataBean dataBean) {
        this.f43642OoooO00 = oo0ooo00;
        this.f43641Oooo = dataBean;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        BlackListActivity blackListActivity = this.f43642OoooO00.f43668OooO00o;
        Objects.requireNonNull(blackListActivity);
        oooO00o.OooO00o(blackListActivity, this.f43641Oooo.userid);
    }
}
