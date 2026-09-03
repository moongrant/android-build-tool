package com.yalla.yalla.module.account.ui.screen;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.model.DeleteAccountReasonChooseModel;
import com.yalla.yalla.ui.vm.account.DeleteAccountReasonChooseVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p063o0000oO.o00Ooo;
import p526o0o0OOO0.oo0oOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountReasonChooseModel f23631OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountReasonChooseVM f23632OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(DeleteAccountReasonChooseModel deleteAccountReasonChooseModel, DeleteAccountReasonChooseVM deleteAccountReasonChooseVM) {
        super(0);
        this.f23631OooO0Oo = deleteAccountReasonChooseModel;
        this.f23632OooO0o0 = deleteAccountReasonChooseVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0oOO0.OooO0o0(DeleteAccountReasonSecondChooseScreen.INSTANCE, o00Ooo.OooO0O0(TuplesKt.to(DeviceRequestsHelper.DEVICE_INFO_MODEL, this.f23631OooO0Oo), TuplesKt.to(LinkedAccountsScreen.ACCOUNT_INFO_PARAM, this.f23632OooO0o0.getAccountInfo())), false, null, 12);
        return Unit.INSTANCE;
    }
}
