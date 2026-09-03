package com.yalla.yalla.ui.dialog;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p519o0o0O0oO.t1;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomGameBoxDialog f27848OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(RoomGameBoxDialog roomGameBoxDialog) {
        super(1);
        this.f27848OooO0Oo = roomGameBoxDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o0OO000.OooO00o("102031");
        RoomGameBoxDialog roomGameBoxDialog = this.f27848OooO0Oo;
        new t1(roomGameBoxDialog.f27921OooO0oO).OooOO0o();
        roomGameBoxDialog.OooO0OO();
        return Unit.INSTANCE;
    }
}
