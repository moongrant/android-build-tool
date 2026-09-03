package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o000OOo0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static o000OOo0 f3313OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static o000OOo0 f3314OooOOOO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f3315OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final View f3316OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f3317OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CharSequence f3318OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000O f3319OooO0oO = new Runnable() { // from class: androidx.appcompat.widget.o000O
        @Override // java.lang.Runnable
        public final void run() {
            this.f3261OooO0Oo.OooO0OO(false);
        }
    };

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000OO00 f3320OooO0oo = new o000OO00(this, 0);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f3321OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o00 f3322OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f3323OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f3324OooOOO0;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.o000O] */
    public o000OOo0(View view, CharSequence charSequence) {
        this.f3316OooO0Oo = view;
        this.f3318OooO0o0 = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = androidx.core.view.o0000OO0.f5420OooO00o;
        this.f3317OooO0o = Build.VERSION.SDK_INT >= 28 ? androidx.core.view.o0000OO0.OooO0O0.OooO00o(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f3324OooOOO0 = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void OooO0O0(o000OOo0 o000ooo1) {
        o000OOo0 o000ooo2 = f3313OooOOO;
        if (o000ooo2 != null) {
            o000ooo2.f3316OooO0Oo.removeCallbacks(o000ooo2.f3319OooO0oO);
        }
        f3313OooOOO = o000ooo1;
        if (o000ooo1 != null) {
            o000ooo1.f3316OooO0Oo.postDelayed(o000ooo1.f3319OooO0oO, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void OooO00o() {
        o000OOo0 o000ooo1 = f3314OooOOOO;
        View view = this.f3316OooO0Oo;
        if (o000ooo1 == this) {
            f3314OooOOOO = null;
            o00 o00Var = this.f3322OooOO0O;
            if (o00Var != null) {
                View view2 = o00Var.f3187OooO0O0;
                if (view2.getParent() != null) {
                    ((WindowManager) o00Var.f3186OooO00o.getSystemService("window")).removeView(view2);
                }
                this.f3322OooOO0O = null;
                this.f3324OooOOO0 = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3313OooOOO == this) {
            OooO0O0(null);
        }
        view.removeCallbacks(this.f3320OooO0oo);
    }

    public final void OooO0OO(boolean z) {
        int height;
        int i;
        int i2;
        long longPressTimeout;
        long j;
        long j2;
        WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        View view = this.f3316OooO0Oo;
        if (ViewCompat.OooOO0O.OooO0O0(view)) {
            OooO0O0(null);
            o000OOo0 o000ooo1 = f3314OooOOOO;
            if (o000ooo1 != null) {
                o000ooo1.OooO00o();
            }
            f3314OooOOOO = this;
            this.f3323OooOO0o = z;
            o00 o00Var = new o00(view.getContext());
            this.f3322OooOO0O = o00Var;
            int width = this.f3315OooO;
            int i3 = this.f3321OooOO0;
            boolean z2 = this.f3323OooOO0o;
            View view2 = o00Var.f3187OooO0O0;
            boolean z3 = view2.getParent() != null;
            Context context = o00Var.f3186OooO00o;
            if (z3) {
                if (view2.getParent() != null) {
                    ((WindowManager) context.getSystemService("window")).removeView(view2);
                }
            }
            o00Var.f3188OooO0OO.setText(this.f3318OooO0o0);
            WindowManager.LayoutParams layoutParams = o00Var.f3189OooO0Oo;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(p012OooOo0O.OooOo00.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(p012OooOo0O.OooOo00.tooltip_precise_anchor_extra_offset);
                height = i3 + dimensionPixelOffset2;
                i = i3 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? p012OooOo0O.OooOo00.tooltip_y_offset_touch : p012OooOo0O.OooOo00.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                Rect rect = o00Var.f3191OooO0o0;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                } else {
                    Resources resources = context.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = o00Var.f3192OooO0oO;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = o00Var.f3190OooO0o;
                view.getLocationOnScreen(iArr2);
                int i4 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i4;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i4 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i5 = iArr2[1];
                int i6 = ((i + i5) - dimensionPixelOffset3) - measuredHeight;
                int i7 = i5 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i6 >= 0) {
                        layoutParams.y = i6;
                    } else {
                        layoutParams.y = i7;
                    }
                } else if (measuredHeight + i7 <= rect.height()) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i6;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f3323OooOO0o) {
                j2 = 2500;
            } else {
                if ((ViewCompat.OooO0o.OooO0oO(view) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            o000OO00 o000oo01 = this.f3320OooO0oo;
            view.removeCallbacks(o000oo01);
            view.postDelayed(o000oo01, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f3322OooOO0O != null && this.f3323OooOO0o) {
            return false;
        }
        View view2 = this.f3316OooO0Oo;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        boolean z = true;
        if (action != 7) {
            if (action == 10) {
                this.f3324OooOOO0 = true;
                OooO00o();
            }
        } else if (view2.isEnabled() && this.f3322OooOO0O == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.f3324OooOOO0) {
                this.f3315OooO = x;
                this.f3321OooOO0 = y;
                this.f3324OooOOO0 = false;
            } else {
                int iAbs = Math.abs(x - this.f3315OooO);
                int i = this.f3317OooO0o;
                if (iAbs > i || Math.abs(y - this.f3321OooOO0) > i) {
                    this.f3315OooO = x;
                    this.f3321OooOO0 = y;
                    this.f3324OooOOO0 = false;
                } else {
                    z = false;
                }
            }
            if (z) {
                OooO0O0(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f3315OooO = view.getWidth() / 2;
        this.f3321OooOO0 = view.getHeight() / 2;
        OooO0OO(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        OooO00o();
    }
}
