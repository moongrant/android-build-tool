package com.yalla.yalla.ui.adapter;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatAdapter f27027OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(PrivateChatAdapter privateChatAdapter) {
        super(1);
        this.f27027OooO0Oo = privateChatAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        p429o0OoOO.o00Ooo.OooO00o(this.f27027OooO0Oo.f26969OooOOo0);
        return Unit.INSTANCE;
    }
}
