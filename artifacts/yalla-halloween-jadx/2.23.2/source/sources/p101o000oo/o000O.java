package p101o000oo;

import androidx.paging.LoadType;
import androidx.paging.o000oOoO;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O<T> implements FlowCollector {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000oOoO<Object, Object> f35435OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LoadType f35436OooO0o0;

    public o000O(o000oOoO<Object, Object> o000oooo2, LoadType loadType) {
        this.f35435OooO0Oo = o000oooo2;
        this.f35436OooO0o0 = loadType;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        Object objOooO0O0 = o000oOoO.OooO0O0(this.f35435OooO0Oo, this.f35436OooO0o0, (o00000OO) obj, continuation);
        return objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0O0 : Unit.INSTANCE;
    }
}
