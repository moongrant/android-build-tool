package o000O0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import o000O00O.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements FlowCollector<OooOo> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<Object> f34332OooO0Oo;

    public OooO0OO(OooO0O0<Object> oooO0O0) {
        this.f34332OooO0Oo = oooO0O0;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(OooOo oooOo, Continuation continuation) {
        this.f34332OooO0Oo.f34331OooO0Oo.setValue(oooOo);
        return Unit.INSTANCE;
    }
}
