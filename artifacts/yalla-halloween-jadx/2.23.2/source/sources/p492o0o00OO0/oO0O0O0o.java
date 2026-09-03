package p492o0o00OO0;

import android.widget.ImageView;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.moment.TopicEditRuleActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0O0o extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicEditRuleActivity f49436OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0O0o(TopicEditRuleActivity topicEditRuleActivity) {
        super(2);
        this.f49436OooO0Oo = topicEditRuleActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        TopicEditRuleActivity topicEditRuleActivity = this.f49436OooO0Oo;
        if (zBooleanValue) {
            int i = TopicEditRuleActivity.f25907OooOo0o;
            ImageView ivClear = topicEditRuleActivity.OooOo().f45046OooO0OO;
            Intrinsics.checkNotNullExpressionValue(ivClear, "ivClear");
            o000O.OooOOOO(ivClear);
        } else {
            int i2 = TopicEditRuleActivity.f25907OooOo0o;
            ImageView ivClear2 = topicEditRuleActivity.OooOo().f45046OooO0OO;
            Intrinsics.checkNotNullExpressionValue(ivClear2, "ivClear");
            o000O.OooO0O0(ivClear2);
            topicEditRuleActivity.OooOo().f45045OooO0O0.clearFocus();
        }
        return Unit.INSTANCE;
    }
}
