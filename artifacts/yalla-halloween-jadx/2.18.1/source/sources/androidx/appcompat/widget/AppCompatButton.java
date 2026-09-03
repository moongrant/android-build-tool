package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.widget.TextViewCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements androidx.core.widget.OooO0O0, androidx.core.widget.OooOo {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO0o f4922Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o00O0O f4923Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NonNull
    public OooOOO f4924Oooo0oo;

    public AppCompatButton(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private OooOOO getEmojiTextViewHelper() {
        if (this.f4924Oooo0oo == null) {
            this.f4924Oooo0oo = new OooOOO(this);
        }
        return this.f4924Oooo0oo;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        OooO0o oooO0o = this.f4922Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO00o();
        }
        o00O0O o00o0o2 = this.f4923Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.OooO0O0.f8010OooO0OO) {
            return super.getAutoSizeMaxTextSize();
        }
        o00O0O o00o0o2 = this.f4923Oooo0oO;
        if (o00o0o2 != null) {
            return Math.round(o00o0o2.f5412OooO.f5441OooO0o0);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.OooO0O0.f8010OooO0OO) {
            return super.getAutoSizeMinTextSize();
        }
        o00O0O o00o0o2 = this.f4923Oooo0oO;
        if (o00o0o2 != null) {
            return Math.round(o00o0o2.f5412OooO.f5439OooO0Oo);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.OooO0O0.f8010OooO0OO) {
            return super.getAutoSizeStepGranularity();
        }
        o00O0O o00o0o2 = this.f4923Oooo0oO;
        if (o00o0o2 != null) {
            return Math.round(o00o0o2.f5412OooO.f5438OooO0OO);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.OooO0O0.f8010OooO0OO) {
            return super.getAutoSizeTextAvailableSizes();
        }
        o00O0O o00o0o2 = this.f4923Oooo0oO;
        return o00o0o2 != null ? o00o0o2.f5412OooO.f5440OooO0o : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.OooO0O0.f8010OooO0OO) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        o00O0O o00o0o2 = this.f4923Oooo0oO;
        if (o00o0o2 != null) {
            return o00o0o2.f5412OooO.f5436OooO00o;
        }
        return 0;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.OooO0oO(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        OooO0o oooO0o = this.f4922Oooo0o;
        if (oooO0o != null) {
            return oooO0o.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        OooO0o oooO0o = this.f4922Oooo0o;
        if (oooO0o != null) {
            return oooO0o.OooO0OO();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4923Oooo0oO.OooO0o0();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4923Oooo0oO.OooO0o();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        o00O0O o00o0o2 = this.f4923Oooo0oO;
        if (o00o0o2 != null) {
            Objects.requireNonNull(o00o0o2);
            if (androidx.core.widget.OooO0O0.f8010OooO0OO) {
                return;
            }
            o00o0o2.OooO0OO();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        o00O0O o00o0o2 = this.f4923Oooo0oO;
        if (o00o0o2 == null || androidx.core.widget.OooO0O0.f8010OooO0OO || !o00o0o2.OooO0oO()) {
            return;
        }
        this.f4923Oooo0oO.OooO0OO();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0OO(z);
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (androidx.core.widget.OooO0O0.f8010OooO0OO) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        o00O0O o00o0o2 = this.f4923Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooOO0O(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        if (androidx.core.widget.OooO0O0.f8010OooO0OO) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        o00O0O o00o0o2 = this.f4923Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooOO0o(iArr, i);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (androidx.core.widget.OooO0O0.f8010OooO0OO) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        o00O0O o00o0o2 = this.f4923Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooOOO0(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        OooO0o oooO0o = this.f4922Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        OooO0o oooO0o = this.f4922Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0o(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.OooO0oo(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0Oo(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().OooO00o(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        o00O0O o00o0o2 = this.f4923Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooOO0(z);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        OooO0o oooO0o = this.f4922Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        OooO0o oooO0o = this.f4922Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO(mode);
        }
    }

    @Override // androidx.core.widget.OooOo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.f4923Oooo0oO.OooOOO(colorStateList);
        this.f4923Oooo0oO.OooO0O0();
    }

    @Override // androidx.core.widget.OooOo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.f4923Oooo0oO.OooOOOO(mode);
        this.f4923Oooo0oO.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00O0O o00o0o2 = this.f4923Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = androidx.core.widget.OooO0O0.f8010OooO0OO;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        o00O0O o00o0o2 = this.f4923Oooo0oO;
        if (o00o0o2 != null) {
            Objects.requireNonNull(o00o0o2);
            if (z || o00o0o2.OooO0oO()) {
                return;
            }
            o00o0o2.f5412OooO.OooO0o(i, f);
        }
    }

    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooOo00.OooO00o.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0000.OooO00o(context);
        o00000OO.OooO00o(this, getContext());
        OooO0o oooO0o = new OooO0o(this);
        this.f4922Oooo0o = oooO0o;
        oooO0o.OooO0Oo(attributeSet, i);
        o00O0O o00o0o2 = new o00O0O(this);
        this.f4923Oooo0oO = o00o0o2;
        o00o0o2.OooO0oo(attributeSet, i);
        o00o0o2.OooO0O0();
        getEmojiTextViewHelper().OooO0O0(attributeSet, i);
    }
}
