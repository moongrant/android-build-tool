package com.yalla.yalla.ui.dialog;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomGameBoxDialog f27384OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(RoomGameBoxDialog roomGameBoxDialog) {
        super(1);
        this.f27384OooO0Oo = roomGameBoxDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        Integer value = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24546OooOO0o.getValue();
        if (value != null && value.intValue() == 2) {
            Intrinsics.checkNotNull(bool2);
            boolean zBooleanValue = bool2.booleanValue();
            RoomGameBoxDialog roomGameBoxDialog = this.f27384OooO0Oo;
            roomGameBoxDialog.f27464OooOOO0 = zBooleanValue;
            roomGameBoxDialog.OooOOO0(true, RoomGameBoxDialog.GameType.GameLuckyNumber);
        }
        return Unit.INSTANCE;
    }
}
