package p101o000oo;

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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f35589OooO00o;

    public static final class OooO00o extends CancellationException {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final oo0o0O0 f35590OooO0Oo;

        public OooO00o(@NotNull oo0o0O0 runner) {
            Intrinsics.checkNotNullParameter(runner, "runner");
            this.f35590OooO0Oo = runner;
        }
    }

    @SourceDebugExtension({"SMAP\nSingleRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleRunner.kt\nandroidx/paging/SingleRunner$Holder\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,123:1\n107#2,10:124\n107#2,10:134\n*S KotlinDebug\n*F\n+ 1 SingleRunner.kt\nandroidx/paging/SingleRunner$Holder\n*L\n92#1:124,10\n111#1:134,10\n*E\n"})
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final oo0o0O0 f35591OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f35592OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final Mutex f35593OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public Job f35594OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f35595OooO0o0;

        @DebugMetadata(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", i = {0, 0, 0}, l = {Constants.ERR_WATERMARK_READ}, m = "onFinish", n = {"this", "job", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
        public static final class OooO00o extends ContinuationImpl {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public int f35596OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public OooO0O0 f35597OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public Mutex f35598OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Job f35599OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public /* synthetic */ Object f35600OooO0oO;

            public OooO00o(Continuation<? super OooO00o> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f35600OooO0oO = obj;
                this.f35596OooO |= Integer.MIN_VALUE;
                return OooO0O0.this.OooO00o(null, this);
            }
        }

        /* JADX INFO: renamed from: o000oo.oo0o0O0$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {Constants.ERR_WATERMARK_READ, 100}, m = "tryEnqueue", n = {"this", "job", "$this$withLock_u24default$iv", "priority", "this", "job", "$this$withLock_u24default$iv", "priority"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"})
        public static final class C0410OooO0O0 extends ContinuationImpl {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public OooO0O0 f35603OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public Mutex f35604OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Job f35605OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public int f35606OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public /* synthetic */ Object f35607OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public int f35608OooOO0;

            public C0410OooO0O0(Continuation<? super C0410OooO0O0> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f35607OooO0oo = obj;
                this.f35608OooOO0 |= Integer.MIN_VALUE;
                return OooO0O0.this.OooO0O0(0, null, this);
            }
        }

        public OooO0O0(@NotNull oo0o0O0 singleRunner, boolean z) {
            Intrinsics.checkNotNullParameter(singleRunner, "singleRunner");
            this.f35591OooO00o = singleRunner;
            this.f35592OooO0O0 = z;
            this.f35593OooO0OO = MutexKt.Mutex$default(false, 1, null);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final Object OooO00o(@NotNull Job job, @NotNull Continuation<? super Unit> continuation) {
            OooO00o oooO00o;
            Mutex mutex;
            OooO0O0 oooO0O0;
            if (continuation instanceof OooO00o) {
                oooO00o = (OooO00o) continuation;
                int i = oooO00o.f35596OooO;
                if ((i & Integer.MIN_VALUE) != 0) {
                    oooO00o.f35596OooO = i - Integer.MIN_VALUE;
                } else {
                    oooO00o = new OooO00o(continuation);
                }
            } else {
                oooO00o = new OooO00o(continuation);
            }
            Object obj = oooO00o.f35600OooO0oO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = oooO00o.f35596OooO;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                oooO00o.f35597OooO0Oo = this;
                oooO00o.f35599OooO0o0 = job;
                mutex = this.f35593OooO0OO;
                oooO00o.f35598OooO0o = mutex;
                oooO00o.f35596OooO = 1;
                if (mutex.lock(null, oooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooO0O0 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Mutex mutex2 = oooO00o.f35598OooO0o;
                Job job2 = oooO00o.f35599OooO0o0;
                oooO0O0 = oooO00o.f35597OooO0Oo;
                ResultKt.throwOnFailure(obj);
                mutex = mutex2;
                job = job2;
            }
            try {
                if (job == oooO0O0.f35594OooO0Oo) {
                    oooO0O0.f35594OooO0Oo = null;
                }
                Unit unit = Unit.INSTANCE;
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
            C0410OooO0O0 c0410OooO0O0;
            OooO0O0 oooO0O0;
            ?? r2;
            Mutex mutex;
            ?? r1;
            OooO0O0 oooO0O1;
            int i2;
            if (continuation instanceof C0410OooO0O0) {
                c0410OooO0O0 = (C0410OooO0O0) continuation;
                int i3 = c0410OooO0O0.f35608OooOO0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c0410OooO0O0.f35608OooOO0 = i3 - Integer.MIN_VALUE;
                } else {
                    c0410OooO0O0 = new C0410OooO0O0(continuation);
                }
            } else {
                c0410OooO0O0 = new C0410OooO0O0(continuation);
            }
            Object obj = c0410OooO0O0.f35607OooO0oo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = c0410OooO0O0.f35608OooOO0;
            boolean z = true;
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        i = c0410OooO0O0.f35606OooO0oO;
                        Mutex mutex2 = c0410OooO0O0.f35604OooO0o;
                        Job job2 = c0410OooO0O0.f35605OooO0o0;
                        oooO0O0 = c0410OooO0O0.f35603OooO0Oo;
                        ResultKt.throwOnFailure(obj);
                        r2 = job2;
                        mutex = mutex2;
                    } else {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i = c0410OooO0O0.f35606OooO0oO;
                        Mutex mutex3 = c0410OooO0O0.f35604OooO0o;
                        Job job3 = c0410OooO0O0.f35605OooO0o0;
                        oooO0O1 = c0410OooO0O0.f35603OooO0Oo;
                        ResultKt.throwOnFailure(obj);
                        r1 = job3;
                        mutex = mutex3;
                    }
                    oooO0O0 = oooO0O1;
                    r2 = r1;
                    oooO0O0.f35594OooO0Oo = r2;
                    oooO0O0.f35595OooO0o0 = i;
                    job = mutex;
                    Boolean boolBoxBoolean = Boxing.boxBoolean(z);
                    job.unlock(null);
                    return boolBoxBoolean;
                }
                ResultKt.throwOnFailure(obj);
                c0410OooO0O0.f35603OooO0Oo = this;
                c0410OooO0O0.f35605OooO0o0 = job;
                Mutex mutex4 = this.f35593OooO0OO;
                c0410OooO0O0.f35604OooO0o = mutex4;
                c0410OooO0O0.f35606OooO0oO = i;
                c0410OooO0O0.f35608OooOO0 = 1;
                if (mutex4.lock(null, c0410OooO0O0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooO0O0 = this;
                r2 = job;
                mutex = mutex4;
                Job job4 = oooO0O0.f35594OooO0Oo;
                if (job4 == null || !job4.isActive() || (i2 = oooO0O0.f35595OooO0o0) < i || (i2 == i && oooO0O0.f35592OooO0O0)) {
                    if (job4 != null) {
                        job4.cancel((CancellationException) new OooO00o(oooO0O0.f35591OooO00o));
                    }
                    if (job4 != null) {
                        c0410OooO0O0.f35603OooO0Oo = oooO0O0;
                        c0410OooO0O0.f35605OooO0o0 = r2;
                        c0410OooO0O0.f35604OooO0o = mutex;
                        c0410OooO0O0.f35606OooO0oO = i;
                        c0410OooO0O0.f35608OooOO0 = 2;
                        if (job4.join(c0410OooO0O0) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r1 = r2;
                        oooO0O1 = oooO0O0;
                        mutex = mutex;
                        oooO0O0 = oooO0O1;
                        r2 = r1;
                    }
                    oooO0O0.f35594OooO0Oo = r2;
                    oooO0O0.f35595OooO0o0 = i;
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public oo0o0O0 f35609OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f35611OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f35612OooO0oO;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35611OooO0o0 = obj;
            this.f35612OooO0oO |= Integer.MIN_VALUE;
            return oo0o0O0.this.OooO00o(0, null, this);
        }
    }

    @DebugMetadata(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", i = {0, 1}, l = {53, 59, 61, 61}, m = "invokeSuspend", n = {"myJob", "myJob"}, s = {"L$0", "L$0"})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f35613OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f35615OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f35616OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Continuation<? super Unit>, Object> f35617OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(int i, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f35616OooO0oO = i;
            this.f35617OooO0oo = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = oo0o0O0.this.new OooO0o(this.f35616OooO0oO, this.f35617OooO0oo, continuation);
            oooO0o.f35615OooO0o0 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0087 A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v8, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r3v1, types: [o000oo.oo0o0O0$OooO0O0] */
        /* JADX WARN: Type inference failed for: r9v14, types: [o000oo.oo0o0O0$OooO0O0] */
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
            ?? r1 = this.f35613OooO0Oo;
            int i = 4;
            oo0o0O0 oo0o0o0 = oo0o0O0.this;
            try {
                if (r1 != 0) {
                    if (r1 == 1) {
                        Job job2 = (Job) this.f35615OooO0o0;
                        ResultKt.throwOnFailure(obj);
                        job = job2;
                    } else if (r1 == 2) {
                        Job job3 = (Job) this.f35615OooO0o0;
                        ResultKt.throwOnFailure(obj);
                        r1 = job3;
                        r1 = job;
                        r9 = oo0o0o0.f35589OooO00o;
                        i = 0;
                        this.f35615OooO0o0 = null;
                        this.f35613OooO0Oo = 3;
                        if (r9.OooO00o(r1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (r1 != 3) {
                            if (r1 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) this.f35615OooO0o0;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                CoroutineContext.Element element = ((CoroutineScope) this.f35615OooO0o0).getCoroutineContext().get(Job.INSTANCE);
                if (element == null) {
                    throw new IllegalStateException("Internal error. coroutineScope should've created a job.".toString());
                }
                Job job4 = (Job) element;
                OooO0O0 oooO0O0 = oo0o0o0.f35589OooO00o;
                this.f35615OooO0o0 = job4;
                this.f35613OooO0Oo = 1;
                Object objOooO0O0 = oooO0O0.OooO0O0(this.f35616OooO0oO, job4, this);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                job = job4;
                obj = objOooO0O0;
                if (((Boolean) obj).booleanValue()) {
                    Function1<Continuation<? super Unit>, Object> function1 = this.f35617OooO0oo;
                    this.f35615OooO0o0 = job;
                    this.f35613OooO0Oo = 2;
                    if (function1.invoke(this) == coroutine_suspended) {
                        r1 = job;
                        return coroutine_suspended;
                    }
                    r1 = job;
                    r9 = oo0o0o0.f35589OooO00o;
                    i = 0;
                    this.f35615OooO0o0 = null;
                    this.f35613OooO0Oo = 3;
                    if (r9.OooO00o(r1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                ?? r3 = oo0o0o0.f35589OooO00o;
                this.f35615OooO0o0 = th2;
                this.f35613OooO0Oo = i;
                if (r3.OooO00o(r1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th2;
            }
        }
    }

    public oo0o0O0(boolean z) {
        this.f35589OooO00o = new OooO0O0(this, z);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(int i, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1, @NotNull Continuation<? super Unit> continuation) {
        OooO0OO oooO0OO;
        OooO00o e;
        oo0o0O0 oo0o0o0;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i2 = oooO0OO.f35612OooO0oO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0OO.f35612OooO0oO = i2 - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object obj = oooO0OO.f35611OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0OO.f35612OooO0oO;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                OooO0o oooO0o = new OooO0o(i, function1, null);
                oooO0OO.f35609OooO0Oo = this;
                oooO0OO.f35612OooO0oO = 1;
                if (CoroutineScopeKt.coroutineScope(oooO0o, oooO0OO) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (OooO00o e2) {
                e = e2;
                oo0o0o0 = this;
                if (e.f35590OooO0Oo != oo0o0o0) {
                    throw e;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oo0o0o0 = oooO0OO.f35609OooO0Oo;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (OooO00o e3) {
                e = e3;
                if (e.f35590OooO0Oo != oo0o0o0) {
                    throw e;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
