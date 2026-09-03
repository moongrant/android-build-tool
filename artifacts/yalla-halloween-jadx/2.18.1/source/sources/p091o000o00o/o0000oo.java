package p091o000o00o;

import androidx.room.RoomDatabase;
import com.qiniu.android.collect.ReportItem;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.ThreadContextElementKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0000oo {

    @DebugMetadata(c = "androidx.room.RoomDatabaseKt", f = "RoomDatabase.kt", i = {0, 0}, l = {99}, m = "createTransactionContext", n = {"$this$createTransactionContext", "controlJob"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f29193Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public RoomDatabase f29194Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public CompletableJob f29195Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f29196Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29196Oooo0oo = obj;
            this.f29193Oooo |= Integer.MIN_VALUE;
            return o0000oo.OooO00o(null, this);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ CompletableJob f29197Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(CompletableJob completableJob) {
            super(1);
            this.f29197Oooo0o = completableJob;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Job.DefaultImpls.cancel$default((Job) this.f29197Oooo0o, (CancellationException) null, 1, (Object) null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.room.RoomDatabaseKt", f = "RoomDatabase.kt", i = {0, 0}, l = {50, 51}, m = "withTransaction", n = {"$this$withTransaction", ReportItem.LogTypeBlock}, s = {"L$0", "L$1"})
    public static final class OooO0OO<R> extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f29198Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public RoomDatabase f29199Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Function1 f29200Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f29201Oooo0oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29201Oooo0oo = obj;
            this.f29198Oooo |= Integer.MIN_VALUE;
            return o0000oo.OooO0O0(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @DebugMetadata(c = "androidx.room.RoomDatabaseKt$withTransaction$2", f = "RoomDatabase.kt", i = {0}, l = {58}, m = "invokeSuspend", n = {"transactionElement"}, s = {"L$0"})
    public static final class OooO0o<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<Continuation<? super R>, Object> f29202Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f29203Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f29204Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ RoomDatabase f29205Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(RoomDatabase roomDatabase, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f29205Oooo0oo = roomDatabase;
            this.f29202Oooo = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f29205Oooo0oo, this.f29202Oooo, continuation);
            oooO0o.f29204Oooo0oO = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Object obj) {
            return ((OooO0o) create(coroutineScope, (Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Throwable th;
            o000 o000Var;
            o000 coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f29203Oooo0o;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext.Element element = ((CoroutineScope) this.f29204Oooo0oO).getCoroutineContext().get(o000.f29113Oooo);
                    Intrinsics.checkNotNull(element);
                    o000 o000Var2 = (o000) element;
                    o000Var2.f29116Oooo0oo.incrementAndGet();
                    try {
                        this.f29205Oooo0oo.OooO0OO();
                        try {
                            Function1<Continuation<? super R>, Object> function1 = this.f29202Oooo;
                            this.f29204Oooo0oO = o000Var2;
                            this.f29203Oooo0o = 1;
                            Object objInvoke = function1.invoke(this);
                            if (objInvoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            o000Var = o000Var2;
                            obj = objInvoke;
                        } catch (Throwable th2) {
                            th = th2;
                            this.f29205Oooo0oo.OooOO0O();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        coroutine_suspended = o000Var2;
                        th = th3;
                        coroutine_suspended.OooO00o();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o000Var = (o000) this.f29204Oooo0oO;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        this.f29205Oooo0oo.OooOO0O();
                        throw th;
                    }
                }
                this.f29205Oooo0oo.OooOOOO();
                this.f29205Oooo0oo.OooOO0O();
                o000Var.OooO00o();
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object OooO00o(RoomDatabase roomDatabase, Continuation<? super CoroutineContext> continuation) {
        OooO00o oooO00o;
        RoomDatabase roomDatabase2;
        CompletableJob completableJob;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f29193Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f29193Oooo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f29196Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f29193Oooo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            Job job = (Job) oooO00o.get$context().get(Job.INSTANCE);
            if (job != null) {
                job.invokeOnCompletion(new OooO0O0(completableJobJob$default));
            }
            o000O000 transactionExecutor = roomDatabase.f9292OooO0OO;
            Intrinsics.checkNotNullExpressionValue(transactionExecutor, "transactionExecutor");
            oooO00o.f29194Oooo0o = roomDatabase;
            oooO00o.f29195Oooo0oO = completableJobJob$default;
            oooO00o.f29193Oooo = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooO00o), 1);
            cancellableContinuationImpl.initCancellability();
            cancellableContinuationImpl.invokeOnCancellation(new o0000(completableJobJob$default));
            try {
                transactionExecutor.execute(new o0000O00(cancellableContinuationImpl, completableJobJob$default));
            } catch (RejectedExecutionException e) {
                cancellableContinuationImpl.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(oooO00o);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            roomDatabase2 = roomDatabase;
            completableJob = completableJobJob$default;
            obj = result;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            completableJob = oooO00o.f29195Oooo0oO;
            roomDatabase2 = oooO00o.f29194Oooo0o;
            ResultKt.throwOnFailure(obj);
        }
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) obj;
        o000 o000Var = new o000(completableJob, continuationInterceptor);
        ThreadLocal<Integer> suspendingTransactionId = roomDatabase2.f9299OooOO0O;
        Intrinsics.checkNotNullExpressionValue(suspendingTransactionId, "suspendingTransactionId");
        return continuationInterceptor.plus(o000Var).plus(ThreadContextElementKt.asContextElement(suspendingTransactionId, Boxing.boxInt(System.identityHashCode(completableJob))));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0078 A[PHI: r9
      0x0078: PHI (r9v13 java.lang.Object) = (r9v10 java.lang.Object), (r9v1 java.lang.Object) binds: [B:26:0x0075, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <R> Object OooO0O0(@NotNull RoomDatabase roomDatabase, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1, @NotNull Continuation<? super R> continuation) {
        OooO0OO oooO0OO;
        CoroutineContext coroutineContext;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f29198Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f29198Oooo = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objOooO00o = oooO0OO.f29201Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f29198Oooo;
        if (i2 != 0) {
            if (i2 == 1) {
                Function1<? super Continuation<? super R>, ? extends Object> function2 = oooO0OO.f29200Oooo0oO;
                RoomDatabase roomDatabase2 = oooO0OO.f29199Oooo0o;
                ResultKt.throwOnFailure(objOooO00o);
                function1 = function2;
                roomDatabase = roomDatabase2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOooO00o);
            }
            return objOooO00o;
        }
        ResultKt.throwOnFailure(objOooO00o);
        o000 o000Var = (o000) oooO0OO.get$context().get(o000.f29113Oooo);
        coroutineContext = o000Var == null ? null : o000Var.f29115Oooo0oO;
        if (coroutineContext == null) {
            oooO0OO.f29199Oooo0o = roomDatabase;
            oooO0OO.f29200Oooo0oO = function1;
            oooO0OO.f29198Oooo = 1;
            objOooO00o = OooO00o(roomDatabase, oooO0OO);
            if (objOooO00o == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        OooO0o oooO0o = new OooO0o(roomDatabase, function1, null);
        oooO0OO.f29199Oooo0o = null;
        oooO0OO.f29200Oooo0oO = null;
        oooO0OO.f29198Oooo = 2;
        objOooO00o = BuildersKt.withContext(coroutineContext, oooO0o, oooO0OO);
        if (objOooO00o == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objOooO00o;
        coroutineContext = (CoroutineContext) objOooO00o;
        OooO0o oooO0o2 = new OooO0o(roomDatabase, function1, null);
        oooO0OO.f29199Oooo0o = null;
        oooO0OO.f29200Oooo0oO = null;
        oooO0OO.f29198Oooo = 2;
        objOooO00o = BuildersKt.withContext(coroutineContext, oooO0o2, oooO0OO);
        if (objOooO00o == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objOooO00o;
    }
}
