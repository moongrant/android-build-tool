package p101o000oOoo;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class oO0o0o extends ViewGroup implements oO000O0 {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final /* synthetic */ int f29769OoooO0O = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f29770Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ViewGroup f29771Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f29772Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final View f29773Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final OooO00o f29774OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public Matrix f29775OoooO00;

    public class OooO00o implements ViewTreeObserver.OnPreDrawListener {
        public OooO00o() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view;
            oO0o0o oo0o0o = oO0o0o.this;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(oo0o0o);
            oO0o0o oo0o0o2 = oO0o0o.this;
            ViewGroup viewGroup = oo0o0o2.f29771Oooo0o;
            if (viewGroup == null || (view = oo0o0o2.f29772Oooo0oO) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            ViewCompat.OooO0o.OooOO0O(oO0o0o.this.f29771Oooo0o);
            oO0o0o oo0o0o3 = oO0o0o.this;
            oo0o0o3.f29771Oooo0o = null;
            oo0o0o3.f29772Oooo0oO = null;
            return true;
        }
    }

    public oO0o0o(View view) {
        super(view.getContext());
        this.f29774OoooO0 = new OooO00o();
        this.f29773Oooo0oo = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    public static void OooO0O0(View view, View view2) {
        oO00OO0O.OooO0O0(view2, view2.getLeft(), view2.getTop(), view.getWidth() + view2.getLeft(), view.getHeight() + view2.getTop());
    }

    public static oO0o0o OooO0OO(View view) {
        return (oO0o0o) view.getTag(oO000OOo.ghost_view);
    }

    @Override // p101o000oOoo.oO000O0
    public final void OooO00o(ViewGroup viewGroup, View view) {
        this.f29771Oooo0o = viewGroup;
        this.f29772Oooo0oO = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29773Oooo0oo.setTag(oO000OOo.ghost_view, this);
        this.f29773Oooo0oo.getViewTreeObserver().addOnPreDrawListener(this.f29774OoooO0);
        oO00OO0O.OooO0Oo(this.f29773Oooo0oo, 4);
        if (this.f29773Oooo0oo.getParent() != null) {
            ((View) this.f29773Oooo0oo.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f29773Oooo0oo.getViewTreeObserver().removeOnPreDrawListener(this.f29774OoooO0);
        oO00OO0O.OooO0Oo(this.f29773Oooo0oo, 0);
        this.f29773Oooo0oo.setTag(oO000OOo.ghost_view, null);
        if (this.f29773Oooo0oo.getParent() != null) {
            ((View) this.f29773Oooo0oo.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        oO0000O.OooO00o(canvas, true);
        canvas.setMatrix(this.f29775OoooO00);
        oO00OO0O.OooO0Oo(this.f29773Oooo0oo, 0);
        this.f29773Oooo0oo.invalidate();
        oO00OO0O.OooO0Oo(this.f29773Oooo0oo, 4);
        drawChild(canvas, this.f29773Oooo0oo, getDrawingTime());
        oO0000O.OooO00o(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, p101o000oOoo.oO000O0
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (OooO0OO(this.f29773Oooo0oo) == this) {
            oO00OO0O.OooO0Oo(this.f29773Oooo0oo, i == 0 ? 4 : 0);
        }
    }
}
