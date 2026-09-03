package p491o0o00O0o;

import com.yalla.yalla.model.DeleteAccountParamsModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import com.yalla.yalla.ui.vm.account.AccountVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountSubmitActivity f48959OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(DeleteAccountSubmitActivity deleteAccountSubmitActivity) {
        super(0);
        this.f48959OooO0Oo = deleteAccountSubmitActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = DeleteAccountSubmitActivity.f24720OooOo0;
        DeleteAccountSubmitActivity deleteAccountSubmitActivity = this.f48959OooO0Oo;
        deleteAccountSubmitActivity.getClass();
        OooO00o.OooO0O0("105002");
        DeleteAccountParamsModel deleteAccountParamsModel = (DeleteAccountParamsModel) deleteAccountSubmitActivity.getIntent().getParcelableExtra("DELETE_REASON_TYPE");
        BaseActivityK.OooOo0o(deleteAccountSubmitActivity, null, 0L, 3);
        ((AccountVM) deleteAccountSubmitActivity.f24722OooOo00.getValue()).deleteAccount(deleteAccountParamsModel).observe(deleteAccountSubmitActivity, new o000Oo0(deleteAccountSubmitActivity, 0));
        return Unit.INSTANCE;
    }
}
