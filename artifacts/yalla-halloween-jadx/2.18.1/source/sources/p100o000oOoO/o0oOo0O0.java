package p100o000oOoO;

import androidx.compose.runtime.Recomposer;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOOo.o00000OO;
import p047Oooooo0.o00O00o0;
import p047Oooooo0.o00O0O0;
import p047Oooooo0.oo00o;
import p047Oooooo0.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {744}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
public final class o0oOo0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Recomposer f29676Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00O00o0 f29677Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f29678Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public /* synthetic */ Object f29679Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o0O000o0 f29680OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Function3<CoroutineScope, o0O000o0, Continuation<? super Unit>, Object> f29681OoooO00;

    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", i = {}, l = {745}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O000o0 f29682Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f29683Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f29684Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function3<CoroutineScope, o0O000o0, Continuation<? super Unit>, Object> f29685Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function3<? super CoroutineScope, ? super o0O000o0, ? super Continuation<? super Unit>, ? extends Object> function3, o0O000o0 o0o000o1, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f29685Oooo0oo = function3;
            this.f29682Oooo = o0o000o1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f29685Oooo0oo, this.f29682Oooo, continuation);
            oooO00o.f29684Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f29683Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f29684Oooo0oO;
                Function3<CoroutineScope, o0O000o0, Continuation<? super Unit>, Object> function3 = this.f29685Oooo0oo;
                o0O000o0 o0o000o1 = this.f29682Oooo;
                this.f29683Oooo0o = 1;
                if (function3.invoke(coroutineScope, o0o000o1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Set<? extends Object>, oo00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Recomposer f29686Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Recomposer recomposer) {
            super(2);
            this.f29686Oooo0o = recomposer;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Set<? extends Object> set, oo00o oo00oVar) {
            CancellableContinuation<Unit> cancellableContinuationOooOo0O;
            Set<? extends Object> changed = set;
            Intrinsics.checkNotNullParameter(changed, "changed");
            Intrinsics.checkNotNullParameter(oo00oVar, "<anonymous parameter 1>");
            Recomposer recomposer = this.f29686Oooo0o;
            synchronized (recomposer.f5968OooO0Oo) {
                if (recomposer.f5978OooOOOO.getValue().compareTo(Recomposer.State.Idle) >= 0) {
                    recomposer.f5972OooO0oo.add(changed);
                    cancellableContinuationOooOo0O = recomposer.OooOo0O();
                } else {
                    cancellableContinuationOooOo0O = null;
                }
            }
            if (cancellableContinuationOooOo0O != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationOooOo0O.resumeWith(Result.m502constructorimpl(Unit.INSTANCE));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0oOo0O0(Recomposer recomposer, Function3<? super CoroutineScope, ? super o0O000o0, ? super Continuation<? super Unit>, ? extends Object> function3, o0O000o0 o0o000o1, Continuation<? super o0oOo0O0> continuation) {
        super(2, continuation);
        this.f29676Oooo = recomposer;
        this.f29681OoooO00 = function3;
        this.f29680OoooO0 = o0o000o1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0oOo0O0 o0ooo0o1 = new o0oOo0O0(this.f29676Oooo, this.f29681OoooO00, this.f29680OoooO0, continuation);
        o0ooo0o1.f29679Oooo0oo = obj;
        return o0ooo0o1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0oOo0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00cf A[Catch: all -> 0x00e1, TryCatch #0 {, blocks: (B:44:0x00cb, B:46:0x00cf, B:47:0x00d1), top: B:82:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5 A[Catch: all -> 0x0105, TryCatch #3 {, blocks: (B:61:0x00f1, B:63:0x00f5, B:64:0x00f7), top: B:87:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Job job;
        MutableStateFlow<o00000OO<Recomposer.OooO0O0>> mutableStateFlow;
        o00000OO<Recomposer.OooO0O0> value;
        o00000OO<Recomposer.OooO0O0> o00000ooAdd;
        o00O00o0 o00o00o1;
        Recomposer recomposer;
        Recomposer recomposer2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f29678Oooo0oO;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o00o00o1 = this.f29677Oooo0o;
            job = (Job) this.f29679Oooo0oo;
            try {
                ResultKt.throwOnFailure(obj);
                o00o00o1.dispose();
                recomposer2 = this.f29676Oooo;
                synchronized (recomposer2.f5968OooO0Oo) {
                    if (recomposer2.f5970OooO0o0 == job) {
                        recomposer2.f5970OooO0o0 = null;
                    }
                    recomposer2.OooOo0O();
                }
                Recomposer.OooO00o oooO00o = Recomposer.f5963OooOOo0;
                Recomposer.OooO00o.OooO00o(this.f29676Oooo.f5979OooOOOo);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                o00o00o1.dispose();
                recomposer = this.f29676Oooo;
                synchronized (recomposer.f5968OooO0Oo) {
                    if (recomposer.f5970OooO0o0 == job) {
                        recomposer.f5970OooO0o0 = null;
                    }
                    recomposer.OooOo0O();
                    Recomposer.OooO00o oooO00o2 = Recomposer.f5963OooOOo0;
                    Recomposer.OooO00o.OooO00o(this.f29676Oooo.f5979OooOOOo);
                    throw th;
                }
            }
        }
        ResultKt.throwOnFailure(obj);
        job = JobKt.getJob(((CoroutineScope) this.f29679Oooo0oo).getCoroutineContext());
        Recomposer recomposer3 = this.f29676Oooo;
        synchronized (recomposer3.f5968OooO0Oo) {
            Throwable th2 = recomposer3.f5969OooO0o;
            if (th2 != null) {
                throw th2;
            }
            if (recomposer3.f5978OooOOOO.getValue().compareTo(Recomposer.State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            }
            if (recomposer3.f5970OooO0o0 != null) {
                throw new IllegalStateException("Recomposer already running".toString());
            }
            recomposer3.f5970OooO0o0 = job;
            recomposer3.OooOo0O();
        }
        OooO0O0 observer = new OooO0O0(this.f29676Oooo);
        Intrinsics.checkNotNullParameter(observer, "observer");
        Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
        oo0o0O0.OooO0o(oo0o0O0.f4156OooO00o);
        synchronized (oo0o0O0.f4158OooO0OO) {
            oo0o0O0.f4162OooO0oO.add(observer);
        }
        o00O00o0 o00o00o2 = new o00O00o0(observer);
        Recomposer.OooO00o oooO00o3 = Recomposer.f5963OooOOo0;
        Recomposer.OooO0O0 oooO0O0 = this.f29676Oooo.f5979OooOOOo;
        do {
            mutableStateFlow = Recomposer.f5962OooOOo;
            value = mutableStateFlow.getValue();
            o00000ooAdd = value.add(oooO0O0);
            if (value == o00000ooAdd) {
                break;
            }
        } while (!mutableStateFlow.compareAndSet(value, o00000ooAdd));
        try {
            Recomposer recomposer4 = this.f29676Oooo;
            synchronized (recomposer4.f5968OooO0Oo) {
                List<oo0O> list = recomposer4.f5971OooO0oO;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.get(i2).OooOOo();
                }
                Unit unit = Unit.INSTANCE;
            }
            OooO00o oooO00o4 = new OooO00o(this.f29681OoooO00, this.f29680OoooO0, null);
            this.f29679Oooo0oo = job;
            this.f29677Oooo0o = o00o00o2;
            this.f29678Oooo0oO = 1;
            if (CoroutineScopeKt.coroutineScope(oooO00o4, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            o00o00o1 = o00o00o2;
            o00o00o1.dispose();
            recomposer2 = this.f29676Oooo;
            synchronized (recomposer2.f5968OooO0Oo) {
                if (recomposer2.f5970OooO0o0 == job) {
                    recomposer2.f5970OooO0o0 = null;
                }
                recomposer2.OooOo0O();
                Recomposer.OooO00o oooO00o5 = Recomposer.f5963OooOOo0;
                Recomposer.OooO00o.OooO00o(this.f29676Oooo.f5979OooOOOo);
                return Unit.INSTANCE;
            }
        } catch (Throwable th3) {
            th = th3;
            o00o00o1 = o00o00o2;
            o00o00o1.dispose();
            recomposer = this.f29676Oooo;
            synchronized (recomposer.f5968OooO0Oo) {
                if (recomposer.f5970OooO0o0 == job) {
                    recomposer.f5970OooO0o0 = null;
                }
                recomposer.OooOo0O();
            }
            Recomposer.OooO00o oooO00o6 = Recomposer.f5963OooOOo0;
            Recomposer.OooO00o.OooO00o(this.f29676Oooo.f5979OooOOOo);
            throw th;
        }
    }
}
