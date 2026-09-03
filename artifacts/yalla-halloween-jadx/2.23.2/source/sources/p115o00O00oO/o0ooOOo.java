package p115o00O00oO;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p117o00O0OOo.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o<Object> f36162OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(o0OOO0o<Object> o0ooo0o2) {
        super(1);
        this.f36162OooO0Oo = o0ooo0o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable th2 = th;
        o0OOO0o<Object> o0ooo0o2 = this.f36162OooO0Oo;
        if (th2 == null) {
            if (!o0ooo0o2.f36156OooO0o0.isDone()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (th2 instanceof CancellationException) {
            o0ooo0o2.f36156OooO0o0.cancel(true);
        } else {
            o00000O<Object> o00000o = o0ooo0o2.f36156OooO0o0;
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            }
            o00000o.OooOO0(th2);
        }
        return Unit.INSTANCE;
    }
}
