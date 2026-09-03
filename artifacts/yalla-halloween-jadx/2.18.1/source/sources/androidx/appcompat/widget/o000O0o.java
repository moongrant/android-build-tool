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
public final class o000O0o implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static o000O0o f5379OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static o000O0o f5380OoooOOo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final o000 f5381Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final View f5382Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final CharSequence f5383Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f5384Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public o000Oo0 f5385OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f5386OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final o000O000 f5387OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f5388OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f5389OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f5390o000oOoO;

    public o000O0o(View view, CharSequence charSequence) {
        int i = 0;
        this.f5381Oooo = new o000(this, i);
        this.f5387OoooO00 = new o000O000(this, i);
        this.f5382Oooo0o = view;
        this.f5383Oooo0oO = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = o000O0O0.o000OOo.f28122OooO00o;
        this.f5384Oooo0oo = Build.VERSION.SDK_INT >= 28 ? o000O0O0.o000OOo.OooO0O0.OooO00o(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f5390o000oOoO = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void OooO0O0(o000O0o o000o0o2) {
        o000O0o o000o0o3 = f5379OoooOOO;
        if (o000o0o3 != null) {
            o000o0o3.f5382Oooo0o.removeCallbacks(o000o0o3.f5381Oooo);
        }
        f5379OoooOOO = o000o0o2;
        if (o000o0o2 != null) {
            o000o0o2.f5382Oooo0o.postDelayed(o000o0o2.f5381Oooo, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void OooO00o() {
        if (f5380OoooOOo == this) {
            f5380OoooOOo = null;
            o000Oo0 o000oo1 = this.f5385OoooO;
            if (o000oo1 != null) {
                o000oo1.OooO00o();
                this.f5385OoooO = null;
                this.f5390o000oOoO = true;
                this.f5382Oooo0o.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f5379OoooOOO == this) {
            OooO0O0(null);
        }
        this.f5382Oooo0o.removeCallbacks(this.f5387OoooO00);
    }

    public final void OooO0OO(boolean z) {
        int height;
        int i;
        long j;
        int longPressTimeout;
        long j2;
        View view = this.f5382Oooo0o;
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (ViewCompat.OooOO0O.OooO0O0(view)) {
            OooO0O0(null);
            o000O0o o000o0o2 = f5380OoooOOo;
            if (o000o0o2 != null) {
                o000o0o2.OooO00o();
            }
            f5380OoooOOo = this;
            this.f5389OoooOO0 = z;
            o000Oo0 o000oo1 = new o000Oo0(this.f5382Oooo0o.getContext());
            this.f5385OoooO = o000oo1;
            View view2 = this.f5382Oooo0o;
            int width = this.f5386OoooO0;
            int i2 = this.f5388OoooO0O;
            boolean z2 = this.f5389OoooOO0;
            CharSequence charSequence = this.f5383Oooo0oO;
            if (o000oo1.f5404OooO0O0.getParent() != null) {
                o000oo1.OooO00o();
            }
            o000oo1.f5405OooO0OO.setText(charSequence);
            WindowManager.LayoutParams layoutParams = o000oo1.f5406OooO0Oo;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = o000oo1.f5403OooO00o.getResources().getDimensionPixelOffset(OooOo00.OooO0o.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                width = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = o000oo1.f5403OooO00o.getResources().getDimensionPixelOffset(OooOo00.OooO0o.tooltip_precise_anchor_extra_offset);
                height = i2 + dimensionPixelOffset2;
                i = i2 - dimensionPixelOffset2;
            } else {
                height = view2.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = o000oo1.f5403OooO00o.getResources().getDimensionPixelOffset(z2 ? OooOo00.OooO0o.tooltip_y_offset_touch : OooOo00.OooO0o.tooltip_y_offset_non_touch);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context = view2.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(o000oo1.f5408OooO0o0);
                Rect rect = o000oo1.f5408OooO0o0;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = o000oo1.f5403OooO00o.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    o000oo1.f5408OooO0o0.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(o000oo1.f5409OooO0oO);
                view2.getLocationOnScreen(o000oo1.f5407OooO0o);
                int[] iArr = o000oo1.f5407OooO0o;
                int i3 = iArr[0];
                int[] iArr2 = o000oo1.f5409OooO0oO;
                iArr[0] = i3 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                o000oo1.f5404OooO0O0.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = o000oo1.f5404OooO0O0.getMeasuredHeight();
                int[] iArr3 = o000oo1.f5407OooO0o;
                int i4 = ((iArr3[1] + i) - dimensionPixelOffset3) - measuredHeight;
                int i5 = iArr3[1] + height + dimensionPixelOffset3;
                if (z2) {
                    if (i4 >= 0) {
                        layoutParams.y = i4;
                    } else {
                        layoutParams.y = i5;
                    }
                } else if (measuredHeight + i5 <= o000oo1.f5408OooO0o0.height()) {
                    layoutParams.y = i5;
                } else {
                    layoutParams.y = i4;
                }
            }
            ((WindowManager) o000oo1.f5403OooO00o.getSystemService("window")).addView(o000oo1.f5404OooO0O0, o000oo1.f5406OooO0Oo);
            this.f5382Oooo0o.addOnAttachStateChangeListener(this);
            if (this.f5389OoooOO0) {
                j2 = 2500;
            } else {
                if ((ViewCompat.OooO0o.OooO0oO(this.f5382Oooo0o) & 1) == 1) {
                    j = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j2 = j - ((long) longPressTimeout);
            }
            this.f5382Oooo0o.removeCallbacks(this.f5387OoooO00);
            this.f5382Oooo0o.postDelayed(this.f5387OoooO00, j2);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f5385OoooO != null && this.f5389OoooOO0) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f5382Oooo0o.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        boolean z = true;
        if (action != 7) {
            if (action == 10) {
                this.f5390o000oOoO = true;
                OooO00o();
            }
        } else if (this.f5382Oooo0o.isEnabled() && this.f5385OoooO == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.f5390o000oOoO || Math.abs(x - this.f5386OoooO0) > this.f5384Oooo0oo || Math.abs(y - this.f5388OoooO0O) > this.f5384Oooo0oo) {
                this.f5386OoooO0 = x;
                this.f5388OoooO0O = y;
                this.f5390o000oOoO = false;
            } else {
                z = false;
            }
            if (z) {
                OooO0O0(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f5386OoooO0 = view.getWidth() / 2;
        this.f5388OoooO0O = view.getHeight() / 2;
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
