package o000OOoO;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends Animation {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f34899OooO0Oo;

    public OooO0OO(SwipeRefreshLayout swipeRefreshLayout) {
        this.f34899OooO0Oo = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f34899OooO0Oo.setAnimationProgress(1.0f - f);
    }
}
