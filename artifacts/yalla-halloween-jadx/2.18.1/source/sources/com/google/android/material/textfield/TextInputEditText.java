package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final Rect f17924OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f17925OoooO0O;

    public TextInputEditText(@NonNull Context context) {
        this(context, null);
    }

    @Nullable
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @Nullable
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean OooO0O0(@Nullable TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f17925OoooO0O;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(@Nullable Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!OooO0O0(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f17924OoooO0);
        rect.bottom = this.f17924OoooO0.bottom;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(@Nullable Rect rect, @Nullable Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        return OooO0O0(textInputLayout) ? textInputLayout.getGlobalVisibleRect(rect, point) : super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.f17998o00ooo) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.f17998o00ooo && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @Nullable
    public final InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT >= 23 || textInputLayout == null) {
            return;
        }
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z = !TextUtils.isEmpty(text);
        String string = "";
        String string2 = TextUtils.isEmpty(hint) ^ true ? hint.toString() : "";
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) text);
            sb.append(TextUtils.isEmpty(string2) ? "" : p016OooOoO0.OooOo00.OooO0Oo(", ", string2));
            string = sb.toString();
        } else if (!TextUtils.isEmpty(string2)) {
            string = string2;
        }
        accessibilityNodeInfo.setText(string);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(@Nullable Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!OooO0O0(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f17924OoooO0.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f17924OoooO0);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f17925OoooO0O = z;
    }

    public TextInputEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p337o0OO0o0.OooO0o.editTextStyle);
    }

    public TextInputEditText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(p352o0OOOOoO.OooOOO0.OooO00o(context, attributeSet, i, 0), attributeSet, i);
        this.f17924OoooO0 = new Rect();
        TypedArray typedArrayOooO0Oo = com.google.android.material.internal.o000oOoO.OooO0Oo(context, attributeSet, p337o0OO0o0.Oooo0.TextInputEditText, i, p337o0OO0o0.Oooo000.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayOooO0Oo.getBoolean(p337o0OO0o0.Oooo0.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        typedArrayOooO0Oo.recycle();
    }
}
