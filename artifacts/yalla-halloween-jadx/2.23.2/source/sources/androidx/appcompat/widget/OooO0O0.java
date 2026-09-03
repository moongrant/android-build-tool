package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0O0 extends ViewGroup {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public androidx.core.view.o000OOo0 f2953OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f2954OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ActionMenuView f2955OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Context f2956OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ActionMenuPresenter f2957OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f2958OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f2959OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f2960OooOO0O;

    public class OooO00o implements androidx.core.view.o00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f2961OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f2962OooO0O0;

        public OooO00o() {
        }

        @Override // androidx.core.view.o00
        public final void OooO00o() {
            if (this.f2961OooO00o) {
                return;
            }
            OooO0O0 oooO0O0 = OooO0O0.this;
            oooO0O0.f2953OooO = null;
            OooO0O0.super.setVisibility(this.f2962OooO0O0);
        }

        @Override // androidx.core.view.o00
        public final void OooO0O0() {
            OooO0O0.super.setVisibility(0);
            this.f2961OooO00o = false;
        }

        @Override // androidx.core.view.o00
        public final void OooO0OO(View view) {
            this.f2961OooO00o = true;
        }
    }

    public OooO0O0(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int OooO0OO(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    public static int OooO0Oo(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iOooO00o = androidx.appcompat.widget.OooO00o.OooO00o(i3, measuredHeight, 2, i2);
        if (z) {
            view.layout(i - measuredWidth, iOooO00o, i, measuredHeight + iOooO00o);
        } else {
            view.layout(i, iOooO00o, i + measuredWidth, measuredHeight + iOooO00o);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final androidx.core.view.o000OOo0 OooO0o0(int i, long j) {
        androidx.core.view.o000OOo0 o000ooo1 = this.f2953OooO;
        if (o000ooo1 != null) {
            o000ooo1.OooO0O0();
        }
        OooO00o oooO00o = this.f2954OooO0Oo;
        if (i != 0) {
            androidx.core.view.o000OOo0 o000ooo0OooO00o = ViewCompat.OooO00o(this);
            o000ooo0OooO00o.OooO00o(0.0f);
            o000ooo0OooO00o.OooO0OO(j);
            OooO0O0.this.f2953OooO = o000ooo0OooO00o;
            oooO00o.f2962OooO0O0 = i;
            o000ooo0OooO00o.OooO0Oo(oooO00o);
            return o000ooo0OooO00o;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        androidx.core.view.o000OOo0 o000ooo0OooO00o2 = ViewCompat.OooO00o(this);
        o000ooo0OooO00o2.OooO00o(1.0f);
        o000ooo0OooO00o2.OooO0OO(j);
        OooO0O0.this.f2953OooO = o000ooo0OooO00o2;
        oooO00o.f2962OooO0O0 = i;
        o000ooo0OooO00o2.OooO0Oo(oooO00o);
        return o000ooo0OooO00o2;
    }

    public int getAnimatedVisibility() {
        return this.f2953OooO != null ? this.f2954OooO0Oo.f2962OooO0O0 : getVisibility();
    }

    public int getContentHeight() {
        return this.f2958OooO0oo;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, p012OooOo0O.o00O0O.ActionBar, p012OooOo0O.OooOOO0.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(p012OooOo0O.o00O0O.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f2957OooO0oO;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.f2596OooO0o0.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            actionMenuPresenter.f2755OooOo00 = i;
            androidx.appcompat.view.menu.OooO oooO = actionMenuPresenter.f2595OooO0o;
            if (oooO != null) {
                oooO.OooOOOo(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2960OooOO0O = false;
        }
        if (!this.f2960OooOO0O) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f2960OooOO0O = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2960OooOO0O = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2959OooOO0 = false;
        }
        if (!this.f2959OooOO0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f2959OooOO0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2959OooOO0 = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f2958OooO0oo = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            androidx.core.view.o000OOo0 o000ooo1 = this.f2953OooO;
            if (o000ooo1 != null) {
                o000ooo1.OooO0O0();
            }
            super.setVisibility(i);
        }
    }

    public OooO0O0(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2954OooO0Oo = new OooO00o();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(p012OooOo0O.OooOOO0.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f2956OooO0o0 = context;
        } else {
            this.f2956OooO0o0 = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
