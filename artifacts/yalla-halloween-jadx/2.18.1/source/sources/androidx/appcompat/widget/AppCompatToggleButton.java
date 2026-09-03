package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatToggleButton extends ToggleButton implements androidx.core.widget.OooOo {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO0o f4986Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o00O0O f4987Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooOOO f4988Oooo0oo;

    public AppCompatToggleButton(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private OooOOO getEmojiTextViewHelper() {
        if (this.f4988Oooo0oo == null) {
            this.f4988Oooo0oo = new OooOOO(this);
        }
        return this.f4988Oooo0oo;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        OooO0o oooO0o = this.f4986Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO00o();
        }
        o00O0O o00o0o2 = this.f4987Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        OooO0o oooO0o = this.f4986Oooo0o;
        if (oooO0o != null) {
            return oooO0o.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        OooO0o oooO0o = this.f4986Oooo0o;
        if (oooO0o != null) {
            return oooO0o.OooO0OO();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4987Oooo0oO.OooO0o0();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4987Oooo0oO.OooO0o();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0OO(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        OooO0o oooO0o = this.f4986Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        OooO0o oooO0o = this.f4986Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00O0O o00o0o2 = this.f4987Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00O0O o00o0o2 = this.f4987Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
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
        OooO0o oooO0o = this.f4986Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        OooO0o oooO0o = this.f4986Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO(mode);
        }
    }

    @Override // androidx.core.widget.OooOo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.f4987Oooo0oO.OooOOO(colorStateList);
        this.f4987Oooo0oO.OooO0O0();
    }

    @Override // androidx.core.widget.OooOo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.f4987Oooo0oO.OooOOOO(mode);
        this.f4987Oooo0oO.OooO0O0();
    }

    public AppCompatToggleButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o00000OO.OooO00o(this, getContext());
        OooO0o oooO0o = new OooO0o(this);
        this.f4986Oooo0o = oooO0o;
        oooO0o.OooO0Oo(attributeSet, i);
        o00O0O o00o0o2 = new o00O0O(this);
        this.f4987Oooo0oO = o00o0o2;
        o00o0o2.OooO0oo(attributeSet, i);
        getEmojiTextViewHelper().OooO0O0(attributeSet, i);
    }
}
