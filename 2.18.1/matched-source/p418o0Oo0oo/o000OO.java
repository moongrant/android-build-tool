package p418o0Oo0oo;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.o00OOOOo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import o0000O0O.OooO;
import o0000O0O.o000oOoO;
import o00O0O.OooOo;
import o00O0O.OooOo00;
import o0O0O00.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p036OoooOOO.o000OOo;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO extends o000000 implements o000000O, o00000, OooO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ OooO f39691Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final o00OOOOo f39692Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public o00Oo0 f39693OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final o000OOo<OooO00o<?>> f39694OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public o00Oo0 f39695OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final o000OOo<OooO00o<?>> f39696OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public long f39697OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public CoroutineScope f39698o000oOoO;

    public final class OooO00o<R> implements OooOOO, OooO, Continuation<R> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @NotNull
        public PointerEventPass f39699Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final Continuation<R> f39700Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000OO f39701Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @Nullable
        public CancellableContinuation<? super o00Oo0> f39702Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o000OO f39703OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @NotNull
        public final EmptyCoroutineContext f39704OoooO00;

        /* JADX INFO: renamed from: o0Oo0oo.o000OO$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {0}, l = {625}, m = "withTimeout", n = {"job"}, s = {"L$0"})
        public static final class C0383OooO00o<T> extends ContinuationImpl {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public int f39705Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public Job f39706Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public /* synthetic */ Object f39707Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ OooO00o<R> f39708Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0383OooO00o(OooO00o<R> oooO00o, Continuation<? super C0383OooO00o> continuation) {
                super(continuation);
                this.f39708Oooo0oo = oooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f39707Oooo0oO = obj;
                this.f39705Oooo |= Integer.MIN_VALUE;
                return this.f39708Oooo0oo.o00O0O(0L, null, this);
            }
        }

        @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {617, 618}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f39709Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ long f39710Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ OooO00o<R> f39711Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(long j, OooO00o<R> oooO00o, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f39710Oooo0oO = j;
                this.f39711Oooo0oo = oooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f39710Oooo0oO, this.f39711Oooo0oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:18:0x003e  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                CancellableContinuation<? super o00Oo0> cancellableContinuation;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f39709Oooo0o;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    cancellableContinuation = this.f39711Oooo0oo.f39702Oooo0oo;
                    if (cancellableContinuation != null) {
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m502constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(this.f39710Oooo0oO))));
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                long j = this.f39710Oooo0oO - 1;
                this.f39709Oooo0o = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.f39709Oooo0o = 2;
                if (DelayKt.delay(1L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cancellableContinuation = this.f39711Oooo0oo.f39702Oooo0oo;
                if (cancellableContinuation != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m502constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(this.f39710Oooo0oO))));
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {}, l = {597}, m = "withTimeoutOrNull", n = {}, s = {})
        public static final class OooO0OO<T> extends ContinuationImpl {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public /* synthetic */ Object f39712Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ OooO00o<R> f39713Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public int f39714Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(OooO00o<R> oooO00o, Continuation<? super OooO0OO> continuation) {
                super(continuation);
                this.f39713Oooo0oO = oooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f39712Oooo0o = obj;
                this.f39714Oooo0oo |= Integer.MIN_VALUE;
                return this.f39713Oooo0oO.Oooo0o0(0L, null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(@NotNull o000OO o000oo2, Continuation<? super R> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            this.f39703OoooO0 = o000oo2;
            this.f39700Oooo0o = completion;
            this.f39701Oooo0oO = o000oo2;
            this.f39699Oooo = PointerEventPass.Main;
            this.f39704OoooO00 = EmptyCoroutineContext.INSTANCE;
        }

        @Override // p418o0Oo0oo.OooOOO
        public final long OooO00o() {
            return this.f39703OoooO0.f39697OoooOO0;
        }

        @Override // o0000O0O.OooO
        @Stable
        public final float OooO0o0(int i) {
            return this.f39701Oooo0oO.OooO0o0(i);
        }

        public final void OooOOO(@NotNull o00Oo0 event, @NotNull PointerEventPass pass) {
            CancellableContinuation<? super o00Oo0> cancellableContinuation;
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(pass, "pass");
            if (pass != this.f39699Oooo || (cancellableContinuation = this.f39702Oooo0oo) == null) {
                return;
            }
            this.f39702Oooo0oo = null;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m502constructorimpl(event));
        }

        @Override // p418o0Oo0oo.OooOOO
        @Nullable
        public final Object OooOo0(@NotNull PointerEventPass pointerEventPass, @NotNull Continuation<? super o00Oo0> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.f39699Oooo = pointerEventPass;
            this.f39702Oooo0oo = cancellableContinuationImpl;
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        @Override // p418o0Oo0oo.OooOOO
        @NotNull
        public final o00Oo0 OooOoO0() {
            return this.f39703OoooO0.f39695OoooO00;
        }

        @Override // o0000O0O.OooO
        @Stable
        public final long OooOoOO(float f) {
            return this.f39701Oooo0oO.OooOoOO(f);
        }

        @Override // o0000O0O.OooO
        @Stable
        public final long OooOoo0(long j) {
            return this.f39701Oooo0oO.OooOoo0(j);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p418o0Oo0oo.OooOOO
        @Nullable
        public final <T> Object Oooo0o0(long j, @NotNull Function2<? super OooOOO, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
            OooO0OO oooO0OO;
            if (continuation instanceof OooO0OO) {
                oooO0OO = (OooO0OO) continuation;
                int i = oooO0OO.f39714Oooo0oo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    oooO0OO.f39714Oooo0oo = i - Integer.MIN_VALUE;
                } else {
                    oooO0OO = new OooO0OO(this, continuation);
                }
            } else {
                oooO0OO = new OooO0OO(this, continuation);
            }
            Object objO00O0O = oooO0OO.f39712Oooo0o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = oooO0OO.f39714Oooo0oo;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objO00O0O);
                    oooO0OO.f39714Oooo0oo = 1;
                    objO00O0O = o00O0O(j, function2, oooO0OO);
                    if (objO00O0O == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objO00O0O);
                }
                return objO00O0O;
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
        }

        @Override // o0000O0O.OooO
        @Stable
        public final float OoooOO0(float f) {
            return this.f39701Oooo0oO.OoooOO0(f);
        }

        @Override // o0000O0O.OooO
        public final float OoooOOo() {
            return this.f39701Oooo0oO.OoooOOo();
        }

        @Override // o0000O0O.OooO
        @Stable
        public final float OoooOoo(float f) {
            return this.f39701Oooo0oO.OoooOoo(f);
        }

        @Override // p418o0Oo0oo.OooOOO
        public final long OooooO0() {
            o000OO o000oo2 = this.f39703OoooO0;
            long jO00ooo = o000oo2.o00ooo(o000oo2.f39692Oooo0oo.OooO0Oo());
            Oooo000 oooo000 = o000oo2.f39668Oooo0o;
            long jOooO00o = oooo000 != null ? oooo000.OooO00o() : 0L;
            return OooOo.OooO00o(Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, OooOo00.OooO0Oo(jO00ooo) - ((int) (jOooO00o >> 32))) / 2.0f, Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, OooOo00.OooO0O0(jO00ooo) - o000oOoO.OooO0O0(jOooO00o)) / 2.0f);
        }

        @Override // o0000O0O.OooO
        @Stable
        public final int OooooOO(long j) {
            return this.f39701Oooo0oO.OooooOO(j);
        }

        @Override // o0000O0O.OooO
        @Stable
        public final int OoooooO(float f) {
            return this.f39701Oooo0oO.OoooooO(f);
        }

        @Override // kotlin.coroutines.Continuation
        @NotNull
        public final CoroutineContext getContext() {
            return this.f39704OoooO00;
        }

        @Override // o0000O0O.OooO
        public final float getDensity() {
            return this.f39701Oooo0oO.getDensity();
        }

        @Override // p418o0Oo0oo.OooOOO
        @NotNull
        public final o00OOOOo getViewConfiguration() {
            return this.f39703OoooO0.f39692Oooo0oo;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0, types: [long] */
        /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v7 */
        @Override // p418o0Oo0oo.OooOOO
        @Nullable
        public final <T> Object o00O0O(long j, @NotNull Function2<? super OooOOO, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
            C0383OooO00o c0383OooO00o;
            CancellableContinuation<? super o00Oo0> cancellableContinuation;
            if (continuation instanceof C0383OooO00o) {
                c0383OooO00o = (C0383OooO00o) continuation;
                int i = c0383OooO00o.f39705Oooo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0383OooO00o.f39705Oooo = i - Integer.MIN_VALUE;
                } else {
                    c0383OooO00o = new C0383OooO00o(this, continuation);
                }
            } else {
                c0383OooO00o = new C0383OooO00o(this, continuation);
            }
            Object objInvoke = c0383OooO00o.f39707Oooo0oO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c0383OooO00o.f39705Oooo;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objInvoke);
                    if (j <= 0 && (cancellableContinuation = this.f39702Oooo0oo) != null) {
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m502constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(j))));
                    }
                    Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.f39703OoooO0.f39698o000oOoO, null, null, new OooO0O0(j, this, null), 3, null);
                    c0383OooO00o.f39706Oooo0o = jobLaunch$default;
                    c0383OooO00o.f39705Oooo = 1;
                    objInvoke = function2.invoke(this, c0383OooO00o);
                    j = jobLaunch$default;
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Job job = c0383OooO00o.f39706Oooo0o;
                    ResultKt.throwOnFailure(objInvoke);
                    j = job;
                }
                Job.DefaultImpls.cancel$default((Job) j, (CancellationException) null, 1, (Object) null);
                return objInvoke;
            } catch (Throwable th) {
                Job.DefaultImpls.cancel$default((Job) j, (CancellationException) null, 1, (Object) null);
                throw th;
            }
        }

        @Override // o0000O0O.OooO
        @Stable
        public final long o00ooo(long j) {
            return this.f39701Oooo0oO.o00ooo(j);
        }

        @Override // o0000O0O.OooO
        @Stable
        public final float oo000o(long j) {
            return this.f39701Oooo0oO.oo000o(j);
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(@NotNull Object obj) {
            o000OO o000oo2 = this.f39703OoooO0;
            synchronized (o000oo2.f39694OoooO0) {
                o000oo2.f39694OoooO0.OooOO0O(this);
                Unit unit = Unit.INSTANCE;
            }
            this.f39700Oooo0o.resumeWith(obj);
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            iArr[PointerEventPass.Initial.ordinal()] = 1;
            iArr[PointerEventPass.Final.ordinal()] = 2;
            iArr[PointerEventPass.Main.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooO00o<R> f39715Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO00o<R> oooO00o) {
            super(1);
            this.f39715Oooo0o = oooO00o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Throwable th2 = th;
            OooO00o<R> oooO00o = this.f39715Oooo0o;
            CancellableContinuation<? super o00Oo0> cancellableContinuation = oooO00o.f39702Oooo0oo;
            if (cancellableContinuation != null) {
                cancellableContinuation.cancel(th2);
            }
            oooO00o.f39702Oooo0oo = null;
            return Unit.INSTANCE;
        }
    }

    public o000OO(@NotNull o00OOOOo viewConfiguration, @NotNull OooO density) {
        Intrinsics.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f39692Oooo0oo = viewConfiguration;
        this.f39691Oooo = density;
        this.f39695OoooO00 = SuspendingPointerInputFilterKt.f6100OooO00o;
        this.f39694OoooO0 = new o000OOo<>(new OooO00o[16]);
        this.f39696OoooO0O = new o000OOo<>(new OooO00o[16]);
        this.f39697OoooOO0 = 0L;
        this.f39698o000oOoO = GlobalScope.INSTANCE;
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float OooO0o0(int i) {
        return this.f39691Oooo.OooO0o0(i);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final long OooOoOO(float f) {
        return this.f39691Oooo.OooOoOO(f);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final long OooOoo0(long j) {
        return this.f39691Oooo.OooOoo0(j);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // p418o0Oo0oo.o00000
    @Nullable
    public final <R> Object Oooo0OO(@NotNull Function2<? super OooOOO, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        OooO00o oooO00o = new OooO00o(this, cancellableContinuationImpl);
        synchronized (this.f39694OoooO0) {
            this.f39694OoooO0.OooO0O0(oooO00o);
            Continuation<Unit> continuationCreateCoroutine = ContinuationKt.createCoroutine(function2, oooO00o, oooO00o);
            Result.Companion companion = Result.INSTANCE;
            continuationCreateCoroutine.resumeWith(Result.m502constructorimpl(Unit.INSTANCE));
        }
        cancellableContinuationImpl.invokeOnCancellation(new OooO0OO(oooO00o));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // p418o0Oo0oo.o000000O
    @NotNull
    public final o000000 OoooO00() {
        return this;
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float OoooOO0(float f) {
        return this.f39691Oooo.OoooOO0(f);
    }

    @Override // o0000O0O.OooO
    public final float OoooOOo() {
        return this.f39691Oooo.OoooOOo();
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float OoooOoo(float f) {
        return this.f39691Oooo.OoooOoo(f);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final int OooooOO(long j) {
        return this.f39691Oooo.OooooOO(j);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return p048OoooooO.o00OOOOo.OooO00o(this, function1);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final int OoooooO(float f) {
        return this.f39691Oooo.OoooooO(f);
    }

    @Override // o0000O0O.OooO
    public final float getDensity() {
        return this.f39691Oooo.getDensity();
    }

    @Override // p418o0Oo0oo.o00000
    @NotNull
    public final o00OOOOo getViewConfiguration() {
        return this.f39692Oooo0oo;
    }

    public final void o000OOo(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<set-?>");
        this.f39698o000oOoO = coroutineScope;
    }

    @Override // o0000O0O.OooO
    @Stable
    public final long o00ooo(long j) {
        return this.f39691Oooo.o00ooo(j);
    }

    public final void o0O0O00(o00Oo0 o00oo1, PointerEventPass pointerEventPass) {
        o000OOo<OooO00o<?>> o000ooo2;
        int i;
        synchronized (this.f39694OoooO0) {
            o000OOo<OooO00o<?>> o000ooo3 = this.f39696OoooO0O;
            o000ooo3.OooO0OO(o000ooo3.f3664Oooo0oo, this.f39694OoooO0);
        }
        try {
            int i2 = OooO0O0.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i2 == 1 || i2 == 2) {
                o000OOo<OooO00o<?>> o000ooo4 = this.f39696OoooO0O;
                int i3 = o000ooo4.f3664Oooo0oo;
                if (i3 > 0) {
                    int i4 = 0;
                    OooO00o<?>[] oooO00oArr = o000ooo4.f3662Oooo0o;
                    do {
                        oooO00oArr[i4].OooOOO(o00oo1, pointerEventPass);
                        i4++;
                    } while (i4 < i3);
                }
            } else if (i2 == 3 && (i = (o000ooo2 = this.f39696OoooO0O).f3664Oooo0oo) > 0) {
                int i5 = i - 1;
                OooO00o<?>[] oooO00oArr2 = o000ooo2.f3662Oooo0o;
                do {
                    oooO00oArr2[i5].OooOOO(o00oo1, pointerEventPass);
                    i5--;
                } while (i5 >= 0);
            }
        } finally {
            this.f39696OoooO0O.OooO0o0();
        }
    }

    @Override // p418o0Oo0oo.o000000
    public final void o0OO00O() {
        boolean z;
        o00Oo0 o00oo1 = this.f39693OoooO;
        if (o00oo1 == null) {
            return;
        }
        List<o0Oo0oo> list = o00oo1.f39723OooO00o;
        int size = list.size();
        int i = 0;
        while (true) {
            z = true;
            if (i >= size) {
                break;
            }
            if (!(true ^ list.get(i).f39745OooO0Oo)) {
                z = false;
                break;
            }
            i++;
        }
        if (z) {
            return;
        }
        List<o0Oo0oo> list2 = o00oo1.f39723OooO00o;
        ArrayList changes = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            o0Oo0oo o0oo0oo2 = list2.get(i2);
            long j = o0oo0oo2.f39742OooO00o;
            long j2 = o0oo0oo2.f39744OooO0OO;
            long j3 = o0oo0oo2.f39743OooO0O0;
            boolean z2 = o0oo0oo2.f39745OooO0Oo;
            o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
            changes.add(new o0Oo0oo(j, j3, j2, false, j3, j2, z2, z2, 1, o00O0O.OooO.f30392OooO0OO));
        }
        Intrinsics.checkNotNullParameter(changes, "changes");
        o00Oo0 o00oo2 = new o00Oo0(changes, null);
        this.f39695OoooO00 = o00oo2;
        o0O0O00(o00oo2, PointerEventPass.Initial);
        o0O0O00(o00oo2, PointerEventPass.Main);
        o0O0O00(o00oo2, PointerEventPass.Final);
        this.f39693OoooO = null;
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float oo000o(long j) {
        return this.f39691Oooo.oo000o(j);
    }

    @Override // p418o0Oo0oo.o000000
    public final void oo0o0Oo(@NotNull o00Oo0 pointerEvent, @NotNull PointerEventPass pass, long j) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.f39697OoooOO0 = j;
        if (pass == PointerEventPass.Initial) {
            this.f39695OoooO00 = pointerEvent;
        }
        o0O0O00(pointerEvent, pass);
        List<o0Oo0oo> list = pointerEvent.f39723OooO00o;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!o00Ooo.OooO0Oo(list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        if (!(!z)) {
            pointerEvent = null;
        }
        this.f39693OoooO = pointerEvent;
    }
}
