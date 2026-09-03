package o00O00;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends Animation {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f36005OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f36006OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f36007OooO0o0;

    public OooO0o(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.f36006OooO0o = swipeRefreshLayout;
        this.f36005OooO0Oo = i;
        this.f36007OooO0o0 = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        CircularProgressDrawable circularProgressDrawable = this.f36006OooO0o.f11163OooOoo0;
        int i = this.f36005OooO0Oo;
        circularProgressDrawable.setAlpha((int) (((this.f36007OooO0o0 - i) * f) + i));
    }
}
