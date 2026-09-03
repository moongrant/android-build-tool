package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import p270o0O0000o.o00000OO;
import p270o0O0000o.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0Oo extends oo000o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public EditText f18157OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f18158OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0OO00O f18159OooO0oO;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.material.textfield.o0OO00O] */
    public oo0o0Oo(@NonNull o00Ooo o00ooo2, @DrawableRes int i) {
        super(o00ooo2);
        this.f18158OooO0o0 = o00000OO.design_password_eye;
        this.f18159OooO0oO = new View.OnClickListener() { // from class: com.google.android.material.textfield.o0OO00O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oo0o0Oo oo0o0oo = this.f18117OooO0Oo;
                EditText editText = oo0o0oo.f18157OooO0o;
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                EditText editText2 = oo0o0oo.f18157OooO0o;
                if (editText2 != null && (editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    oo0o0oo.f18157OooO0o.setTransformationMethod(null);
                } else {
                    oo0o0oo.f18157OooO0o.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    oo0o0oo.f18157OooO0o.setSelection(selectionEnd);
                }
                oo0o0oo.OooOOo0();
            }
        };
        if (i != 0) {
            this.f18158OooO0o0 = i;
        }
    }

    @Override // com.google.android.material.textfield.oo000o
    public final void OooO0O0() {
        OooOOo0();
    }

    @Override // com.google.android.material.textfield.oo000o
    @StringRes
    public final int OooO0OO() {
        return o0000O0.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.oo000o
    @DrawableRes
    public final int OooO0Oo() {
        return this.f18158OooO0o0;
    }

    @Override // com.google.android.material.textfield.oo000o
    public final View.OnClickListener OooO0o() {
        return this.f18159OooO0oO;
    }

    @Override // com.google.android.material.textfield.oo000o
    public final boolean OooOO0O() {
        return true;
    }

    @Override // com.google.android.material.textfield.oo000o
    public final boolean OooOO0o() {
        EditText editText = this.f18157OooO0o;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.oo000o
    public final void OooOOO0(@Nullable EditText editText) {
        this.f18157OooO0o = editText;
        OooOOo0();
    }

    @Override // com.google.android.material.textfield.oo000o
    public final void OooOOo() {
        EditText editText = this.f18157OooO0o;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            this.f18157OooO0o.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.oo000o
    public final void OooOOoo() {
        EditText editText = this.f18157OooO0o;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
