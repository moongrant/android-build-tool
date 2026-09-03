package p487o0o00O;

import android.view.View;
import com.yalla.yalla.ui.activity.main.TestActivity;
import com.yalla.yalla.ui.view.ScrollableViews;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOOo extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TestActivity f48899OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ScrollableViews f48900OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOOo(TestActivity testActivity, ScrollableViews scrollableViews) {
        super(1);
        this.f48899OooO0Oo = testActivity;
        this.f48900OooO0o0 = scrollableViews;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        TestActivity testActivity = this.f48899OooO0Oo;
        int i = testActivity.f25110OooOo0;
        ScrollableViews this_apply = this.f48900OooO0o0;
        if (i == 0) {
            this_apply.setDelay(200L);
            Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
            ScrollableViews.OooO00o(this_apply, 1);
            testActivity.f25110OooOo0++;
        } else if (i == 1) {
            this_apply.setDelay(100L);
            Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
            ScrollableViews.OooO00o(this_apply, 123);
            testActivity.f25110OooOo0++;
        } else if (i != 2) {
            this_apply.setDelay(0L);
            Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
            ScrollableViews.OooO00o(this_apply, 999);
            testActivity.f25110OooOo0 = 0;
        } else {
            this_apply.setDelay(50L);
            Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
            ScrollableViews.OooO00o(this_apply, 963);
            testActivity.f25110OooOo0++;
        }
        return Unit.INSTANCE;
    }
}
