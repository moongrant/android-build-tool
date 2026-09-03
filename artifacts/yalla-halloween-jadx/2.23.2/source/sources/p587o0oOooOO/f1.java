package p587o0oOooOO;

import android.view.View;
import com.yalla.yalla.ui.view.ScrollableView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ScrollableView f56790OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(ScrollableView scrollableView) {
        super(1);
        this.f56790OooO0Oo = scrollableView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        int measuredHeight = it.getMeasuredHeight();
        ScrollableView scrollableView = this.f56790OooO0Oo;
        if (measuredHeight > scrollableView.f30061OooO0o) {
            scrollableView.f30061OooO0o = it.getMeasuredHeight();
        }
        if (it.getMeasuredWidth() > scrollableView.f30063OooO0oO) {
            scrollableView.f30063OooO0oO = it.getMeasuredWidth();
        }
        return Unit.INSTANCE;
    }
}
