package p474o0o00;

import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import com.yalla.yalla.ui.vm.account.AccountVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountCheckActivity f47285OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(DeleteAccountCheckActivity deleteAccountCheckActivity) {
        super(3);
        this.f47285OooO0Oo = deleteAccountCheckActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String accessToken = str;
        OpenAuthManager.AuthType type = authType;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        int value = type.getValue();
        int i = DeleteAccountCheckActivity.f25168OooOoO0;
        DeleteAccountCheckActivity deleteAccountCheckActivity = this.f47285OooO0Oo;
        deleteAccountCheckActivity.getClass();
        BaseActivityK.OooOo0o(deleteAccountCheckActivity, null, 0L, 3);
        ((AccountVM) deleteAccountCheckActivity.f25172OooOo00.getValue()).verifyThirdAccount(value, accessToken, str2).observe(deleteAccountCheckActivity, new o0OOO0o(deleteAccountCheckActivity));
        return Unit.INSTANCE;
    }
}
