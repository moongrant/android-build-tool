package OooO0OO;

import android.widget.TextView;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f91Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f92OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f93OoooO00;

    public /* synthetic */ OooO00o(Object obj, Object obj2, int i) {
        this.f91Oooo = i;
        this.f93OoooO00 = obj;
        this.f92OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f91Oooo) {
            case 0:
                OooO this$0 = (OooO) this.f93OoooO00;
                OooO00o.OooO nativeAppInfo = (OooO00o.OooO) this.f92OoooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(nativeAppInfo, "$nativeAppInfo");
                this$0.OooO0o(nativeAppInfo);
                break;
            default:
                WalletCoinFragment.m433x906e8907((TextView) this.f93OoooO00, (WalletCoinFragment) this.f92OoooO0);
                break;
        }
    }
}
