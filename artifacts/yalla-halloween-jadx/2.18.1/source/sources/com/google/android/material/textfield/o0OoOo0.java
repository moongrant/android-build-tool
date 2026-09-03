package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 extends OooOo00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0O0 f18028OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f18029OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0OO f18030OooO0oO;

    public class OooO00o extends com.google.android.material.internal.Oooo0 {
        public OooO00o() {
        }

        @Override // com.google.android.material.internal.Oooo0, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            o0OoOo0 o0oooo1 = o0OoOo0.this;
            o0oooo1.f17895OooO0OO.setChecked(!o0OoOo0.OooO0Oo(o0oooo1));
        }
    }

    public class OooO0O0 implements TextInputLayout.OooOO0 {
        public OooO0O0() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OooOO0
        public final void OooO00o(@NonNull TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            o0OoOo0 o0oooo1 = o0OoOo0.this;
            o0oooo1.f17895OooO0OO.setChecked(!o0OoOo0.OooO0Oo(o0oooo1));
            editText.removeTextChangedListener(o0OoOo0.this.f18029OooO0o0);
            editText.addTextChangedListener(o0OoOo0.this.f18029OooO0o0);
        }
    }

    public class OooO0OO implements TextInputLayout.OooOO0O {

        public class OooO00o implements Runnable {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ EditText f18034Oooo0o;

            public OooO00o(EditText editText) {
                this.f18034Oooo0o = editText;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f18034Oooo0o.removeTextChangedListener(o0OoOo0.this.f18029OooO0o0);
            }
        }

        public OooO0OO() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OooOO0O
        public final void OooO00o(@NonNull TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new OooO00o(editText));
        }
    }

    public class OooO0o implements View.OnClickListener {
        public OooO0o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            EditText editText = o0OoOo0.this.f17893OooO00o.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (o0OoOo0.OooO0Oo(o0OoOo0.this)) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            o0OoOo0.this.f17893OooO00o.OooOOOo();
        }
    }

    public o0OoOo0(@NonNull TextInputLayout textInputLayout, @DrawableRes int i) {
        super(textInputLayout, i);
        this.f18029OooO0o0 = new OooO00o();
        this.f18028OooO0o = new OooO0O0();
        this.f18030OooO0oO = new OooO0OO();
    }

    public static boolean OooO0Oo(o0OoOo0 o0oooo1) {
        EditText editText = o0oooo1.f17893OooO00o.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // com.google.android.material.textfield.OooOo00
    public final void OooO00o() {
        TextInputLayout textInputLayout = this.f17893OooO00o;
        int i = this.f17896OooO0Oo;
        if (i == 0) {
            i = p337o0OO0o0.OooOO0O.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f17893OooO00o;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(p337o0OO0o0.OooOo.password_toggle_content_description));
        boolean z = true;
        this.f17893OooO00o.setEndIconVisible(true);
        this.f17893OooO00o.setEndIconCheckable(true);
        this.f17893OooO00o.setEndIconOnClickListener(new OooO0o());
        this.f17893OooO00o.OooO00o(this.f18028OooO0o);
        this.f17893OooO00o.OooO0O0(this.f18030OooO0oO);
        EditText editText = this.f17893OooO00o.getEditText();
        if (editText == null || (editText.getInputType() != 16 && editText.getInputType() != 128 && editText.getInputType() != 144 && editText.getInputType() != 224)) {
            z = false;
        }
        if (z) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
