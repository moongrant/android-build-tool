package p601o0oo00Oo;

import com.yalla.yalla.ui.view.ScrollableViews;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ScrollableViews f48212Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f48213Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ char[] f48214Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0(ScrollableViews scrollableViews, int i, char[] cArr) {
        super(0);
        this.f48212Oooo0o = scrollableViews;
        this.f48213Oooo0oO = i;
        this.f48214Oooo0oo = cArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function0<Unit> scrollFinishListener;
        Function1<Integer, Unit> itemScrollFinishListener = this.f48212Oooo0o.getItemScrollFinishListener();
        if (itemScrollFinishListener != null) {
            itemScrollFinishListener.invoke(Integer.valueOf(this.f48213Oooo0oO));
        }
        if (this.f48213Oooo0oO == this.f48214Oooo0oo.length - 1 && (scrollFinishListener = this.f48212Oooo0o.getScrollFinishListener()) != null) {
            scrollFinishListener.invoke();
        }
        return Unit.INSTANCE;
    }
}
