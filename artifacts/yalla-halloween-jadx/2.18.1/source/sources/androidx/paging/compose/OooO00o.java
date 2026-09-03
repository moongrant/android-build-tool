package androidx.paging.compose;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import p089o000o000.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements FlowCollector<OooOo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<Object> f8791Oooo0o;

    public OooO00o(OooO0OO<Object> oooO0OO) {
        this.f8791Oooo0o = oooO0OO;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(OooOo oooOo, Continuation continuation) {
        this.f8791Oooo0o.f8799OooO0o0.setValue(oooOo);
        return Unit.INSTANCE;
    }
}
