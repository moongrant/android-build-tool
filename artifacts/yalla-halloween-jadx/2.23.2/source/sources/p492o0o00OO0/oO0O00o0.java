package p492o0o00OO0;

import android.widget.ImageView;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.moment.TopicEditDescActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00o0 extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicEditDescActivity f49432OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00o0(TopicEditDescActivity topicEditDescActivity) {
        super(2);
        this.f49432OooO0Oo = topicEditDescActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        TopicEditDescActivity topicEditDescActivity = this.f49432OooO0Oo;
        if (zBooleanValue) {
            int i = TopicEditDescActivity.f25898OooOo0o;
            ImageView ivClear = topicEditDescActivity.OooOo().f45042OooO0OO;
            Intrinsics.checkNotNullExpressionValue(ivClear, "ivClear");
            o000O.OooOOOO(ivClear);
        } else {
            int i2 = TopicEditDescActivity.f25898OooOo0o;
            ImageView ivClear2 = topicEditDescActivity.OooOo().f45042OooO0OO;
            Intrinsics.checkNotNullExpressionValue(ivClear2, "ivClear");
            o000O.OooO0O0(ivClear2);
            topicEditDescActivity.OooOo().f45041OooO0O0.clearFocus();
        }
        return Unit.INSTANCE;
    }
}
