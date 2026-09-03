package p538o0o0Oo0;

import android.widget.ImageView;
import com.yalla.yalla.ui.activity.moment.TopicEditRuleActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00OO extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicEditRuleActivity f44032Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00OO(TopicEditRuleActivity topicEditRuleActivity) {
        super(2);
        this.f44032Oooo0o = topicEditRuleActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        if (bool.booleanValue()) {
            TopicEditRuleActivity topicEditRuleActivity = this.f44032Oooo0o;
            int i = TopicEditRuleActivity.f22610OooooOO;
            ImageView imageView = topicEditRuleActivity.OooOoo().f49030OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivClear");
            oOO00O.OooO(imageView);
        } else {
            TopicEditRuleActivity topicEditRuleActivity2 = this.f44032Oooo0o;
            int i2 = TopicEditRuleActivity.f22610OooooOO;
            ImageView imageView2 = topicEditRuleActivity2.OooOoo().f49030OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivClear");
            oOO00O.OooO00o(imageView2);
            this.f44032Oooo0o.OooOoo().f49029OooO0O0.clearFocus();
        }
        return Unit.INSTANCE;
    }
}
