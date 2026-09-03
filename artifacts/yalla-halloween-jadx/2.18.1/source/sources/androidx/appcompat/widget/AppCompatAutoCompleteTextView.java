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
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements androidx.core.widget.OooOo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final int[] f4918Oooo = {R.attr.popupBackground};

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO0o f4919Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o00O0O f4920Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NonNull
    public final OooOOO0 f4921Oooo0oo;

    public AppCompatAutoCompleteTextView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        OooO0o oooO0o = this.f4919Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO00o();
        }
        o00O0O o00o0o2 = this.f4920Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.OooO0oO(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        OooO0o oooO0o = this.f4919Oooo0o;
        if (oooO0o != null) {
            return oooO0o.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        OooO0o oooO0o = this.f4919Oooo0o;
        if (oooO0o != null) {
            return oooO0o.OooO0OO();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4920Oooo0oO.OooO0o0();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4920Oooo0oO.OooO0o();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        OooOOOO.OooO0O0(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f4921Oooo0oo.OooO0OO(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        OooO0o oooO0o = this.f4919Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        OooO0o oooO0o = this.f4919Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00O0O o00o0o2 = this.f4920Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00O0O o00o0o2 = this.f4920Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.OooO0oo(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@DrawableRes int i) {
        setDropDownBackgroundDrawable(p012OooOo0.OooOO0O.OooO0O0(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f4921Oooo0oo.OooO0Oo(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.f4921Oooo0oo.OooO00o(keyListener));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        OooO0o oooO0o = this.f4919Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        OooO0o oooO0o = this.f4919Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO(mode);
        }
    }

    @Override // androidx.core.widget.OooOo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.f4920Oooo0oO.OooOOO(colorStateList);
        this.f4920Oooo0oO.OooO0O0();
    }

    @Override // androidx.core.widget.OooOo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.f4920Oooo0oO.OooOOOO(mode);
        this.f4920Oooo0oO.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00O0O o00o0o2 = this.f4920Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO(context, i);
        }
    }

    public AppCompatAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooOo00.OooO00o.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0000.OooO00o(context);
        o00000OO.OooO00o(this, getContext());
        o0000O0 o0000o0OooOOo = o0000O0.OooOOo(getContext(), attributeSet, f4918Oooo, i);
        if (o0000o0OooOOo.OooOOOo(0)) {
            setDropDownBackgroundDrawable(o0000o0OooOOo.OooO0oO(0));
        }
        o0000o0OooOOo.OooOOoo();
        OooO0o oooO0o = new OooO0o(this);
        this.f4919Oooo0o = oooO0o;
        oooO0o.OooO0Oo(attributeSet, i);
        o00O0O o00o0o2 = new o00O0O(this);
        this.f4920Oooo0oO = o00o0o2;
        o00o0o2.OooO0oo(attributeSet, i);
        o00o0o2.OooO0O0();
        OooOOO0 oooOOO0 = new OooOOO0(this);
        this.f4921Oooo0oo = oooOOO0;
        oooOOO0.OooO0O0(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerOooO00o = oooOOO0.OooO00o(keyListener);
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
