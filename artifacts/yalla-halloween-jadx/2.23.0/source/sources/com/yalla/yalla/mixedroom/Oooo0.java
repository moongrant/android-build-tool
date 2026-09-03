package com.yalla.yalla.mixedroom;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Oooo0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = MixedRoomActivity.f23425OoooO0O;
        LiveEventBus.get("QUERY_USER_IN_ROOM_INFORMATION").post(((ChatModel) obj).getNewFrom());
        return null;
    }
}
