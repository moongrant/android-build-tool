package p110o000ooo0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0 implements Executor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Executor f35892OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Runnable f35893OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<Runnable> f35894OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Object f35895OooO0oO;

    public o000O0(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f35892OooO0Oo = executor;
        this.f35894OooO0o0 = new ArrayDeque<>();
        this.f35895OooO0oO = new Object();
    }

    public final void OooO0O0() {
        synchronized (this.f35895OooO0oO) {
            Runnable runnablePoll = this.f35894OooO0o0.poll();
            Runnable runnable = runnablePoll;
            this.f35893OooO0o = runnable;
            if (runnablePoll != null) {
                this.f35892OooO0Oo.execute(runnable);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NotNull final Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.f35895OooO0oO) {
            this.f35894OooO0o0.offer(new Runnable() { // from class: o000ooo0.o000O00O
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable command2 = command;
                    Intrinsics.checkNotNullParameter(command2, "$command");
                    o000O0 this$0 = this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    try {
                        command2.run();
                    } finally {
                        this$0.OooO0O0();
                    }
                }
            });
            if (this.f35893OooO0o == null) {
                OooO0O0();
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
