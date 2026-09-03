package com.yalla.yalla.ui.activity.room;

import android.text.TextUtils;
import android.view.View;
import java.util.LinkedHashMap;
import p579o0oOoo.oO000Oo0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0O extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RoomReNameActivity f26870OooO0oO;

    public o00O0O0O(RoomReNameActivity roomReNameActivity) {
        this.f26870OooO0oO = roomReNameActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(View view) {
        RoomReNameActivity roomReNameActivity = this.f26870OooO0oO;
        String strTrim = roomReNameActivity.f26635OooOOo.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        p377o0OOoOo.o000O00O o000o00o2 = p377o0OOoOo.o000O0O0.f44226OooO00o;
        String barid = roomReNameActivity.f26636OooOOo0.getBarid();
        o00O0OO0 o00o0oo1 = new o00O0OO0(roomReNameActivity, strTrim);
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("barid", barid);
        linkedHashMapOooO00o.put("barname", oO000Oo0.OooO0O0(strTrim));
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0OO(p377o0OOoOo.o0000O.f44100OooOoo, p377o0OOoOo.o0000O.f44116OoooO0, linkedHashMapOooO00o, o00o0oo1);
    }
}
