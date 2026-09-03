package p100o000oOoO;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00O000o implements o0O000o0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f29362Oooo0o;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Throwable f29364Oooo0oo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Object f29363Oooo0oO = new Object();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public List<OooO00o<?>> f29361Oooo = new ArrayList();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public List<OooO00o<?>> f29365OoooO00 = new ArrayList();

    public static final class OooO00o<R> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Function1<Long, R> f29366OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Continuation<R> f29367OooO0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(@NotNull Function1<? super Long, ? extends R> onFrame, @NotNull Continuation<? super R> continuation) {
            Intrinsics.checkNotNullParameter(onFrame, "onFrame");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.f29366OooO00o = onFrame;
            this.f29367OooO0O0 = continuation;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<OooO00o<R>> f29369Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Ref.ObjectRef<OooO00o<R>> objectRef) {
            super(1);
            this.f29369Oooo0oO = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            OooO00o oooO00o;
            Unit unit;
            o00O000o o00o000o2 = o00O000o.this;
            Object obj = o00o000o2.f29363Oooo0oO;
            Ref.ObjectRef<OooO00o<R>> objectRef = this.f29369Oooo0oO;
            synchronized (obj) {
                List<OooO00o<?>> list = o00o000o2.f29361Oooo;
                T t = objectRef.element;
                if (t == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("awaiter");
                    oooO00o = null;
                } else {
                    oooO00o = (OooO00o) t;
                }
                list.remove(oooO00o);
                unit = Unit.INSTANCE;
            }
            return unit;
        }
    }

    public o00O000o(@Nullable Function0<Unit> function0) {
        this.f29362Oooo0o = function0;
    }

    public final boolean OooO00o() {
        boolean z;
        synchronized (this.f29363Oooo0oO) {
            z = !this.f29361Oooo.isEmpty();
        }
        return z;
    }

    public final void OooO0OO(long j) {
        Object objM502constructorimpl;
        synchronized (this.f29363Oooo0oO) {
            List<OooO00o<?>> list = this.f29361Oooo;
            this.f29361Oooo = this.f29365OoooO00;
            this.f29365OoooO00 = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                OooO00o<?> oooO00o = list.get(i);
                Continuation<?> continuation = oooO00o.f29367OooO0O0;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM502constructorimpl = Result.m502constructorimpl(oooO00o.f29366OooO00o.invoke(Long.valueOf(j)));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM502constructorimpl = Result.m502constructorimpl(ResultKt.createFailure(th));
                }
                continuation.resumeWith(objM502constructorimpl);
            }
            list.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, o000oOoO.o00O000o$OooO00o] */
    @Override // p100o000oOoO.o0O000o0
    @Nullable
    public final <R> Object OooO0o(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
        OooO00o<?> oooO00o;
        Function0<Unit> function0;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (this.f29363Oooo0oO) {
            Throwable th = this.f29364Oooo0oo;
            if (th != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m502constructorimpl(ResultKt.createFailure(th)));
            } else {
                objectRef.element = new OooO00o(function1, cancellableContinuationImpl);
                boolean z = !this.f29361Oooo.isEmpty();
                List<OooO00o<?>> list = this.f29361Oooo;
                T t = objectRef.element;
                if (t == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("awaiter");
                    oooO00o = null;
                } else {
                    oooO00o = (OooO00o) t;
                }
                list.add(oooO00o);
                boolean z2 = !z;
                cancellableContinuationImpl.invokeOnCancellation(new OooO0O0(objectRef));
                if (z2 && (function0 = this.f29362Oooo0o) != null) {
                    try {
                        function0.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.f29363Oooo0oO) {
                            if (this.f29364Oooo0oo == null) {
                                this.f29364Oooo0oo = th2;
                                List<OooO00o<?>> list2 = this.f29361Oooo;
                                int size = list2.size();
                                for (int i = 0; i < size; i++) {
                                    Continuation<?> continuation2 = list2.get(i).f29367OooO0O0;
                                    Result.Companion companion2 = Result.INSTANCE;
                                    continuation2.resumeWith(Result.m502constructorimpl(ResultKt.createFailure(th2)));
                                }
                                this.f29361Oooo.clear();
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                    }
                }
            }
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
        return o0O000o0.OooO00o.f29528Oooo0o;
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
