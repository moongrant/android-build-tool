package p492o0o00OO0;

import android.view.View;
import android.widget.FrameLayout;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p511o0o0O.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO0000Oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49364OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49365OooO0o0;

    public /* synthetic */ oO0000Oo(Object obj, int i) {
        this.f49364OooO0Oo = i;
        this.f49365OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f49364OooO0Oo;
        Object obj = this.f49365OooO0o0;
        switch (i) {
            case 0:
                TopicDetailActivity this$0 = (TopicDetailActivity) obj;
                int i2 = TopicDetailActivity.f25854OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO0();
                break;
            default:
                o00000OO this$1 = (o00000OO) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                FrameLayout overrideGiftContainer = this$1.OooOOo0().f44518OooOOoo;
                Intrinsics.checkNotNullExpressionValue(overrideGiftContainer, "overrideGiftContainer");
                o000O.OooO0O0(overrideGiftContainer);
                break;
        }
    }
}
