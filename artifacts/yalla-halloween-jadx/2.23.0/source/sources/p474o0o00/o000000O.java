package p474o0o00;

import com.yalla.yalla.model.DeleteAccountParamsModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import com.yalla.yalla.ui.vm.account.AccountVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountSubmitActivity f47230OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(DeleteAccountSubmitActivity deleteAccountSubmitActivity) {
        super(0);
        this.f47230OooO0Oo = deleteAccountSubmitActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = DeleteAccountSubmitActivity.f25179OooOo0;
        DeleteAccountSubmitActivity deleteAccountSubmitActivity = this.f47230OooO0Oo;
        deleteAccountSubmitActivity.getClass();
        o0OO000.OooO00o("105002");
        DeleteAccountParamsModel deleteAccountParamsModel = (DeleteAccountParamsModel) deleteAccountSubmitActivity.getIntent().getParcelableExtra("DELETE_REASON_TYPE");
        BaseActivityK.OooOo0o(deleteAccountSubmitActivity, null, 0L, 3);
        ((AccountVM) deleteAccountSubmitActivity.f25181OooOo00.getValue()).deleteAccount(deleteAccountParamsModel).observe(deleteAccountSubmitActivity, new o0OO00O(deleteAccountSubmitActivity));
        return Unit.INSTANCE;
    }
}
