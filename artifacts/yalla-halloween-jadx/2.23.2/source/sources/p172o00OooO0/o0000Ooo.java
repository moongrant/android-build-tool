package p172o00OooO0;

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
import p170o00Ooo0o.Oooo0;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class o0000Ooo<T extends View, Z> extends o0O0O00<Z> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final int f38317OooO0oO = OooOO0O.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f38318OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final T f38319OooO0o0;

    @VisibleForTesting
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        @VisibleForTesting
        public static Integer f38320OooO0Oo;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f38321OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f38322OooO0O0 = new ArrayList();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public ViewTreeObserverOnPreDrawListenerC0430OooO00o f38323OooO0OO;

        /* JADX INFO: renamed from: o00OooO0.o0000Ooo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC0430OooO00o implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final WeakReference<OooO00o> f38324OooO0Oo;

            public ViewTreeObserverOnPreDrawListenerC0430OooO00o(@NonNull OooO00o oooO00o) {
                this.f38324OooO0Oo = new WeakReference<>(oooO00o);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                OooO00o oooO00o = this.f38324OooO0Oo.get();
                if (oooO00o != null) {
                    ArrayList arrayList = oooO00o.f38322OooO0O0;
                    if (!arrayList.isEmpty()) {
                        int iOooO0OO = oooO00o.OooO0OO();
                        int iOooO0O0 = oooO00o.OooO0O0();
                        boolean z = false;
                        if (iOooO0OO > 0 || iOooO0OO == Integer.MIN_VALUE) {
                            if (iOooO0O0 > 0 || iOooO0O0 == Integer.MIN_VALUE) {
                                z = true;
                            }
                        }
                        if (z) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((o00000O) it.next()).OooO0O0(iOooO0OO, iOooO0O0);
                            }
                            ViewTreeObserver viewTreeObserver = oooO00o.f38321OooO00o.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(oooO00o.f38323OooO0OO);
                            }
                            oooO00o.f38323OooO0OO = null;
                            arrayList.clear();
                        }
                    }
                }
                return true;
            }
        }

        public OooO00o(@NonNull View view) {
            this.f38321OooO00o = view;
        }

        public final int OooO00o(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            View view = this.f38321OooO00o;
            if (view.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = view.getContext();
            if (f38320OooO0Oo == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                o00OO00O.OooO0O0(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f38320OooO0Oo = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f38320OooO0Oo.intValue();
        }

        public final int OooO0O0() {
            View view = this.f38321OooO00o;
            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return OooO00o(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int OooO0OO() {
            View view = this.f38321OooO00o;
            int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return OooO00o(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }
    }

    public o0000Ooo(@NonNull T t) {
        o00OO00O.OooO0O0(t);
        this.f38319OooO0o0 = t;
        this.f38318OooO0o = new OooO00o(t);
    }

    @Override // p172o00OooO0.o0O0O00, p172o00OooO0.o00000OO
    public final void OooO(@Nullable Oooo0 oooo0) {
        this.f38319OooO0o0.setTag(f38317OooO0oO, oooo0);
    }

    @Override // p172o00OooO0.o0O0O00, p172o00OooO0.o00000OO
    @Nullable
    public final Oooo0 OooO00o() {
        Object tag = this.f38319OooO0o0.getTag(f38317OooO0oO);
        if (tag == null) {
            return null;
        }
        if (tag instanceof Oooo0) {
            return (Oooo0) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p172o00OooO0.o0O0O00, p172o00OooO0.o00000OO
    @CallSuper
    public void OooO0Oo(@Nullable Drawable drawable) {
        OooO00o oooO00o = this.f38318OooO0o;
        ViewTreeObserver viewTreeObserver = oooO00o.f38321OooO00o.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(oooO00o.f38323OooO0OO);
        }
        oooO00o.f38323OooO0OO = null;
        oooO00o.f38322OooO0O0.clear();
    }

    @Override // p172o00OooO0.o00000OO
    @CallSuper
    public final void OooO0o(@NonNull o00000O o00000o) {
        OooO00o oooO00o = this.f38318OooO0o;
        int iOooO0OO = oooO00o.OooO0OO();
        int iOooO0O0 = oooO00o.OooO0O0();
        boolean z = false;
        if (iOooO0OO > 0 || iOooO0OO == Integer.MIN_VALUE) {
            if (iOooO0O0 > 0 || iOooO0O0 == Integer.MIN_VALUE) {
                z = true;
            }
        }
        if (z) {
            o00000o.OooO0O0(iOooO0OO, iOooO0O0);
            return;
        }
        ArrayList arrayList = oooO00o.f38322OooO0O0;
        if (!arrayList.contains(o00000o)) {
            arrayList.add(o00000o);
        }
        if (oooO00o.f38323OooO0OO == null) {
            ViewTreeObserver viewTreeObserver = oooO00o.f38321OooO00o.getViewTreeObserver();
            OooO00o.ViewTreeObserverOnPreDrawListenerC0430OooO00o viewTreeObserverOnPreDrawListenerC0430OooO00o = new OooO00o.ViewTreeObserverOnPreDrawListenerC0430OooO00o(oooO00o);
            oooO00o.f38323OooO0OO = viewTreeObserverOnPreDrawListenerC0430OooO00o;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0430OooO00o);
        }
    }

    @Override // p172o00OooO0.o00000OO
    @CallSuper
    public final void OooOO0(@NonNull o00000O o00000o) {
        this.f38318OooO0o.f38322OooO0O0.remove(o00000o);
    }

    public final String toString() {
        return "Target for: " + this.f38319OooO0o0;
    }
}
