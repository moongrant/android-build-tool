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
import androidx.annotation.UiThread;
import androidx.core.widget.TextViewCompat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements androidx.core.widget.Oooo000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f2871OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO f2872OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00O0O f2873OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00Oo0 f2874OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public OooOOOO f2875OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f2876OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Future<o0000O0O.o00O0O> f2877OooOO0;

    public interface OooO00o {
        void OooO00o(@Px int i);

        void OooO0O0(@Px int i);
    }

    @RequiresApi(api = 26)
    public class OooO0O0 implements OooO00o {
        public OooO0O0() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.OooO00o
        public void OooO00o(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.OooO00o
        public void OooO0O0(int i) {
        }
    }

    @RequiresApi(api = 28)
    public class OooO0OO extends OooO0O0 {
        public OooO0OO() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.OooO0O0, androidx.appcompat.widget.AppCompatTextView.OooO00o
        public final void OooO00o(@Px int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.OooO0O0, androidx.appcompat.widget.AppCompatTextView.OooO00o
        public final void OooO0O0(@Px int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }
    }

    public AppCompatTextView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private OooOOOO getEmojiTextViewHelper() {
        if (this.f2875OooO0oO == null) {
            this.f2875OooO0oO = new OooOOOO(this);
        }
        return this.f2875OooO0oO;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        OooO oooO = this.f2872OooO0Oo;
        if (oooO != null) {
            oooO.OooO00o();
        }
        o00Oo0 o00oo1 = this.f2874OooO0o0;
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
        o00Oo0 o00oo1 = this.f2874OooO0o0;
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
        o00Oo0 o00oo1 = this.f2874OooO0o0;
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
        o00Oo0 o00oo1 = this.f2874OooO0o0;
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
        o00Oo0 o00oo1 = this.f2874OooO0o0;
        return o00oo1 != null ? o00oo1.f3337OooO.f3368OooO0o : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (o0O0ooO.f3358OooO0O0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        o00Oo0 o00oo1 = this.f2874OooO0o0;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @RequiresApi(api = 26)
    @UiThread
    public OooO00o getSuperCaller() {
        if (this.f2871OooO == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                this.f2871OooO = new OooO0OO();
            } else if (i >= 26) {
                this.f2871OooO = new OooO0O0();
            }
        }
        return this.f2871OooO;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        OooO oooO = this.f2872OooO0Oo;
        if (oooO != null) {
            return oooO.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        OooO oooO = this.f2872OooO0Oo;
        if (oooO != null) {
            return oooO.OooO0OO();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2874OooO0o0.OooO0Oo();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2874OooO0o0.OooO0o0();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<o0000O0O.o00O0O> future = this.f2877OooOO0;
        if (future != null) {
            try {
                this.f2877OooOO0 = null;
                TextViewCompat.OooO0Oo(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        o00O0O o00o0o2;
        if (Build.VERSION.SDK_INT >= 28 || (o00o0o2 = this.f2873OooO0o) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = o00o0o2.f3336OooO0O0;
        return textClassifier == null ? o00O0O.OooO00o.OooO00o(o00o0o2.f3335OooO00o) : textClassifier;
    }

    @NonNull
    public o0000O0O.o00O0O.OooO00o getTextMetricsParamsCompat() {
        return TextViewCompat.OooO00o(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2874OooO0o0.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            o0000OO.OooO0OO.OooO00o(editorInfo, getText());
        }
        OooOo00.OooO00o(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        o00Oo0 o00oo1 = this.f2874OooO0o0;
        if (o00oo1 == null || o0O0ooO.f3358OooO0O0) {
            return;
        }
        o00oo1.f3337OooO.OooO00o();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future<o0000O0O.o00O0O> future = this.f2877OooOO0;
        if (future != null) {
            try {
                this.f2877OooOO0 = null;
                TextViewCompat.OooO0Oo(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        boolean z = false;
        o00Oo0 o00oo1 = this.f2874OooO0o0;
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
        o00Oo0 o00oo1 = this.f2874OooO0o0;
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
        o00Oo0 o00oo1 = this.f2874OooO0o0;
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
        o00Oo0 o00oo1 = this.f2874OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooOO0(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        OooO oooO = this.f2872OooO0Oo;
        if (oooO != null) {
            oooO.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        OooO oooO = this.f2872OooO0Oo;
        if (oooO != null) {
            oooO.OooO0o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00Oo0 o00oo1 = this.f2874OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00Oo0 o00oo1 = this.f2874OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        o00Oo0 o00oo1 = this.f2874OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        o00Oo0 o00oo1 = this.f2874OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@IntRange(from = ULong.MIN_VALUE) @Px int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().OooO0O0(i);
        } else {
            TextViewCompat.OooO0O0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@IntRange(from = ULong.MIN_VALUE) @Px int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().OooO00o(i);
        } else {
            TextViewCompat.OooO0OO(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@IntRange(from = ULong.MIN_VALUE) @Px int i) {
        o000OO.OooOOO0.OooO0Oo(i);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(@NonNull o0000O0O.o00O0O o00o0o2) {
        TextViewCompat.OooO0Oo(this, o00o0o2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        OooO oooO = this.f2872OooO0Oo;
        if (oooO != null) {
            oooO.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        OooO oooO = this.f2872OooO0Oo;
        if (oooO != null) {
            oooO.OooO(mode);
        }
    }

    @Override // androidx.core.widget.Oooo000
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        o00Oo0 o00oo1 = this.f2874OooO0o0;
        o00oo1.OooOO0O(colorStateList);
        o00oo1.OooO0O0();
    }

    @Override // androidx.core.widget.Oooo000
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        o00Oo0 o00oo1 = this.f2874OooO0o0;
        o00oo1.OooOO0o(mode);
        o00oo1.OooO0O0();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00Oo0 o00oo1 = this.f2874OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0oO(i, context);
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        o00O0O o00o0o2;
        if (Build.VERSION.SDK_INT >= 28 || (o00o0o2 = this.f2873OooO0o) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            o00o0o2.f3336OooO0O0 = textClassifier;
        }
    }

    public void setTextFuture(@Nullable Future<o0000O0O.o00O0O> future) {
        this.f2877OooOO0 = future;
        if (future != null) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0030  */
    public void setTextMetricsParamsCompat(@NonNull o0000O0O.o00O0O.OooO00o oooO00o) {
        int i;
        TextDirectionHeuristic textDirectionHeuristic = oooO00o.f34104OooO0O0;
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            i = 1;
        } else if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            i = 2;
        } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            i = 3;
        } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            i = 4;
        } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            i = 5;
        } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            i = 6;
        } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            i = 7;
        } else {
            i = 1;
        }
        TextViewCompat.OooO0O0.OooO0oo(this, i);
        getPaint().set(oooO00o.f34103OooO00o);
        TextViewCompat.OooO0OO.OooO0o0(this, oooO00o.f34105OooO0OO);
        TextViewCompat.OooO0OO.OooO0oo(this, oooO00o.f34106OooO0Oo);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = o0O0ooO.f3358OooO0O0;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        o00Oo0 o00oo1 = this.f2874OooO0o0;
        if (o00oo1 == null || z) {
            return;
        }
        oo000o oo000oVar = o00oo1.f3337OooO;
        if (oo000oVar.OooO() && oo000oVar.f3364OooO00o != 0) {
            return;
        }
        oo000oVar.OooO0o(f, i);
    }

    @Override // android.widget.TextView
    public final void setTypeface(@Nullable Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f2876OooO0oo) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            p052o00000oO.o00O0O o00o0o2 = p052o00000oO.OooOOOO.f33996OooO00o;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f2876OooO0oo = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f2876OooO0oo = false;
        }
    }

    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o000.OooO00o(context);
        this.f2876OooO0oo = false;
        this.f2871OooO = null;
        o0000O.OooO00o(getContext(), this);
        OooO oooO = new OooO(this);
        this.f2872OooO0Oo = oooO;
        oooO.OooO0Oo(attributeSet, i);
        o00Oo0 o00oo1 = new o00Oo0(this);
        this.f2874OooO0o0 = o00oo1;
        o00oo1.OooO0o(attributeSet, i);
        o00oo1.OooO0O0();
        this.f2873OooO0o = new o00O0O(this);
        getEmojiTextViewHelper().OooO0O0(attributeSet, i);
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? p013OooOo0o.o00Oo0.OooO00o(context, i) : null, i2 != 0 ? p013OooOo0o.o00Oo0.OooO00o(context, i2) : null, i3 != 0 ? p013OooOo0o.o00Oo0.OooO00o(context, i3) : null, i4 != 0 ? p013OooOo0o.o00Oo0.OooO00o(context, i4) : null);
        o00Oo0 o00oo1 = this.f2874OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? p013OooOo0o.o00Oo0.OooO00o(context, i) : null, i2 != 0 ? p013OooOo0o.o00Oo0.OooO00o(context, i2) : null, i3 != 0 ? p013OooOo0o.o00Oo0.OooO00o(context, i3) : null, i4 != 0 ? p013OooOo0o.o00Oo0.OooO00o(context, i4) : null);
        o00Oo0 o00oo1 = this.f2874OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
    }
}
