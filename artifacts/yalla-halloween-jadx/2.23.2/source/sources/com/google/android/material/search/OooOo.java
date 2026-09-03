package com.google.android.material.search;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SearchView f17030OooO0Oo;

    public OooOo(SearchView searchView) {
        this.f17030OooO0Oo = searchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f17030OooO0Oo.f17062OooOOO.setVisibility(charSequence.length() > 0 ? 0 : 8);
    }
}
