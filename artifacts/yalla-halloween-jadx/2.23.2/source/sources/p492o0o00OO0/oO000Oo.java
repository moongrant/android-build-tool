package p492o0o00OO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p230o00oOo0o.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000Oo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f49371OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<o000000> f49372OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000Oo(TopicDetailActivity topicDetailActivity, Ref.ObjectRef<o000000> objectRef) {
        super(2);
        this.f49371OooO0Oo = topicDetailActivity;
        this.f49372OooO0o0 = objectRef;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1058459476, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicDetailActivity.initView.<anonymous> (TopicDetailActivity.kt:359)");
            }
            TopicDetailActivity topicDetailActivity = this.f49371OooO0Oo;
            TopicInfoModel topicInfoModel = topicDetailActivity.f25858OooOo00;
            if (topicInfoModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("topicInfoModel");
                topicInfoModel = null;
            }
            Long lValueOf = Long.valueOf(topicInfoModel.getId());
            TopicDetailActivity topicDetailActivity2 = this.f49371OooO0Oo;
            o000000 o000000Var = this.f49372OooO0o0.element;
            Intrinsics.checkNotNull(o000000Var);
            oO00OOo0.OooO00o(lValueOf, topicDetailActivity2, o000000Var, topicDetailActivity.OooOoo0(), composer2, 4160);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
