package com.yalla.yalla.ui.activity.message;

import androidx.lifecycle.Observer;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25818OooO0Oo;

    public o000O0o(PrivateChatActivity privateChatActivity) {
        this.f25818OooO0Oo = privateChatActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        if (bool.booleanValue()) {
            p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(this.f25818OooO0Oo);
            o0oo00o2.OooOo00(com.code.android.util.o0000.OooO0OO(oO00OOo0.backpack_frozen));
            o0oo00o2.OooOO0o();
        }
    }
}
