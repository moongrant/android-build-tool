package p474o0o00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f47280OooO0Oo;

    public o00OOO0(PhoneNumberActivity phoneNumberActivity) {
        this.f47280OooO0Oo = phoneNumberActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f47280OooO0Oo.finish();
    }
}
