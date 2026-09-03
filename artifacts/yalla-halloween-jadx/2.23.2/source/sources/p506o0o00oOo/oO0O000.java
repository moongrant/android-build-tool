package p506o0o00oOo;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.SupportInfo;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.user.SupportTopActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicFollowingFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO0O000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f50473OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f50474OooO0o0;

    public /* synthetic */ oO0O000(Object obj, int i) {
        this.f50473OooO0Oo = i;
        this.f50474OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        List<SupportInfo.UserData> data;
        int i = this.f50473OooO0Oo;
        Object obj2 = this.f50474OooO0o0;
        switch (i) {
            case 0:
                SupportTopActivity this$0 = (SupportTopActivity) obj2;
                Response response = (Response) obj;
                int i2 = SupportTopActivity.f26727OooOo0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (response.getIsSuccess() && response.getData() != null) {
                    SupportInfo supportInfo = (SupportInfo) response.getData();
                    oO0O00 oo0o00 = null;
                    String updateAt = supportInfo != null ? supportInfo.getUpdateAt() : null;
                    SupportInfo supportInfo2 = (SupportInfo) response.getData();
                    if (supportInfo2 != null && (data = supportInfo2.getData()) != null) {
                        this$0.OooOo().f45576OooO0Oo.setText(updateAt + " (GMT+2)");
                        oO0O00 oo0o01 = this$0.f26729OooOo0;
                        if (oo0o01 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                            oo0o01 = null;
                        }
                        oo0o01.OooOoO0(data);
                        oO0O00 oo0o02 = this$0.f26729OooOo0;
                        if (oo0o02 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        } else {
                            oo0o00 = oo0o02;
                        }
                        oo0o00.Oooo00o();
                        this$0.OooOo().f45574OooO0O0.OooOooo(true, true, true);
                        break;
                    }
                }
                break;
            default:
                MainMomentsTopicFollowingFragment.initObserver$lambda$0((MainMomentsTopicFollowingFragment) obj2, obj);
                break;
        }
    }
}
