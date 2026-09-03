package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0000 implements p100o000oOoO.o0O000o0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Choreographer f6388Oooo0o;

    public static final class OooO00o extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000Ooo f6389Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f6390Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0000Ooo o0000ooo, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f6389Oooo0o = o0000ooo;
            this.f6390Oooo0oO = frameCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            o0000Ooo o0000ooo = this.f6389Oooo0o;
            Choreographer.FrameCallback callback = this.f6390Oooo0oO;
            Objects.requireNonNull(o0000ooo);
            Intrinsics.checkNotNullParameter(callback, "callback");
            synchronized (o0000ooo.f6417Oooo0oo) {
                o0000ooo.f6420OoooO00.remove(callback);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f6392Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f6392Oooo0oO = frameCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            o0000.this.f6388Oooo0o.removeFrameCallback(this.f6392Oooo0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<R> f6393Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, R> f6394Oooo0oO;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(CancellableContinuation<? super R> cancellableContinuation, o0000 o0000Var, Function1<? super Long, ? extends R> function1) {
            this.f6393Oooo0o = cancellableContinuation;
            this.f6394Oooo0oO = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object objM502constructorimpl;
            Continuation continuation = this.f6393Oooo0o;
            Function1<Long, R> function1 = this.f6394Oooo0oO;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM502constructorimpl = Result.m502constructorimpl(function1.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM502constructorimpl = Result.m502constructorimpl(ResultKt.createFailure(th));
            }
            continuation.resumeWith(objM502constructorimpl);
        }
    }

    public o0000(@NotNull Choreographer choreographer) {
        Intrinsics.checkNotNullParameter(choreographer, "choreographer");
        this.f6388Oooo0o = choreographer;
    }

    @Override // p100o000oOoO.o0O000o0
    @Nullable
    public final <R> Object OooO0o(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
        CoroutineContext.Element element = continuation.get$context().get(ContinuationInterceptor.INSTANCE);
        o0000Ooo o0000ooo = element instanceof o0000Ooo ? (o0000Ooo) element : null;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        OooO0OO callback = new OooO0OO(cancellableContinuationImpl, this, function1);
        if (o0000ooo == null || !Intrinsics.areEqual(o0000ooo.f6415Oooo0o, this.f6388Oooo0o)) {
            this.f6388Oooo0o.postFrameCallback(callback);
            cancellableContinuationImpl.invokeOnCancellation(new OooO0O0(callback));
        } else {
            Intrinsics.checkNotNullParameter(callback, "callback");
            synchronized (o0000ooo.f6417Oooo0oo) {
                o0000ooo.f6420OoooO00.add(callback);
                if (!o0000ooo.f6418OoooO) {
                    o0000ooo.f6418OoooO = true;
                    o0000ooo.f6415Oooo0o.postFrameCallback(o0000ooo.f6422OoooOO0);
                }
                Unit unit = Unit.INSTANCE;
            }
            cancellableContinuationImpl.invokeOnCancellation(new OooO00o(o0000ooo, callback));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r, operation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (E) CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return o000oOoO.o0O000o0.OooO00o.f29528Oooo0o;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext plus(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return CoroutineContext.Element.DefaultImpls.plus(this, context);
    }
}
