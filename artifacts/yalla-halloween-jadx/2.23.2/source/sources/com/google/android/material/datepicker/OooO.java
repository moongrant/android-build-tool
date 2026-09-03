package com.google.android.material.datepicker;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ EditText[] f16396OooO00o;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        for (EditText editText : this.f16396OooO00o) {
            if (editText.hasFocus()) {
                return;
            }
        }
        com.google.android.material.internal.oo0o0Oo.OooO0o0(view, true);
    }
}
