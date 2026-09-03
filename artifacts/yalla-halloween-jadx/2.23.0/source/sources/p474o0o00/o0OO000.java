package p474o0o00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.account.TurnOnLoginProtectionActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TurnOnLoginProtectionActivity f47326OooO0Oo;

    public o0OO000(TurnOnLoginProtectionActivity turnOnLoginProtectionActivity) {
        this.f47326OooO0Oo = turnOnLoginProtectionActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f47326OooO0Oo.finish();
    }
}
