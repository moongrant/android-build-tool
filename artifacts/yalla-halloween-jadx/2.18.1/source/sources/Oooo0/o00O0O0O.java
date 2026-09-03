package Oooo0;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Stable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class o00O0O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final AtomicReference<OooO00o> f656OooO00o = new AtomicReference<>(null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Mutex f657OooO0O0 = MutexKt.Mutex$default(false, 1, null);

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final MutatePriority f658OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Job f659OooO0O0;

        public OooO00o(@NotNull MutatePriority priority, @NotNull Job job) {
            Intrinsics.checkNotNullParameter(priority, "priority");
            Intrinsics.checkNotNullParameter(job, "job");
            this.f658OooO00o = priority;
            this.f659OooO0O0 = job;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {173, 119}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class OooO0O0<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f660Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Mutex f661Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Object f662Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public o00O0O0O f663Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ Function1<Continuation<? super R>, Object> f664OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ MutatePriority f665OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f666OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ o00O0O0O f667OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(MutatePriority mutatePriority, o00O0O0O o00o0o0o2, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f665OoooO0 = mutatePriority;
            this.f667OoooO0O = o00o0o0o2;
            this.f664OoooO = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f665OoooO0, this.f667OoooO0O, this.f664OoooO, continuation);
            oooO0O0.f666OoooO00 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Object obj) {
            return ((OooO0O0) create(coroutineScope, (Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00O0O0O o00o0o0o2;
            Mutex mutex;
            Function1<Continuation<? super R>, Object> function1;
            OooO00o oooO00o;
            Mutex mutex2;
            OooO00o oooO00o2;
            o00O0O0O o00o0o0o3;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.f660Oooo;
            try {
                try {
                    if (r1 == 0) {
                        ResultKt.throwOnFailure(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.f666OoooO00;
                        MutatePriority mutatePriority = this.f665OoooO0;
                        CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(Job.INSTANCE);
                        Intrinsics.checkNotNull(element);
                        OooO00o oooO00o3 = new OooO00o(mutatePriority, (Job) element);
                        o00O0O0O.OooO00o(this.f667OoooO0O, oooO00o3);
                        o00o0o0o2 = this.f667OoooO0O;
                        mutex = o00o0o0o2.f657OooO0O0;
                        Function1<Continuation<? super R>, Object> function2 = this.f664OoooO;
                        this.f666OoooO00 = oooO00o3;
                        this.f661Oooo0o = mutex;
                        this.f662Oooo0oO = function2;
                        this.f663Oooo0oo = o00o0o0o2;
                        this.f660Oooo = 1;
                        if (mutex.lock(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        function1 = function2;
                        oooO00o = oooO00o3;
                    } else {
                        if (r1 != 1) {
                            if (r1 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            o00o0o0o3 = (o00O0O0O) this.f662Oooo0oO;
                            mutex2 = this.f661Oooo0o;
                            oooO00o2 = (OooO00o) this.f666OoooO00;
                            try {
                                ResultKt.throwOnFailure(obj);
                                o00o0o0o3.f656OooO00o.compareAndSet(oooO00o2, null);
                                mutex2.unlock(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                o00o0o0o3.f656OooO00o.compareAndSet(oooO00o2, null);
                                throw th;
                            }
                        }
                        o00O0O0O o00o0o0o4 = this.f663Oooo0oo;
                        function1 = (Function1) this.f662Oooo0oO;
                        mutex = this.f661Oooo0o;
                        oooO00o = (OooO00o) this.f666OoooO00;
                        ResultKt.throwOnFailure(obj);
                        o00o0o0o2 = o00o0o0o4;
                    }
                    this.f666OoooO00 = oooO00o;
                    this.f661Oooo0o = mutex2;
                    this.f662Oooo0oO = o00o0o0o2;
                    this.f663Oooo0oo = null;
                    this.f660Oooo = 2;
                    Object objInvoke = function1.invoke(this);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o00o0o0o3 = o00o0o0o2;
                    obj = objInvoke;
                    oooO00o2 = oooO00o;
                    o00o0o0o3.f656OooO00o.compareAndSet(oooO00o2, null);
                    mutex2.unlock(null);
                    return obj;
                } catch (Throwable th3) {
                    oooO00o2 = oooO00o;
                    o00o0o0o3 = o00o0o0o2;
                    th = th3;
                    o00o0o0o3.f656OooO00o.compareAndSet(oooO00o2, null);
                    throw th;
                }
                mutex2 = mutex;
            } catch (Throwable th4) {
                r1.unlock(null);
                throw th4;
            }
        }
    }

    public static final void OooO00o(o00O0O0O o00o0o0o2, OooO00o oooO00o) {
        OooO00o other;
        do {
            other = o00o0o0o2.f656OooO00o.get();
            if (other != null) {
                Intrinsics.checkNotNullParameter(other, "other");
                if (!(oooO00o.f658OooO00o.compareTo(other.f658OooO00o) >= 0)) {
                    throw new CancellationException("Current mutation had a higher priority");
                }
            }
        } while (!o00o0o0o2.f656OooO00o.compareAndSet(other, oooO00o));
        if (other != null) {
            Job.DefaultImpls.cancel$default(other.f659OooO0O0, (CancellationException) null, 1, (Object) null);
        }
    }

    @Nullable
    public final <R> Object OooO0O0(@NotNull MutatePriority mutatePriority, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1, @NotNull Continuation<? super R> continuation) {
        return CoroutineScopeKt.coroutineScope(new OooO0O0(mutatePriority, this, function1, null), continuation);
    }
}
