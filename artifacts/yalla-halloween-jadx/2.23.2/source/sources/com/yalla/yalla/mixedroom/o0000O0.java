package com.yalla.yalla.mixedroom;

import android.os.Looper;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.chat.ChatModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ChatModel f23045OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f23046OooO0o0;

    public o0000O0(MixedRoomActivity mixedRoomActivity, ChatModel chatModel) {
        this.f23046OooO0o0 = mixedRoomActivity;
        this.f23045OooO0Oo = chatModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ArrayList<ChatModel> arrayList = MixedRoomDataSource.OooO0o0().f22996OooOO0O;
        ChatModel chatModel = this.f23045OooO0Oo;
        arrayList.remove(chatModel);
        MixedRoomActivity mixedRoomActivity = this.f23046OooO0o0;
        mixedRoomActivity.f22968OooOoo.f50854OooO0o0.remove(chatModel);
        mixedRoomActivity.f22968OooOoo.notifyDataSetChanged();
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Removed_successfully);
        if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
            return null;
        }
        com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
            return null;
        }
        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
        return null;
    }
}
