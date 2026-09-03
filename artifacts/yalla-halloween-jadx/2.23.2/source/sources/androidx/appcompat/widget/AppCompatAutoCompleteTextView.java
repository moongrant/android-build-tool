package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.widget.TextViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements androidx.core.widget.Oooo000 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final int[] f2808OooO0oO = {R.attr.popupBackground};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO f2809OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final OooOOO f2810OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00Oo0 f2811OooO0o0;

    public AppCompatAutoCompleteTextView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        OooO oooO = this.f2809OooO0Oo;
        if (oooO != null) {
            oooO.OooO00o();
        }
        o00Oo0 o00oo1 = this.f2811OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
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
        OooO oooO = this.f2809OooO0Oo;
        if (oooO != null) {
            return oooO.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        OooO oooO = this.f2809OooO0Oo;
        if (oooO != null) {
            return oooO.OooO0OO();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2811OooO0o0.OooO0Oo();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2811OooO0o0.OooO0o0();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        OooOo00.OooO00o(this, editorInfo, inputConnectionOnCreateInputConnection);
        return this.f2810OooO0o.OooO0OO(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        OooO oooO = this.f2809OooO0Oo;
        if (oooO != null) {
            oooO.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        OooO oooO = this.f2809OooO0Oo;
        if (oooO != null) {
            oooO.OooO0o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00Oo0 o00oo1 = this.f2811OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00Oo0 o00oo1 = this.f2811OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.OooO0o(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@DrawableRes int i) {
        setDropDownBackgroundDrawable(p013OooOo0o.o00Oo0.OooO00o(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f2810OooO0o.OooO0Oo(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.f2810OooO0o.OooO00o(keyListener));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        OooO oooO = this.f2809OooO0Oo;
        if (oooO != null) {
            oooO.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        OooO oooO = this.f2809OooO0Oo;
        if (oooO != null) {
            oooO.OooO(mode);
        }
    }

    @Override // androidx.core.widget.Oooo000
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        o00Oo0 o00oo1 = this.f2811OooO0o0;
        o00oo1.OooOO0O(colorStateList);
        o00oo1.OooO0O0();
    }

    @Override // androidx.core.widget.Oooo000
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        o00Oo0 o00oo1 = this.f2811OooO0o0;
        o00oo1.OooOO0o(mode);
        o00oo1.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00Oo0 o00oo1 = this.f2811OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0oO(i, context);
        }
    }

    public AppCompatAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p012OooOo0O.OooOOO0.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o000.OooO00o(context);
        o0000O.OooO00o(getContext(), this);
        o000Oo0 o000oo0OooOOO0 = o000Oo0.OooOOO0(getContext(), attributeSet, f2808OooO0oO, i);
        if (o000oo0OooOOO0.OooOO0o(0)) {
            setDropDownBackgroundDrawable(o000oo0OooOOO0.OooO0o0(0));
        }
        o000oo0OooOOO0.OooOOO();
        OooO oooO = new OooO(this);
        this.f2809OooO0Oo = oooO;
        oooO.OooO0Oo(attributeSet, i);
        o00Oo0 o00oo1 = new o00Oo0(this);
        this.f2811OooO0o0 = o00oo1;
        o00oo1.OooO0o(attributeSet, i);
        o00oo1.OooO0O0();
        OooOOO oooOOO = new OooOOO(this);
        this.f2810OooO0o = oooOOO;
        oooOOO.OooO0O0(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerOooO00o = oooOOO.OooO00o(keyListener);
            if (keyListenerOooO00o == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerOooO00o);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }
}
