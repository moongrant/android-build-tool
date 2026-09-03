package o0O00O0;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0O0 implements Closeable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f35114Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public Job f35115Oooo0oO;

    public OooO0O0(@NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f35114Oooo0o = scope;
    }

    public abstract long OooO00o();

    public abstract void OooO0O0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Job job = this.f35115Oooo0oO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f35115Oooo0oO = null;
    }
}
