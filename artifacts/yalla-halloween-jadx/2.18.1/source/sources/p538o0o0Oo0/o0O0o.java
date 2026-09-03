package p538o0o0Oo0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0o extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ShowImageActivity f44015OooO00o;

    public o0O0o(ShowImageActivity showImageActivity) {
        this.f44015OooO00o = showImageActivity;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(@Nullable MotionEvent motionEvent) {
        ShowImageActivity showImageActivity = this.f44015OooO00o;
        String str = showImageActivity.f22516OoooOo0.get(showImageActivity.OooOoo().f50708OooO0o0.getCurrentItem());
        Intrinsics.checkNotNullExpressionValue(str, "mImageUrlList[bind.viewPager.currentItem]");
        showImageActivity.OooOooO(str, true);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(@Nullable MotionEvent motionEvent) {
        ShowImageActivity showImageActivity = this.f44015OooO00o;
        ShowImageActivity.OooO00o oooO00o = ShowImageActivity.f22515o00o0O;
        showImageActivity.Oooo00o();
        return true;
    }
}
