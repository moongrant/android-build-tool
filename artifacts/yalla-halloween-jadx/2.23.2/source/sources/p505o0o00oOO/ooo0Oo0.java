package p505o0o00oOO;

import android.widget.TextView;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class ooo0Oo0 extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WalletActivity f50383OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0Oo0(WalletActivity walletActivity) {
        super(1);
        this.f50383OooO0Oo = walletActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long jLongValue = l.longValue();
        WalletActivity walletActivity = this.f50383OooO0Oo;
        if (walletActivity.f26594OooOo0o == 0.0d) {
            TextView textView = walletActivity.OooOo().f43852OooO0oO;
            StringBuilder sb = new StringBuilder();
            sb.append(jLongValue);
            textView.setText(o0O0O0Oo.OooO0Oo(sb.toString()));
        }
        return Unit.INSTANCE;
    }
}
