package p102o000oo;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p236o00oOoo.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000oOoO<Object> f29808Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(o000oOoO<Object> o000oooo2) {
        super(1);
        this.f29808Oooo0o = o000oooo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable th2 = th;
        if (th2 == null) {
            if (!this.f29808Oooo0o.f29810Oooo0oO.isDone()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (th2 instanceof CancellationException) {
            this.f29808Oooo0o.f29810Oooo0oO.cancel(true);
        } else {
            o00OOOO0<Object> o00oooo1 = this.f29808Oooo0o.f29810Oooo0oO;
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            }
            o00oooo1.OooOO0O(th2);
        }
        return Unit.INSTANCE;
    }
}
