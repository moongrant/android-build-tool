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
    public static o000OOo0 f3311OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static o000OOo0 f3312OooOOOO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f3313OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final View f3314OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f3315OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CharSequence f3316OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000O f3317OooO0oO = new o000O(this, 0);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000OO00 f3318OooO0oo = new o000OO00(this, 0);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f3319OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o00 f3320OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f3321OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f3322OooOOO0;

    public o000OOo0(View view, CharSequence charSequence) {
        this.f3314OooO0Oo = view;
        this.f3316OooO0o0 = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = androidx.core.view.o000O00.f5447OooO00o;
        this.f3315OooO0o = Build.VERSION.SDK_INT >= 28 ? androidx.core.view.o000O00.OooO0O0.OooO00o(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f3322OooOOO0 = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void OooO0O0(o000OOo0 o000ooo1) {
        o000OOo0 o000ooo2 = f3311OooOOO;
        if (o000ooo2 != null) {
            o000ooo2.f3314OooO0Oo.removeCallbacks(o000ooo2.f3317OooO0oO);
        }
        f3311OooOOO = o000ooo1;
        if (o000ooo1 != null) {
            o000ooo1.f3314OooO0Oo.postDelayed(o000ooo1.f3317OooO0oO, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void OooO00o() {
        o000OOo0 o000ooo1 = f3312OooOOOO;
        View view = this.f3314OooO0Oo;
        if (o000ooo1 == this) {
            f3312OooOOOO = null;
            o00 o00Var = this.f3320OooOO0O;
            if (o00Var != null) {
                View view2 = o00Var.f3185OooO0O0;
                if (view2.getParent() != null) {
                    ((WindowManager) o00Var.f3184OooO00o.getSystemService("window")).removeView(view2);
                }
                this.f3320OooOO0O = null;
                this.f3322OooOOO0 = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3311OooOOO == this) {
            OooO0O0(null);
        }
        view.removeCallbacks(this.f3318OooO0oo);
    }

    public final void OooO0OO(boolean z) {
        int height;
        int i;
        int i2;
        long longPressTimeout;
        long j;
        long j2;
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        View view = this.f3314OooO0Oo;
        if (ViewCompat.OooOO0O.OooO0O0(view)) {
            OooO0O0(null);
            o000OOo0 o000ooo1 = f3312OooOOOO;
            if (o000ooo1 != null) {
                o000ooo1.OooO00o();
            }
            f3312OooOOOO = this;
            this.f3321OooOO0o = z;
            o00 o00Var = new o00(view.getContext());
            this.f3320OooOO0O = o00Var;
            int width = this.f3313OooO;
            int i3 = this.f3319OooOO0;
            boolean z2 = this.f3321OooOO0o;
            View view2 = o00Var.f3185OooO0O0;
            boolean z3 = view2.getParent() != null;
            Context context = o00Var.f3184OooO00o;
            if (z3) {
                if (view2.getParent() != null) {
                    ((WindowManager) context.getSystemService("window")).removeView(view2);
                }
            }
            o00Var.f3186OooO0OO.setText(this.f3316OooO0o0);
            WindowManager.LayoutParams layoutParams = o00Var.f3187OooO0Oo;
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
                Rect rect = o00Var.f3189OooO0o0;
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
                int[] iArr = o00Var.f3190OooO0oO;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = o00Var.f3188OooO0o;
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
            if (this.f3321OooOO0o) {
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
            o000OO00 o000oo01 = this.f3318OooO0oo;
            view.removeCallbacks(o000oo01);
            view.postDelayed(o000oo01, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f3320OooOO0O != null && this.f3321OooOO0o) {
            return false;
        }
        View view2 = this.f3314OooO0Oo;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        boolean z = true;
        if (action != 7) {
            if (action == 10) {
                this.f3322OooOOO0 = true;
                OooO00o();
            }
        } else if (view2.isEnabled() && this.f3320OooOO0O == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.f3322OooOOO0) {
                this.f3313OooO = x;
                this.f3319OooOO0 = y;
                this.f3322OooOOO0 = false;
            } else {
                int iAbs = Math.abs(x - this.f3313OooO);
                int i = this.f3315OooO0o;
                if (iAbs > i || Math.abs(y - this.f3319OooOO0) > i) {
                    this.f3313OooO = x;
                    this.f3319OooOO0 = y;
                    this.f3322OooOOO0 = false;
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
        this.f3313OooO = view.getWidth() / 2;
        this.f3319OooOO0 = view.getHeight() / 2;
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
