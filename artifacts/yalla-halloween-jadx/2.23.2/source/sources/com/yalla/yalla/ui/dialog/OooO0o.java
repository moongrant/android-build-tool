package com.yalla.yalla.ui.dialog;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomGameBoxDialog f27388OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(RoomGameBoxDialog roomGameBoxDialog) {
        super(1);
        this.f27388OooO0Oo = roomGameBoxDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer value;
        Integer num2 = num;
        RoomGameBoxDialog roomGameBoxDialog = this.f27388OooO0Oo;
        if (num2 != null && num2.intValue() == 1 && (value = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24546OooOO0o.getValue()) != null && value.intValue() == 1) {
            roomGameBoxDialog.f27460OooOO0 = true;
        } else {
            roomGameBoxDialog.f27460OooOO0 = false;
            roomGameBoxDialog.f27461OooOO0O = 1;
        }
        roomGameBoxDialog.OooOOO0(true, RoomGameBoxDialog.GameType.GameLuckyNumber);
        return Unit.INSTANCE;
    }
}
