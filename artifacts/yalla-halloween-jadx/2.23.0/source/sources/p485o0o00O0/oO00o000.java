package p485o0o00O0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p184o00o00o.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f48057OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<Oooo000> f48058OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o000(TopicDetailActivity topicDetailActivity, Ref.ObjectRef<Oooo000> objectRef) {
        super(2);
        this.f48057OooO0Oo = topicDetailActivity;
        this.f48058OooO0o0 = objectRef;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1058459476, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicDetailActivity.initView.<anonymous> (TopicDetailActivity.kt:358)");
            }
            TopicDetailActivity topicDetailActivity = this.f48057OooO0Oo;
            TopicInfoModel topicInfoModel = topicDetailActivity.f26309OooOo00;
            if (topicInfoModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topicInfoModel");
                topicInfoModel = null;
            }
            Long lValueOf = Long.valueOf(topicInfoModel.getId());
            TopicDetailActivity topicDetailActivity2 = this.f48057OooO0Oo;
            Oooo000 oooo000 = this.f48058OooO0o0.element;
            Intrinsics.checkNotNull(oooo000);
            oOo000o0.OooO00o(lValueOf, topicDetailActivity2, oooo000, topicDetailActivity.OooOoo0(), composer2, 4160);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
