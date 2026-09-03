package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton implements androidx.core.widget.OooOo, androidx.core.widget.Oooo000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0O f2837OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00Oo0 f2838OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO f2839OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooOOOO f2840OooO0oO;

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    @NonNull
    private OooOOOO getEmojiTextViewHelper() {
        if (this.f2840OooO0oO == null) {
            this.f2840OooO0oO = new OooOOOO(this);
        }
        return this.f2840OooO0oO;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        OooO oooO = this.f2839OooO0o0;
        if (oooO != null) {
            oooO.OooO00o();
        }
        o00Oo0 o00oo1 = this.f2838OooO0o;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        OooOO0O oooOO0O = this.f2837OooO0Oo;
        if (oooOO0O != null) {
            oooOO0O.getClass();
        }
        return compoundPaddingLeft;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        OooO oooO = this.f2839OooO0o0;
        if (oooO != null) {
            return oooO.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        OooO oooO = this.f2839OooO0o0;
        if (oooO != null) {
            return oooO.OooO0OO();
        }
        return null;
    }

    @Override // androidx.core.widget.OooOo
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportButtonTintList() {
        OooOO0O oooOO0O = this.f2837OooO0Oo;
        if (oooOO0O != null) {
            return oooOO0O.f2972OooO0O0;
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportButtonTintMode() {
        OooOO0O oooOO0O = this.f2837OooO0Oo;
        if (oooOO0O != null) {
            return oooOO0O.f2973OooO0OO;
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2838OooO0o.OooO0Oo();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2838OooO0o.OooO0o0();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0OO(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        OooO oooO = this.f2839OooO0o0;
        if (oooO != null) {
            oooO.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        OooO oooO = this.f2839OooO0o0;
        if (oooO != null) {
            oooO.OooO0o(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        OooOO0O oooOO0O = this.f2837OooO0Oo;
        if (oooOO0O != null) {
            if (oooOO0O.f2975OooO0o) {
                oooOO0O.f2975OooO0o = false;
            } else {
                oooOO0O.f2975OooO0o = true;
                oooOO0O.OooO00o();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00Oo0 o00oo1 = this.f2838OooO0o;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00Oo0 o00oo1 = this.f2838OooO0o;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0Oo(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().OooO00o(inputFilterArr));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        OooO oooO = this.f2839OooO0o0;
        if (oooO != null) {
            oooO.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        OooO oooO = this.f2839OooO0o0;
        if (oooO != null) {
            oooO.OooO(mode);
        }
    }

    @Override // androidx.core.widget.OooOo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        OooOO0O oooOO0O = this.f2837OooO0Oo;
        if (oooOO0O != null) {
            oooOO0O.f2972OooO0O0 = colorStateList;
            oooOO0O.f2974OooO0Oo = true;
            oooOO0O.OooO00o();
        }
    }

    @Override // androidx.core.widget.OooOo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        OooOO0O oooOO0O = this.f2837OooO0Oo;
        if (oooOO0O != null) {
            oooOO0O.f2973OooO0OO = mode;
            oooOO0O.f2976OooO0o0 = true;
            oooOO0O.OooO00o();
        }
    }

    @Override // androidx.core.widget.Oooo000
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        o00Oo0 o00oo1 = this.f2838OooO0o;
        o00oo1.OooOO0O(colorStateList);
        o00oo1.OooO0O0();
    }

    @Override // androidx.core.widget.Oooo000
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        o00Oo0 o00oo1 = this.f2838OooO0o;
        o00oo1.OooOO0o(mode);
        o00oo1.OooO0O0();
    }

    public AppCompatRadioButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p012OooOo0O.OooOOO0.radioButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o000.OooO00o(context);
        o0000O.OooO00o(getContext(), this);
        OooOO0O oooOO0O = new OooOO0O(this);
        this.f2837OooO0Oo = oooOO0O;
        oooOO0O.OooO0O0(attributeSet, i);
        OooO oooO = new OooO(this);
        this.f2839OooO0o0 = oooO;
        oooO.OooO0Oo(attributeSet, i);
        o00Oo0 o00oo1 = new o00Oo0(this);
        this.f2838OooO0o = o00oo1;
        o00oo1.OooO0o(attributeSet, i);
        getEmojiTextViewHelper().OooO0O0(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i) {
        setButtonDrawable(p013OooOo0o.o00Oo0.OooO00o(getContext(), i));
    }
}
