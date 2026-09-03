package p485o0o00O0;

import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f47774OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f47775OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TopicSearchActivity topicSearchActivity, int i) {
        super(0);
        this.f47774OooO0Oo = topicSearchActivity;
        this.f47775OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("103034");
        int i = TopicSearchActivity.f26398OooOoo0;
        TopicSearchActivity topicSearchActivity = this.f47774OooO0Oo;
        List<TopicInfoModel> list = topicSearchActivity.OooOoO().f10111OooOOoo;
        int i2 = this.f47775OooO0o0;
        TopicInfoModel topicInfoModel = list.get(i2);
        topicSearchActivity.OooOoo().joinTopic(topicInfoModel.getId()).observe(topicSearchActivity, new c(topicInfoModel, topicSearchActivity, i2));
        return Unit.INSTANCE;
    }
}
