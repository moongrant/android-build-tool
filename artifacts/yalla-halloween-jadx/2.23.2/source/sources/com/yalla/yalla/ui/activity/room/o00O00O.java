package com.yalla.yalla.ui.activity.room;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00O implements TextWatcher {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f26406OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomReAnnouncementActivity f26407OooO0o0;

    public o00O00O(RoomReAnnouncementActivity roomReAnnouncementActivity) {
        this.f26407OooO0o0 = roomReAnnouncementActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f26406OooO0Oo = charSequence.toString() + "";
        RoomReAnnouncementActivity roomReAnnouncementActivity = this.f26407OooO0o0;
        roomReAnnouncementActivity.f26175OooOOo.setText((100 - this.f26406OooO0Oo.length()) + "/100");
        if (charSequence.toString().isEmpty()) {
            roomReAnnouncementActivity.f26177OooOOoo.setVisibility(8);
            roomReAnnouncementActivity.f26179OooOo00.setVisibility(8);
        } else {
            roomReAnnouncementActivity.f26177OooOOoo.setVisibility(0);
            roomReAnnouncementActivity.f26179OooOo00.setVisibility(0);
        }
    }
}
