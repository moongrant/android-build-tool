package p601o0oo00Oo;

import android.view.View;
import com.yalla.yalla.ui.view.ScrollableView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ScrollableView f48194Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO(ScrollableView scrollableView) {
        super(1);
        this.f48194Oooo0o = scrollableView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        int measuredHeight = it.getMeasuredHeight();
        ScrollableView scrollableView = this.f48194Oooo0o;
        if (measuredHeight > scrollableView.f25127Oooo0oo) {
            scrollableView.f25127Oooo0oo = it.getMeasuredHeight();
        }
        int measuredWidth = it.getMeasuredWidth();
        ScrollableView scrollableView2 = this.f48194Oooo0o;
        if (measuredWidth > scrollableView2.f25124Oooo) {
            scrollableView2.f25124Oooo = it.getMeasuredWidth();
        }
        return Unit.INSTANCE;
    }
}
