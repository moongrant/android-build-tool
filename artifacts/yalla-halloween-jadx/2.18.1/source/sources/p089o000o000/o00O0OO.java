package p089o000o000;

import io.agora.rtc.Constants;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f28983OooO00o = new OooO0O0(this, true);

    public static final class OooO00o extends CancellationException {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final o00O0OO f28984Oooo0o;

        public OooO00o(@NotNull o00O0OO runner) {
            Intrinsics.checkNotNullParameter(runner, "runner");
            this.f28984Oooo0o = runner;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o00O0OO f28985OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f28986OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final Mutex f28987OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public Job f28988OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f28989OooO0o0;

        @DebugMetadata(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", i = {0, 0, 0}, l = {Constants.ERR_WATERMARK_READ}, m = "onFinish", n = {"this", "job", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
        public static final class OooO00o extends ContinuationImpl {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public /* synthetic */ Object f28990Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public OooO0O0 f28991Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public Job f28992Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public Mutex f28993Oooo0oo;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public int f28994OoooO0;

            public OooO00o(Continuation<? super OooO00o> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f28990Oooo = obj;
                this.f28994OoooO0 |= Integer.MIN_VALUE;
                return OooO0O0.this.OooO00o(null, this);
            }
        }

        /* JADX INFO: renamed from: o000o000.o00O0OO$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {Constants.ERR_WATERMARK_READ, 100}, m = "tryEnqueue", n = {"this", "job", "$this$withLock_u24default$iv", "priority", "this", "job", "$this$withLock_u24default$iv", "priority"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"})
        public static final class C0316OooO0O0 extends ContinuationImpl {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public int f28996Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public OooO0O0 f28997Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public Job f28998Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public Mutex f28999Oooo0oo;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public /* synthetic */ Object f29001OoooO00;

            /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
            public int f29002OoooO0O;

            public C0316OooO0O0(Continuation<? super C0316OooO0O0> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f29001OoooO00 = obj;
                this.f29002OoooO0O |= Integer.MIN_VALUE;
                return OooO0O0.this.OooO0O0(0, null, this);
            }
        }

        public OooO0O0(@NotNull o00O0OO singleRunner, boolean z) {
            Intrinsics.checkNotNullParameter(singleRunner, "singleRunner");
            this.f28985OooO00o = singleRunner;
            this.f28986OooO0O0 = z;
            this.f28987OooO0OO = MutexKt.Mutex$default(false, 1, null);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final Object OooO00o(@NotNull Job job, @NotNull Continuation<? super Unit> continuation) {
            OooO00o oooO00o;
            Mutex mutex;
            OooO0O0 oooO0O0;
            if (continuation instanceof OooO00o) {
                oooO00o = (OooO00o) continuation;
                int i = oooO00o.f28994OoooO0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    oooO00o.f28994OoooO0 = i - Integer.MIN_VALUE;
                } else {
                    oooO00o = new OooO00o(continuation);
                }
            } else {
                oooO00o = new OooO00o(continuation);
            }
            Object obj = oooO00o.f28990Oooo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = oooO00o.f28994OoooO0;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.f28987OooO0OO;
                oooO00o.f28991Oooo0o = this;
                oooO00o.f28992Oooo0oO = job;
                oooO00o.f28993Oooo0oo = mutex;
                oooO00o.f28994OoooO0 = 1;
                if (mutex.lock(null, oooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooO0O0 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Mutex mutex2 = oooO00o.f28993Oooo0oo;
                Job job2 = oooO00o.f28992Oooo0oO;
                oooO0O0 = oooO00o.f28991Oooo0o;
                ResultKt.throwOnFailure(obj);
                mutex = mutex2;
                job = job2;
            }
            try {
                if (job == oooO0O0.f28988OooO0Oo) {
                    oooO0O0.f28988OooO0Oo = null;
                }
                return Unit.INSTANCE;
            } finally {
                mutex.unlock(null);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r11v12 */
        /* JADX WARN: Type inference failed for: r11v13 */
        /* JADX WARN: Type inference failed for: r11v4, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v7 */
        @Nullable
        public final Object OooO0O0(int i, @NotNull Job job, @NotNull Continuation<? super Boolean> continuation) {
            C0316OooO0O0 c0316OooO0O0;
            OooO0O0 oooO0O0;
            ?? r2;
            Mutex mutex;
            ?? r1;
            OooO0O0 oooO0O1;
            int i2;
            if (continuation instanceof C0316OooO0O0) {
                c0316OooO0O0 = (C0316OooO0O0) continuation;
                int i3 = c0316OooO0O0.f29002OoooO0O;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c0316OooO0O0.f29002OoooO0O = i3 - Integer.MIN_VALUE;
                } else {
                    c0316OooO0O0 = new C0316OooO0O0(continuation);
                }
            } else {
                c0316OooO0O0 = new C0316OooO0O0(continuation);
            }
            Object obj = c0316OooO0O0.f29001OoooO00;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = c0316OooO0O0.f29002OoooO0O;
            boolean z = true;
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        i = c0316OooO0O0.f28996Oooo;
                        Mutex mutex2 = c0316OooO0O0.f28999Oooo0oo;
                        Job job2 = c0316OooO0O0.f28998Oooo0oO;
                        oooO0O0 = c0316OooO0O0.f28997Oooo0o;
                        ResultKt.throwOnFailure(obj);
                        r2 = job2;
                        mutex = mutex2;
                    } else {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i = c0316OooO0O0.f28996Oooo;
                        Mutex mutex3 = c0316OooO0O0.f28999Oooo0oo;
                        Job job3 = c0316OooO0O0.f28998Oooo0oO;
                        oooO0O1 = c0316OooO0O0.f28997Oooo0o;
                        ResultKt.throwOnFailure(obj);
                        r1 = job3;
                        mutex = mutex3;
                    }
                    oooO0O0 = oooO0O1;
                    r2 = r1;
                    oooO0O0.f28988OooO0Oo = r2;
                    oooO0O0.f28989OooO0o0 = i;
                    job = mutex;
                    Boolean boolBoxBoolean = Boxing.boxBoolean(z);
                    job.unlock(null);
                    return boolBoxBoolean;
                }
                ResultKt.throwOnFailure(obj);
                Mutex mutex4 = this.f28987OooO0OO;
                c0316OooO0O0.f28997Oooo0o = this;
                c0316OooO0O0.f28998Oooo0oO = job;
                c0316OooO0O0.f28999Oooo0oo = mutex4;
                c0316OooO0O0.f28996Oooo = i;
                c0316OooO0O0.f29002OoooO0O = 1;
                if (mutex4.lock(null, c0316OooO0O0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooO0O0 = this;
                r2 = job;
                mutex = mutex4;
                Job job4 = oooO0O0.f28988OooO0Oo;
                if (job4 == null || !job4.isActive() || (i2 = oooO0O0.f28989OooO0o0) < i || (i2 == i && oooO0O0.f28986OooO0O0)) {
                    if (job4 != null) {
                        job4.cancel((CancellationException) new OooO00o(oooO0O0.f28985OooO00o));
                    }
                    if (job4 != null) {
                        c0316OooO0O0.f28997Oooo0o = oooO0O0;
                        c0316OooO0O0.f28998Oooo0oO = r2;
                        c0316OooO0O0.f28999Oooo0oo = mutex;
                        c0316OooO0O0.f28996Oooo = i;
                        c0316OooO0O0.f29002OoooO0O = 2;
                        if (job4.join(c0316OooO0O0) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r1 = r2;
                        oooO0O1 = oooO0O0;
                        mutex = mutex;
                        oooO0O0 = oooO0O1;
                        r2 = r1;
                    }
                    oooO0O0.f28988OooO0Oo = r2;
                    oooO0O0.f28989OooO0o0 = i;
                    job = mutex;
                } else {
                    z = false;
                    job = mutex;
                }
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(z);
                job.unlock(null);
                return boolBoxBoolean2;
            } catch (Throwable th) {
                job.unlock(null);
                throw th;
            }
        }
    }

    @DebugMetadata(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", i = {0}, l = {49}, m = "runInIsolation", n = {"this"}, s = {"L$0"})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f29003Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o00O0OO f29004Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f29005Oooo0oO;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29005Oooo0oO = obj;
            this.f29003Oooo |= Integer.MIN_VALUE;
            return o00O0OO.this.OooO00o(0, null, this);
        }
    }

    @DebugMetadata(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", i = {0, 1}, l = {53, 59, 61, 61}, m = "invokeSuspend", n = {"myJob", "myJob"}, s = {"L$0", "L$0"})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f29007Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f29008Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f29009Oooo0oO;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function1<Continuation<? super Unit>, Object> f29011OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(int i, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f29007Oooo = i;
            this.f29011OoooO00 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = o00O0OO.this.new OooO0o(this.f29007Oooo, this.f29011OoooO00, continuation);
            oooO0o.f29009Oooo0oO = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0089 A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r3v2, types: [o000o000.o00O0OO$OooO0O0] */
        /* JADX WARN: Type inference failed for: r9v15, types: [o000o000.o00O0OO$OooO0O0] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Job job;
            ?? r9;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.f29008Oooo0o;
            int i = 4;
            try {
                if (r1 != 0) {
                    if (r1 == 1) {
                        Job job2 = (Job) this.f29009Oooo0oO;
                        ResultKt.throwOnFailure(obj);
                        job = job2;
                    } else if (r1 == 2) {
                        Job job3 = (Job) this.f29009Oooo0oO;
                        ResultKt.throwOnFailure(obj);
                        r1 = job3;
                        r1 = job;
                        r9 = o00O0OO.this.f28983OooO00o;
                        i = 0;
                        this.f29009Oooo0oO = null;
                        this.f29008Oooo0o = 3;
                        if (r9.OooO00o(r1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (r1 != 3) {
                            if (r1 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) this.f29009Oooo0oO;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                CoroutineContext.Element element = ((CoroutineScope) this.f29009Oooo0oO).getCoroutineContext().get(Job.INSTANCE);
                if (element == null) {
                    throw new IllegalStateException("Internal error. coroutineScope should've created a job.".toString());
                }
                Job job4 = (Job) element;
                OooO0O0 oooO0O0 = o00O0OO.this.f28983OooO00o;
                int i2 = this.f29007Oooo;
                this.f29009Oooo0oO = job4;
                this.f29008Oooo0o = 1;
                Object objOooO0O0 = oooO0O0.OooO0O0(i2, job4, this);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                job = job4;
                obj = objOooO0O0;
                if (((Boolean) obj).booleanValue()) {
                    Function1<Continuation<? super Unit>, Object> function1 = this.f29011OoooO00;
                    this.f29009Oooo0oO = job;
                    this.f29008Oooo0o = 2;
                    if (function1.invoke(this) == coroutine_suspended) {
                        r1 = job;
                        return coroutine_suspended;
                    }
                    r1 = job;
                    r9 = o00O0OO.this.f28983OooO00o;
                    i = 0;
                    this.f29009Oooo0oO = null;
                    this.f29008Oooo0o = 3;
                    if (r9.OooO00o(r1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                ?? r3 = o00O0OO.this.f28983OooO00o;
                this.f29009Oooo0oO = th2;
                this.f29008Oooo0o = i;
                if (r3.OooO00o(r1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th2;
            }
        }
    }

    public o00O0OO(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(int i, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1, @NotNull Continuation<? super Unit> continuation) {
        OooO0OO oooO0OO;
        OooO00o e;
        o00O0OO o00o0oo2;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i2 = oooO0OO.f29003Oooo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0OO.f29003Oooo = i2 - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object obj = oooO0OO.f29005Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0OO.f29003Oooo;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                OooO0o oooO0o = new OooO0o(i, function1, null);
                oooO0OO.f29004Oooo0o = this;
                oooO0OO.f29003Oooo = 1;
                if (CoroutineScopeKt.coroutineScope(oooO0o, oooO0OO) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (OooO00o e2) {
                e = e2;
                o00o0oo2 = this;
                if (e.f28984Oooo0o != o00o0oo2) {
                    throw e;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o00o0oo2 = oooO0OO.f29004Oooo0o;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (OooO00o e3) {
                e = e3;
                if (e.f28984Oooo0o != o00o0oo2) {
                    throw e;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
