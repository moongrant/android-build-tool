package p539o0o0OoOO;

import android.view.View;
import android.widget.FrameLayout;
import com.yalla.yalla.ui.view.ScrollableView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class j2 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ScrollableView f55577OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(ScrollableView scrollableView) {
        super(1);
        this.f55577OooO0Oo = scrollableView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        ScrollableView scrollableView = this.f55577OooO0Oo;
        if (scrollableView.f30606OooO0o == -1) {
            i2 i2Var = new i2(scrollableView);
            Intrinsics.checkNotNullParameter(it, "<this>");
            it.measure(0, 0);
            i2Var.invoke(it);
            scrollableView.setLayoutParams(new FrameLayout.LayoutParams(scrollableView.f30608OooO0oO, scrollableView.f30606OooO0o));
        }
        scrollableView.f30605OooO0Oo.add(it);
        scrollableView.getLinearLayout().addView(it);
        return Unit.INSTANCE;
    }
}
