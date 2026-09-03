package p485o0o00O0;

import android.widget.ImageView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.moment.TopicEditDescActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0o0000 extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicEditDescActivity f48130OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0o0000(TopicEditDescActivity topicEditDescActivity) {
        super(2);
        this.f48130OooO0Oo = topicEditDescActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        TopicEditDescActivity topicEditDescActivity = this.f48130OooO0Oo;
        if (zBooleanValue) {
            int i = TopicEditDescActivity.f26349OooOo0o;
            ImageView imageView = topicEditDescActivity.OooOo().f57920OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivClear");
            o000OO00.OooOOOO(imageView);
        } else {
            int i2 = TopicEditDescActivity.f26349OooOo0o;
            ImageView imageView2 = topicEditDescActivity.OooOo().f57920OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivClear");
            o000OO00.OooO0O0(imageView2);
            topicEditDescActivity.OooOo().f57919OooO0O0.clearFocus();
        }
        return Unit.INSTANCE;
    }
}
