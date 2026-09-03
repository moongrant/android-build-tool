package com.yalla.yalla.module.account.ui.screen;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.model.DeleteAccountReasonChooseModel;
import com.yalla.yalla.ui.vm.account.DeleteAccountReasonChooseVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p063o0000oO.o000oOoO;
import p532o0o0OOo0.o00O00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountReasonChooseModel f23171OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountReasonChooseVM f23172OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(DeleteAccountReasonChooseModel deleteAccountReasonChooseModel, DeleteAccountReasonChooseVM deleteAccountReasonChooseVM) {
        super(0);
        this.f23171OooO0Oo = deleteAccountReasonChooseModel;
        this.f23172OooO0o0 = deleteAccountReasonChooseVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O00.OooO0o0(DeleteAccountReasonSecondChooseScreen.INSTANCE, o000oOoO.OooO0O0(TuplesKt.to(DeviceRequestsHelper.DEVICE_INFO_MODEL, this.f23171OooO0Oo), TuplesKt.to(LinkedAccountsScreen.ACCOUNT_INFO_PARAM, this.f23172OooO0o0.getAccountInfo())), false, null, 12);
        return Unit.INSTANCE;
    }
}
