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
public class AppCompatCheckedTextView extends CheckedTextView implements androidx.core.widget.OooOo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NonNull
    public OooOOO f4929Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO f4930Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooO0o f4931Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o00O0O f4932Oooo0oo;

    public AppCompatCheckedTextView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private OooOOO getEmojiTextViewHelper() {
        if (this.f4929Oooo == null) {
            this.f4929Oooo = new OooOOO(this);
        }
        return this.f4929Oooo;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o00O0O o00o0o2 = this.f4932Oooo0oo;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
        }
        OooO0o oooO0o = this.f4931Oooo0oO;
        if (oooO0o != null) {
            oooO0o.OooO00o();
        }
        OooO oooO = this.f4930Oooo0o;
        if (oooO != null) {
            oooO.OooO00o();
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
        OooO0o oooO0o = this.f4931Oooo0oO;
        if (oooO0o != null) {
            return oooO0o.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        OooO0o oooO0o = this.f4931Oooo0oO;
        if (oooO0o != null) {
            return oooO0o.OooO0OO();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCheckMarkTintList() {
        OooO oooO = this.f4930Oooo0o;
        if (oooO != null) {
            return oooO.f5057OooO0O0;
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        OooO oooO = this.f4930Oooo0o;
        if (oooO != null) {
            return oooO.f5058OooO0OO;
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4932Oooo0oo.OooO0o0();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4932Oooo0oo.OooO0o();
    }

    @Override // android.widget.TextView, android.view.View
    @Nullable
    public final InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        OooOOOO.OooO0O0(inputConnectionOnCreateInputConnection, editorInfo, this);
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
        OooO0o oooO0o = this.f4931Oooo0oO;
        if (oooO0o != null) {
            oooO0o.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        OooO0o oooO0o = this.f4931Oooo0oO;
        if (oooO0o != null) {
            oooO0o.OooO0o(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Nullable Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        OooO oooO = this.f4930Oooo0o;
        if (oooO != null) {
            if (oooO.f5060OooO0o) {
                oooO.f5060OooO0o = false;
            } else {
                oooO.f5060OooO0o = true;
                oooO.OooO00o();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00O0O o00o0o2 = this.f4932Oooo0oo;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00O0O o00o0o2 = this.f4932Oooo0oo;
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

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        OooO0o oooO0o = this.f4931Oooo0oO;
        if (oooO0o != null) {
            oooO0o.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        OooO0o oooO0o = this.f4931Oooo0oO;
        if (oooO0o != null) {
            oooO0o.OooO(mode);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintList(@Nullable ColorStateList colorStateList) {
        OooO oooO = this.f4930Oooo0o;
        if (oooO != null) {
            oooO.f5057OooO0O0 = colorStateList;
            oooO.f5059OooO0Oo = true;
            oooO.OooO00o();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode) {
        OooO oooO = this.f4930Oooo0o;
        if (oooO != null) {
            oooO.f5058OooO0OO = mode;
            oooO.f5061OooO0o0 = true;
            oooO.OooO00o();
        }
    }

    @Override // androidx.core.widget.OooOo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.f4932Oooo0oo.OooOOO(colorStateList);
        this.f4932Oooo0oo.OooO0O0();
    }

    @Override // androidx.core.widget.OooOo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.f4932Oooo0oo.OooOOOO(mode);
        this.f4932Oooo0oo.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(@NonNull Context context, int i) {
        super.setTextAppearance(context, i);
        o00O0O o00o0o2 = this.f4932Oooo0oo;
        if (o00o0o2 != null) {
            o00o0o2.OooO(context, i);
        }
    }

    public AppCompatCheckedTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooOo00.OooO00o.checkedTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckedTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        boolean z;
        int iOooOOO0;
        int iOooOOO1;
        super(context, attributeSet, i);
        o0000.OooO00o(context);
        o00000OO.OooO00o(this, getContext());
        o00O0O o00o0o2 = new o00O0O(this);
        this.f4932Oooo0oo = o00o0o2;
        o00o0o2.OooO0oo(attributeSet, i);
        o00o0o2.OooO0O0();
        OooO0o oooO0o = new OooO0o(this);
        this.f4931Oooo0oO = oooO0o;
        oooO0o.OooO0Oo(attributeSet, i);
        OooO oooO = new OooO(this);
        this.f4930Oooo0o = oooO;
        Context context2 = getContext();
        int[] iArr = OooOo00.OooOOOO.CheckedTextView;
        o0000O0 o0000o0OooOOo = o0000O0.OooOOo(context2, attributeSet, iArr, i);
        ViewCompat.OooOo0O(this, getContext(), iArr, attributeSet, o0000o0OooOOo.f5367OooO0O0, i);
        try {
            int i2 = OooOo00.OooOOOO.CheckedTextView_checkMarkCompat;
            if (!o0000o0OooOOo.OooOOOo(i2) || (iOooOOO1 = o0000o0OooOOo.OooOOO0(i2, 0)) == 0) {
                z = false;
            } else {
                try {
                    setCheckMarkDrawable(p012OooOo0.OooOO0O.OooO0O0(getContext(), iOooOOO1));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                    z = false;
                }
            }
            if (!z) {
                int i3 = OooOo00.OooOOOO.CheckedTextView_android_checkMark;
                if (o0000o0OooOOo.OooOOOo(i3) && (iOooOOO0 = o0000o0OooOOo.OooOOO0(i3, 0)) != 0) {
                    CheckedTextView checkedTextView = oooO.f5056OooO00o;
                    checkedTextView.setCheckMarkDrawable(p012OooOo0.OooOO0O.OooO0O0(checkedTextView.getContext(), iOooOOO0));
                }
            }
            int i4 = OooOo00.OooOOOO.CheckedTextView_checkMarkTint;
            if (o0000o0OooOOo.OooOOOo(i4)) {
                oooO.f5056OooO00o.setCheckMarkTintList(o0000o0OooOOo.OooO0OO(i4));
            }
            int i5 = OooOo00.OooOOOO.CheckedTextView_checkMarkTintMode;
            if (o0000o0OooOOo.OooOOOo(i5)) {
                oooO.f5056OooO00o.setCheckMarkTintMode(o0ooOOo.OooO0Oo(o0000o0OooOOo.OooOO0(i5, -1), null));
            }
            o0000o0OooOOo.OooOOoo();
            getEmojiTextViewHelper().OooO0O0(attributeSet, i);
        } catch (Throwable th) {
            o0000o0OooOOo.OooOOoo();
            throw th;
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@DrawableRes int i) {
        setCheckMarkDrawable(p012OooOo0.OooOO0O.OooO0O0(getContext(), i));
    }
}
