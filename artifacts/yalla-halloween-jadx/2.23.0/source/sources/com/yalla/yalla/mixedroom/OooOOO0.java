package com.yalla.yalla.mixedroom;

import androidx.lifecycle.Observer;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class OooOOO0 implements Observer {
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Pair<String, String> pair = (Pair) obj;
        int i = MixedRoomActivity.f23425OoooO0O;
        if (pair != null) {
            com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47516OooOO0o.setValue(pair);
        }
    }
}
