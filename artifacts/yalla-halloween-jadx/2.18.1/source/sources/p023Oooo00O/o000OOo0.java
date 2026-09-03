package p023Oooo00O;

import androidx.compose.animation.core.MutatePriority;
import java.util.concurrent.CancellationException;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {171, 119}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class o000OOo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f1081Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Mutex f1082Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Object f1083Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o000OO00 f1084Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ Function1<Continuation<Object>, Object> f1085OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f1086OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public /* synthetic */ Object f1087OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f1088OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000OOo0(MutatePriority mutatePriority, o000OO00 o000oo01, Function1<? super Continuation<Object>, ? extends Object> function1, Continuation<? super o000OOo0> continuation) {
        super(2, continuation);
        this.f1086OoooO0 = mutatePriority;
        this.f1088OoooO0O = o000oo01;
        this.f1085OoooO = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o000OOo0 o000ooo1 = new o000OOo0(this.f1086OoooO0, this.f1088OoooO0O, this.f1085OoooO, continuation);
        o000ooo1.f1087OoooO00 = obj;
        return o000ooo1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return ((o000OOo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o000OO00.OooO00o other;
        o000OO00 o000oo01;
        Function1<Continuation<Object>, Object> function1;
        o000OO00.OooO00o oooO00o;
        Mutex mutex;
        o000OO00 o000oo02;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.f1081Oooo;
        try {
            try {
                if (r1 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f1087OoooO00;
                    MutatePriority mutatePriority = this.f1086OoooO0;
                    CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(Job.INSTANCE);
                    Intrinsics.checkNotNull(element);
                    o000OO00.OooO00o oooO00o2 = new o000OO00.OooO00o(mutatePriority, (Job) element);
                    o000OO00 o000oo03 = this.f1088OoooO0O;
                    do {
                        other = o000oo03.f1077OooO00o.get();
                        if (other != null) {
                            Intrinsics.checkNotNullParameter(other, "other");
                            if (!(oooO00o2.f1079OooO00o.compareTo(other.f1079OooO00o) >= 0)) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                    } while (!o000oo03.f1077OooO00o.compareAndSet(other, oooO00o2));
                    if (other != null) {
                        Job.DefaultImpls.cancel$default(other.f1080OooO0O0, (CancellationException) null, 1, (Object) null);
                    }
                    o000oo01 = this.f1088OoooO0O;
                    Mutex mutex2 = o000oo01.f1078OooO0O0;
                    function1 = this.f1085OoooO;
                    this.f1087OoooO00 = oooO00o2;
                    this.f1082Oooo0o = mutex2;
                    this.f1083Oooo0oO = function1;
                    this.f1084Oooo0oo = o000oo01;
                    this.f1081Oooo = 1;
                    if (mutex2.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    oooO00o = oooO00o2;
                    mutex = mutex2;
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o000oo02 = (o000OO00) this.f1083Oooo0oO;
                        mutex = this.f1082Oooo0o;
                        oooO00o = (o000OO00.OooO00o) this.f1087OoooO00;
                        try {
                            ResultKt.throwOnFailure(obj);
                            o000oo02.f1077OooO00o.compareAndSet(oooO00o, null);
                            mutex.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            o000oo02.f1077OooO00o.compareAndSet(oooO00o, null);
                            throw th;
                        }
                    }
                    o000OO00 o000oo04 = this.f1084Oooo0oo;
                    Function1<Continuation<Object>, Object> function2 = (Function1) this.f1083Oooo0oO;
                    Mutex mutex3 = this.f1082Oooo0o;
                    o000OO00.OooO00o oooO00o3 = (o000OO00.OooO00o) this.f1087OoooO00;
                    ResultKt.throwOnFailure(obj);
                    o000oo01 = o000oo04;
                    mutex = mutex3;
                    function1 = function2;
                    oooO00o = oooO00o3;
                }
                this.f1087OoooO00 = oooO00o;
                this.f1082Oooo0o = mutex;
                this.f1083Oooo0oO = o000oo01;
                this.f1084Oooo0oo = null;
                this.f1081Oooo = 2;
                Object objInvoke = function1.invoke(this);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o000oo02 = o000oo01;
                obj = objInvoke;
                o000oo02.f1077OooO00o.compareAndSet(oooO00o, null);
                mutex.unlock(null);
                return obj;
            } catch (Throwable th3) {
                o000oo02 = o000oo01;
                th = th3;
                o000oo02.f1077OooO00o.compareAndSet(oooO00o, null);
                throw th;
            }
        } catch (Throwable th4) {
            r1.unlock(null);
            throw th4;
        }
    }
}
