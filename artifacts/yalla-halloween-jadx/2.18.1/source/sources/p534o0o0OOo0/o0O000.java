package p534o0o0OOo0;

import com.yalla.yalla.model.DeleteAccountParamsModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import com.yalla.yalla.ui.vm.account.AccountVM;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p142o00OOooO.o0O0O00;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountSubmitActivity f43538Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000(DeleteAccountSubmitActivity deleteAccountSubmitActivity) {
        super(0);
        this.f43538Oooo0o = deleteAccountSubmitActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        DeleteAccountSubmitActivity deleteAccountSubmitActivity = this.f43538Oooo0o;
        DeleteAccountSubmitActivity.OooO00o oooO00o = DeleteAccountSubmitActivity.f21745Ooooo0o;
        Objects.requireNonNull(deleteAccountSubmitActivity);
        OooOo.OooO0O0("105002");
        DeleteAccountParamsModel deleteAccountParamsModel = (DeleteAccountParamsModel) deleteAccountSubmitActivity.getIntent().getParcelableExtra("DELETE_REASON_TYPE");
        BaseActivityK.OooOoo0(deleteAccountSubmitActivity, null, 0L, 3, null);
        ((AccountVM) deleteAccountSubmitActivity.f21747Ooooo00.getValue()).deleteAccount(deleteAccountParamsModel).observe(deleteAccountSubmitActivity, new o0O0O00(deleteAccountSubmitActivity, 1));
        return Unit.INSTANCE;
    }
}
