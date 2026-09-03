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

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements androidx.core.widget.Oooo000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO f2814OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public OooOOOO f2815OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00Oo0 f2816OooO0o0;

    public AppCompatButton(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private OooOOOO getEmojiTextViewHelper() {
        if (this.f2815OooO0o == null) {
            this.f2815OooO0o = new OooOOOO(this);
        }
        return this.f2815OooO0o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        OooO oooO = this.f2814OooO0Oo;
        if (oooO != null) {
            oooO.OooO00o();
        }
        o00Oo0 o00oo1 = this.f2816OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (o0O0ooO.f3358OooO0O0) {
            return super.getAutoSizeMaxTextSize();
        }
        o00Oo0 o00oo1 = this.f2816OooO0o0;
        if (o00oo1 != null) {
            return Math.round(o00oo1.f3337OooO.f3369OooO0o0);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (o0O0ooO.f3358OooO0O0) {
            return super.getAutoSizeMinTextSize();
        }
        o00Oo0 o00oo1 = this.f2816OooO0o0;
        if (o00oo1 != null) {
            return Math.round(o00oo1.f3337OooO.f3367OooO0Oo);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (o0O0ooO.f3358OooO0O0) {
            return super.getAutoSizeStepGranularity();
        }
        o00Oo0 o00oo1 = this.f2816OooO0o0;
        if (o00oo1 != null) {
            return Math.round(o00oo1.f3337OooO.f3366OooO0OO);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (o0O0ooO.f3358OooO0O0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        o00Oo0 o00oo1 = this.f2816OooO0o0;
        return o00oo1 != null ? o00oo1.f3337OooO.f3368OooO0o : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (o0O0ooO.f3358OooO0O0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        o00Oo0 o00oo1 = this.f2816OooO0o0;
        if (o00oo1 != null) {
            return o00oo1.f3337OooO.f3364OooO00o;
        }
        return 0;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.OooO0o0(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        OooO oooO = this.f2814OooO0Oo;
        if (oooO != null) {
            return oooO.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        OooO oooO = this.f2814OooO0Oo;
        if (oooO != null) {
            return oooO.OooO0OO();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2816OooO0o0.OooO0Oo();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2816OooO0o0.OooO0o0();
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
        o00Oo0 o00oo1 = this.f2816OooO0o0;
        if (o00oo1 == null || o0O0ooO.f3358OooO0O0) {
            return;
        }
        o00oo1.f3337OooO.OooO00o();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        boolean z = false;
        o00Oo0 o00oo1 = this.f2816OooO0o0;
        if (o00oo1 != null && !o0O0ooO.f3358OooO0O0) {
            oo000o oo000oVar = o00oo1.f3337OooO;
            if (oo000oVar.OooO() && oo000oVar.f3364OooO00o != 0) {
                z = true;
            }
        }
        if (z) {
            o00oo1.f3337OooO.OooO00o();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0OO(z);
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (o0O0ooO.f3358OooO0O0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        o00Oo0 o00oo1 = this.f2816OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0oo(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        if (o0O0ooO.f3358OooO0O0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        o00Oo0 o00oo1 = this.f2816OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO(iArr, i);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (o0O0ooO.f3358OooO0O0) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        o00Oo0 o00oo1 = this.f2816OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooOO0(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        OooO oooO = this.f2814OooO0Oo;
        if (oooO != null) {
            oooO.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        OooO oooO = this.f2814OooO0Oo;
        if (oooO != null) {
            oooO.OooO0o(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.OooO0o(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0Oo(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().OooO00o(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        o00Oo0 o00oo1 = this.f2816OooO0o0;
        if (o00oo1 != null) {
            o00oo1.f3338OooO00o.setAllCaps(z);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        OooO oooO = this.f2814OooO0Oo;
        if (oooO != null) {
            oooO.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        OooO oooO = this.f2814OooO0Oo;
        if (oooO != null) {
            oooO.OooO(mode);
        }
    }

    @Override // androidx.core.widget.Oooo000
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        o00Oo0 o00oo1 = this.f2816OooO0o0;
        o00oo1.OooOO0O(colorStateList);
        o00oo1.OooO0O0();
    }

    @Override // androidx.core.widget.Oooo000
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        o00Oo0 o00oo1 = this.f2816OooO0o0;
        o00oo1.OooOO0o(mode);
        o00oo1.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00Oo0 o00oo1 = this.f2816OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0oO(i, context);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = o0O0ooO.f3358OooO0O0;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        o00Oo0 o00oo1 = this.f2816OooO0o0;
        if (o00oo1 == null || z) {
            return;
        }
        oo000o oo000oVar = o00oo1.f3337OooO;
        if (oo000oVar.OooO() && oo000oVar.f3364OooO00o != 0) {
            return;
        }
        oo000oVar.OooO0o(f, i);
    }

    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p012OooOo0O.OooOOO0.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o000.OooO00o(context);
        o0000O.OooO00o(getContext(), this);
        OooO oooO = new OooO(this);
        this.f2814OooO0Oo = oooO;
        oooO.OooO0Oo(attributeSet, i);
        o00Oo0 o00oo1 = new o00Oo0(this);
        this.f2816OooO0o0 = o00oo1;
        o00oo1.OooO0o(attributeSet, i);
        o00oo1.OooO0O0();
        getEmojiTextViewHelper().OooO0O0(attributeSet, i);
    }
}
