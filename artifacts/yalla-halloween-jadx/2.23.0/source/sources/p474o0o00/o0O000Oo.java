package p474o0o00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000Oo implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f47298OooO0Oo;

    public o0O000Oo(SmsCodeActivity smsCodeActivity) {
        this.f47298OooO0Oo = smsCodeActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f47298OooO0Oo.finish();
    }
}
