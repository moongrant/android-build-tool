package com.yalla.yalla.module.account.ui.screen;

import com.yalla.yalla.model.AccountBindInfo;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p063o0000oO.o000oOoO;
import p532o0o0OOo0.o00O00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AccountBindInfo f23169OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(AccountBindInfo accountBindInfo) {
        super(1);
        this.f23169OooO0Oo = accountBindInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        o00O00.OooO0o0(DeleteAccountReasonFirstChooseScreen.INSTANCE, o000oOoO.OooO0O0(TuplesKt.to(LinkedAccountsScreen.ACCOUNT_INFO_PARAM, this.f23169OooO0Oo)), false, null, 12);
        return Unit.INSTANCE;
    }
}
