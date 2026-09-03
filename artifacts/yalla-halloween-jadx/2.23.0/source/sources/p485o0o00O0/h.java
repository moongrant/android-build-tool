package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicSettingActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Observer<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSettingActivity f47784OooO0Oo;

    public h(TopicSettingActivity topicSettingActivity) {
        this.f47784OooO0Oo = topicSettingActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        TopicSettingActivity topicSettingActivity = this.f47784OooO0Oo;
        TopicInfoModel topicInfoModel = topicSettingActivity.f26418OooOo00;
        if (topicInfoModel != null) {
            topicInfoModel.setDescribe(it);
        }
        topicSettingActivity.OooOo().f58272OooO0oO.setText(it);
    }
}
