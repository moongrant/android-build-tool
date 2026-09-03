package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.code.android.util.o0000O0;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p464o0Oooo.o000000O;
import p543o0oO0O00.OooO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOOo implements Observer<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f48050OooO0Oo;

    public oO00OOOo(TopicDetailActivity topicDetailActivity) {
        this.f48050OooO0Oo = topicDetailActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        String it = str;
        int i = TopicDetailActivity.f26305OooOoOO;
        TopicDetailActivity topicDetailActivity = this.f48050OooO0Oo;
        long currentTopicUserId = topicDetailActivity.OooOoo0().getCurrentTopicUserId();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if (l != null && currentTopicUserId == l.longValue()) {
            Response response = (Response) topicDetailActivity.OooOoo0().getTopicDetailLiveData().getValue();
            TopicInfoModel topicInfoModel = response != null ? (TopicInfoModel) response.getData() : null;
            if (topicInfoModel != null) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                topicInfoModel.setImage(it);
            }
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(topicDetailActivity);
            int iOooO00o = o0000O0.OooO00o(55);
            oooO00o.f43911OooO0OO = OooO0o.OooO0o0(OooO0o.OooO0oo(iOooO00o, iOooO00o, it));
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO00o(OooO.OooO0oO());
            oooO00o.OooO0o0(12);
            oooO00o.OooO0Oo(topicDetailActivity.OooOoOO().f57826OooO0oO.f58787OooO0o0);
            OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(topicDetailActivity);
            oooO00o2.f43911OooO0OO = OooO0o.OooO00o(50, it);
            oooO00o2.f43909OooO00o = 0;
            int i2 = oOo00OO0.icon_topic_detail_bg;
            oooO00o2.f43923OooOOOo = i2;
            oooO00o2.f43913OooO0o = i2;
            oooO00o2.OooO0Oo(topicDetailActivity.OooOoOO().f57826OooO0oO.f58785OooO0Oo);
        }
    }
}
