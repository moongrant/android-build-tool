package com.yalla.yalla.ui.activity.room;

import android.os.Looper;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0O implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26960OooO0Oo;

    public oo0O(RoomSettingActivity roomSettingActivity) {
        this.f26960OooO0Oo = roomSettingActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        Boolean isOwner = bool;
        Intrinsics.checkNotNullExpressionValue(isOwner, "isOwner");
        if (isOwner.booleanValue()) {
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25021OooOoO.getValue();
            this.f26960OooO0Oo.f26659Oooo000 = false;
        }
    }
}
