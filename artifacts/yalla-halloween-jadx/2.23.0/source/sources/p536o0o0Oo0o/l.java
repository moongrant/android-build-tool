package p536o0o0Oo0o;

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
public final class l extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f54955OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ State<Pair<Boolean, Integer>> f54956OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(State state, FragmentActivity fragmentActivity) {
        super(0);
        this.f54955OooO0Oo = fragmentActivity;
        this.f54956OooO0o0 = state;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z;
        Pair<Boolean, Integer> value = this.f54956OooO0o0.getValue();
        if (value != null) {
            z = value.getFirst().booleanValue();
        }
        FragmentActivity fragmentActivity = this.f54955OooO0Oo;
        if (z) {
            int i = VehicleStoreActivity.f27043OooOo;
            VehicleStoreActivity.OooO00o.OooO00o(fragmentActivity, false);
        } else {
            int i2 = PremiumActivity.f27140Oooo0oO;
            PremiumActivity.OooO00o.OooO00o(fragmentActivity, PremiumLevel.Premium3);
        }
        return Unit.INSTANCE;
    }
}
