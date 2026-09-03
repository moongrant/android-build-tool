package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.topic.TopicFollowChange;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.JoinTopicListActivity;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nJoinTopicListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JoinTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/JoinTopicListActivity$initObserver$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n1864#2,3:179\n*S KotlinDebug\n*F\n+ 1 JoinTopicListActivity.kt\ncom/yalla/yalla/ui/activity/moment/JoinTopicListActivity$initObserver$1\n*L\n101#1:179,3\n*E\n"})
public final class oo0o0Oo implements Observer<TopicFollowChange> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ JoinTopicListActivity f48225OooO0Oo;

    public oo0o0Oo(JoinTopicListActivity joinTopicListActivity) {
        this.f48225OooO0Oo = joinTopicListActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(TopicFollowChange topicFollowChange) {
        TopicFollowChange topicFollowChange2 = topicFollowChange;
        int i = JoinTopicListActivity.f26043OooOoO0;
        JoinTopicListActivity joinTopicListActivity = this.f48225OooO0Oo;
        List<TopicInfoModel> list = joinTopicListActivity.OooOoO0().f10111OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "mAdapter.data");
        int i2 = 0;
        int i3 = -1;
        for (Object obj : list) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (((TopicInfoModel) obj).getId() == topicFollowChange2.getTopicId()) {
                i3 = i2;
            }
            i2 = i4;
        }
        if (i3 != -1) {
            joinTopicListActivity.OooOoO0().OooOOo(i3);
        }
    }
}
