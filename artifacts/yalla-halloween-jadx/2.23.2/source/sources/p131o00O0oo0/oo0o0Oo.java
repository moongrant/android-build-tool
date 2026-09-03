package p131o00O0oo0;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Deferred<o0Oo0oo> f36855OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    public oo0o0Oo(@NotNull Deferred<? extends o0Oo0oo> deferred) {
        this.f36855OooO00o = deferred;
    }

    @Override // p131o00O0oo0.oo000o
    public final void dispose() {
        Deferred<o0Oo0oo> deferred = this.f36855OooO00o;
        if (!deferred.isActive()) {
            return;
        }
        Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
    }
}
