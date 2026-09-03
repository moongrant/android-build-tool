package p100o000oOoO;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0O00oO0 implements o0O000o0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o0O000o0 f29541Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o0O000O f29542Oooo0oO;

    @DebugMetadata(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", i = {0, 0}, l = {62, 63}, m = "withFrameNanos", n = {"this", "onFrame"}, s = {"L$0", "L$1"})
    public static final class OooO00o<R> extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o0O00oO0 f29544Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Function1 f29545Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f29546Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f29547OoooO00;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29546Oooo0oo = obj;
            this.f29547OoooO00 |= Integer.MIN_VALUE;
            return o0O00oO0.this.OooO0o(null, this);
        }
    }

    public o0O00oO0(@NotNull o0O000o0 frameClock) {
        Intrinsics.checkNotNullParameter(frameClock, "frameClock");
        this.f29541Oooo0o = frameClock;
        this.f29542Oooo0oO = new o0O000O();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p100o000oOoO.o0O000o0
    @Nullable
    public final <R> Object OooO0o(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
        OooO00o oooO00o;
        boolean z;
        Object result;
        o0O00oO0 o0o00oo1;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f29547OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f29547OoooO00 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0o = oooO00o.f29546Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f29547OoooO00;
        if (i2 != 0) {
            if (i2 == 1) {
                function1 = oooO00o.f29545Oooo0oO;
                o0o00oo1 = oooO00o.f29544Oooo0o;
                ResultKt.throwOnFailure(objOooO0o);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOooO0o);
            }
        }
        ResultKt.throwOnFailure(objOooO0o);
        o0O000O o0o000o = this.f29542Oooo0oO;
        oooO00o.f29544Oooo0o = this;
        oooO00o.f29545Oooo0oO = function1;
        oooO00o.f29547OoooO00 = 1;
        synchronized (o0o000o.f29522OooO00o) {
            z = o0o000o.f29525OooO0Oo;
        }
        if (z) {
            result = Unit.INSTANCE;
        } else {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooO00o), 1);
            cancellableContinuationImpl.initCancellability();
            synchronized (o0o000o.f29522OooO00o) {
                o0o000o.f29523OooO0O0.add(cancellableContinuationImpl);
            }
            cancellableContinuationImpl.invokeOnCancellation(new o0O000(o0o000o, cancellableContinuationImpl));
            result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(oooO00o);
            }
            if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                result = Unit.INSTANCE;
            }
        }
        if (result == coroutine_suspended) {
            return coroutine_suspended;
        }
        o0o00oo1 = this;
        o0O000o0 o0o000o1 = o0o00oo1.f29541Oooo0o;
        oooO00o.f29544Oooo0o = null;
        oooO00o.f29545Oooo0oO = null;
        oooO00o.f29547OoooO00 = 2;
        objOooO0o = o0o000o1.OooO0o(function1, oooO00o);
        return objOooO0o == coroutine_suspended ? coroutine_suspended : objOooO0o;
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
