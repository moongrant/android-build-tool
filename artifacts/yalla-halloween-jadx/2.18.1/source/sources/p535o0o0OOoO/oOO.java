package p535o0o0OOoO;

import android.view.View;
import com.qiniu.android.dns.NetworkInfo;
import com.yalla.yalla.ui.activity.main.TestActivity;
import com.yalla.yalla.ui.view.ScrollableViews;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TestActivity f43673Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ScrollableViews f43674Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO(TestActivity testActivity, ScrollableViews scrollableViews) {
        super(1);
        this.f43673Oooo0o = testActivity;
        this.f43674Oooo0oO = scrollableViews;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        int i = this.f43673Oooo0o.f22088Ooooo00;
        if (i == 0) {
            this.f43674Oooo0oO.setDelay(200L);
            ScrollableViews scrollableViews = this.f43674Oooo0oO;
            Intrinsics.checkNotNullExpressionValue(scrollableViews, "");
            ScrollableViews.OooO00o(scrollableViews, 1);
            this.f43673Oooo0o.f22088Ooooo00++;
        } else if (i == 1) {
            this.f43674Oooo0oO.setDelay(100L);
            ScrollableViews scrollableViews2 = this.f43674Oooo0oO;
            Intrinsics.checkNotNullExpressionValue(scrollableViews2, "");
            ScrollableViews.OooO00o(scrollableViews2, 123);
            this.f43673Oooo0o.f22088Ooooo00++;
        } else if (i != 2) {
            this.f43674Oooo0oO.setDelay(0L);
            ScrollableViews scrollableViews3 = this.f43674Oooo0oO;
            Intrinsics.checkNotNullExpressionValue(scrollableViews3, "");
            ScrollableViews.OooO00o(scrollableViews3, NetworkInfo.ISP_OTHER);
            this.f43673Oooo0o.f22088Ooooo00 = 0;
        } else {
            this.f43674Oooo0oO.setDelay(50L);
            ScrollableViews scrollableViews4 = this.f43674Oooo0oO;
            Intrinsics.checkNotNullExpressionValue(scrollableViews4, "");
            ScrollableViews.OooO00o(scrollableViews4, 963);
            this.f43673Oooo0o.f22088Ooooo00++;
        }
        return Unit.INSTANCE;
    }
}
