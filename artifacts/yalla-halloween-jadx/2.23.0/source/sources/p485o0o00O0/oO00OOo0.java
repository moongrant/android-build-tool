package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOo0 implements Observer<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f48051OooO0Oo;

    public oO00OOo0(TopicDetailActivity topicDetailActivity) {
        this.f48051OooO0Oo = topicDetailActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        Long l;
        String it = str;
        int i = TopicDetailActivity.f26305OooOoOO;
        TopicDetailActivity topicDetailActivity = this.f48051OooO0Oo;
        long currentTopicUserId = topicDetailActivity.OooOoo0().getCurrentTopicUserId();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l2 = (Long) o000000O.OooOOo0().getValue();
        if (l2 != null && currentTopicUserId == l2.longValue() && (l = (Long) o000000O.OooOOo0().getValue()) != null && currentTopicUserId == l.longValue()) {
            Response response = (Response) topicDetailActivity.OooOoo0().getTopicDetailLiveData().getValue();
            TopicInfoModel topicInfoModel = response != null ? (TopicInfoModel) response.getData() : null;
            if (topicInfoModel != null) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                topicInfoModel.setDescribe(it);
            }
            topicDetailActivity.OooOoOO().f57826OooO0oO.f58788OooO0oO.setText(it);
        }
    }
}
