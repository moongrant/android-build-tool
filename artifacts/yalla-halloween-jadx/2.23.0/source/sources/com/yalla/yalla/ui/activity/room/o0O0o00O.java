package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.os.Looper;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o00O extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UpgradeRoomActivity f26915OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o00O(UpgradeRoomActivity upgradeRoomActivity, Context context) {
        super(context);
        this.f26915OooO0o0 = upgradeRoomActivity;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        Map map = (Map) oOo00OO0.OooO00o(str, Map.class);
        if (map != null) {
            String str2 = (String) map.get("data");
            if (!"1000".equals((String) map.get("code")) || str2 == null) {
                return;
            }
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            p464o0Oooo.o000000O.OooO0O0().postValue(Long.valueOf(p590o0oo0.OooOOOO.OooOO0o(str2)));
            UpgradeRoomActivity upgradeRoomActivity = this.f26915OooO0o0;
            UpgradeRoomActivity.OooOo0(upgradeRoomActivity, upgradeRoomActivity.f26748OoooOo0);
            int i = upgradeRoomActivity.f26748OoooOo0;
            boolean z = true;
            upgradeRoomActivity.OooOo0o(i != 5 ? i + 1 : 5, true);
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Success);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (!z) {
                com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            com.squareup.okhttp.OooOo.OooO0OO(32, null);
        }
    }
}
