package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import p272o0O0000o.o00000OO;
import p272o0O0000o.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public EditText f17634OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f17635OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0OOO0o f17636OooO0oO;

    public o0Oo0oo(@NonNull o00O0O o00o0o2, @DrawableRes int i) {
        super(o00o0o2);
        this.f17635OooO0o0 = o00000OO.design_password_eye;
        this.f17636OooO0oO = new o0OOO0o(this, 0);
        if (i != 0) {
            this.f17635OooO0o0 = i;
        }
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final void OooO0O0() {
        OooOOo0();
    }

    @Override // com.google.android.material.textfield.o00Oo0
    @StringRes
    public final int OooO0OO() {
        return o0000O0.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.o00Oo0
    @DrawableRes
    public final int OooO0Oo() {
        return this.f17635OooO0o0;
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final View.OnClickListener OooO0o() {
        return this.f17636OooO0oO;
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final boolean OooOO0O() {
        return true;
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final boolean OooOO0o() {
        EditText editText = this.f17634OooO0o;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final void OooOOO0(@Nullable EditText editText) {
        this.f17634OooO0o = editText;
        OooOOo0();
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final void OooOOo() {
        EditText editText = this.f17634OooO0o;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            this.f17634OooO0o.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.o00Oo0
    public final void OooOOoo() {
        EditText editText = this.f17634OooO0o;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
