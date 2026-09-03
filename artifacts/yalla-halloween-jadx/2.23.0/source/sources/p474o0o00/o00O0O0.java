package p474o0o00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.account.PhoneBindActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneBindActivity f47267OooO0Oo;

    public o00O0O0(PhoneBindActivity phoneBindActivity) {
        this.f47267OooO0Oo = phoneBindActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f47267OooO0Oo.finish();
    }
}
