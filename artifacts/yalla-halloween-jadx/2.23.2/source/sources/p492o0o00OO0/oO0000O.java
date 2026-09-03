package p492o0o00OO0;

import android.widget.ImageView;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.moment.TopicCreateNameActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000O extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicCreateNameActivity f49363OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000O(TopicCreateNameActivity topicCreateNameActivity) {
        super(2);
        this.f49363OooO0Oo = topicCreateNameActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        TopicCreateNameActivity topicCreateNameActivity = this.f49363OooO0Oo;
        if (zBooleanValue) {
            int i = TopicCreateNameActivity.f25851OooOo0;
            ImageView ivClear = topicCreateNameActivity.OooOo().f45033OooO0OO;
            Intrinsics.checkNotNullExpressionValue(ivClear, "ivClear");
            o000O.OooOOOO(ivClear);
        } else {
            int i2 = TopicCreateNameActivity.f25851OooOo0;
            ImageView ivClear2 = topicCreateNameActivity.OooOo().f45033OooO0OO;
            Intrinsics.checkNotNullExpressionValue(ivClear2, "ivClear");
            o000O.OooO0O0(ivClear2);
            topicCreateNameActivity.OooOo().f45032OooO0O0.clearFocus();
        }
        return Unit.INSTANCE;
    }
}
