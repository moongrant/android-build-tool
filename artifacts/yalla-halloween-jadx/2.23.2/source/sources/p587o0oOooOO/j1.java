package p587o0oOooOO;

import android.view.View;
import android.widget.LinearLayout;
import com.yalla.yalla.ui.view.ScrollableView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p110o000ooo0.o0000Ooo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nScrollableView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableView.kt\ncom/yalla/yalla/ui/view/ScrollableView$setNumber$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1855#2,2:183\n*S KotlinDebug\n*F\n+ 1 ScrollableView.kt\ncom/yalla/yalla/ui/view/ScrollableView$setNumber$3\n*L\n92#1:183,2\n*E\n"})
public final class j1 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ScrollableView f56849OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f56850OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f56851OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(ScrollableView scrollableView, long j, Function0<Unit> function0) {
        super(1);
        this.f56849OooO0Oo = scrollableView;
        this.f56851OooO0o0 = j;
        this.f56850OooO0o = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        ScrollableView scrollableView = this.f56849OooO0Oo;
        final int measuredHeight = scrollableView.getLinearLayout().getMeasuredHeight();
        LinearLayout linearLayout = scrollableView.getLinearLayout();
        final long j = this.f56851OooO0o0;
        final ScrollableView scrollableView2 = this.f56849OooO0Oo;
        final Function0<Unit> function0 = this.f56850OooO0o;
        linearLayout.postDelayed(new Runnable() { // from class: o0oOooOO.i1
            @Override // java.lang.Runnable
            public final void run() {
                ScrollableView this$0 = scrollableView2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int smoothScrollDuration = j > 0 ? this$0.getSmoothScrollDuration() : 0;
                this$0.f30059OooO.startScroll(this$0.getScrollX(), this$0.getScrollY(), 0 - this$0.getScrollX(), (measuredHeight - this$0.f30061OooO0o) - this$0.getScrollY(), smoothScrollDuration);
                this$0.invalidate();
                this$0.getLinearLayout().postDelayed(new o0000Ooo(2, this$0, function0), ((long) smoothScrollDuration) + 100);
            }
        }, j);
        return Unit.INSTANCE;
    }
}
