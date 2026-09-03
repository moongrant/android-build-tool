package com.yalla.yalla.mixedroom;

import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f23496OooO0Oo;

    public o0000(MixedRoomActivity mixedRoomActivity) {
        this.f23496OooO0Oo = mixedRoomActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        if (bool.booleanValue()) {
            MixedRoomActivity mixedRoomActivity = this.f23496OooO0Oo;
            if (mixedRoomActivity.f23438OooOoo0 != null) {
                mixedRoomActivity.OooOo();
            }
        }
    }
}
