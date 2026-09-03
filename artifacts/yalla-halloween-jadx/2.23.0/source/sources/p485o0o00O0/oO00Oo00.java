package p485o0o00O0;

import com.code.android.util.o0000;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o00O0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00Oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f48053OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00Oo00(TopicDetailActivity topicDetailActivity) {
        super(0);
        this.f48053OooO0Oo = topicDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TopicInfoModel topicInfoModel;
        int i = TopicDetailActivity.f26305OooOoOO;
        TopicDetailActivity topicDetailActivity = this.f48053OooO0Oo;
        Response response = (Response) topicDetailActivity.OooOoo0().getTopicDetailLiveData().getValue();
        if (response != null && (topicInfoModel = (TopicInfoModel) response.getData()) != null) {
            o00O0O o00o0o2 = new o00O0O(topicDetailActivity, null);
            o00o0o2.OooOOO0(o0000.OooO0OO(oO00OOo0.share_with_friends));
            if (!topicInfoModel.isOwner()) {
                o00o0o2.OooOOO0(o0000.OooO0OO(oO00OOo0.Report));
            }
            o00o0o2.OooOOo0(new oO0OOO00(topicDetailActivity, topicInfoModel));
            o00o0o2.OooOO0o();
        }
        return Unit.INSTANCE;
    }
}
