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
import androidx.appcompat.widget.o0000OO0;
import androidx.appcompat.widget.o0OO00O;
import p015OooOoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionMenuItemView extends AppCompatTextView implements OooOOO.OooO00o, View.OnClickListener, ActionMenuView.OooO00o {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public CharSequence f4609OoooO;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public OooOO0 f4610OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public Drawable f4611OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public OooO00o f4612OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public OooO0O0 f4613OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f4614OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f4615OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f4616OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f4617Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f4618Ooooo0o;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public OooO0o.OooO0O0 f4619o000oOoO;

    public class OooO00o extends o0OO00O {
        public OooO00o() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.o0OO00O
        public final o00Oo0 OooO0O0() {
            ActionMenuPresenter.OooO00o oooO00o;
            OooO0O0 oooO0O0 = ActionMenuItemView.this.f4613OoooOOo;
            if (oooO0O0 == null || (oooO00o = ActionMenuPresenter.this.f4862Oooooo0) == null) {
                return null;
            }
            return oooO00o.OooO00o();
        }

        @Override // androidx.appcompat.widget.o0OO00O
        public final boolean OooO0OO() {
            o00Oo0 o00oo0OooO0O0;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            OooO0o.OooO0O0 oooO0O0 = actionMenuItemView.f4619o000oOoO;
            return oooO0O0 != null && oooO0O0.OooO00o(actionMenuItemView.f4610OoooO0O) && (o00oo0OooO0O0 = OooO0O0()) != null && o00oo0OooO0O0.OooO0O0();
        }
    }

    public static abstract class OooO0O0 {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
    public final boolean OooO00o() {
        return OooO0OO();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.OooO00o
    public final boolean OooO0O0() {
        return OooO0OO() && this.f4610OoooO0O.getIcon() == null;
    }

    public final boolean OooO0OO() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
    public final void OooO0Oo(OooOO0 oooOO1) {
        this.f4610OoooO0O = oooOO1;
        setIcon(oooOO1.getIcon());
        setTitle(oooOO1.getTitleCondensed());
        setId(oooOO1.f4730OooO00o);
        setVisibility(oooOO1.isVisible() ? 0 : 8);
        setEnabled(oooOO1.isEnabled());
        if (oooOO1.hasSubMenu() && this.f4612OoooOOO == null) {
            this.f4612OoooOOO = new OooO00o();
        }
    }

    public final void OooO0o() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f4609OoooO);
        if (this.f4611OoooOO0 != null) {
            if (!((this.f4610OoooO0O.f4754OooOoO0 & 4) == 4) || (!this.f4614OoooOo0 && !this.f4615OoooOoO)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f4609OoooO : null);
        CharSequence charSequence = this.f4610OoooO0O.f4746OooOOo0;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f4610OoooO0O.f4735OooO0o0);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f4610OoooO0O.f4745OooOOo;
        if (TextUtils.isEmpty(charSequence2)) {
            o0000OO0.OooO00o(this, z3 ? null : this.f4610OoooO0O.f4735OooO0o0);
        } else {
            o0000OO0.OooO00o(this, charSequence2);
        }
    }

    public final boolean OooO0o0() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
    public OooOO0 getItemData() {
        return this.f4610OoooO0O;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OooO0o.OooO0O0 oooO0O0 = this.f4619o000oOoO;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o(this.f4610OoooO0O);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4614OoooOo0 = OooO0o0();
        OooO0o();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zOooO0OO = OooO0OO();
        if (zOooO0OO && (i3 = this.f4617Ooooo00) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f4616OoooOoo) : this.f4616OoooOoo;
        if (mode != 1073741824 && this.f4616OoooOoo > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zOooO0OO || this.f4611OoooOO0 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f4611OoooOO0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        OooO00o oooO00o;
        if (this.f4610OoooO0O.hasSubMenu() && (oooO00o = this.f4612OoooOOO) != null && oooO00o.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f4615OoooOoO != z) {
            this.f4615OoooOoO = z;
            OooOO0 oooOO1 = this.f4610OoooO0O;
            if (oooOO1 != null) {
                oooOO1.f4741OooOOO.OooOOo0();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4611OoooOO0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f4618Ooooo0o;
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
        OooO0o();
    }

    public void setItemInvoker(OooO0o.OooO0O0 oooO0O0) {
        this.f4619o000oOoO = oooO0O0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f4617Ooooo00 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(OooO0O0 oooO0O0) {
        this.f4613OoooOOo = oooO0O0;
    }

    public void setTitle(CharSequence charSequence) {
        this.f4609OoooO = charSequence;
        OooO0o();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f4614OoooOo0 = OooO0o0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOo00.OooOOOO.ActionMenuItemView, i, 0);
        this.f4616OoooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooOo00.OooOOOO.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f4618Ooooo0o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f4617Ooooo00 = -1;
        setSaveEnabled(false);
    }
}
