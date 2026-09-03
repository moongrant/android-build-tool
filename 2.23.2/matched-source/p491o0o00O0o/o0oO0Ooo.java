package p491o0o00O0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.ReOpenAccountActivity;
import com.yalla.yalla.ui.activity.moment.TopicSettingActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0oO0Ooo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49064OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseActivityK f49065OooO0o0;

    public /* synthetic */ o0oO0Ooo(BaseActivityK baseActivityK, int i) {
        this.f49064OooO0Oo = i;
        this.f49065OooO0o0 = baseActivityK;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49064OooO0Oo;
        BaseActivityK baseActivityK = this.f49065OooO0o0;
        switch (i) {
            case 0:
                ReOpenAccountActivity this$0 = (ReOpenAccountActivity) baseActivityK;
                int i2 = ReOpenAccountActivity.f24833OooOo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            default:
                TopicSettingActivity this$1 = (TopicSettingActivity) baseActivityK;
                String it = (String) obj;
                int i3 = TopicSettingActivity.f25963OooOo0O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                TopicInfoModel topicInfoModel = this$1.f25966OooOo00;
                if (topicInfoModel != null) {
                    topicInfoModel.setRule(it);
                }
                this$1.OooOo().f45080OooO.setText(it);
                break;
        }
    }
}
