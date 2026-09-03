package p538o0o0Oo0;

import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0OOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f44013Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOO0(TopicDetailActivity topicDetailActivity) {
        super(0);
        this.f44013Oooo0o = topicDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TopicInfoModel topicInfoModel;
        TopicDetailActivity topicDetailActivity = this.f44013Oooo0o;
        TopicDetailActivity.OooO00o oooO00o = TopicDetailActivity.f22567o0OoOo0;
        Response response = (Response) topicDetailActivity.Oooo000().getTopicDetailLiveData().getValue();
        if (response == null || (topicInfoModel = (TopicInfoModel) response.getData()) == null) {
            return null;
        }
        TopicDetailActivity topicDetailActivity2 = this.f44013Oooo0o;
        o00O0 o00o1 = new o00O0(topicDetailActivity2);
        o00o1.OooOOO(o000O0O0.OooO0OO(R.string.share_with_friends));
        if (!topicInfoModel.isOwner()) {
            o00o1.OooOOO(o000O0O0.OooO0OO(R.string.report));
        }
        o00o1.OooOOoo(new o0O0o000(topicDetailActivity2, topicInfoModel));
        o00o1.OooOOO0();
        return Unit.INSTANCE;
    }
}
