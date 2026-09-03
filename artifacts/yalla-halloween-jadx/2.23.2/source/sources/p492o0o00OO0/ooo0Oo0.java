package p492o0o00OO0;

import com.yalla.yalla.ui.activity.moment.TopicCreateActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p139o00OOOo0.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class ooo0Oo0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicCreateActivity f49555OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0Oo0(TopicCreateActivity topicCreateActivity) {
        super(1);
        this.f49555OooO0Oo = topicCreateActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        TopicCreateActivity topicCreateActivity = this.f49555OooO0Oo;
        if (zBooleanValue) {
            OooOO0O.OooO0OO(topicCreateActivity, 1.0f, 1.0f, false, false, new o0oo0000(topicCreateActivity));
            int i = TopicCreateActivity.f25836OooOo0O;
            topicCreateActivity.OooOo().f45027OooO0OO.f45002OooO0O0.setEnabled(true);
        } else {
            int i2 = TopicCreateActivity.f25836OooOo0O;
            topicCreateActivity.OooOo().f45027OooO0OO.f45002OooO0O0.setEnabled(true);
        }
        return Unit.INSTANCE;
    }
}
