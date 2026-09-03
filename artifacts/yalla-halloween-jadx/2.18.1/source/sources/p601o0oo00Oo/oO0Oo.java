package p601o0oo00Oo;

import com.yalla.yalla.ui.view.SendMomentLocationPowerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0Oo extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SendMomentLocationPowerView f48255Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo(SendMomentLocationPowerView sendMomentLocationPowerView) {
        super(1);
        this.f48255Oooo0o = sendMomentLocationPowerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.f48255Oooo0o.getLocation();
        }
        return Unit.INSTANCE;
    }
}
