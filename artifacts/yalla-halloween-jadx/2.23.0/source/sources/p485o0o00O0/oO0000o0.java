package p485o0o00O0;

import com.yalla.yalla.ui.activity.moment.TopicCreateActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o00O0OO.OooO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000o0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicCreateActivity f48036OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000o0(TopicCreateActivity topicCreateActivity) {
        super(1);
        this.f48036OooO0Oo = topicCreateActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        TopicCreateActivity topicCreateActivity = this.f48036OooO0Oo;
        if (zBooleanValue) {
            OooO0o.OooO0OO(topicCreateActivity, 1.0f, 1.0f, false, false, new oO0000Oo(topicCreateActivity));
            int i = TopicCreateActivity.f26287OooOo0O;
            topicCreateActivity.OooOo().f57587OooO0OO.f58952OooO0O0.setEnabled(true);
        } else {
            int i2 = TopicCreateActivity.f26287OooOo0O;
            topicCreateActivity.OooOo().f57587OooO0OO.f58952OooO0O0.setEnabled(true);
        }
        return Unit.INSTANCE;
    }
}
