package com.yalla.yalla.ui.activity.room;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0ooO implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f26918OooO0Oo;

    public o0O0ooO(MusicActivity musicActivity) {
        this.f26918OooO0Oo = musicActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String string = charSequence.toString();
        int i4 = MusicActivity.f26579OooOoO0;
        this.f26918OooO0Oo.OooOo0(string);
    }
}
