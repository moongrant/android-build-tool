package oOO00O;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class OooOOO0 extends ViewGroup implements OooO {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final /* synthetic */ int f60098OooOO0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO00o f60099OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ViewGroup f60100OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final View f60101OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public View f60102OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f60103OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Matrix f60104OooO0oo;

    public class OooO00o implements ViewTreeObserver.OnPreDrawListener {
        public OooO00o() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view;
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
            OooOOO0 oooOOO0 = OooOOO0.this;
            ViewCompat.OooO0o.OooOO0O(oooOOO0);
            ViewGroup viewGroup = oooOOO0.f60100OooO0Oo;
            if (viewGroup == null || (view = oooOOO0.f60102OooO0o0) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            ViewCompat.OooO0o.OooOO0O(oooOOO0.f60100OooO0Oo);
            oooOOO0.f60100OooO0Oo = null;
            oooOOO0.f60102OooO0o0 = null;
            return true;
        }
    }

    public OooOOO0(View view) {
        super(view.getContext());
        this.f60099OooO = new OooO00o();
        this.f60101OooO0o = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    public static void OooO0O0(View view, ViewGroup viewGroup) {
        o0OO00O.OooO00o(viewGroup, viewGroup.getLeft(), viewGroup.getTop(), view.getWidth() + viewGroup.getLeft(), view.getHeight() + viewGroup.getTop());
    }

    @Override // oOO00O.OooO
    public final void OooO00o(View view, ViewGroup viewGroup) {
        this.f60100OooO0Oo = viewGroup;
        this.f60102OooO0o0 = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = OooOo.ghost_view;
        View view = this.f60101OooO0o;
        view.setTag(i, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.f60099OooO);
        o0OO00O.OooO0OO(4, view);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = this.f60101OooO0o;
        view.getViewTreeObserver().removeOnPreDrawListener(this.f60099OooO);
        o0OO00O.OooO0OO(0, view);
        view.setTag(OooOo.ghost_view, null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        oOO00O.OooO00o.OooO00o(canvas, true);
        canvas.setMatrix(this.f60104OooO0oo);
        View view = this.f60101OooO0o;
        o0OO00O.OooO0OO(0, view);
        view.invalidate();
        o0OO00O.OooO0OO(4, view);
        drawChild(canvas, view, getDrawingTime());
        oOO00O.OooO00o.OooO00o(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, oOO00O.OooO
    public final void setVisibility(int i) {
        super.setVisibility(i);
        int i2 = OooOo.ghost_view;
        View view = this.f60101OooO0o;
        if (((OooOOO0) view.getTag(i2)) == this) {
            o0OO00O.OooO0OO(i == 0 ? 4 : 0, view);
        }
    }
}
