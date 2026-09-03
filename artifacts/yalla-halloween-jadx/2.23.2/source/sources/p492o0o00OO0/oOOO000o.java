package p492o0o00OO0;

import com.yalla.yalla.ui.activity.moment.TopicSettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p139o00OOOo0.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO000o extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSettingActivity f49494OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO000o(TopicSettingActivity topicSettingActivity) {
        super(1);
        this.f49494OooO0Oo = topicSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        TopicSettingActivity topicSettingActivity = this.f49494OooO0Oo;
        if (zBooleanValue) {
            topicSettingActivity.getClass();
            OooOO0O.OooO0OO(topicSettingActivity, 1.0f, 1.0f, false, false, new oOO(topicSettingActivity));
            topicSettingActivity.OooOo().f45091OooOO0o.setEnabled(true);
        } else {
            int i = TopicSettingActivity.f25963OooOo0O;
            topicSettingActivity.OooOo().f45091OooOO0o.setEnabled(true);
        }
        return Unit.INSTANCE;
    }
}
