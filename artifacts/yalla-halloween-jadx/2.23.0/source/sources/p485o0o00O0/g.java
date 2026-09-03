package p485o0o00O0;

import com.yalla.yalla.ui.activity.moment.TopicSettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o00O0OO.OooO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSettingActivity f47783OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TopicSettingActivity topicSettingActivity) {
        super(1);
        this.f47783OooO0Oo = topicSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        TopicSettingActivity topicSettingActivity = this.f47783OooO0Oo;
        if (zBooleanValue) {
            topicSettingActivity.getClass();
            OooO0o.OooO0OO(topicSettingActivity, 1.0f, 1.0f, false, false, new f(topicSettingActivity));
            topicSettingActivity.OooOo().f58276OooOO0o.setEnabled(true);
        } else {
            int i = TopicSettingActivity.f26415OooOo0O;
            topicSettingActivity.OooOo().f58276OooOO0o.setEnabled(true);
        }
        return Unit.INSTANCE;
    }
}
