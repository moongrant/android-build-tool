package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.widget.TextViewCompat;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements androidx.core.widget.OooOo, androidx.core.widget.OooO0O0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NonNull
    public OooOOO f4980Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO0o f4981Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o00O0O f4982Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o0OoOo0 f4983Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public Future<o000O0Oo.OooO0O0> f4984OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f4985OoooO00;

    public AppCompatTextView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private OooOOO getEmojiTextViewHelper() {
        if (this.f4980Oooo == null) {
            this.f4980Oooo = new OooOOO(this);
        }
        return this.f4980Oooo;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        OooO0o oooO0o = this.f4981Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO00o();
        }
        o00O0O o00o0o2 = this.f4982Oooo0oO;
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
        o00O0O o00o0o2 = this.f4982Oooo0oO;
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
        o00O0O o00o0o2 = this.f4982Oooo0oO;
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
        o00O0O o00o0o2 = this.f4982Oooo0oO;
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
        o00O0O o00o0o2 = this.f4982Oooo0oO;
        return o00o0o2 != null ? o00o0o2.f5412OooO.f5440OooO0o : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.OooO0O0.f8010OooO0OO) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        o00O0O o00o0o2 = this.f4982Oooo0oO;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        OooO0o oooO0o = this.f4981Oooo0o;
        if (oooO0o != null) {
            return oooO0o.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        OooO0o oooO0o = this.f4981Oooo0o;
        if (oooO0o != null) {
            return oooO0o.OooO0OO();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4982Oooo0oO.OooO0o0();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4982Oooo0oO.OooO0o();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<o000O0Oo.OooO0O0> future = this.f4984OoooO0;
        if (future != null) {
            try {
                this.f4984OoooO0 = null;
                TextViewCompat.OooO0o0(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        o0OoOo0 o0oooo1;
        if (Build.VERSION.SDK_INT >= 28 || (o0oooo1 = this.f4983Oooo0oo) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = o0oooo1.f5477OooO0O0;
        return textClassifier == null ? o0OoOo0.OooO00o.OooO00o(o0oooo1.f5476OooO00o) : textClassifier;
    }

    @NonNull
    public o000O0Oo.OooO0O0.OooO00o getTextMetricsParamsCompat() {
        return TextViewCompat.OooO00o(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        Objects.requireNonNull(this.f4982Oooo0oO);
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            p074o000O0oo.OooOO0O.OooO0Oo(editorInfo, getText());
        }
        OooOOOO.OooO0O0(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        o00O0O o00o0o2 = this.f4982Oooo0oO;
        if (o00o0o2 != null) {
            Objects.requireNonNull(o00o0o2);
            if (androidx.core.widget.OooO0O0.f8010OooO0OO) {
                return;
            }
            o00o0o2.OooO0OO();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future<o000O0Oo.OooO0O0> future = this.f4984OoooO0;
        if (future != null) {
            try {
                this.f4984OoooO0 = null;
                TextViewCompat.OooO0o0(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        o00O0O o00o0o2 = this.f4982Oooo0oO;
        if (o00o0o2 == null || androidx.core.widget.OooO0O0.f8010OooO0OO || !o00o0o2.OooO0oO()) {
            return;
        }
        this.f4982Oooo0oO.OooO0OO();
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
        o00O0O o00o0o2 = this.f4982Oooo0oO;
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
        o00O0O o00o0o2 = this.f4982Oooo0oO;
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
        o00O0O o00o0o2 = this.f4982Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooOOO0(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        OooO0o oooO0o = this.f4981Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        OooO0o oooO0o = this.f4981Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00O0O o00o0o2 = this.f4982Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00O0O o00o0o2 = this.f4982Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        o00O0O o00o0o2 = this.f4982Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        o00O0O o00o0o2 = this.f4982Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@IntRange(from = ULong.MIN_VALUE) @Px int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            TextViewCompat.OooO0O0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@IntRange(from = ULong.MIN_VALUE) @Px int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            TextViewCompat.OooO0OO(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@IntRange(from = ULong.MIN_VALUE) @Px int i) {
        TextViewCompat.OooO0Oo(this, i);
    }

    public void setPrecomputedText(@NonNull o000O0Oo.OooO0O0 oooO0O0) {
        TextViewCompat.OooO0o0(this, oooO0O0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        OooO0o oooO0o = this.f4981Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        OooO0o oooO0o = this.f4981Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO(mode);
        }
    }

    @Override // androidx.core.widget.OooOo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.f4982Oooo0oO.OooOOO(colorStateList);
        this.f4982Oooo0oO.OooO0O0();
    }

    @Override // androidx.core.widget.OooOo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.f4982Oooo0oO.OooOOOO(mode);
        this.f4982Oooo0oO.OooO0O0();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00O0O o00o0o2 = this.f4982Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO(context, i);
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        o0OoOo0 o0oooo1;
        if (Build.VERSION.SDK_INT >= 28 || (o0oooo1 = this.f4983Oooo0oo) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            o0oooo1.f5477OooO0O0 = textClassifier;
        }
    }

    public void setTextFuture(@Nullable Future<o000O0Oo.OooO0O0> future) {
        this.f4984OoooO0 = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull o000O0Oo.OooO0O0.OooO00o oooO00o) {
        int i = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = oooO00o.f28151OooO0O0;
        int i2 = 1;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i2 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i2 = 7;
            }
        }
        TextViewCompat.OooO0O0.OooO0oo(this, i2);
        if (i >= 23) {
            getPaint().set(oooO00o.f28150OooO00o);
            TextViewCompat.OooO0OO.OooO0o0(this, oooO00o.f28152OooO0OO);
            TextViewCompat.OooO0OO.OooO0oo(this, oooO00o.f28153OooO0Oo);
        } else {
            float textScaleX = oooO00o.f28150OooO00o.getTextScaleX();
            getPaint().set(oooO00o.f28150OooO00o);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = androidx.core.widget.OooO0O0.f8010OooO0OO;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        o00O0O o00o0o2 = this.f4982Oooo0oO;
        if (o00o0o2 != null) {
            Objects.requireNonNull(o00o0o2);
            if (z || o00o0o2.OooO0oO()) {
                return;
            }
            o00o0o2.f5412OooO.OooO0o(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(@Nullable Typeface typeface, int i) {
        if (this.f4985OoooO00) {
            return;
        }
        Typeface typefaceCreate = null;
        if (typeface != null && i > 0) {
            Context context = getContext();
            p071o000O0o.Oooo0 oooo0 = p071o000O0o.OooOOO0.f28175OooO00o;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f4985OoooO00 = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f4985OoooO00 = false;
        }
    }

    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0000.OooO00o(context);
        this.f4985OoooO00 = false;
        o00000OO.OooO00o(this, getContext());
        OooO0o oooO0o = new OooO0o(this);
        this.f4981Oooo0o = oooO0o;
        oooO0o.OooO0Oo(attributeSet, i);
        o00O0O o00o0o2 = new o00O0O(this);
        this.f4982Oooo0oO = o00o0o2;
        o00o0o2.OooO0oo(attributeSet, i);
        o00o0o2.OooO0O0();
        this.f4983Oooo0oo = new o0OoOo0(this);
        getEmojiTextViewHelper().OooO0O0(attributeSet, i);
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? p012OooOo0.OooOO0O.OooO0O0(context, i) : null, i2 != 0 ? p012OooOo0.OooOO0O.OooO0O0(context, i2) : null, i3 != 0 ? p012OooOo0.OooOO0O.OooO0O0(context, i3) : null, i4 != 0 ? p012OooOo0.OooOO0O.OooO0O0(context, i4) : null);
        o00O0O o00o0o2 = this.f4982Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? p012OooOo0.OooOO0O.OooO0O0(context, i) : null, i2 != 0 ? p012OooOo0.OooOO0O.OooO0O0(context, i2) : null, i3 != 0 ? p012OooOo0.OooOO0O.OooO0O0(context, i3) : null, i4 != 0 ? p012OooOo0.OooOO0O.OooO0O0(context, i4) : null);
        o00O0O o00o0o2 = this.f4982Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
        }
    }
}
