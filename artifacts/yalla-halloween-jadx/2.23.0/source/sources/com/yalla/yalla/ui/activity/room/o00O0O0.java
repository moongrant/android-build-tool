package com.yalla.yalla.ui.activity.room;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0 implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f26867OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomReNameActivity f26868OooO0o0;

    public o00O0O0(RoomReNameActivity roomReNameActivity) {
        this.f26868OooO0o0 = roomReNameActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f26867OooO0Oo = charSequence.toString() + "";
        RoomReNameActivity roomReNameActivity = this.f26868OooO0o0;
        roomReNameActivity.f26637OooOOoo.setText((24 - this.f26867OooO0Oo.length()) + "");
        if (charSequence.toString().trim().isEmpty()) {
            roomReNameActivity.f26639OooOo00.setVisibility(8);
            roomReNameActivity.f26638OooOo0.setVisibility(8);
        } else {
            roomReNameActivity.f26639OooOo00.setVisibility(0);
            roomReNameActivity.f26638OooOo0.setVisibility(0);
        }
    }
}
