package p539o0o0OoOO;

import com.yalla.yalla.ui.view.ScrollableViews;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class p2 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ScrollableViews f55644OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ char[] f55645OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f55646OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(ScrollableViews scrollableViews, int i, char[] cArr) {
        super(0);
        this.f55644OooO0Oo = scrollableViews;
        this.f55646OooO0o0 = i;
        this.f55645OooO0o = cArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> scrollFinishListener;
        ScrollableViews scrollableViews = this.f55644OooO0Oo;
        Function1<Integer, Unit> itemScrollFinishListener = scrollableViews.getItemScrollFinishListener();
        int i = this.f55646OooO0o0;
        if (itemScrollFinishListener != null) {
            itemScrollFinishListener.invoke(Integer.valueOf(i));
        }
        if (i == this.f55645OooO0o.length - 1 && (scrollFinishListener = scrollableViews.getScrollFinishListener()) != null) {
            scrollFinishListener.invoke();
        }
        return Unit.INSTANCE;
    }
}
