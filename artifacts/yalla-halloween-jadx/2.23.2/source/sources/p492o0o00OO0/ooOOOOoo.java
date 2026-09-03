package p492o0o00OO0;

import com.code.android.util.o0000;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O0o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class ooOOOOoo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f49554OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOOOoo(TopicDetailActivity topicDetailActivity) {
        super(0);
        this.f49554OooO0Oo = topicDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TopicInfoModel topicInfoModel;
        int i = TopicDetailActivity.f25854OooOoOO;
        TopicDetailActivity topicDetailActivity = this.f49554OooO0Oo;
        Response response = (Response) topicDetailActivity.OooOoo0().getTopicDetailLiveData().getValue();
        if (response != null && (topicInfoModel = (TopicInfoModel) response.getData()) != null) {
            o000O0o o000o0o2 = new o000O0o(topicDetailActivity, null);
            o000o0o2.OooOOO0(o0000.OooO0OO(o000000.share_with_friends));
            if (!topicInfoModel.isOwner()) {
                o000o0o2.OooOOO0(o0000.OooO0OO(o000000.Report));
            }
            o000o0o2.OooOOo0(new oO0O0OoO(topicDetailActivity, topicInfoModel));
            o000o0o2.OooOO0o();
        }
        return Unit.INSTANCE;
    }
}
