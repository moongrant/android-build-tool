package p534o0o0OOo0;

import androidx.lifecycle.Observer;
import com.code.android.util.ToastUtil;
import com.facebook.login.LoginManager;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.AccountBindActivity;
import com.yalla.yalla.ui.vm.account.AccountVM;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AccountBindActivity f43520Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(AccountBindActivity accountBindActivity) {
        super(3);
        this.f43520Oooo0o = accountBindActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String accessToken = str;
        OpenAuthManager.AuthType type = authType;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        final AccountBindActivity accountBindActivity = this.f43520Oooo0o;
        final int value = type.getValue();
        AccountBindActivity.OooO00o oooO00o = AccountBindActivity.f21702OooooOO;
        Objects.requireNonNull(accountBindActivity);
        BaseActivityK.OooOoo0(accountBindActivity, null, 0L, 3, null);
        ((AccountVM) accountBindActivity.f21706OooooO0.getValue()).thirdAccountBind(accessToken, value, str2).observe(accountBindActivity, new Observer() { // from class: o0o0OOo0.o00O0O0O
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                AccountBindActivity this$0 = accountBindActivity;
                int i = value;
                AccountBindActivity.OooO00o oooO00o2 = AccountBindActivity.f21702OooooOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((Response) obj).getIsSuccess()) {
                    ToastUtil.f12567OooO00o.OooO0O0(this$0.getResources().getString(R.string.Success));
                    this$0.OooOoo();
                } else {
                    this$0.OooOoO();
                    if (i == 4) {
                        LoginManager.INSTANCE.getInstance().logOut();
                    }
                }
            }
        });
        return Unit.INSTANCE;
    }
}
