package androidx.compose.runtime;

import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Recomposer f5960Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Throwable f5961Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(Recomposer recomposer, Throwable th) {
        super(1);
        this.f5960Oooo0o = recomposer;
        this.f5961Oooo0oO = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Unit unit;
        Throwable th2 = th;
        Recomposer recomposer = this.f5960Oooo0o;
        Object obj = recomposer.f5968OooO0Oo;
        Throwable th3 = this.f5961Oooo0oO;
        synchronized (obj) {
            if (th3 == null) {
                th3 = null;
            } else if (th2 != null) {
                if (!(!(th2 instanceof CancellationException))) {
                    th2 = null;
                }
                if (th2 != null) {
                    ExceptionsKt.addSuppressed(th3, th2);
                }
            }
            recomposer.f5969OooO0o = th3;
            recomposer.f5978OooOOOO.setValue(Recomposer.State.ShutDown);
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
