package p420o0Oo0ooO;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.squareup.picasso.o000oOoO;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00Oo0 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o000oOoO f39771Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final WeakReference<ImageView> f39772Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public oO00Oo00 f39773Oooo0oo;

    public oO00Oo0(o000oOoO o000oooo2, ImageView imageView, oO00Oo00 oo00oo00) {
        this.f39771Oooo0o = o000oooo2;
        this.f39772Oooo0oO = new WeakReference<>(imageView);
        this.f39773Oooo0oo = oo00oo00;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ImageView imageView = this.f39772Oooo0oO.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            o000oOoO o000oooo2 = this.f39771Oooo0o;
            o000oooo2.f19817OooO0OO = false;
            o000oooo2.f19816OooO0O0.OooO00o(width, height);
            o000oooo2.OooO0O0(imageView, this.f39773Oooo0oo);
        }
        return true;
    }
}
