package p109o000ooo;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Deferred<o00oO0o> f35861OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OOO0o(@NotNull Deferred<? extends o00oO0o> deferred) {
        this.f35861OooO00o = deferred;
    }

    @Override // p109o000ooo.o00O0O
    public final void dispose() {
        Deferred<o00oO0o> deferred = this.f35861OooO00o;
        if (!deferred.isActive()) {
            return;
        }
        Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
    }
}
