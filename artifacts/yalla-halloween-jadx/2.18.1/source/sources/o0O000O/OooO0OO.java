package o0O000O;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements CoroutineScope {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f35077Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f35078Oooo0oO;

    public OooO0OO(CoroutineContext coroutineContext) {
        this.f35078Oooo0oO = coroutineContext;
        this.f35077Oooo0o = SupervisorKt.SupervisorJob(coroutineContext == null ? null : (Job) coroutineContext.get(Job.INSTANCE)).plus(Dispatchers.getIO());
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.f35077Oooo0o;
    }
}
