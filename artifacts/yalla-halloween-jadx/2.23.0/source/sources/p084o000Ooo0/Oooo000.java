package p084o000Ooo0;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p094o000o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Oooo0<Object> f35108OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(Oooo0<Object> oooo0) {
        super(1);
        this.f35108OooO0Oo = oooo0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable th2 = th;
        Oooo0<Object> oooo0 = this.f35108OooO0Oo;
        if (th2 == null) {
            if (!oooo0.f35107OooO0o0.isDone()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (th2 instanceof CancellationException) {
            oooo0.f35107OooO0o0.cancel(true);
        } else {
            o0000O00<Object> o0000o00 = oooo0.f35107OooO0o0;
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            }
            o0000o00.OooOO0(th2);
        }
        return Unit.INSTANCE;
    }
}
