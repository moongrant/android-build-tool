package p535o0o0OOoO;

import android.view.View;
import com.app.base.model.BlackUserModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import p188o00o00o0.OooO0o;
import p255o00ooO0o.oo0oOO0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00o00 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ BlackUserModel.DataBean f43638Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ oO0OOO00 f43639OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ OooO0o f43640OoooO00;

    public oO00o00(oO0OOO00 oo0ooo00, BlackUserModel.DataBean dataBean, OooO0o oooO0o) {
        this.f43639OoooO0 = oo0ooo00;
        this.f43638Oooo = dataBean;
        this.f43640OoooO00 = oooO0o;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        final BlackListActivity blackListActivity = this.f43639OoooO0.f43668OooO00o;
        final BlackUserModel.DataBean dataBean = this.f43638Oooo;
        final int layoutPosition = this.f43640OoooO00.getLayoutPosition();
        int i = BlackListActivity.f21921Oooooo0;
        Objects.requireNonNull(blackListActivity);
        oo0oOO0 oo0ooo0 = new oo0oOO0(blackListActivity);
        oo0ooo0.OooOo0O(blackListActivity.getString(R.string.Unblock_this_user));
        oo0ooo0.OooOoO();
        oo0ooo0.OooOo0o(new Function0(dataBean, layoutPosition) { // from class: o0o0OOoO.oO00Oo0

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ BlackUserModel.DataBean f43635Oooo0oO;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BlackListActivity blackListActivity2 = this.f43634Oooo0o;
                BlackUserModel.DataBean dataBean2 = this.f43635Oooo0oO;
                int i2 = BlackListActivity.f21921Oooooo0;
                Objects.requireNonNull(blackListActivity2);
                if (dataBean2.userid.isEmpty()) {
                    return null;
                }
                blackListActivity2.f21929OooooOo.blockUser(OooO.OooO0o(dataBean2.userid), false).observe(blackListActivity2, new oOo00ooO(blackListActivity2, dataBean2));
                return null;
            }
        });
        oo0ooo0.OooOOO0();
    }
}
