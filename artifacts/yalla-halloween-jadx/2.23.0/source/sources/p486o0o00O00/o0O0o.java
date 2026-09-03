package p486o0o00O00;

import android.view.View;
import com.yalla.yalla.ui.activity.main.TestActivity;
import com.yalla.yalla.ui.view.ScrollableViews;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TestActivity f48382OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ScrollableViews f48383OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o(TestActivity testActivity, ScrollableViews scrollableViews) {
        super(1);
        this.f48382OooO0Oo = testActivity;
        this.f48383OooO0o0 = scrollableViews;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        TestActivity testActivity = this.f48382OooO0Oo;
        int i = testActivity.f25565OooOo00;
        ScrollableViews invoke = this.f48383OooO0o0;
        if (i == 0) {
            invoke.setDelay(200L);
            Intrinsics.checkNotNullExpressionValue(invoke, "invoke");
            ScrollableViews.OooO00o(invoke, 1);
            testActivity.f25565OooOo00++;
        } else if (i == 1) {
            invoke.setDelay(100L);
            Intrinsics.checkNotNullExpressionValue(invoke, "invoke");
            ScrollableViews.OooO00o(invoke, 123);
            testActivity.f25565OooOo00++;
        } else if (i != 2) {
            invoke.setDelay(0L);
            Intrinsics.checkNotNullExpressionValue(invoke, "invoke");
            ScrollableViews.OooO00o(invoke, 999);
            testActivity.f25565OooOo00 = 0;
        } else {
            invoke.setDelay(50L);
            Intrinsics.checkNotNullExpressionValue(invoke, "invoke");
            ScrollableViews.OooO00o(invoke, 963);
            testActivity.f25565OooOo00++;
        }
        return Unit.INSTANCE;
    }
}
