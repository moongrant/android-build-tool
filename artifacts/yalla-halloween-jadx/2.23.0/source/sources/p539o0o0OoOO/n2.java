package p539o0o0OoOO;

import android.view.View;
import android.widget.LinearLayout;
import com.yalla.yalla.ui.view.ScrollableView;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nScrollableView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableView.kt\ncom/yalla/yalla/ui/view/ScrollableView$setNumber$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1855#2,2:183\n*S KotlinDebug\n*F\n+ 1 ScrollableView.kt\ncom/yalla/yalla/ui/view/ScrollableView$setNumber$3\n*L\n92#1:183,2\n*E\n"})
public final class n2 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ScrollableView f55601OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f55602OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f55603OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(ScrollableView scrollableView, long j, Function0<Unit> function0) {
        super(1);
        this.f55601OooO0Oo = scrollableView;
        this.f55603OooO0o0 = j;
        this.f55602OooO0o = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        ScrollableView scrollableView = this.f55601OooO0Oo;
        final int measuredHeight = scrollableView.getLinearLayout().getMeasuredHeight();
        LinearLayout linearLayout = scrollableView.getLinearLayout();
        final long j = this.f55603OooO0o0;
        final ScrollableView scrollableView2 = this.f55601OooO0Oo;
        final Function0<Unit> function0 = this.f55602OooO0o;
        linearLayout.postDelayed(new Runnable() { // from class: o0o0OoOO.l2
            @Override // java.lang.Runnable
            public final void run() {
                final ScrollableView this$0 = scrollableView2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int smoothScrollDuration = j > 0 ? this$0.getSmoothScrollDuration() : 0;
                this$0.f30604OooO.startScroll(this$0.getScrollX(), this$0.getScrollY(), 0 - this$0.getScrollX(), (measuredHeight - this$0.f30606OooO0o) - this$0.getScrollY(), smoothScrollDuration);
                this$0.invalidate();
                LinearLayout linearLayout2 = this$0.getLinearLayout();
                final Function0 function1 = function0;
                linearLayout2.postDelayed(new Runnable() { // from class: o0o0OoOO.m2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScrollableView this$1 = this$0;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        Iterator it2 = this$1.f30605OooO0Oo.iterator();
                        while (it2.hasNext()) {
                            this$1.getLinearLayout().removeView((View) it2.next());
                        }
                        this$1.f30605OooO0Oo.clear();
                        Function0 function2 = function1;
                        if (function2 != null) {
                            function2.invoke();
                        }
                        this$1.invalidate();
                    }
                }, ((long) smoothScrollDuration) + 100);
            }
        }, j);
        return Unit.INSTANCE;
    }
}
