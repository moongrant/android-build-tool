package Oooo0;

import androidx.compose.foundation.MutatePriority;
import io.agora.rtc.Constants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {173, Constants.ERR_ALREADY_IN_RECORDING}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class o00O0OO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o00O0O0O f670Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Mutex f671Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Object f672Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Object f673Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ o00O0O0O f674OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public /* synthetic */ Object f675OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f676OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ MutatePriority f677OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ Function2<Object, Continuation<Object>, Object> f678OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ Object f679o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O0OO0(MutatePriority mutatePriority, o00O0O0O o00o0o0o2, Function2<Object, ? super Continuation<Object>, ? extends Object> function2, Object obj, Continuation<? super o00O0OO0> continuation) {
        super(2, continuation);
        this.f677OoooO0O = mutatePriority;
        this.f674OoooO = o00o0o0o2;
        this.f678OoooOO0 = function2;
        this.f679o000oOoO = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00O0OO0 o00o0oo1 = new o00O0OO0(this.f677OoooO0O, this.f674OoooO, this.f678OoooOO0, this.f679o000oOoO, continuation);
        o00o0oo1.f675OoooO0 = obj;
        return o00o0oo1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return ((o00O0OO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o00O0O0O o00o0o0o2;
        Object obj2;
        o00O0O0O.OooO00o oooO00o;
        Mutex mutex;
        Function2<Object, Continuation<Object>, Object> function2;
        o00O0O0O.OooO00o oooO00o2;
        o00O0O0O o00o0o0o3;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.f676OoooO00;
        try {
            try {
                if (r1 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f675OoooO0;
                    MutatePriority mutatePriority = this.f677OoooO0O;
                    CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(Job.INSTANCE);
                    Intrinsics.checkNotNull(element);
                    o00O0O0O.OooO00o oooO00o3 = new o00O0O0O.OooO00o(mutatePriority, (Job) element);
                    o00O0O0O.OooO00o(this.f674OoooO, oooO00o3);
                    o00o0o0o2 = this.f674OoooO;
                    Mutex mutex2 = o00o0o0o2.f657OooO0O0;
                    Function2<Object, Continuation<Object>, Object> function3 = this.f678OoooOO0;
                    Object obj3 = this.f679o000oOoO;
                    this.f675OoooO0 = oooO00o3;
                    this.f671Oooo0o = mutex2;
                    this.f672Oooo0oO = function3;
                    this.f673Oooo0oo = obj3;
                    this.f670Oooo = o00o0o0o2;
                    this.f676OoooO00 = 1;
                    if (mutex2.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = obj3;
                    oooO00o = oooO00o3;
                    mutex = mutex2;
                    function2 = function3;
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o00o0o0o3 = (o00O0O0O) this.f672Oooo0oO;
                        mutex = this.f671Oooo0o;
                        oooO00o2 = (o00O0O0O.OooO00o) this.f675OoooO0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            o00o0o0o3.f656OooO00o.compareAndSet(oooO00o2, null);
                            mutex.unlock(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            o00o0o0o3.f656OooO00o.compareAndSet(oooO00o2, null);
                            throw th;
                        }
                    }
                    o00O0O0O o00o0o0o4 = this.f670Oooo;
                    obj2 = this.f673Oooo0oo;
                    function2 = (Function2) this.f672Oooo0oO;
                    Mutex mutex3 = this.f671Oooo0o;
                    oooO00o = (o00O0O0O.OooO00o) this.f675OoooO0;
                    ResultKt.throwOnFailure(obj);
                    o00o0o0o2 = o00o0o0o4;
                    mutex = mutex3;
                }
                this.f675OoooO0 = oooO00o;
                this.f671Oooo0o = mutex;
                this.f672Oooo0oO = o00o0o0o2;
                this.f673Oooo0oo = null;
                this.f670Oooo = null;
                this.f676OoooO00 = 2;
                Object objInvoke = function2.invoke(obj2, this);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00o0o0o3 = o00o0o0o2;
                obj = objInvoke;
                oooO00o2 = oooO00o;
                o00o0o0o3.f656OooO00o.compareAndSet(oooO00o2, null);
                mutex.unlock(null);
                return obj;
            } catch (Throwable th3) {
                oooO00o2 = oooO00o;
                o00o0o0o3 = o00o0o0o2;
                th = th3;
                o00o0o0o3.f656OooO00o.compareAndSet(oooO00o2, null);
                throw th;
            }
        } catch (Throwable th4) {
            r1.unlock(null);
            throw th4;
        }
    }
}
