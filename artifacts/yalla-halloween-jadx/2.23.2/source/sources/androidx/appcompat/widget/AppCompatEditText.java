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
import android.os.Bundle;
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
import androidx.annotation.UiThread;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements androidx.core.view.o00000O0, androidx.core.widget.Oooo000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooO00o f2823OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO f2824OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00O0O f2825OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00Oo0 f2826OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final androidx.core.widget.OooOo00 f2827OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final OooOOO f2828OooO0oo;

    @RequiresApi(api = 26)
    public class OooO00o {
        public OooO00o() {
        }
    }

    public AppCompatEditText(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    @RequiresApi(26)
    @UiThread
    private OooO00o getSuperCaller() {
        if (this.f2823OooO == null) {
            this.f2823OooO = new OooO00o();
        }
        return this.f2823OooO;
    }

    @Override // androidx.core.view.o00000O0
    @Nullable
    public final ContentInfoCompat OooO00o(@NonNull ContentInfoCompat contentInfoCompat) {
        return this.f2827OooO0oO.OooO00o(this, contentInfoCompat);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        OooO oooO = this.f2824OooO0Oo;
        if (oooO != null) {
            oooO.OooO00o();
        }
        o00Oo0 o00oo1 = this.f2826OooO0o0;
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
        OooO oooO = this.f2824OooO0Oo;
        if (oooO != null) {
            return oooO.OooO0O0();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        OooO oooO = this.f2824OooO0Oo;
        if (oooO != null) {
            return oooO.OooO0OO();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2826OooO0o0.OooO0Oo();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2826OooO0o0.OooO0o0();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        o00O0O o00o0o2;
        if (Build.VERSION.SDK_INT >= 28 || (o00o0o2 = this.f2825OooO0o) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = o00o0o2.f3334OooO0O0;
        return textClassifier == null ? o00O0O.OooO00o.OooO00o(o00o0o2.f3333OooO00o) : textClassifier;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e A[PHI: r1
      0x005e: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:33:0x0071, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        String[] strArrOooO0oO;
        String[] stringArray;
        InputConnection oooOO1;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2826OooO0o0.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            o0000OO.OooO0OO.OooO00o(editorInfo, getText());
        }
        OooOo00.OooO00o(this, editorInfo, inputConnectionOnCreateInputConnection);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrOooO0oO = ViewCompat.OooO0oO(this)) != null) {
            if (i >= 25) {
                editorInfo.contentMimeTypes = strArrOooO0oO;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrOooO0oO);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrOooO0oO);
            }
            o0000OO.OooO0o oooO0o = new o0000OO.OooO0o(this);
            if (i >= 25) {
                oooOO1 = new o0000OO.OooO(inputConnectionOnCreateInputConnection, oooO0o);
            } else {
                String[] strArr = o0000OO.OooO0OO.f33603OooO00o;
                if (i >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                            strArr = stringArray;
                        }
                    }
                }
                if (strArr.length != 0) {
                    oooOO1 = new o0000OO.OooOO0(inputConnectionOnCreateInputConnection, oooO0o);
                }
            }
            inputConnectionOnCreateInputConnection = oooOO1;
        }
        return this.f2828OooO0oo.OooO0OO(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean zOooO00o = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && ViewCompat.OooO0oO(this) != null) {
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
                zOooO00o = Oooo0.OooO00o(dragEvent, this, activity);
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
        if (i2 < 31 && ViewCompat.OooO0oO(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                ContentInfoCompat.OooO0O0 oooO00o = i2 >= 31 ? new ContentInfoCompat.OooO00o(primaryClip, 1) : new ContentInfoCompat.OooO0OO(primaryClip, 1);
                oooO00o.OooO0O0(i != 16908322 ? 1 : 0);
                ViewCompat.OooOO0O(this, oooO00o.build());
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
        OooO oooO = this.f2824OooO0Oo;
        if (oooO != null) {
            oooO.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        OooO oooO = this.f2824OooO0Oo;
        if (oooO != null) {
            oooO.OooO0o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00Oo0 o00oo1 = this.f2826OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00Oo0 o00oo1 = this.f2826OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.OooO0o(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f2828OooO0oo.OooO0Oo(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.f2828OooO0oo.OooO00o(keyListener));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        OooO oooO = this.f2824OooO0Oo;
        if (oooO != null) {
            oooO.OooO0oo(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        OooO oooO = this.f2824OooO0Oo;
        if (oooO != null) {
            oooO.OooO(mode);
        }
    }

    @Override // androidx.core.widget.Oooo000
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        o00Oo0 o00oo1 = this.f2826OooO0o0;
        o00oo1.OooOO0O(colorStateList);
        o00oo1.OooO0O0();
    }

    @Override // androidx.core.widget.Oooo000
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        o00Oo0 o00oo1 = this.f2826OooO0o0;
        o00oo1.OooOO0o(mode);
        o00oo1.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00Oo0 o00oo1 = this.f2826OooO0o0;
        if (o00oo1 != null) {
            o00oo1.OooO0oO(i, context);
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        o00O0O o00o0o2;
        if (Build.VERSION.SDK_INT >= 28 || (o00o0o2 = this.f2825OooO0o) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            o00o0o2.f3334OooO0O0 = textClassifier;
        }
    }

    public AppCompatEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p012OooOo0O.OooOOO0.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    @Nullable
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o000.OooO00o(context);
        o0000O.OooO00o(getContext(), this);
        OooO oooO = new OooO(this);
        this.f2824OooO0Oo = oooO;
        oooO.OooO0Oo(attributeSet, i);
        o00Oo0 o00oo1 = new o00Oo0(this);
        this.f2826OooO0o0 = o00oo1;
        o00oo1.OooO0o(attributeSet, i);
        o00oo1.OooO0O0();
        this.f2825OooO0o = new o00O0O(this);
        this.f2827OooO0oO = new androidx.core.widget.OooOo00();
        OooOOO oooOOO = new OooOOO(this);
        this.f2828OooO0oo = oooOOO;
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
