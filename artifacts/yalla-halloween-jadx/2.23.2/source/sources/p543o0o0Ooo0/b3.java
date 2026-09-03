package p543o0o0Ooo0;

import androidx.compose.runtime.State;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class b3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f55369OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ State<Pair<Boolean, Integer>> f55370OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(State state, FragmentActivity fragmentActivity) {
        super(0);
        this.f55369OooO0Oo = fragmentActivity;
        this.f55370OooO0o0 = state;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z;
        Pair<Boolean, Integer> value = this.f55370OooO0o0.getValue();
        if (value != null) {
            z = value.getFirst().booleanValue();
        }
        FragmentActivity fragmentActivity = this.f55369OooO0Oo;
        if (z) {
            int i = VehicleStoreActivity.f26578OooOo;
            VehicleStoreActivity.OooO00o.OooO00o(fragmentActivity, false);
        } else {
            int i2 = PremiumActivity.f26673Oooo0oO;
            PremiumActivity.OooO00o.OooO00o(fragmentActivity, PremiumLevel.Premium3);
        }
        return Unit.INSTANCE;
    }
}
