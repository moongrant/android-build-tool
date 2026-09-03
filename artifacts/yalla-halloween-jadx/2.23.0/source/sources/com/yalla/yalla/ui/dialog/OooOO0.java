package com.yalla.yalla.ui.dialog;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomGameBoxDialog f27851OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(RoomGameBoxDialog roomGameBoxDialog) {
        super(1);
        this.f27851OooO0Oo = roomGameBoxDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Integer it = num;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        int iIntValue = it.intValue();
        RoomGameBoxDialog roomGameBoxDialog = this.f27851OooO0Oo;
        roomGameBoxDialog.f27925OooOO0o = iIntValue;
        RoomGameBoxDialog.OooOOO0(roomGameBoxDialog, true, RoomGameBoxDialog.GameType.GameLuckyNumber);
        return Unit.INSTANCE;
    }
}
