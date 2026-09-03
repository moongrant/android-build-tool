package p564o0oOo0O;

import com.yalla.yalla.ui.view.moment.SendMomentLocationPowerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00o0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SendMomentLocationPowerView f56365OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00o0(SendMomentLocationPowerView sendMomentLocationPowerView) {
        super(1);
        this.f56365OooO0Oo = sendMomentLocationPowerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.f56365OooO0Oo.getLocation();
        }
        return Unit.INSTANCE;
    }
}
