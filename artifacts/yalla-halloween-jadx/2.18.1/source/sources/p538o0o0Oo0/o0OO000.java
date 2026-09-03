package p538o0o0Oo0;

import android.widget.ImageView;
import com.yalla.yalla.ui.activity.moment.TopicEditDescActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO000 extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicEditDescActivity f44028Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000(TopicEditDescActivity topicEditDescActivity) {
        super(2);
        this.f44028Oooo0o = topicEditDescActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        if (bool.booleanValue()) {
            TopicEditDescActivity topicEditDescActivity = this.f44028Oooo0o;
            int i = TopicEditDescActivity.f22601OooooOO;
            ImageView imageView = topicEditDescActivity.OooOoo().f48939OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivClear");
            oOO00O.OooO(imageView);
        } else {
            TopicEditDescActivity topicEditDescActivity2 = this.f44028Oooo0o;
            int i2 = TopicEditDescActivity.f22601OooooOO;
            ImageView imageView2 = topicEditDescActivity2.OooOoo().f48939OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivClear");
            oOO00O.OooO00o(imageView2);
            this.f44028Oooo0o.OooOoo().f48938OooO0O0.clearFocus();
        }
        return Unit.INSTANCE;
    }
}
