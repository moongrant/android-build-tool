package OooO00o;

import android.os.Bundle;
import android.widget.TextView;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f80Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f81Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f82Oooo0oo;

    public /* synthetic */ OooOOO0(Object obj, Object obj2, int i) {
        this.f80Oooo0o = i;
        this.f81Oooo0oO = obj;
        this.f82Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Pair pair;
        switch (this.f80Oooo0o) {
            case 0:
                OooOOO this$0 = (OooOOO) this.f81Oooo0oO;
                OooOOOO data = (OooOOOO) this.f82Oooo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(data, "$data");
                Function1<? super OooOo, Unit> function1 = this$0.f79OooO0Oo;
                if (function1 != null) {
                    Bundle bundle = data.f85OooO0OO;
                    if (bundle == null) {
                        pair = null;
                    } else {
                        Intrinsics.checkNotNullParameter(bundle, "bundle");
                        String string = bundle.getString("auth_sdk_version");
                        if (string == null) {
                            string = "";
                        }
                        pair = new Pair(string, Integer.valueOf(bundle.getInt("auth_service_version", -1)));
                    }
                    if (pair == null) {
                        pair = new Pair("", -1);
                    }
                    String str = (String) pair.component1();
                    ((Number) pair.component2()).intValue();
                    OooOo oooOo = OooOo.f86OooO0O0;
                    oooOo.OooO00o(str);
                    function1.invoke(oooOo);
                    break;
                }
                break;
            default:
                WalletCoinFragment.m432x7785f978((TextView) this.f81Oooo0oO, (WalletCoinFragment) this.f82Oooo0oo);
                break;
        }
    }
}
