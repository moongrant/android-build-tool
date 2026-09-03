package p490o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.ReOpenAccountActivity;
import com.yalla.yalla.ui.activity.moment.TopicSettingActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oo00oO implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48871OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseActivityK f48872OooO0o0;

    public /* synthetic */ oo00oO(BaseActivityK baseActivityK, int i) {
        this.f48871OooO0Oo = i;
        this.f48872OooO0o0 = baseActivityK;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f48871OooO0Oo;
        BaseActivityK baseActivityK = this.f48872OooO0o0;
        switch (i) {
            case 0:
                ReOpenAccountActivity this$0 = (ReOpenAccountActivity) baseActivityK;
                int i2 = ReOpenAccountActivity.f24835OooOo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            default:
                TopicSettingActivity this$1 = (TopicSettingActivity) baseActivityK;
                String it = (String) obj;
                int i3 = TopicSettingActivity.f25965OooOo0O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                TopicInfoModel topicInfoModel = this$1.f25968OooOo00;
                if (topicInfoModel != null) {
                    topicInfoModel.setRule(it);
                }
                this$1.OooOo().f45071OooO.setText(it);
                break;
        }
    }
}
