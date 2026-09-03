package p115o00O00oO;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import p674o0oooo0.o0O00000;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes.dex */
@PublishedApi
public final class oo000o extends o0O00000 implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final AtomicInteger f30389Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Thread f30390Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(@NotNull CancellableContinuation<?> continuation, @NotNull o0O0O0O delegate) {
        int i;
        super(delegate);
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        AtomicInteger atomicInteger = new AtomicInteger(1);
        this.f30389Oooo0oO = atomicInteger;
        this.f30390Oooo0oo = Thread.currentThread();
        continuation.invokeOnCancellation(this);
        do {
            i = atomicInteger.get();
            if (i != 1) {
                if (i == 3 || i == 4 || i == 5) {
                    return;
                }
                OooO0O0(i);
                throw null;
            }
        } while (!this.f30389Oooo0oO.compareAndSet(i, 1));
    }

    public final void OooO00o() {
        AtomicInteger atomicInteger = this.f30389Oooo0oO;
        while (true) {
            int i = atomicInteger.get();
            if (i == 0 || i == 3) {
                if (this.f30389Oooo0oO.compareAndSet(i, 2)) {
                    return;
                }
            } else if (i != 4) {
                if (i == 5) {
                    Thread.interrupted();
                    return;
                } else {
                    OooO0O0(i);
                    throw null;
                }
            }
        }
    }

    public final Void OooO0O0(int i) {
        throw new IllegalStateException(Intrinsics.stringPlus("Illegal state: ", Integer.valueOf(i)).toString());
    }

    public final void OooO0Oo(boolean z) {
        AtomicInteger atomicInteger = this.f30389Oooo0oO;
        while (true) {
            int i = atomicInteger.get();
            if (i == 0 || i == 1) {
                if (this.f30389Oooo0oO.compareAndSet(i, 1 ^ (z ? 1 : 0))) {
                    return;
                }
            } else if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        Thread.interrupted();
                        return;
                    } else {
                        OooO0O0(i);
                        throw null;
                    }
                }
            } else if (this.f30389Oooo0oO.compareAndSet(i, 4)) {
                this.f30390Oooo0oo.interrupt();
                this.f30389Oooo0oO.set(5);
                return;
            }
        }
    }

    @Override // p674o0oooo0.o0O00000, p674o0oooo0.o0O0O0O
    public final long Oooo0O0(@NotNull o0oOO sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            OooO0Oo(false);
            return super.Oooo0O0(sink, j);
        } finally {
            OooO0Oo(true);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        AtomicInteger atomicInteger = this.f30389Oooo0oO;
        while (true) {
            int i = atomicInteger.get();
            if (i != 0) {
                if (i != 1) {
                    if (i != 2 && i != 3 && i != 4 && i != 5) {
                        OooO0O0(i);
                        throw null;
                    }
                    break;
                    break;
                    break;
                    break;
                }
                if (this.f30389Oooo0oO.compareAndSet(i, 3)) {
                    break;
                }
            } else if (this.f30389Oooo0oO.compareAndSet(i, 4)) {
                this.f30390Oooo0oo.interrupt();
                this.f30389Oooo0oO.set(5);
                break;
            }
        }
        return Unit.INSTANCE;
    }
}
