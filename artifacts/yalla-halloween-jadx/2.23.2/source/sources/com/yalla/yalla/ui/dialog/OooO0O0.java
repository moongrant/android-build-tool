package com.yalla.yalla.ui.dialog;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p650o0ooo.w1;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomGameBoxDialog f27386OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(RoomGameBoxDialog roomGameBoxDialog) {
        super(1);
        this.f27386OooO0Oo = roomGameBoxDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o0oo0000.OooO00o.OooO0O0("102031");
        RoomGameBoxDialog roomGameBoxDialog = this.f27386OooO0Oo;
        new w1(roomGameBoxDialog.f27458OooO0oO).OooOO0o();
        roomGameBoxDialog.OooO0OO();
        return Unit.INSTANCE;
    }
}
