package p098o000o0oO;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o extends Animation {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f29318Oooo0o;

    public o0OOO0o(SwipeRefreshLayout swipeRefreshLayout) {
        this.f29318Oooo0o = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f29318Oooo0o.setAnimationProgress(f);
    }
}
