package com.yalla.yalla.ui.dialog;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomGameBoxDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGameBoxDialog.kt\ncom/yalla/yalla/ui/dialog/RoomGameBoxDialog$initObserver$7\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n1#2:361\n*E\n"})
public final class OooOOO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomGameBoxDialog f27853OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(RoomGameBoxDialog roomGameBoxDialog) {
        super(1);
        this.f27853OooO0Oo = roomGameBoxDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 != null) {
            RoomGameBoxDialog.OooOOO0(this.f27853OooO0Oo, bool2.booleanValue(), RoomGameBoxDialog.GameType.GameCamel);
        }
        return Unit.INSTANCE;
    }
}
