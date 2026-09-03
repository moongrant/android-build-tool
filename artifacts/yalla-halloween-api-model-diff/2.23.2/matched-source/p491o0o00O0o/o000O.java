package p491o0o00O0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p650o0ooo.o000OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48950OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseActivityK f48951OooO0o0;

    public /* synthetic */ o000O(BaseActivityK baseActivityK, int i) {
        this.f48950OooO0Oo = i;
        this.f48951OooO0o0 = baseActivityK;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f48950OooO0Oo;
        BaseActivityK baseActivityK = this.f48951OooO0o0;
        switch (i) {
            case 0:
                LoginActivity this$0 = (LoginActivity) baseActivityK;
                int i2 = LoginActivity.f24727OooOo0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Pair<kotlin.Long, kotlin.Long>");
                Pair pair = (Pair) obj;
                new o000OO0O(this$0, ((Number) pair.getFirst()).longValue(), ((Number) pair.getSecond()).longValue()).OooO();
                break;
            default:
                TopicInfoActivity this$1 = (TopicInfoActivity) baseActivityK;
                String str = (String) obj;
                int i3 = TopicInfoActivity.f25916OooOoOO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                TopicInfoModel topicInfoModel = this$1.f25920OooOo00;
                TopicInfoModel topicInfoModel2 = null;
                if (topicInfoModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
                    topicInfoModel = null;
                }
                if (topicInfoModel.isOwner()) {
                    TopicInfoModel topicInfoModel3 = this$1.f25920OooOo00;
                    if (topicInfoModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
                    } else {
                        topicInfoModel2 = topicInfoModel3;
                    }
                    Intrinsics.checkNotNull(str);
                    topicInfoModel2.setImage(str);
                    this$1.OooOoO().setTopicHead(str);
                }
                break;
        }
    }
}
