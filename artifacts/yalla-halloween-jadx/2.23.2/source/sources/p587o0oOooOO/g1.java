package p587o0oOooOO;

import android.view.View;
import android.widget.FrameLayout;
import com.yalla.yalla.ui.view.ScrollableView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ScrollableView f56803OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(ScrollableView scrollableView) {
        super(1);
        this.f56803OooO0Oo = scrollableView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        ScrollableView scrollableView = this.f56803OooO0Oo;
        if (scrollableView.f30061OooO0o == -1) {
            f1 f1Var = new f1(scrollableView);
            Intrinsics.checkNotNullParameter(it, "<this>");
            it.measure(0, 0);
            f1Var.invoke(it);
            scrollableView.setLayoutParams(new FrameLayout.LayoutParams(scrollableView.f30063OooO0oO, scrollableView.f30061OooO0o));
        }
        scrollableView.f30060OooO0Oo.add(it);
        scrollableView.getLinearLayout().addView(it);
        return Unit.INSTANCE;
    }
}
