package p474o0o00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO0 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AccountProtectionActivity f47217OooO0Oo;

    public OooOOO0(AccountProtectionActivity accountProtectionActivity) {
        this.f47217OooO0Oo = accountProtectionActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = AccountProtectionActivity.f25146OooOo0O;
        AccountProtectionActivity accountProtectionActivity = this.f47217OooO0Oo;
        accountProtectionActivity.OooOoO().syncAccountProtection();
        AccountProtectionActivity.OooOo(accountProtectionActivity);
    }
}
