package p492o0o00OO0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0ooO extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShowImageActivity f49549OooO0Oo;

    public oo0ooO(ShowImageActivity showImageActivity) {
        this.f49549OooO0Oo = showImageActivity;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(@NotNull MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        ShowImageActivity showImageActivity = this.f49549OooO0Oo;
        String str = showImageActivity.f25804OooOOo0.get(showImageActivity.OooOo0o().f44718OooO0o0.getCurrentItem());
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        showImageActivity.OooOo(str, true);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(@NotNull MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        int i = ShowImageActivity.f25802Oooo00o;
        this.f49549OooO0Oo.OooOoO();
        return true;
    }
}
