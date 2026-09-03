package p493o0o00O0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import kotlin.jvm.internal.Intrinsics;
import p595o0oo0.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49479OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49480OooO0o0;

    public /* synthetic */ v(Object obj, int i) {
        this.f49479OooO0Oo = i;
        this.f49480OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49479OooO0Oo;
        TopicInfoModel topicInfoModel = null;
        Object obj2 = this.f49480OooO0o0;
        switch (i) {
            case 0:
                TopicDetailActivity this$0 = (TopicDetailActivity) obj2;
                Long l = (Long) obj;
                int i2 = TopicDetailActivity.f25856OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopicInfoModel topicInfoModel2 = this$0.f25860OooOo00;
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
            case 1:
                UserInfoEditActivity this$1 = (UserInfoEditActivity) obj2;
                int i3 = UserInfoEditActivity.f26819Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoO().f45683OooOOO0.setText(OooOo00.OooO((String) obj));
                this$1.f26835Oooo00O.setValue(null);
                break;
            default:
                MomentDetailCommentFragment.initObserver$lambda$0((MomentDetailCommentFragment) obj2, obj);
                break;
        }
    }
}
