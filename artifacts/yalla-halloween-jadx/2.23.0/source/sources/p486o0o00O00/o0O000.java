package p486o0o00O00;

import android.view.View;
import com.yalla.yalla.ui.activity.main.TestActivity;
import com.yalla.yalla.ui.view.ScrollableViews;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TestActivity f48337OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ScrollableViews f48338OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000(TestActivity testActivity, ScrollableViews scrollableViews) {
        super(1);
        this.f48337OooO0Oo = testActivity;
        this.f48338OooO0o0 = scrollableViews;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        TestActivity testActivity = this.f48337OooO0Oo;
        int i = testActivity.f25566OooOo0O;
        ScrollableViews invoke = this.f48338OooO0o0;
        if (i == 0) {
            invoke.setDelay(200L);
            Intrinsics.checkNotNullExpressionValue(invoke, "invoke");
            ScrollableViews.OooO00o(invoke, 1);
            testActivity.f25566OooOo0O++;
        } else if (i == 1) {
            invoke.setDelay(100L);
            Intrinsics.checkNotNullExpressionValue(invoke, "invoke");
            ScrollableViews.OooO00o(invoke, 123);
            testActivity.f25566OooOo0O++;
        } else if (i != 2) {
            invoke.setDelay(0L);
            Intrinsics.checkNotNullExpressionValue(invoke, "invoke");
            ScrollableViews.OooO00o(invoke, 999);
            testActivity.f25566OooOo0O = 0;
        } else {
            invoke.setDelay(50L);
            Intrinsics.checkNotNullExpressionValue(invoke, "invoke");
            ScrollableViews.OooO00o(invoke, 963);
            testActivity.f25566OooOo0O++;
        }
        return Unit.INSTANCE;
    }
}
