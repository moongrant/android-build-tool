package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView implements androidx.core.widget.Oooo000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0 f2819OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00Oo0 f2820OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO f2821OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public OooOOOO f2822OooO0oO;

    public AppCompatCheckedTextView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private OooOOOO getEmojiTextViewHelper() {
        if (this.f2822OooO0oO == null) {
            this.f2822OooO0oO = new OooOOOO(this);
        }
        return this.f2822OooO0oO;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o00Oo0 o00oo1 = this.f2820OooO0o;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
        OooO oooO = this.f2821OooO0o0;
        if (oooO != null) {
            oooO.OooO00o();
        }
        OooOO0 oooOO1 = this.f2819OooO0Oo;
        if (oooOO1 != null) {
            oooOO1.OooO00o();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.OooO0o0(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        OooO oooO = this.f2821OooO0o0;
        if (oooO != null) {
            return oooO.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        OooO oooO = this.f2821OooO0o0;
        if (oooO != null) {
            return oooO.OooO0OO();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCheckMarkTintList() {
        OooOO0 oooOO1 = this.f2819OooO0Oo;
        if (oooOO1 != null) {
            return oooOO1.f2966OooO0O0;
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        OooOO0 oooOO1 = this.f2819OooO0Oo;
        if (oooOO1 != null) {
            return oooOO1.f2967OooO0OO;
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2820OooO0o.OooO0Oo();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2820OooO0o.OooO0o0();
    }

    @Override // android.widget.TextView, android.view.View
    @Nullable
    public final InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        OooOo00.OooO00o(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0OO(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        OooO oooO = this.f2821OooO0o0;
        if (oooO != null) {
            oooO.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        OooO oooO = this.f2821OooO0o0;
        if (oooO != null) {
            oooO.OooO0o(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Nullable Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        OooOO0 oooOO1 = this.f2819OooO0Oo;
        if (oooOO1 != null) {
            if (oooOO1.f2969OooO0o) {
                oooOO1.f2969OooO0o = false;
            } else {
                oooOO1.f2969OooO0o = true;
                oooOO1.OooO00o();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00Oo0 o00oo1 = this.f2820OooO0o;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00Oo0 o00oo1 = this.f2820OooO0o;
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

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        OooO oooO = this.f2821OooO0o0;
        if (oooO != null) {
            oooO.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        OooO oooO = this.f2821OooO0o0;
        if (oooO != null) {
            oooO.OooO(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintList(@Nullable ColorStateList colorStateList) {
        OooOO0 oooOO1 = this.f2819OooO0Oo;
        if (oooOO1 != null) {
            oooOO1.f2966OooO0O0 = colorStateList;
            oooOO1.f2968OooO0Oo = true;
            oooOO1.OooO00o();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode) {
        OooOO0 oooOO1 = this.f2819OooO0Oo;
        if (oooOO1 != null) {
            oooOO1.f2967OooO0OO = mode;
            oooOO1.f2970OooO0o0 = true;
            oooOO1.OooO00o();
        }
    }

    @Override // androidx.core.widget.Oooo000
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        o00Oo0 o00oo1 = this.f2820OooO0o;
        o00oo1.OooOO0O(colorStateList);
        o00oo1.OooO0O0();
    }

    @Override // androidx.core.widget.Oooo000
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        o00Oo0 o00oo1 = this.f2820OooO0o;
        o00oo1.OooOO0o(mode);
        o00oo1.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(@NonNull Context context, int i) {
        super.setTextAppearance(context, i);
        o00Oo0 o00oo1 = this.f2820OooO0o;
        if (o00oo1 != null) {
            o00oo1.OooO0oO(i, context);
        }
    }

    public AppCompatCheckedTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p012OooOo0O.OooOOO0.checkedTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckedTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        boolean z;
        int iOooO;
        int iOooO2;
        super(context, attributeSet, i);
        o000.OooO00o(context);
        o0000O.OooO00o(getContext(), this);
        o00Oo0 o00oo1 = new o00Oo0(this);
        this.f2820OooO0o = o00oo1;
        o00oo1.OooO0o(attributeSet, i);
        o00oo1.OooO0O0();
        OooO oooO = new OooO(this);
        this.f2821OooO0o0 = oooO;
        oooO.OooO0Oo(attributeSet, i);
        this.f2819OooO0Oo = new OooOO0(this);
        Context context2 = getContext();
        int[] iArr = p012OooOo0O.o00O0O.CheckedTextView;
        o000Oo0 o000oo0OooOOO0 = o000Oo0.OooOOO0(context2, attributeSet, iArr, i);
        ViewCompat.OooOOO(this, getContext(), iArr, attributeSet, o000oo0OooOOO0.f3324OooO0O0, i, 0);
        try {
            int i2 = p012OooOo0O.o00O0O.CheckedTextView_checkMarkCompat;
            if (!o000oo0OooOOO0.OooOO0o(i2) || (iOooO2 = o000oo0OooOOO0.OooO(i2, 0)) == 0) {
                z = false;
            } else {
                try {
                    setCheckMarkDrawable(p013OooOo0o.o00Oo0.OooO00o(getContext(), iOooO2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                    z = false;
                }
            }
            if (!z) {
                int i3 = p012OooOo0O.o00O0O.CheckedTextView_android_checkMark;
                if (o000oo0OooOOO0.OooOO0o(i3) && (iOooO = o000oo0OooOOO0.OooO(i3, 0)) != 0) {
                    setCheckMarkDrawable(p013OooOo0o.o00Oo0.OooO00o(getContext(), iOooO));
                }
            }
            int i4 = p012OooOo0O.o00O0O.CheckedTextView_checkMarkTint;
            if (o000oo0OooOOO0.OooOO0o(i4)) {
                setCheckMarkTintList(o000oo0OooOOO0.OooO0O0(i4));
            }
            int i5 = p012OooOo0O.o00O0O.CheckedTextView_checkMarkTintMode;
            if (o000oo0OooOOO0.OooOO0o(i5)) {
                setCheckMarkTintMode(o000000.OooO0OO(o000oo0OooOOO0.OooO0oo(i5, -1), null));
            }
            o000oo0OooOOO0.OooOOO();
            getEmojiTextViewHelper().OooO0O0(attributeSet, i);
        } catch (Throwable th) {
            o000oo0OooOOO0.OooOOO();
            throw th;
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@DrawableRes int i) {
        setCheckMarkDrawable(p013OooOo0o.o00Oo0.OooO00o(getContext(), i));
    }
}
