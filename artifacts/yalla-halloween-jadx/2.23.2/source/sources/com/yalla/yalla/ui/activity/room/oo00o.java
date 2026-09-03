package com.yalla.yalla.ui.activity.room;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00o implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f26491OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomReNameActivity f26492OooO0o0;

    public oo00o(RoomReNameActivity roomReNameActivity) {
        this.f26492OooO0o0 = roomReNameActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f26491OooO0Oo = charSequence.toString() + "";
        RoomReNameActivity roomReNameActivity = this.f26492OooO0o0;
        roomReNameActivity.f26183OooOOoo.setText((24 - this.f26491OooO0Oo.length()) + "");
        if (charSequence.toString().trim().isEmpty()) {
            roomReNameActivity.f26185OooOo00.setVisibility(8);
            roomReNameActivity.f26184OooOo0.setVisibility(8);
        } else {
            roomReNameActivity.f26185OooOo00.setVisibility(0);
            roomReNameActivity.f26184OooOo0.setVisibility(0);
        }
    }
}
