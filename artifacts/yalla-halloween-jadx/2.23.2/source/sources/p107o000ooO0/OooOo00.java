package p107o000ooO0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import p101o000oo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements FlowCollector<oo0o0Oo> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<Object> f35811OooO0Oo;

    public OooOo00(OooOOOO<Object> oooOOOO) {
        this.f35811OooO0Oo = oooOOOO;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(oo0o0Oo oo0o0oo, Continuation continuation) {
        this.f35811OooO0Oo.f35807OooO0Oo.setValue(oo0o0oo);
        return Unit.INSTANCE;
    }
}
