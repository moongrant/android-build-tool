package p235o00oOoOo;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.OooOO0O;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p234o00oOoOO.oOO0O0O0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class oOOO0OO0<T extends View, Z> extends oOO0Oo00<Z> {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static int f34017Oooo0oo = OooOO0O.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final T f34018Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooO00o f34019Oooo0oO;

    @VisibleForTesting
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        @VisibleForTesting
        public static Integer f34020OooO0Oo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f34021OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<oOOO00o0> f34022OooO0O0 = new ArrayList();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public ViewTreeObserverOnPreDrawListenerC0353OooO00o f34023OooO0OO;

        /* JADX INFO: renamed from: o00oOoOo.oOOO0OO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC0353OooO00o implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final WeakReference<OooO00o> f34024Oooo0o;

            public ViewTreeObserverOnPreDrawListenerC0353OooO00o(@NonNull OooO00o oooO00o) {
                this.f34024Oooo0o = new WeakReference<>(oooO00o);
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<o00oOoOo.oOOO00o0>] */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                OooO00o oooO00o = this.f34024Oooo0o.get();
                if (oooO00o == null || oooO00o.f34022OooO0O0.isEmpty()) {
                    return true;
                }
                int iOooO0Oo = oooO00o.OooO0Oo();
                int iOooO0OO = oooO00o.OooO0OO();
                if (!oooO00o.OooO0o0(iOooO0Oo, iOooO0OO)) {
                    return true;
                }
                Iterator it = new ArrayList(oooO00o.f34022OooO0O0).iterator();
                while (it.hasNext()) {
                    ((oOOO00o0) it.next()).OooO0O0(iOooO0Oo, iOooO0OO);
                }
                oooO00o.OooO00o();
                return true;
            }
        }

        public OooO00o(@NonNull View view) {
            this.f34021OooO00o = view;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<o00oOoOo.oOOO00o0>] */
        public final void OooO00o() {
            ViewTreeObserver viewTreeObserver = this.f34021OooO00o.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f34023OooO0OO);
            }
            this.f34023OooO0OO = null;
            this.f34022OooO0O0.clear();
        }

        public final int OooO0O0(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f34021OooO00o.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.f34021OooO00o.getContext();
            if (f34020OooO0Oo == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f34020OooO0Oo = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f34020OooO0Oo.intValue();
        }

        public final int OooO0OO() {
            int paddingBottom = this.f34021OooO00o.getPaddingBottom() + this.f34021OooO00o.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f34021OooO00o.getLayoutParams();
            return OooO0O0(this.f34021OooO00o.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int OooO0Oo() {
            int paddingRight = this.f34021OooO00o.getPaddingRight() + this.f34021OooO00o.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f34021OooO00o.getLayoutParams();
            return OooO0O0(this.f34021OooO00o.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        public final boolean OooO0o0(int i, int i2) {
            if (i > 0 || i == Integer.MIN_VALUE) {
                return i2 > 0 || i2 == Integer.MIN_VALUE;
            }
            return false;
        }
    }

    public oOOO0OO0(@NonNull T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.f34018Oooo0o = t;
        this.f34019Oooo0oO = new OooO00o(t);
    }

    @Override // p235o00oOoOo.oOO0Oo00, p235o00oOoOo.oOOO0O0o
    @Nullable
    public final oOO0O0O0 getRequest() {
        Object tag = this.f34018Oooo0o.getTag(f34017Oooo0oo);
        if (tag == null) {
            return null;
        }
        if (tag instanceof oOO0O0O0) {
            return (oOO0O0O0) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<o00oOoOo.oOOO00o0>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<o00oOoOo.oOOO00o0>] */
    @Override // p235o00oOoOo.oOOO0O0o
    @CallSuper
    public final void getSize(@NonNull oOOO00o0 oooo00o0) {
        OooO00o oooO00o = this.f34019Oooo0oO;
        int iOooO0Oo = oooO00o.OooO0Oo();
        int iOooO0OO = oooO00o.OooO0OO();
        if (oooO00o.OooO0o0(iOooO0Oo, iOooO0OO)) {
            oooo00o0.OooO0O0(iOooO0Oo, iOooO0OO);
            return;
        }
        if (!oooO00o.f34022OooO0O0.contains(oooo00o0)) {
            oooO00o.f34022OooO0O0.add(oooo00o0);
        }
        if (oooO00o.f34023OooO0OO == null) {
            ViewTreeObserver viewTreeObserver = oooO00o.f34021OooO00o.getViewTreeObserver();
            OooO00o.ViewTreeObserverOnPreDrawListenerC0353OooO00o viewTreeObserverOnPreDrawListenerC0353OooO00o = new OooO00o.ViewTreeObserverOnPreDrawListenerC0353OooO00o(oooO00o);
            oooO00o.f34023OooO0OO = viewTreeObserverOnPreDrawListenerC0353OooO00o;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0353OooO00o);
        }
    }

    @Override // p235o00oOoOo.oOO0Oo00, p235o00oOoOo.oOOO0O0o
    @CallSuper
    public void onLoadCleared(@Nullable Drawable drawable) {
        super.onLoadCleared(drawable);
        this.f34019Oooo0oO.OooO00o();
    }

    @Override // p235o00oOoOo.oOO0Oo00, p235o00oOoOo.oOOO0O0o
    @CallSuper
    public void onLoadStarted(@Nullable Drawable drawable) {
        super.onLoadStarted(drawable);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o00oOoOo.oOOO00o0>] */
    @Override // p235o00oOoOo.oOOO0O0o
    @CallSuper
    public final void removeCallback(@NonNull oOOO00o0 oooo00o0) {
        this.f34019Oooo0oO.f34022OooO0O0.remove(oooo00o0);
    }

    @Override // p235o00oOoOo.oOO0Oo00, p235o00oOoOo.oOOO0O0o
    public final void setRequest(@Nullable oOO0O0O0 ooo0o0o0) {
        this.f34018Oooo0o.setTag(f34017Oooo0oo, ooo0o0o0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Target for: ");
        sbOooO0o0.append(this.f34018Oooo0o);
        return sbOooO0o0.toString();
    }
}
