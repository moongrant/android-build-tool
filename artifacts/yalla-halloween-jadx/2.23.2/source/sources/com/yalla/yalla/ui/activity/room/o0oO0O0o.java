package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.os.Looper;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0O0o extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UpgradeRoomActivity f26482OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(UpgradeRoomActivity upgradeRoomActivity, Context context) {
        super(context);
        this.f26482OooO0o0 = upgradeRoomActivity;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        Map map = (Map) oOOO00.OooO00o(str, Map.class);
        if (map != null) {
            String str2 = (String) map.get("data");
            if (!"1000".equals((String) map.get("code")) || str2 == null) {
                return;
            }
            p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
            p475o0Ooooo0.o0O00oO0.OooO0O0().postValue(Long.valueOf(p605o0oo0O0O.o0O0O0Oo.OooOO0o(str2)));
            UpgradeRoomActivity upgradeRoomActivity = this.f26482OooO0o0;
            UpgradeRoomActivity.OooOo0(upgradeRoomActivity, upgradeRoomActivity.f26294OoooOo0);
            int i = upgradeRoomActivity.f26294OoooOo0;
            boolean z = true;
            upgradeRoomActivity.OooOo0o(i != 5 ? i + 1 : 5, true);
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Success);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (!z) {
                com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            p545o0oO0O00.OooOo00.OooO0O0(32, null);
        }
    }
}
