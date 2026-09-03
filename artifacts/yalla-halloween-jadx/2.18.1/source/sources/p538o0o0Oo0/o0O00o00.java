package p538o0o0Oo0;

import com.yalla.yalla.ui.activity.moment.TopicCreateActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p193o00o0O00.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00o00 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicCreateActivity f44004Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o00(TopicCreateActivity topicCreateActivity) {
        super(1);
        this.f44004Oooo0o = topicCreateActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            TopicCreateActivity topicCreateActivity = this.f44004Oooo0o;
            Oooo0.f33130OooO00o.OooO0O0(topicCreateActivity, 1.0f, 1.0f, false, false, new o0oO0Ooo(topicCreateActivity));
            TopicCreateActivity topicCreateActivity2 = this.f44004Oooo0o;
            int i = TopicCreateActivity.f22549OooooO0;
            topicCreateActivity2.OooOoo().f50889OooO0OO.f50969OooO0O0.setEnabled(true);
        } else {
            TopicCreateActivity topicCreateActivity3 = this.f44004Oooo0o;
            int i2 = TopicCreateActivity.f22549OooooO0;
            topicCreateActivity3.OooOoo().f50889OooO0OO.f50969OooO0O0.setEnabled(true);
        }
        return Unit.INSTANCE;
    }
}
