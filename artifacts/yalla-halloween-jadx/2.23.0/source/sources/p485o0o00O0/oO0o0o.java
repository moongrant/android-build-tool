package p485o0o00O0;

import android.widget.ImageView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.moment.TopicCreateNameActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0o0o extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicCreateNameActivity f48131OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0o0o(TopicCreateNameActivity topicCreateNameActivity) {
        super(2);
        this.f48131OooO0Oo = topicCreateNameActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        TopicCreateNameActivity topicCreateNameActivity = this.f48131OooO0Oo;
        if (zBooleanValue) {
            int i = TopicCreateNameActivity.f26302OooOo0;
            ImageView imageView = topicCreateNameActivity.OooOo().f57732OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivClear");
            o000OO00.OooOOOO(imageView);
        } else {
            int i2 = TopicCreateNameActivity.f26302OooOo0;
            ImageView imageView2 = topicCreateNameActivity.OooOo().f57732OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivClear");
            o000OO00.OooO0O0(imageView2);
            topicCreateNameActivity.OooOo().f57731OooO0O0.clearFocus();
        }
        return Unit.INSTANCE;
    }
}
