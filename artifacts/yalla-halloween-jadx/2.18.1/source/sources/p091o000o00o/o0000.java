package p091o000o00o;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final class o0000 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Job f29117Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(Job job) {
        super(1);
        this.f29117Oooo0o = job;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Job.DefaultImpls.cancel$default(this.f29117Oooo0o, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }
}
