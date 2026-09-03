package com.yalla.yalla.ui.dialog;

import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomGameBoxDialog f27857OooO0Oo;

    public OooOOOO(RoomGameBoxDialog roomGameBoxDialog) {
        this.f27857OooO0Oo = roomGameBoxDialog;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        RoomGameBoxDialog.OooOOO0(this.f27857OooO0Oo, true, RoomGameBoxDialog.GameType.GameMora);
    }
}
