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
import o0000O.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextInputLayout f17617OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O f17618OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f17619OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CheckableImageButton f17620OooO0Oo;

    public o00Oo0(@NonNull o00O0O o00o0o2) {
        this.f17617OooO00o = o00o0o2.f17589OooO0Oo;
        this.f17618OooO0O0 = o00o0o2;
        this.f17619OooO0OO = o00o0o2.getContext();
        this.f17620OooO0Oo = o00o0o2.f17594OooOO0;
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
        return this instanceof o0OoOo0;
    }

    public boolean OooOO0o() {
        return false;
    }

    public void OooOOO(@NonNull o0O0O00 o0o0o00) {
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
        this.f17618OooO0O0.OooO0o0(false);
    }

    public void OooOOoo() {
    }
}
