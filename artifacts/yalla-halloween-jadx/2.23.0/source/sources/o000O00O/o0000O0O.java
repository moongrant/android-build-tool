package o000O00O;

import androidx.paging.LoadType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O<T> implements FlowCollector {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.o000oOoO<Object, Object> f34508OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LoadType f34509OooO0o0;

    public o0000O0O(androidx.paging.o000oOoO<Object, Object> o000oooo2, LoadType loadType) {
        this.f34508OooO0Oo = o000oooo2;
        this.f34509OooO0o0 = loadType;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        Object objOooO0O0 = androidx.paging.o000oOoO.OooO0O0(this.f34508OooO0Oo, this.f34509OooO0o0, (oo000o) obj, continuation);
        return objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0O0 : Unit.INSTANCE;
    }
}
