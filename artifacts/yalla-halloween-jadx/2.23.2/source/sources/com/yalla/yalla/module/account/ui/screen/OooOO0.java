package com.yalla.yalla.module.account.ui.screen;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23174OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f23175OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(MutableState mutableState, int i) {
        super(0);
        this.f23174OooO0Oo = i;
        this.f23175OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        DeleteAccountReasonSecondChooseScreen.MainListChooseBody$lambda$5(this.f23175OooO0o0, this.f23174OooO0Oo);
        return Unit.INSTANCE;
    }
}
