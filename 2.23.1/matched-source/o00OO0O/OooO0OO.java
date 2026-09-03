package o00OO0O;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.airbnb.lottie.compose.LottieCancellationBehavior;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Stable
public final class OooO0OO implements o00OO0O.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState f37160OooO0Oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState f37162OooO0o0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f37161OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState f37163OooO0oO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableState f37164OooO0oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableState f37159OooO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableState f37165OooOO0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final MutableState f37166OooOO0O = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.MIN_VALUE, null, 2, null);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final State f37167OooOO0o = SnapshotStateKt.derivedStateOf(new OooO0O0());

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final State f37169OooOOO0 = SnapshotStateKt.derivedStateOf(new C0423OooO0OO());

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final MutatorMutex f37168OooOOO = new MutatorMutex();

    @DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f37170OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f37171OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f37172OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f37173OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f37174OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f37175OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.OooOO0 f37176OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ float f37177OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f37178OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ LottieCancellationBehavior f37179OooOOO0;

        /* JADX INFO: renamed from: o00OO0O.OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$2", f = "LottieAnimatable.kt", i = {}, l = {240}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0421OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public final /* synthetic */ OooO0OO f37180OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f37181OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ Job f37182OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ LottieCancellationBehavior f37183OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ int f37184OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ int f37185OooO0oo;

            /* JADX INFO: renamed from: o00OO0O.OooO0OO$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public /* synthetic */ class C0422OooO00o {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LottieCancellationBehavior.values().length];
                    iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0421OooO00o(LottieCancellationBehavior lottieCancellationBehavior, Job job, int i, int i2, OooO0OO oooO0OO, Continuation<? super C0421OooO00o> continuation) {
                super(2, continuation);
                this.f37183OooO0o0 = lottieCancellationBehavior;
                this.f37182OooO0o = job;
                this.f37184OooO0oO = i;
                this.f37185OooO0oo = i2;
                this.f37180OooO = oooO0OO;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0421OooO00o(this.f37183OooO0o0, this.f37182OooO0o, this.f37184OooO0oO, this.f37185OooO0oo, this.f37180OooO, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0421OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002b  */
            /* JADX WARN: Code duplicated, block: B:17:0x0048 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:18:0x0049  */
            /* JADX WARN: Code duplicated, block: B:21:0x0055  */
            /* JADX WARN: Code duplicated, block: B:23:0x0058  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0049 -> B:19:0x004d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r6.f37181OooO0Oo
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    kotlin.ResultKt.throwOnFailure(r7)
                    r1 = r0
                    r0 = r6
                    goto L4d
                L11:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L19:
                    kotlin.ResultKt.throwOnFailure(r7)
                    r7 = r6
                L1d:
                    int[] r1 = o00OO0O.OooO0OO.OooO00o.C0421OooO00o.C0422OooO00o.$EnumSwitchMapping$0
                    com.airbnb.lottie.compose.LottieCancellationBehavior r3 = r7.f37183OooO0o0
                    int r3 = r3.ordinal()
                    r1 = r1[r3]
                    int r3 = r7.f37184OooO0oO
                    if (r1 != r2) goto L36
                    kotlinx.coroutines.Job r1 = r7.f37182OooO0o
                    boolean r1 = r1.isActive()
                    if (r1 == 0) goto L34
                    goto L36
                L34:
                    int r3 = r7.f37185OooO0oo
                L36:
                    r7.f37181OooO0Oo = r2
                    o00OO0O.OooO0OO r1 = r7.f37180OooO
                    r1.getClass()
                    o00OO0O.OooO0o r4 = new o00OO0O.OooO0o
                    r4.<init>(r1, r3)
                    java.lang.Object r1 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r4, r7)
                    if (r1 != r0) goto L49
                    return r0
                L49:
                    r5 = r0
                    r0 = r7
                    r7 = r1
                    r1 = r5
                L4d:
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r7 = r7.booleanValue()
                    if (r7 != 0) goto L58
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                L58:
                    r7 = r0
                    r0 = r1
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: o00OO0O.OooO0OO.OooO00o.C0421OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ class OooO0O0 {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LottieCancellationBehavior.values().length];
                iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
                iArr[LottieCancellationBehavior.Immediately.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(float f, OooO0OO oooO0OO, int i, int i2, OooOO0O oooOO0O, com.airbnb.lottie.OooOO0 oooOO1, float f2, boolean z, LottieCancellationBehavior lottieCancellationBehavior, Continuation<? super OooO00o> continuation) {
            super(1, continuation);
            this.f37173OooO0o0 = f;
            this.f37172OooO0o = oooO0OO;
            this.f37174OooO0oO = i;
            this.f37175OooO0oo = i2;
            this.f37170OooO = oooOO0O;
            this.f37176OooOO0 = oooOO1;
            this.f37177OooOO0O = f2;
            this.f37178OooOO0o = z;
            this.f37179OooOOO0 = lottieCancellationBehavior;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new OooO00o(this.f37173OooO0o0, this.f37172OooO0o, this.f37174OooO0oO, this.f37175OooO0oo, this.f37170OooO, this.f37176OooOO0, this.f37177OooOO0O, this.f37178OooOO0o, this.f37179OooOOO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((OooO00o) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineContext coroutineContext;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f37171OooO0Oo;
            OooO0OO oooO0OO = this.f37172OooO0o;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    float f = this.f37173OooO0o0;
                    if (!((Float.isInfinite(f) || Float.isNaN(f)) ? false : true)) {
                        throw new IllegalArgumentException(("Speed must be a finite number. It is " + f + '.').toString());
                    }
                    oooO0OO.f37161OooO0o.setValue(Integer.valueOf(this.f37174OooO0oO));
                    oooO0OO.f37163OooO0oO.setValue(Integer.valueOf(this.f37175OooO0oo));
                    oooO0OO.f37159OooO.setValue(Float.valueOf(f));
                    oooO0OO.f37164OooO0oo.setValue(this.f37170OooO);
                    MutableState mutableState = oooO0OO.f37165OooOO0;
                    com.airbnb.lottie.OooOO0 oooOO1 = this.f37176OooOO0;
                    mutableState.setValue(oooOO1);
                    oooO0OO.f37162OooO0o0.setValue(Float.valueOf(this.f37177OooOO0O));
                    if (!this.f37178OooOO0o) {
                        oooO0OO.f37166OooOO0O.setValue(Long.MIN_VALUE);
                    }
                    MutableState mutableState2 = oooO0OO.f37160OooO0Oo;
                    if (oooOO1 == null) {
                        mutableState2.setValue(Boolean.FALSE);
                        return Unit.INSTANCE;
                    }
                    mutableState2.setValue(Boolean.TRUE);
                    int i2 = OooO0O0.$EnumSwitchMapping$0[this.f37179OooOOO0.ordinal()];
                    if (i2 == 1) {
                        coroutineContext = NonCancellable.INSTANCE;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        coroutineContext = EmptyCoroutineContext.INSTANCE;
                    }
                    C0421OooO00o c0421OooO00o = new C0421OooO00o(this.f37179OooOOO0, JobKt.getJob(getContext()), this.f37175OooO0oo, this.f37174OooO0oO, this.f37172OooO0o, null);
                    this.f37171OooO0Oo = 1;
                    if (BuildersKt.withContext(coroutineContext, c0421OooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                JobKt.ensureActive(getContext());
                oooO0OO.f37160OooO0Oo.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                oooO0OO.f37160OooO0Oo.setValue(Boolean.FALSE);
                throw th;
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Float> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            OooO0OO oooO0OO = OooO0OO.this;
            float fOooO00o = 0.0f;
            if (oooO0OO.getComposition() != null) {
                if (oooO0OO.OooO0O0() < 0.0f) {
                    OooOO0O oooOO0OOooO0oO = oooO0OO.OooO0oO();
                    if (oooOO0OOooO0oO != null) {
                        fOooO00o = oooOO0OOooO0oO.OooO0O0();
                    }
                } else {
                    OooOO0O oooOO0OOooO0oO2 = oooO0OO.OooO0oO();
                    fOooO00o = oooOO0OOooO0oO2 == null ? 1.0f : oooOO0OOooO0oO2.OooO00o();
                }
            }
            return Float.valueOf(fOooO00o);
        }
    }

    /* JADX INFO: renamed from: o00OO0O.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C0423OooO0OO extends Lambda implements Function0<Boolean> {
        public C0423OooO0OO() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            OooO0OO oooO0OO = OooO0OO.this;
            boolean z = false;
            if (oooO0OO.OooO0o0() == ((Number) oooO0OO.f37163OooO0oO.getValue()).intValue()) {
                if (oooO0OO.OooO0Oo() == ((Number) oooO0OO.f37167OooOO0o.getValue()).floatValue()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f37189OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.OooOO0 f37190OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f37191OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f37192OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(com.airbnb.lottie.OooOO0 oooOO1, float f, int i, boolean z, Continuation<? super OooO0o> continuation) {
            super(1, continuation);
            this.f37190OooO0o0 = oooOO1;
            this.f37189OooO0o = f;
            this.f37191OooO0oO = i;
            this.f37192OooO0oo = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return OooO0OO.this.new OooO0o(this.f37190OooO0o0, this.f37189OooO0o, this.f37191OooO0oO, this.f37192OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((OooO0o) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            OooO0OO oooO0OO = OooO0OO.this;
            oooO0OO.f37165OooOO0.setValue(this.f37190OooO0o0);
            oooO0OO.f37162OooO0o0.setValue(Float.valueOf(this.f37189OooO0o));
            oooO0OO.f37161OooO0o.setValue(Integer.valueOf(this.f37191OooO0oO));
            oooO0OO.f37160OooO0Oo.setValue(Boolean.FALSE);
            if (this.f37192OooO0oo) {
                oooO0OO.f37166OooOO0O.setValue(Long.MIN_VALUE);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o00OO0O.OooO0O0
    @Nullable
    public final Object OooO00o(@Nullable com.airbnb.lottie.OooOO0 oooOO1, int i, int i2, float f, @Nullable OooOO0O oooOO0O, float f2, boolean z, @NotNull LottieCancellationBehavior lottieCancellationBehavior, @NotNull Continuation<? super Unit> continuation) {
        Object objMutate$default = MutatorMutex.mutate$default(this.f37168OooOOO, null, new OooO00o(f, this, i, i2, oooOO0O, oooOO1, f2, z, lottieCancellationBehavior, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OO0O.OooOO0
    public final float OooO0O0() {
        return ((Number) this.f37159OooO.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OO0O.OooOO0
    public final float OooO0Oo() {
        return ((Number) this.f37162OooO0o0.getValue()).floatValue();
    }

    @Override // o00OO0O.OooO0O0
    @Nullable
    public final Object OooO0o(@Nullable com.airbnb.lottie.OooOO0 oooOO1, float f, int i, boolean z, @NotNull Continuation<? super Unit> continuation) {
        Object objMutate$default = MutatorMutex.mutate$default(this.f37168OooOOO, null, new OooO0o(oooOO1, f, i, z, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OO0O.OooOO0
    public final int OooO0o0() {
        return ((Number) this.f37161OooO0o.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OO0O.OooOO0
    @Nullable
    public final OooOO0O OooO0oO() {
        return (OooOO0O) this.f37164OooO0oo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OO0O.OooOO0
    @Nullable
    public final com.airbnb.lottie.OooOO0 getComposition() {
        return (com.airbnb.lottie.OooOO0) this.f37165OooOO0.getValue();
    }

    @Override // androidx.compose.runtime.State
    public final Float getValue() {
        return Float.valueOf(OooO0Oo());
    }
}
