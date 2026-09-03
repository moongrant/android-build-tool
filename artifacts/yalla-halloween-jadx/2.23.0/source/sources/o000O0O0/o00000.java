package o000O0O0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 implements Executor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Executor f34759OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Runnable f34760OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<Runnable> f34761OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Object f34762OooO0oO;

    public o00000(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f34759OooO0Oo = executor;
        this.f34761OooO0o0 = new ArrayDeque<>();
        this.f34762OooO0oO = new Object();
    }

    public final void OooO0O0() {
        synchronized (this.f34762OooO0oO) {
            Runnable runnablePoll = this.f34761OooO0o0.poll();
            Runnable runnable = runnablePoll;
            this.f34760OooO0o = runnable;
            if (runnablePoll != null) {
                this.f34759OooO0Oo.execute(runnable);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NotNull Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.f34762OooO0oO) {
            this.f34761OooO0o0.offer(new o000O00(1, command, this));
            if (this.f34760OooO0o == null) {
                OooO0O0();
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
