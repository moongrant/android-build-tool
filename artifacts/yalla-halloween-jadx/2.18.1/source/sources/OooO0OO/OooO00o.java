package OooO0OO;

import android.widget.TextView;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f91Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f92Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f93Oooo0oo;

    public /* synthetic */ OooO00o(Object obj, Object obj2, int i) {
        this.f91Oooo0o = i;
        this.f92Oooo0oO = obj;
        this.f93Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f91Oooo0o) {
            case 0:
                OooO this$0 = (OooO) this.f92Oooo0oO;
                OooO00o.OooO nativeAppInfo = (OooO00o.OooO) this.f93Oooo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(nativeAppInfo, "$nativeAppInfo");
                this$0.OooO0o(nativeAppInfo);
                break;
            default:
                WalletCoinFragment.m433x906e8907((TextView) this.f92Oooo0oO, (WalletCoinFragment) this.f93Oooo0oo);
                break;
        }
    }
}
