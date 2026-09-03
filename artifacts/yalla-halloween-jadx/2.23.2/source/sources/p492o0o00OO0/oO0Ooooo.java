package p492o0o00OO0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.jvm.internal.Intrinsics;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO0Ooooo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49456OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseActivityK f49457OooO0o0;

    public /* synthetic */ oO0Ooooo(BaseActivityK baseActivityK, int i) {
        this.f49456OooO0Oo = i;
        this.f49457OooO0o0 = baseActivityK;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49456OooO0Oo;
        TopicInfoModel topicInfoModel = null;
        BaseActivityK baseActivityK = this.f49457OooO0o0;
        switch (i) {
            case 0:
                TopicDetailActivity this$0 = (TopicDetailActivity) baseActivityK;
                Long l = (Long) obj;
                int i2 = TopicDetailActivity.f25854OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopicInfoModel topicInfoModel2 = this$0.f25858OooOo00;
                if (topicInfoModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("topicInfoModel");
                } else {
                    topicInfoModel = topicInfoModel2;
                }
                long id = topicInfoModel.getId();
                if (l != null && l.longValue() == id) {
                    this$0.OooOoo().getGroupInfo();
                }
                break;
            default:
                UserInfoEditActivity this$1 = (UserInfoEditActivity) baseActivityK;
                int i3 = UserInfoEditActivity.f26818Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoO().f45668OooOOO0.setText(o0O0O0Oo.OooO((String) obj));
                this$1.f26834Oooo00O.setValue(null);
                break;
        }
    }
}
