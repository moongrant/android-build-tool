package com.yalla.yalla.mixedroom;

import android.os.Looper;
import com.code.android.util.o000O0;
import com.yalla.yalla.model.chat.ChatModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ChatModel f23503OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f23504OooO0o0;

    public o0000O0(MixedRoomActivity mixedRoomActivity, ChatModel chatModel) {
        this.f23504OooO0o0 = mixedRoomActivity;
        this.f23503OooO0Oo = chatModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ArrayList<ChatModel> arrayList = MixedRoomDataSource.OooO0o0().f23465OooOO0O;
        ChatModel chatModel = this.f23503OooO0Oo;
        arrayList.remove(chatModel);
        MixedRoomActivity mixedRoomActivity = this.f23504OooO0o0;
        mixedRoomActivity.f23437OooOoo.f49490OooO0o0.remove(chatModel);
        mixedRoomActivity.f23437OooOoo.notifyDataSetChanged();
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.Removed_successfully);
        if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
            return null;
        }
        com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
            return null;
        }
        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
        return null;
    }
}
