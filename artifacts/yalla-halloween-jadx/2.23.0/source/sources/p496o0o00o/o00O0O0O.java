package p496o0o00o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.user.PremiumActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0O implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f49022OooO0Oo;

    public o00O0O0O(PremiumActivity premiumActivity) {
        this.f49022OooO0Oo = premiumActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        PremiumActivity.OooOoo(this.f49022OooO0Oo, false);
    }
}
