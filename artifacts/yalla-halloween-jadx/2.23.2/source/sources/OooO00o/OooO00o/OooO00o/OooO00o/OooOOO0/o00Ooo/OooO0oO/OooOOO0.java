package OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o00Ooo.OooO0oO;

import com.yallatech.support.platform.base.bean.Action;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO f62OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Action f63OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(OooO oooO, Action action) {
        super(0);
        this.f62OooO0Oo = oooO;
        this.f63OooO0o0 = action;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f62OooO0Oo.OooO0OO(null, this.f63OooO0o0.getCompletion().getFunctionID());
        return Unit.INSTANCE;
    }
}
