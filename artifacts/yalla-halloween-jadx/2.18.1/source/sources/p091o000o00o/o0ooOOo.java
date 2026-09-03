package p091o000o00o;

import android.os.CancellationSignal;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f29218Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Job f29219Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(CancellationSignal cancellationSignal, Job job) {
        super(1);
        this.f29218Oooo0o = cancellationSignal;
        this.f29219Oooo0oO = job;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.f29218Oooo0o.cancel();
        Job.DefaultImpls.cancel$default(this.f29219Oooo0oO, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }
}
