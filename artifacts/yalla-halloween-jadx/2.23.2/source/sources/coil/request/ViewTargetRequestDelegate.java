package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.Job;
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import p118o00O0Oo.o00000O;
import p132o00O0ooo.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/ViewTargetRequestDelegate;", "Lcoil/request/RequestDelegate;", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class ViewTargetRequestDelegate extends RequestDelegate {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00000O f11718OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o00O00<?> f11719OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooO00o f11720OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lifecycle f11721OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Job f11722OooO0oo;

    public ViewTargetRequestDelegate(@NotNull o00000O o00000o, @NotNull OooO00o oooO00o, @NotNull o00O00<?> o00o01, @NotNull Lifecycle lifecycle, @NotNull Job job) {
        super(0);
        this.f11718OooO0Oo = o00000o;
        this.f11720OooO0o0 = oooO00o;
        this.f11719OooO0o = o00o01;
        this.f11721OooO0oO = lifecycle;
        this.f11722OooO0oo = job;
    }

    @Override // coil.request.RequestDelegate
    public final void OooO00o() {
        o00O00<?> o00o01 = this.f11719OooO0o;
        if (o00o01.getView().isAttachedToWindow()) {
            return;
        }
        p131o00O0oo0.o00000O o00000oOooO0OO = OooOo00.OooO0OO(o00o01.getView());
        ViewTargetRequestDelegate viewTargetRequestDelegate = o00000oOooO0OO.f36794OooO0oO;
        if (viewTargetRequestDelegate != null) {
            Job.DefaultImpls.cancel$default(viewTargetRequestDelegate.f11722OooO0oo, (CancellationException) null, 1, (Object) null);
            o00O00<?> o00o02 = viewTargetRequestDelegate.f11719OooO0o;
            boolean z = o00o02 instanceof LifecycleObserver;
            Lifecycle lifecycle = viewTargetRequestDelegate.f11721OooO0oO;
            if (z) {
                lifecycle.removeObserver((LifecycleObserver) o00o02);
            }
            lifecycle.removeObserver(viewTargetRequestDelegate);
        }
        o00000oOooO0OO.f36794OooO0oO = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // coil.request.RequestDelegate
    public final void OooO0OO() {
        Lifecycle lifecycle = this.f11721OooO0oO;
        lifecycle.addObserver(this);
        o00O00<?> o00o01 = this.f11719OooO0o;
        if (o00o01 instanceof LifecycleObserver) {
            LifecycleObserver lifecycleObserver = (LifecycleObserver) o00o01;
            lifecycle.removeObserver(lifecycleObserver);
            lifecycle.addObserver(lifecycleObserver);
        }
        p131o00O0oo0.o00000O o00000oOooO0OO = OooOo00.OooO0OO(o00o01.getView());
        ViewTargetRequestDelegate viewTargetRequestDelegate = o00000oOooO0OO.f36794OooO0oO;
        if (viewTargetRequestDelegate != null) {
            Job.DefaultImpls.cancel$default(viewTargetRequestDelegate.f11722OooO0oo, (CancellationException) null, 1, (Object) null);
            o00O00<?> o00o02 = viewTargetRequestDelegate.f11719OooO0o;
            boolean z = o00o02 instanceof LifecycleObserver;
            Lifecycle lifecycle2 = viewTargetRequestDelegate.f11721OooO0oO;
            if (z) {
                lifecycle2.removeObserver((LifecycleObserver) o00o02);
            }
            lifecycle2.removeObserver(viewTargetRequestDelegate);
        }
        o00000oOooO0OO.f36794OooO0oO = this;
    }

    @Override // coil.request.RequestDelegate, androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        OooOo00.OooO0OO(this.f11719OooO0o.getView()).OooO00o();
    }
}
