package p491o0o00O0o;

import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AccountProtectionActivity f48938OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(AccountProtectionActivity accountProtectionActivity) {
        super(1);
        this.f48938OooO0Oo = accountProtectionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        int i = AccountProtectionActivity.f24684OooOo0O;
        AccountProtectionActivity accountProtectionActivity = this.f48938OooO0Oo;
        Switch r1 = accountProtectionActivity.OooOo().f44219OooO0OO;
        Intrinsics.checkNotNull(bool2);
        r1.setChecked(bool2.booleanValue());
        if (bool2.booleanValue()) {
            accountProtectionActivity.OooOoO0();
        } else {
            TextView tvTrustedDevice = accountProtectionActivity.OooOo().f44220OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(tvTrustedDevice, "tvTrustedDevice");
            o000O.OooO0OO(tvTrustedDevice);
            RecyclerView rvTrustedDevice = accountProtectionActivity.OooOo().f44218OooO0O0;
            Intrinsics.checkNotNullExpressionValue(rvTrustedDevice, "rvTrustedDevice");
            o000O.OooO0OO(rvTrustedDevice);
        }
        return Unit.INSTANCE;
    }
}
