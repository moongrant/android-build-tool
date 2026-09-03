package p474o0o00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.account.PasswordActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f47259OooO0Oo;

    public o00O00(PasswordActivity passwordActivity) {
        this.f47259OooO0Oo = passwordActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f47259OooO0Oo.finish();
    }
}
