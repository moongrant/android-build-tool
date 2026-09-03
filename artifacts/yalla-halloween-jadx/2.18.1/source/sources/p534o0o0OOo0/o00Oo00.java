package p534o0o0OOo0;

import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import com.yalla.yalla.ui.vm.account.AccountVM;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p142o00OOooO.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo00 extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountCheckActivity f43535Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(DeleteAccountCheckActivity deleteAccountCheckActivity) {
        super(3);
        this.f43535Oooo0o = deleteAccountCheckActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String accessToken = str;
        OpenAuthManager.AuthType type = authType;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        DeleteAccountCheckActivity deleteAccountCheckActivity = this.f43535Oooo0o;
        int value = type.getValue();
        DeleteAccountCheckActivity.OooO00o oooO00o = DeleteAccountCheckActivity.f21734Oooooo0;
        Objects.requireNonNull(deleteAccountCheckActivity);
        BaseActivityK.OooOoo0(deleteAccountCheckActivity, null, 0L, 3, null);
        ((AccountVM) deleteAccountCheckActivity.f21736Ooooo00.getValue()).verifyThirdAccount(value, accessToken, str2).observe(deleteAccountCheckActivity, new o0OOO0o(deleteAccountCheckActivity, 2));
        return Unit.INSTANCE;
    }
}
