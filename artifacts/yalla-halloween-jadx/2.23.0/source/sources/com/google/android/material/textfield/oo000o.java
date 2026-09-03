package com.google.android.material.textfield;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextInputLayout f18153OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Ooo f18154OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f18155OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CheckableImageButton f18156OooO0Oo;

    public oo000o(@NonNull o00Ooo o00ooo2) {
        this.f18153OooO00o = o00ooo2.f18079OooO0Oo;
        this.f18154OooO0O0 = o00ooo2;
        this.f18155OooO0OO = o00ooo2.getContext();
        this.f18156OooO0Oo = o00ooo2.f18084OooOO0;
    }

    public boolean OooO(int i) {
        return true;
    }

    public void OooO00o() {
    }

    public void OooO0O0() {
    }

    @StringRes
    public int OooO0OO() {
        return 0;
    }

    @DrawableRes
    public int OooO0Oo() {
        return 0;
    }

    public View.OnClickListener OooO0o() {
        return null;
    }

    public View.OnFocusChangeListener OooO0o0() {
        return null;
    }

    public View.OnFocusChangeListener OooO0oO() {
        return null;
    }

    public o0000O.OooO0o OooO0oo() {
        return null;
    }

    public boolean OooOO0() {
        return false;
    }

    public boolean OooOO0O() {
        return this instanceof o00Oo0;
    }

    public boolean OooOO0o() {
        return false;
    }

    public void OooOOO(@NonNull o0000O.o0Oo0oo o0oo0oo2) {
    }

    public void OooOOO0(@Nullable EditText editText) {
    }

    public void OooOOOO(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void OooOOOo(boolean z) {
    }

    public void OooOOo() {
    }

    public final void OooOOo0() {
        this.f18154OooO0O0.OooO0o0(false);
    }

    public void OooOOoo() {
    }
}
