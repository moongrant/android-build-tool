package com.yalla.yalla.ui.dialog;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomGameBoxDialog f27846OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(RoomGameBoxDialog roomGameBoxDialog) {
        super(1);
        this.f27846OooO0Oo = roomGameBoxDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean it = bool;
        Integer value = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25008OooOO0o.getValue();
        if (value != null && value.intValue() == 2) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            boolean zBooleanValue = it.booleanValue();
            RoomGameBoxDialog roomGameBoxDialog = this.f27846OooO0Oo;
            roomGameBoxDialog.f27927OooOOO0 = zBooleanValue;
            RoomGameBoxDialog.OooOOO0(roomGameBoxDialog, true, RoomGameBoxDialog.GameType.GameLuckyNumber);
        }
        return Unit.INSTANCE;
    }
}
