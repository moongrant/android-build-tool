package p499o0o00o0O;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOO0 implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WalletActivity f49408OooO0Oo;

    public o00OOOO0(WalletActivity walletActivity) {
        this.f49408OooO0Oo = walletActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        Boolean it = bool;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            this.f49408OooO0Oo.finish();
        }
    }
}
