package com.yalla.yalla.ui.dialog;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;
import p579o0oOoOOo.x;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomGameBoxDialog f23742Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(RoomGameBoxDialog roomGameBoxDialog) {
        super(1);
        this.f23742Oooo0o = roomGameBoxDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o0O00000.OooO0OO("InRoom_game_luckynumber_setting");
        OooOo.OooO0O0("102031");
        RoomGameBoxDialog roomGameBoxDialog = this.f23742Oooo0o;
        new x(roomGameBoxDialog.f23746OooO0oO).OooOOO0();
        roomGameBoxDialog.OooO0Oo();
        return Unit.INSTANCE;
    }
}
