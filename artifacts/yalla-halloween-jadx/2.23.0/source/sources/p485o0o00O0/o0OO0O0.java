package p485o0o00O0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0O0 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShowImageActivity f47992OooO0Oo;

    public o0OO0O0(ShowImageActivity showImageActivity) {
        this.f47992OooO0Oo = showImageActivity;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(@NotNull MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        ShowImageActivity showImageActivity = this.f47992OooO0Oo;
        String str = showImageActivity.f26253OooOOo0.get(showImageActivity.OooOo0o().f59458OooO0o0.getCurrentItem());
        Intrinsics.checkNotNullExpressionValue(str, "mImageUrlList[bind.viewPager.currentItem]");
        showImageActivity.OooOo(str, true);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(@NotNull MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        int i = ShowImageActivity.f26251Oooo00o;
        this.f47992OooO0Oo.OooOoO();
        return true;
    }
}
