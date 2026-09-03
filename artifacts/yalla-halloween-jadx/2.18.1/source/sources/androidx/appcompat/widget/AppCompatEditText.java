package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements o000O0O0.o0ooOOo, androidx.core.widget.OooOo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final androidx.core.widget.OooOo00 f4933Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO0o f4934Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o00O0O f4935Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o0OoOo0 f4936Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NonNull
    public final OooOOO0 f4937OoooO00;

    public AppCompatEditText(@NonNull Context context) {
        this(context, null);
    }

    @Override // o000O0O0.o0ooOOo
    @Nullable
    public final ContentInfoCompat OooO00o(@NonNull ContentInfoCompat contentInfoCompat) {
        return this.f4933Oooo.OooO00o(this, contentInfoCompat);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        OooO0o oooO0o = this.f4934Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO00o();
        }
        o00O0O o00o0o2 = this.f4935Oooo0oO;
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
        OooO0o oooO0o = this.f4934Oooo0o;
        if (oooO0o != null) {
            return oooO0o.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        OooO0o oooO0o = this.f4934Oooo0o;
        if (oooO0o != null) {
            return oooO0o.OooO0OO();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4935Oooo0oO.OooO0o0();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4935Oooo0oO.OooO0o();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        o0OoOo0 o0oooo1;
        if (Build.VERSION.SDK_INT >= 28 || (o0oooo1 = this.f4936Oooo0oo) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = o0oooo1.f5477OooO0O0;
        return textClassifier == null ? o0OoOo0.OooO00o.OooO00o(o0oooo1.f5476OooO00o) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        String[] strArrOooOO0o;
        InputConnection oooOo00;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        Objects.requireNonNull(this.f4935Oooo0oO);
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            p074o000O0oo.OooOO0O.OooO0Oo(editorInfo, getText());
        }
        OooOOOO.OooO0O0(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrOooOO0o = ViewCompat.OooOO0o(this)) != null) {
            p074o000O0oo.OooOO0O.OooO0OO(editorInfo, strArrOooOO0o);
            p074o000O0oo.OooOOO0 oooOOO0 = new p074o000O0oo.OooOOO0(this);
            if (i >= 25) {
                oooOo00 = new p074o000O0oo.OooOOOO(inputConnectionOnCreateInputConnection, oooOOO0);
            } else if (p074o000O0oo.OooOO0O.OooO00o(editorInfo).length != 0) {
                oooOo00 = new p074o000O0oo.OooOo00(inputConnectionOnCreateInputConnection, oooOOO0);
            }
            inputConnectionOnCreateInputConnection = oooOo00;
        }
        return this.f4937OoooO00.OooO0OO(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean zOooO00o = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && ViewCompat.OooOO0o(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zOooO00o = Oooo000.OooO00o(dragEvent, this, activity);
            }
        }
        if (zOooO00o) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (i2 < 31 && ViewCompat.OooOO0o(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                ContentInfoCompat.OooO0O0 oooO00o = i2 >= 31 ? new ContentInfoCompat.OooO00o(primaryClip, 1) : new ContentInfoCompat.OooO0OO(primaryClip, 1);
                oooO00o.OooO0O0(i != 16908322 ? 1 : 0);
                ViewCompat.OooOOo(this, oooO00o.build());
            }
            i3 = 1;
        }
        if (i3 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        OooO0o oooO0o = this.f4934Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        OooO0o oooO0o = this.f4934Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00O0O o00o0o2 = this.f4935Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00O0O o00o0o2 = this.f4935Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.OooO0oo(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f4937OoooO00.OooO0Oo(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.f4937OoooO00.OooO00o(keyListener));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        OooO0o oooO0o = this.f4934Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        OooO0o oooO0o = this.f4934Oooo0o;
        if (oooO0o != null) {
            oooO0o.OooO(mode);
        }
    }

    @Override // androidx.core.widget.OooOo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.f4935Oooo0oO.OooOOO(colorStateList);
        this.f4935Oooo0oO.OooO0O0();
    }

    @Override // androidx.core.widget.OooOo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.f4935Oooo0oO.OooOOOO(mode);
        this.f4935Oooo0oO.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00O0O o00o0o2 = this.f4935Oooo0oO;
        if (o00o0o2 != null) {
            o00o0o2.OooO(context, i);
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        o0OoOo0 o0oooo1;
        if (Build.VERSION.SDK_INT >= 28 || (o0oooo1 = this.f4936Oooo0oo) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            o0oooo1.f5477OooO0O0 = textClassifier;
        }
    }

    public AppCompatEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooOo00.OooO00o.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    @Nullable
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0000.OooO00o(context);
        o00000OO.OooO00o(this, getContext());
        OooO0o oooO0o = new OooO0o(this);
        this.f4934Oooo0o = oooO0o;
        oooO0o.OooO0Oo(attributeSet, i);
        o00O0O o00o0o2 = new o00O0O(this);
        this.f4935Oooo0oO = o00o0o2;
        o00o0o2.OooO0oo(attributeSet, i);
        o00o0o2.OooO0O0();
        this.f4936Oooo0oo = new o0OoOo0(this);
        this.f4933Oooo = new androidx.core.widget.OooOo00();
        OooOOO0 oooOOO0 = new OooOOO0(this);
        this.f4937OoooO00 = oooOOO0;
        oooOOO0.OooO0O0(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        Objects.requireNonNull(oooOOO0);
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
