package p100o000oOoO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O000O f29514Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<Unit> f29515Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0O000(o0O000O o0o000o, CancellableContinuation<? super Unit> cancellableContinuation) {
        super(1);
        this.f29514Oooo0o = o0o000o;
        this.f29515Oooo0oO = cancellableContinuation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Unit unit;
        o0O000O o0o000o = this.f29514Oooo0o;
        Object obj = o0o000o.f29522OooO00o;
        CancellableContinuation<Unit> cancellableContinuation = this.f29515Oooo0oO;
        synchronized (obj) {
            o0o000o.f29523OooO0O0.remove(cancellableContinuation);
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
