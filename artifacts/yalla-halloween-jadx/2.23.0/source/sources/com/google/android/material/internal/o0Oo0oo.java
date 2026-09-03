package com.google.android.material.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ View f17328OooO0Oo;

    public o0Oo0oo(EditText editText) {
        this.f17328OooO0Oo = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f17328OooO0Oo;
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }
}
