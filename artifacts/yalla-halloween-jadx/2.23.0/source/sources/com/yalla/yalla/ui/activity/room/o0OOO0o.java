package com.yalla.yalla.ui.activity.room;

import androidx.lifecycle.Observer;
import com.yalla.netimage.NetImageView;
import kotlin.jvm.internal.Intrinsics;
import p519o0o0O0oO.O0000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o implements Observer<p136o00OOOo0.OooO0OO> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ O0000000 f26936OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CreateRoomActivity f26937OooO0o0;

    public o0OOO0o(O0000000 o0000000, CreateRoomActivity createRoomActivity) {
        this.f26936OooO0Oo = o0000000;
        this.f26937OooO0o0 = createRoomActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(p136o00OOOo0.OooO0OO oooO0OO) {
        String strOooO00o;
        p136o00OOOo0.OooO0OO oooO0OO2 = oooO0OO;
        this.f26936OooO0Oo.OooO00o();
        if (oooO0OO2 == null || (strOooO00o = oooO0OO2.OooO00o()) == null) {
            return;
        }
        CreateRoomActivity createRoomActivity = this.f26937OooO0o0;
        createRoomActivity.f26513OooOoOO = strOooO00o;
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(createRoomActivity);
        int iOooO00o = com.code.android.util.o0000O0.OooO00o(110);
        oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(iOooO00o, iOooO00o, strOooO00o);
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0o0(com.code.android.util.o0000O0.OooO00o(6));
        NetImageView netImageView = createRoomActivity.f26504OooOOo0;
        if (netImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nivRoomHeader");
            netImageView = null;
        }
        oooO00o.OooO0Oo(netImageView);
    }
}
