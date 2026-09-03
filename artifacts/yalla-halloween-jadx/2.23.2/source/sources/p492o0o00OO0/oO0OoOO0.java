package p492o0o00OO0;

import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OoOO0 extends Lambda implements Function1<TopicInfoModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f49455OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OoOO0(TopicDetailActivity topicDetailActivity) {
        super(1);
        this.f49455OooO0Oo = topicDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TopicInfoModel topicInfoModel) {
        TopicInfoModel topicInfoModel2 = topicInfoModel;
        Intrinsics.checkNotNull(topicInfoModel2);
        TopicDetailActivity.OooOo(this.f49455OooO0Oo, topicInfoModel2);
        return Unit.INSTANCE;
    }
}
