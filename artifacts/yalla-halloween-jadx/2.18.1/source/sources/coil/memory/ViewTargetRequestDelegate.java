package coil.memory;

import androidx.lifecycle.LifecycleObserver;
import coil.request.OooO00o;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import o00O0O0O.oo000o;
import o00O0OO.OooO0O0;
import oOO00O.OooOO0;
import org.jetbrains.annotations.NotNull;
import p119o00O0Oo0.o00O0O;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/ViewTargetRequestDelegate;", "Lcoil/memory/RequestDelegate;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
public final class ViewTargetRequestDelegate extends RequestDelegate {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final Job f9871Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final OooOO0 f9872Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final OooO00o f9873Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final oo000o f9874Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTargetRequestDelegate(@NotNull OooOO0 imageLoader, @NotNull OooO00o request, @NotNull oo000o targetDelegate, @NotNull Job job) {
        super(null);
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(targetDelegate, "targetDelegate");
        Intrinsics.checkNotNullParameter(job, "job");
        this.f9872Oooo0o = imageLoader;
        this.f9873Oooo0oO = request;
        this.f9874Oooo0oo = targetDelegate;
        this.f9871Oooo = job;
    }

    @Override // coil.memory.RequestDelegate
    public final void OooO0O0() {
        Job.DefaultImpls.cancel$default(this.f9871Oooo, (CancellationException) null, 1, (Object) null);
        this.f9874Oooo0oo.OooO00o();
        o00O0O.OooO0o0(this.f9874Oooo0oo);
        OooO00o oooO00o = this.f9873Oooo0oO;
        OooO0O0 oooO0O0 = oooO00o.f9878OooO0OO;
        if (oooO0O0 instanceof LifecycleObserver) {
            oooO00o.f9888OooOOO0.removeObserver((LifecycleObserver) oooO0O0);
        }
        this.f9873Oooo0oO.f9888OooOOO0.removeObserver(this);
    }
}
