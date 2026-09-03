package p538o0o0Oo0;

import android.widget.ImageView;
import com.yalla.yalla.ui.activity.moment.TopicCreateNameActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0oo0o extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicCreateNameActivity f44024Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo0o(TopicCreateNameActivity topicCreateNameActivity) {
        super(2);
        this.f44024Oooo0o = topicCreateNameActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        if (bool.booleanValue()) {
            TopicCreateNameActivity topicCreateNameActivity = this.f44024Oooo0o;
            int i = TopicCreateNameActivity.f22564Ooooo0o;
            ImageView imageView = topicCreateNameActivity.OooOoo().f51023OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivClear");
            oOO00O.OooO(imageView);
        } else {
            TopicCreateNameActivity topicCreateNameActivity2 = this.f44024Oooo0o;
            int i2 = TopicCreateNameActivity.f22564Ooooo0o;
            ImageView imageView2 = topicCreateNameActivity2.OooOoo().f51023OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivClear");
            oOO00O.OooO00o(imageView2);
            this.f44024Oooo0o.OooOoo().f51022OooO0O0.clearFocus();
        }
        return Unit.INSTANCE;
    }
}
