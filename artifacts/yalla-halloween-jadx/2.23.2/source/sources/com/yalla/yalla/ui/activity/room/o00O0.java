package com.yalla.yalla.ui.activity.room;

import android.text.TextUtils;
import android.view.View;
import java.util.LinkedHashMap;
import p473o0OoooOo.o0OOOO0o;
import p590o0oOooo0.oOO0OOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RoomReNameActivity f26403OooO0oO;

    public o00O0(RoomReNameActivity roomReNameActivity) {
        this.f26403OooO0oO = roomReNameActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(View view) {
        RoomReNameActivity roomReNameActivity = this.f26403OooO0oO;
        String strTrim = roomReNameActivity.f26181OooOOo.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        p384o0OOoo0O.o00oO0o o00oo0o2 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
        String barid = roomReNameActivity.f26182OooOOo0.getBarid();
        o00O0O00 o00o0o01 = new o00O0O00(roomReNameActivity, strTrim);
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("barid", barid);
        linkedHashMapOooO00o.put("barname", oOO0OOO.OooO0O0(strTrim));
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0OO(p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43375OoooO0, linkedHashMapOooO00o, o00o0o01);
    }
}
