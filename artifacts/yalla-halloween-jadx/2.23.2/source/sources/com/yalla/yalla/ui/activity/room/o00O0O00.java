package com.yalla.yalla.ui.activity.room;

import android.os.Looper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.mixedroom.model.RoomLoginInformation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O00 extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RoomReNameActivity f26413OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f26414OooO0o0;

    public o00O0O00(RoomReNameActivity roomReNameActivity, String str) {
        this.f26413OooO0o = roomReNameActivity;
        this.f26414OooO0o0 = str;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        RoomReNameActivity roomReNameActivity = this.f26413OooO0o;
        RoomConfiguration roomConfiguration = roomReNameActivity.f26182OooOOo0;
        String str2 = this.f26414OooO0o0;
        roomConfiguration.setBarname(str2);
        LiveEventBus.get("RoomName").post(str2);
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
        RoomLoginInformation value = oooO00o.OooO00o().f24543OooO0oo.getValue();
        if (value != null) {
            value.getRoom().setName(str2);
        }
        oooO00o.OooO00o().f24537OooO0O0.postValue(str2);
        p545o0oO0O00.OooOo00.OooO0O0(33, roomReNameActivity.f26182OooOOo0);
        String string = roomReNameActivity.getResources().getString(p562o0oOo000.o000000.OK);
        if (!(string == null || StringsKt.isBlank(string))) {
            com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(string, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        roomReNameActivity.setResult(-1);
        roomReNameActivity.finish();
    }
}
