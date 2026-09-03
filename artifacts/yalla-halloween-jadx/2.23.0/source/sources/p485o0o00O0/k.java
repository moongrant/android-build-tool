package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicSettingActivity;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.jvm.internal.Intrinsics;
import p136o00OOOo0.OooO0OO;
import p519o0o0O0oO.O0000000;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Observer<OooO0OO> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ O0000000 f47789OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicSettingActivity f47790OooO0o0;

    public k(O0000000 o0000000, TopicSettingActivity topicSettingActivity) {
        this.f47789OooO0Oo = o0000000;
        this.f47790OooO0o0 = topicSettingActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(OooO0OO oooO0OO) {
        OooO0OO oooO0OO2 = oooO0OO;
        this.f47789OooO0Oo.OooO00o();
        if (oooO0OO2 != null) {
            Intrinsics.checkNotNull(oooO0OO2);
            String strOooO00o = oooO0OO2.OooO00o();
            TopicSettingActivity topicSettingActivity = this.f47790OooO0o0;
            TopicInfoModel topicInfoModel = topicSettingActivity.f26418OooOo00;
            if (topicInfoModel != null) {
                long id = topicInfoModel.getId();
                O0000000 o0000000 = new O0000000();
                o0000000.OooO0O0(oO00OOo0.uploading, topicSettingActivity);
                ((TopicEditVM) topicSettingActivity.f26417OooOo0.getValue()).changeTopicImage(id, strOooO00o).observe(topicSettingActivity, new j(o0000000, strOooO00o, topicSettingActivity));
            }
        }
    }
}
