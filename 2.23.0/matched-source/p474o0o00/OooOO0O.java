package p474o0o00;

import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AccountProtectionActivity f47215OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(AccountProtectionActivity accountProtectionActivity) {
        super(1);
        this.f47215OooO0Oo = accountProtectionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean it = bool;
        int i = AccountProtectionActivity.f25146OooOo0O;
        AccountProtectionActivity accountProtectionActivity = this.f47215OooO0Oo;
        Switch r1 = accountProtectionActivity.OooOoO0().f58770OooO0OO;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        r1.setChecked(it.booleanValue());
        if (it.booleanValue()) {
            AccountProtectionActivity.OooOo(accountProtectionActivity);
        } else {
            TextView textView = accountProtectionActivity.OooOoO0().f58771OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTrustedDevice");
            o000OO00.OooO0OO(textView);
            RecyclerView recyclerView = accountProtectionActivity.OooOoO0().f58769OooO0O0;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvTrustedDevice");
            o000OO00.OooO0OO(recyclerView);
        }
        return Unit.INSTANCE;
    }
}
