package p078o000Oo0O;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class o00Ooo extends ViewGroup implements o0OoOo0 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final /* synthetic */ int f34965OooOO0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO00o f34966OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ViewGroup f34967OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final View f34968OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public View f34969OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f34970OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Matrix f34971OooO0oo;

    public class OooO00o implements ViewTreeObserver.OnPreDrawListener {
        public OooO00o() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            o00Ooo o00ooo2 = o00Ooo.this;
            ViewCompat.OooO0o.OooOO0O(o00ooo2);
            ViewGroup viewGroup = o00ooo2.f34967OooO0Oo;
            if (viewGroup == null || (view = o00ooo2.f34969OooO0o0) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            ViewCompat.OooO0o.OooOO0O(o00ooo2.f34967OooO0Oo);
            o00ooo2.f34967OooO0Oo = null;
            o00ooo2.f34969OooO0o0 = null;
            return true;
        }
    }

    public o00Ooo(View view) {
        super(view.getContext());
        this.f34966OooO = new OooO00o();
        this.f34968OooO0o = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    public static void OooO0O0(View view, ViewGroup viewGroup) {
        o0000O00.OooO00o(viewGroup, viewGroup.getLeft(), viewGroup.getTop(), view.getWidth() + viewGroup.getLeft(), view.getHeight() + viewGroup.getTop());
    }

    @Override // p078o000Oo0O.o0OoOo0
    public final void OooO00o(View view, ViewGroup viewGroup) {
        this.f34967OooO0Oo = viewGroup;
        this.f34969OooO0o0 = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = o0OOO0o.ghost_view;
        View view = this.f34968OooO0o;
        view.setTag(i, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.f34966OooO);
        o0000O00.OooO0OO(4, view);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = this.f34968OooO0o;
        view.getViewTreeObserver().removeOnPreDrawListener(this.f34966OooO);
        o0000O00.OooO0OO(0, view);
        view.setTag(o0OOO0o.ghost_view, null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOo.OooO00o(canvas, true);
        canvas.setMatrix(this.f34971OooO0oo);
        View view = this.f34968OooO0o;
        o0000O00.OooO0OO(0, view);
        view.invalidate();
        o0000O00.OooO0OO(4, view);
        drawChild(canvas, view, getDrawingTime());
        OooOo.OooO00o(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, p078o000Oo0O.o0OoOo0
    public final void setVisibility(int i) {
        super.setVisibility(i);
        int i2 = o0OOO0o.ghost_view;
        View view = this.f34968OooO0o;
        if (((o00Ooo) view.getTag(i2)) == this) {
            o0000O00.OooO0OO(i == 0 ? 4 : 0, view);
        }
    }
}
