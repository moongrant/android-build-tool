package p485o0o00O0;

import android.widget.ImageView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.moment.TopicEditRuleActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0000 extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicEditRuleActivity f48139OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0000(TopicEditRuleActivity topicEditRuleActivity) {
        super(2);
        this.f48139OooO0Oo = topicEditRuleActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        TopicEditRuleActivity topicEditRuleActivity = this.f48139OooO0Oo;
        if (zBooleanValue) {
            int i = TopicEditRuleActivity.f26358OooOo0o;
            ImageView imageView = topicEditRuleActivity.OooOo().f57972OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivClear");
            o000OO00.OooOOOO(imageView);
        } else {
            int i2 = TopicEditRuleActivity.f26358OooOo0o;
            ImageView imageView2 = topicEditRuleActivity.OooOo().f57972OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivClear");
            o000OO00.OooO0O0(imageView2);
            topicEditRuleActivity.OooOo().f57971OooO0O0.clearFocus();
        }
        return Unit.INSTANCE;
    }
}
