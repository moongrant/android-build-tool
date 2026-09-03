package o000OOoO;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends Animation {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34900OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f34901OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f34902OooO0o0;

    public OooO0o(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.f34901OooO0o = swipeRefreshLayout;
        this.f34900OooO0Oo = i;
        this.f34902OooO0o0 = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        CircularProgressDrawable circularProgressDrawable = this.f34901OooO0o.f8069OooOoo0;
        int i = this.f34900OooO0Oo;
        circularProgressDrawable.setAlpha((int) (((this.f34902OooO0o0 - i) * f) + i));
    }
}
