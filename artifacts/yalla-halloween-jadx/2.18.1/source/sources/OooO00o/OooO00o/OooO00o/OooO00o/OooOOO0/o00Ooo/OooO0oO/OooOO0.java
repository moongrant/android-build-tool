package OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o00Ooo.OooO0oO;

import com.yallatech.support.platform.base.bean.Action;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO f34Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Action f35Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooO oooO, Action action) {
        super(0);
        this.f34Oooo0o = oooO;
        this.f35Oooo0oO = action;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f34Oooo0o.OooO0OO(this.f35Oooo0oO.getCompletion().getFunctionID(), null);
        return Unit.INSTANCE;
    }
}
