package p089o000o000;

import androidx.paging.LoadType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class o000Oo0<T> implements FlowCollector {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O000<Object, Object> f28892Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ LoadType f28893Oooo0oO;

    public o000Oo0(o000O000<Object, Object> o000o001, LoadType loadType) {
        this.f28892Oooo0o = o000o001;
        this.f28893Oooo0oO = loadType;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        Object objOooO0O0 = o000O000.OooO0O0(this.f28892Oooo0o, this.f28893Oooo0oO, (o00oO0o) obj, continuation);
        return objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0O0 : Unit.INSTANCE;
    }
}
