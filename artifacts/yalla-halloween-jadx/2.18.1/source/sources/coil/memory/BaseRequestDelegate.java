package coil.memory;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/BaseRequestDelegate;", "Lcoil/memory/RequestDelegate;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
public final class BaseRequestDelegate extends RequestDelegate {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Lifecycle f9864Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Job f9865Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRequestDelegate(@NotNull Lifecycle lifecycle, @NotNull Job job) {
        super(null);
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(job, "job");
        this.f9864Oooo0o = lifecycle;
        this.f9865Oooo0oO = job;
    }

    @Override // coil.memory.RequestDelegate
    public final void OooO00o() {
        this.f9864Oooo0o.removeObserver(this);
    }

    @Override // coil.memory.RequestDelegate
    public final void OooO0O0() {
        Job.DefaultImpls.cancel$default(this.f9865Oooo0oO, (CancellationException) null, 1, (Object) null);
    }
}
