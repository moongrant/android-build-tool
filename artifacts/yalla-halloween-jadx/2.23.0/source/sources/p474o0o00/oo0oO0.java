package p474o0o00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oO0 implements Observer<ApiResult<AccountBindInfo>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UntieAccountBindActivity f47357OooO0Oo;

    public oo0oO0(UntieAccountBindActivity untieAccountBindActivity) {
        this.f47357OooO0Oo = untieAccountBindActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(ApiResult<AccountBindInfo> apiResult) {
        ApiResult<AccountBindInfo> apiResult2 = apiResult;
        UntieAccountBindActivity untieAccountBindActivity = this.f47357OooO0Oo;
        untieAccountBindActivity.OooOo0();
        if (apiResult2.isSuccess()) {
            if (apiResult2.getData() != null) {
                untieAccountBindActivity.f25344OooOo0 = apiResult2.getData();
            }
        }
    }
}
