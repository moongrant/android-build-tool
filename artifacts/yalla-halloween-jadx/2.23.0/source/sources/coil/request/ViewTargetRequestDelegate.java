package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import p097o000o0oO.o000O000;
import p109o000ooo.o000000O;
import p112o000oooo.o00O0;
import p321o0O0ooO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/ViewTargetRequestDelegate;", "Lcoil/request/RequestDelegate;", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class ViewTargetRequestDelegate extends RequestDelegate {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o000O000 f8628OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o00O0<?> f8629OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooO00o f8630OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lifecycle f8631OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Job f8632OooO0oo;

    public ViewTargetRequestDelegate(@NotNull o000O000 o000o001, @NotNull OooO00o oooO00o, @NotNull o00O0<?> o00o1, @NotNull Lifecycle lifecycle, @NotNull Job job) {
        super(0);
        this.f8628OooO0Oo = o000o001;
        this.f8630OooO0o0 = oooO00o;
        this.f8629OooO0o = o00o1;
        this.f8631OooO0oO = lifecycle;
        this.f8632OooO0oo = job;
    }

    @Override // coil.request.RequestDelegate
    public final void OooO00o() {
        o00O0<?> o00o1 = this.f8629OooO0o;
        if (o00o1.getView().isAttachedToWindow()) {
            return;
        }
        o000000O o000000oOooO0OO = o000O0O0.OooO0OO(o00o1.getView());
        ViewTargetRequestDelegate viewTargetRequestDelegate = o000000oOooO0OO.f35826OooO0oO;
        if (viewTargetRequestDelegate != null) {
            Job.DefaultImpls.cancel$default(viewTargetRequestDelegate.f8632OooO0oo, (CancellationException) null, 1, (Object) null);
            o00O0<?> o00o2 = viewTargetRequestDelegate.f8629OooO0o;
            boolean z = o00o2 instanceof LifecycleObserver;
            Lifecycle lifecycle = viewTargetRequestDelegate.f8631OooO0oO;
            if (z) {
                lifecycle.removeObserver((LifecycleObserver) o00o2);
            }
            lifecycle.removeObserver(viewTargetRequestDelegate);
        }
        o000000oOooO0OO.f35826OooO0oO = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // coil.request.RequestDelegate
    public final void OooO0OO() {
        Lifecycle lifecycle = this.f8631OooO0oO;
        lifecycle.addObserver(this);
        o00O0<?> o00o1 = this.f8629OooO0o;
        if (o00o1 instanceof LifecycleObserver) {
            LifecycleObserver lifecycleObserver = (LifecycleObserver) o00o1;
            lifecycle.removeObserver(lifecycleObserver);
            lifecycle.addObserver(lifecycleObserver);
        }
        o000000O o000000oOooO0OO = o000O0O0.OooO0OO(o00o1.getView());
        ViewTargetRequestDelegate viewTargetRequestDelegate = o000000oOooO0OO.f35826OooO0oO;
        if (viewTargetRequestDelegate != null) {
            Job.DefaultImpls.cancel$default(viewTargetRequestDelegate.f8632OooO0oo, (CancellationException) null, 1, (Object) null);
            o00O0<?> o00o2 = viewTargetRequestDelegate.f8629OooO0o;
            boolean z = o00o2 instanceof LifecycleObserver;
            Lifecycle lifecycle2 = viewTargetRequestDelegate.f8631OooO0oO;
            if (z) {
                lifecycle2.removeObserver((LifecycleObserver) o00o2);
            }
            lifecycle2.removeObserver(viewTargetRequestDelegate);
        }
        o000000oOooO0OO.f35826OooO0oO = this;
    }

    @Override // coil.request.RequestDelegate, androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        o000O0O0.OooO0OO(this.f8629OooO0o.getView()).OooO00o();
    }
}
