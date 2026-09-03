package p485o0o00O0;

import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00O0oO extends Lambda implements Function1<TopicInfoModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f48047OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0oO(TopicDetailActivity topicDetailActivity) {
        super(1);
        this.f48047OooO0Oo = topicDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TopicInfoModel topicInfoModel) {
        TopicInfoModel it = topicInfoModel;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        TopicDetailActivity.OooOo(this.f48047OooO0Oo, it);
        return Unit.INSTANCE;
    }
}
