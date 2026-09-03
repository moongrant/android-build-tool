package p492o0o00OO0;

import com.yalla.yalla.ui.activity.moment.MomentPowerSelectActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentPowerSelectActivity f49540OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(MomentPowerSelectActivity momentPowerSelectActivity) {
        super(0);
        this.f49540OooO0Oo = momentPowerSelectActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f49540OooO0Oo.onBackPressed();
        return Unit.INSTANCE;
    }
}
