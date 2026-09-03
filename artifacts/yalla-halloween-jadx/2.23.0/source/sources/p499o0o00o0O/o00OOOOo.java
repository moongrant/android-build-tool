package p499o0o00o0O;

import android.widget.TextView;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOOo extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WalletActivity f49409OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOOo(WalletActivity walletActivity) {
        super(1);
        this.f49409OooO0Oo = walletActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long jLongValue = l.longValue();
        WalletActivity walletActivity = this.f49409OooO0Oo;
        if (walletActivity.f27060OooOo0o == 0.0d) {
            TextView textView = walletActivity.OooOo().f58686OooO0oO;
            StringBuilder sb = new StringBuilder();
            sb.append(jLongValue);
            textView.setText(OooOOOO.OooO0Oo(sb.toString()));
        }
        return Unit.INSTANCE;
    }
}
