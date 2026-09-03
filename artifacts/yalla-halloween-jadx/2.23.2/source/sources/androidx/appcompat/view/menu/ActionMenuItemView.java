package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.o00000O0;
import androidx.appcompat.widget.o000O0O0;
import org.jctools.util.Pow2;
import p012OooOo0O.o00O0O;
import p018OooOoo0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionMenuItemView extends AppCompatTextView implements OooOOOO.OooO00o, View.OnClickListener, ActionMenuView.OooO00o {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooOO0O f2504OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public CharSequence f2505OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public OooO.OooO0O0 f2506OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Drawable f2507OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooO00o f2508OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public OooO0O0 f2509OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f2510OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f2511OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int f2512OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final int f2513OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f2514OooOo00;

    public class OooO00o extends o00000O0 {
        public OooO00o() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.o00000O0
        public final Oooo000 OooO0O0() {
            ActionMenuPresenter.OooO00o oooO00o;
            OooO0O0 oooO0O0 = ActionMenuItemView.this.f2509OooOOOo;
            if (oooO0O0 == null || (oooO00o = ActionMenuPresenter.this.f2753OooOo) == null) {
                return null;
            }
            return oooO00o.OooO00o();
        }

        @Override // androidx.appcompat.widget.o00000O0
        public final boolean OooO0OO() {
            Oooo000 oooo000OooO0O0;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            OooO.OooO0O0 oooO0O0 = actionMenuItemView.f2506OooOOO;
            return oooO0O0 != null && oooO0O0.OooO0Oo(actionMenuItemView.f2504OooOO0O) && (oooo000OooO0O0 = OooO0O0()) != null && oooo000OooO0O0.OooO00o();
        }
    }

    public static abstract class OooO0O0 {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
    public final boolean OooO00o() {
        return OooOO0o();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
    public final boolean OooO0O0() {
        return OooOO0o() && this.f2504OooOO0O.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
    public final void OooO0OO(OooOO0O oooOO0O) {
        this.f2504OooOO0O = oooOO0O;
        setIcon(oooOO0O.getIcon());
        setTitle(oooOO0O.getTitleCondensed());
        setId(oooOO0O.f2625OooO00o);
        setVisibility(oooOO0O.isVisible() ? 0 : 8);
        setEnabled(oooOO0O.isEnabled());
        if (oooOO0O.hasSubMenu() && this.f2508OooOOOO == null) {
            this.f2508OooOOOO = new OooO00o();
        }
    }

    public final boolean OooOO0o() {
        return !TextUtils.isEmpty(getText());
    }

    public final void OooOOO() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2505OooOO0o);
        if (this.f2507OooOOO0 != null) {
            if (!((this.f2504OooOO0O.f2649OooOoO0 & 4) == 4) || (!this.f2511OooOOo0 && !this.f2510OooOOo)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f2505OooOO0o : null);
        CharSequence charSequence = this.f2504OooOO0O.f2641OooOOo0;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f2504OooOO0O.f2630OooO0o0);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f2504OooOO0O.f2640OooOOo;
        if (TextUtils.isEmpty(charSequence2)) {
            o000O0O0.OooO00o(this, z3 ? null : this.f2504OooOO0O.f2630OooO0o0);
        } else {
            o000O0O0.OooO00o(this, charSequence2);
        }
    }

    public final boolean OooOOO0() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
    public OooOO0O getItemData() {
        return this.f2504OooOO0O;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OooO.OooO0O0 oooO0O0 = this.f2506OooOOO;
        if (oooO0O0 != null) {
            oooO0O0.OooO0Oo(this.f2504OooOO0O);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2511OooOOo0 = OooOOO0();
        OooOOO();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zOooOO0o = OooOO0o();
        if (zOooOO0o && (i3 = this.f2514OooOo00) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f2512OooOOoo;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, Pow2.MAX_POW2), i2);
        }
        if (zOooOO0o || this.f2507OooOOO0 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f2507OooOOO0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        OooO00o oooO00o;
        if (this.f2504OooOO0O.hasSubMenu() && (oooO00o = this.f2508OooOOOO) != null && oooO00o.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f2510OooOOo != z) {
            this.f2510OooOOo = z;
            OooOO0O oooOO0O = this.f2504OooOO0O;
            if (oooOO0O != null) {
                OooO oooO = oooOO0O.f2636OooOOO;
                oooO.f2579OooOO0O = true;
                oooO.OooOOOo(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2507OooOOO0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f2513OooOo0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        OooOOO();
    }

    public void setItemInvoker(OooO.OooO0O0 oooO0O0) {
        this.f2506OooOOO = oooO0O0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f2514OooOo00 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(OooO0O0 oooO0O0) {
        this.f2509OooOOOo = oooO0O0;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2505OooOO0o = charSequence;
        OooOOO();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f2511OooOOo0 = OooOOO0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o00O0O.ActionMenuItemView, i, 0);
        this.f2512OooOOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o00O0O.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f2513OooOo0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2514OooOo00 = -1;
        setSaveEnabled(false);
    }
}
