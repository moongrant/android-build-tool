package com.yalla.yalla.module.account.ui.screen;

import com.yalla.yalla.model.AccountBindInfo;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p063o0000oO.o00Ooo;
import p526o0o0OOO0.oo0oOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AccountBindInfo f23629OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(AccountBindInfo accountBindInfo) {
        super(1);
        this.f23629OooO0Oo = accountBindInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        oo0oOO0.OooO0o0(DeleteAccountReasonFirstChooseScreen.INSTANCE, o00Ooo.OooO0O0(TuplesKt.to(LinkedAccountsScreen.ACCOUNT_INFO_PARAM, this.f23629OooO0Oo)), false, null, 12);
        return Unit.INSTANCE;
    }
}
