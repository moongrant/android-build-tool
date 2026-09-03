package p588o0oOooO;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.model.DeleteAccountReasonChooseModel;
import com.yalla.yalla.ui.vm.account.DeleteAccountReasonChooseVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o000O00O.OooO0OO;
import p584o0oOoo.o000O;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountReasonChooseModel f47164Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountReasonChooseVM f47165Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000000(DeleteAccountReasonChooseModel deleteAccountReasonChooseModel, DeleteAccountReasonChooseVM deleteAccountReasonChooseVM) {
        super(0);
        this.f47164Oooo0o = deleteAccountReasonChooseModel;
        this.f47165Oooo0oO = deleteAccountReasonChooseVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000O.OooO00o(Oo0000.f47099OooO00o, OooO0OO.OooO0O0(TuplesKt.to(DeviceRequestsHelper.DEVICE_INFO_MODEL, this.f47164Oooo0o), TuplesKt.to("accountInfo", this.f47165Oooo0oO.getAccountInfo())));
        return Unit.INSTANCE;
    }
}
