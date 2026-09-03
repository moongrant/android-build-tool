package com.yalla.yalla.ui.activity.room;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes4.dex */
public final class o00 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f26368OooO0Oo;

    public o00(MusicActivity musicActivity) {
        this.f26368OooO0Oo = musicActivity;
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
        int i4 = MusicActivity.f26127OooOoO0;
        this.f26368OooO0Oo.OooOo0(string);
    }
}
