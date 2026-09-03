package p091o000o00o;

import androidx.annotation.RestrictTo;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000 implements CoroutineContext.Element {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f29113Oooo = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Job f29114Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final ContinuationInterceptor f29115Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final AtomicInteger f29116Oooo0oo;

    public static final class OooO00o implements CoroutineContext.Key<o000> {
    }

    public o000(@NotNull Job transactionThreadControlJob, @NotNull ContinuationInterceptor transactionDispatcher) {
        Intrinsics.checkNotNullParameter(transactionThreadControlJob, "transactionThreadControlJob");
        Intrinsics.checkNotNullParameter(transactionDispatcher, "transactionDispatcher");
        this.f29114Oooo0o = transactionThreadControlJob;
        this.f29115Oooo0oO = transactionDispatcher;
        this.f29116Oooo0oo = new AtomicInteger(0);
    }

    public final void OooO00o() {
        int iDecrementAndGet = this.f29116Oooo0oo.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
        if (iDecrementAndGet == 0) {
            Job.DefaultImpls.cancel$default(this.f29114Oooo0o, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.Key<o000> getKey() {
        return f29113Oooo;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
