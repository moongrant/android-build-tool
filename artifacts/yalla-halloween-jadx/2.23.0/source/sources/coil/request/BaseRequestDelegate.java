package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/BaseRequestDelegate;", "Lcoil/request/RequestDelegate;", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class BaseRequestDelegate extends RequestDelegate {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lifecycle f8546OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Job f8547OooO0o0;

    public BaseRequestDelegate(@NotNull Lifecycle lifecycle, @NotNull Job job) {
        super(0);
        this.f8546OooO0Oo = lifecycle;
        this.f8547OooO0o0 = job;
    }

    @Override // coil.request.RequestDelegate
    public final void OooO0O0() {
        this.f8546OooO0Oo.removeObserver(this);
    }

    @Override // coil.request.RequestDelegate
    public final void OooO0OO() {
        this.f8546OooO0Oo.addObserver(this);
    }

    @Override // coil.request.RequestDelegate, androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        Job.DefaultImpls.cancel$default(this.f8547OooO0o0, (CancellationException) null, 1, (Object) null);
    }
}
