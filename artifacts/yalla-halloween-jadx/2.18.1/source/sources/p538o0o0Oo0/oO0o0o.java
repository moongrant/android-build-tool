package p538o0o0Oo0;

import com.yalla.yalla.ui.activity.moment.TopicSettingActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p193o00o0O00.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0o0o extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicSettingActivity f44098Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0o0o(TopicSettingActivity topicSettingActivity) {
        super(1);
        this.f44098Oooo0o = topicSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            TopicSettingActivity topicSettingActivity = this.f44098Oooo0o;
            Objects.requireNonNull(topicSettingActivity);
            Oooo0.f33130OooO00o.OooO0O0(topicSettingActivity, 1.0f, 1.0f, false, false, new oO0Ooooo(this.f44098Oooo0o));
            this.f44098Oooo0o.OooOoo().f49374OooOO0o.setEnabled(true);
        } else {
            TopicSettingActivity topicSettingActivity2 = this.f44098Oooo0o;
            TopicSettingActivity.OooO00o oooO00o = TopicSettingActivity.f22666OooooO0;
            topicSettingActivity2.OooOoo().f49374OooOO0o.setEnabled(true);
        }
        return Unit.INSTANCE;
    }
}
