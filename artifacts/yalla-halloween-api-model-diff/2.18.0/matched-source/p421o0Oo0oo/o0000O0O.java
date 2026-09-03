package p421o0Oo0oo;

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
import o0O0O00.Oooo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p036OoooOOO.o000OOo;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O extends o000OOo implements o000000, o000000O, OooO {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public o00Oo0 f39705OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final o00OOOOo f39706OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ OooO f39707OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final o000OOo<OooO00o<?>> f39708OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public o00Oo0 f39709OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public long f39710OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public CoroutineScope f39711OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final o000OOo<OooO00o<?>> f39712o000oOoO;

    public final class OooO00o<R> implements OooOOO, OooO, Continuation<R> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @NotNull
        public final Continuation<R> f39713Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        @NotNull
        public final EmptyCoroutineContext f39714OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        @Nullable
        public CancellableContinuation<? super o00Oo0> f39715OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0000O0O f39716OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        @NotNull
        public PointerEventPass f39717OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ o0000O0O f39718OoooOO0;

        /* JADX INFO: renamed from: o0Oo0oo.o0000O0O$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {0}, l = {625}, m = "withTimeout", n = {"job"}, s = {"L$0"})
        public static final class C0383OooO00o<T> extends ContinuationImpl {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public Job f39719Oooo;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public final /* synthetic */ OooO00o<R> f39720OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public /* synthetic */ Object f39721OoooO00;

            /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
            public int f39722OoooO0O;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0383OooO00o(OooO00o<R> oooO00o, Continuation<? super C0383OooO00o> continuation) {
                super(continuation);
                this.f39720OoooO0 = oooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f39721OoooO00 = obj;
                this.f39722OoooO0O |= Integer.MIN_VALUE;
                return this.f39720OoooO0.o00O0O(0L, null, this);
            }
        }

        @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {617, 618}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public int f39723Oooo;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public final /* synthetic */ OooO00o<R> f39724OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ long f39725OoooO00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(long j, OooO00o<R> oooO00o, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f39725OoooO00 = j;
                this.f39724OoooO0 = oooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f39725OoooO00, this.f39724OoooO0, continuation);
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
                int i = this.f39723Oooo;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    cancellableContinuation = this.f39724OoooO0.f39715OoooO0;
                    if (cancellableContinuation != null) {
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m502constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(this.f39725OoooO00))));
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                long j = this.f39725OoooO00 - 1;
                this.f39723Oooo = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.f39723Oooo = 2;
                if (DelayKt.delay(1L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cancellableContinuation = this.f39724OoooO0.f39715OoooO0;
                if (cancellableContinuation != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m502constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(this.f39725OoooO00))));
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {}, l = {597}, m = "withTimeoutOrNull", n = {}, s = {})
        public static final class OooO0OO<T> extends ContinuationImpl {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public /* synthetic */ Object f39726Oooo;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public int f39727OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ OooO00o<R> f39728OoooO00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(OooO00o<R> oooO00o, Continuation<? super OooO0OO> continuation) {
                super(continuation);
                this.f39728OoooO00 = oooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f39726Oooo = obj;
                this.f39727OoooO0 |= Integer.MIN_VALUE;
                return this.f39728OoooO00.Oooo0o0(0L, null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(@NotNull o0000O0O o0000o0o2, Continuation<? super R> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            this.f39718OoooOO0 = o0000o0o2;
            this.f39713Oooo = completion;
            this.f39716OoooO00 = o0000o0o2;
            this.f39717OoooO0O = PointerEventPass.Main;
            this.f39714OoooO = EmptyCoroutineContext.INSTANCE;
        }

        @Override // p421o0Oo0oo.OooOOO
        public final long OooO00o() {
            return this.f39718OoooOO0.f39710OoooOOo;
        }

        @Override // o0000O0O.OooO
        @Stable
        public final float OooO0o0(int i) {
            return this.f39716OoooO00.OooO0o0(i);
        }

        public final void OooOOO(@NotNull o00Oo0 event, @NotNull PointerEventPass pass) {
            CancellableContinuation<? super o00Oo0> cancellableContinuation;
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(pass, "pass");
            if (pass != this.f39717OoooO0O || (cancellableContinuation = this.f39715OoooO0) == null) {
                return;
            }
            this.f39715OoooO0 = null;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m502constructorimpl(event));
        }

        @Override // p421o0Oo0oo.OooOOO
        @Nullable
        public final Object OooOo0(@NotNull PointerEventPass pointerEventPass, @NotNull Continuation<? super o00Oo0> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.f39717OoooO0O = pointerEventPass;
            this.f39715OoooO0 = cancellableContinuationImpl;
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        @Override // p421o0Oo0oo.OooOOO
        @NotNull
        public final o00Oo0 OooOoO0() {
            return this.f39718OoooOO0.f39705OoooO;
        }

        @Override // o0000O0O.OooO
        @Stable
        public final long OooOoOO(float f) {
            return this.f39716OoooO00.OooOoOO(f);
        }

        @Override // o0000O0O.OooO
        @Stable
        public final long OooOoo0(long j) {
            return this.f39716OoooO00.OooOoo0(j);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p421o0Oo0oo.OooOOO
        @Nullable
        public final <T> Object Oooo0o0(long j, @NotNull Function2<? super OooOOO, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
            OooO0OO oooO0OO;
            if (continuation instanceof OooO0OO) {
                oooO0OO = (OooO0OO) continuation;
                int i = oooO0OO.f39727OoooO0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    oooO0OO.f39727OoooO0 = i - Integer.MIN_VALUE;
                } else {
                    oooO0OO = new OooO0OO(this, continuation);
                }
            } else {
                oooO0OO = new OooO0OO(this, continuation);
            }
            Object objO00O0O = oooO0OO.f39726Oooo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = oooO0OO.f39727OoooO0;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objO00O0O);
                    oooO0OO.f39727OoooO0 = 1;
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
            return this.f39716OoooO00.OoooOO0(f);
        }

        @Override // o0000O0O.OooO
        public final float OoooOOo() {
            return this.f39716OoooO00.OoooOOo();
        }

        @Override // o0000O0O.OooO
        @Stable
        public final float OoooOoo(float f) {
            return this.f39716OoooO00.OoooOoo(f);
        }

        @Override // p421o0Oo0oo.OooOOO
        public final long OooooO0() {
            o0000O0O o0000o0o2 = this.f39718OoooOO0;
            long jO00ooo = o0000o0o2.o00ooo(o0000o0o2.f39706OoooO0.OooO0Oo());
            Oooo0 oooo0 = o0000o0o2.f39734Oooo;
            long jOooO00o = oooo0 != null ? oooo0.OooO00o() : 0L;
            return OooOo.OooO00o(Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, OooOo00.OooO0Oo(jO00ooo) - ((int) (jOooO00o >> 32))) / 2.0f, Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, OooOo00.OooO0O0(jO00ooo) - o000oOoO.OooO0O0(jOooO00o)) / 2.0f);
        }

        @Override // o0000O0O.OooO
        @Stable
        public final int OooooOO(long j) {
            return this.f39716OoooO00.OooooOO(j);
        }

        @Override // o0000O0O.OooO
        @Stable
        public final int OoooooO(float f) {
            return this.f39716OoooO00.OoooooO(f);
        }

        @Override // kotlin.coroutines.Continuation
        @NotNull
        public final CoroutineContext getContext() {
            return this.f39714OoooO;
        }

        @Override // o0000O0O.OooO
        public final float getDensity() {
            return this.f39716OoooO00.getDensity();
        }

        @Override // p421o0Oo0oo.OooOOO
        @NotNull
        public final o00OOOOo getViewConfiguration() {
            return this.f39718OoooOO0.f39706OoooO0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0, types: [long] */
        /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v7 */
        @Override // p421o0Oo0oo.OooOOO
        @Nullable
        public final <T> Object o00O0O(long j, @NotNull Function2<? super OooOOO, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
            C0383OooO00o c0383OooO00o;
            CancellableContinuation<? super o00Oo0> cancellableContinuation;
            if (continuation instanceof C0383OooO00o) {
                c0383OooO00o = (C0383OooO00o) continuation;
                int i = c0383OooO00o.f39722OoooO0O;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0383OooO00o.f39722OoooO0O = i - Integer.MIN_VALUE;
                } else {
                    c0383OooO00o = new C0383OooO00o(this, continuation);
                }
            } else {
                c0383OooO00o = new C0383OooO00o(this, continuation);
            }
            Object objInvoke = c0383OooO00o.f39721OoooO00;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c0383OooO00o.f39722OoooO0O;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objInvoke);
                    if (j <= 0 && (cancellableContinuation = this.f39715OoooO0) != null) {
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m502constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(j))));
                    }
                    Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.f39718OoooOO0.f39711OoooOo0, null, null, new OooO0O0(j, this, null), 3, null);
                    c0383OooO00o.f39719Oooo = jobLaunch$default;
                    c0383OooO00o.f39722OoooO0O = 1;
                    objInvoke = function2.invoke(this, c0383OooO00o);
                    j = jobLaunch$default;
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Job job = c0383OooO00o.f39719Oooo;
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
            return this.f39716OoooO00.o00ooo(j);
        }

        @Override // o0000O0O.OooO
        @Stable
        public final float oo000o(long j) {
            return this.f39716OoooO00.oo000o(j);
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(@NotNull Object obj) {
            o0000O0O o0000o0o2 = this.f39718OoooOO0;
            synchronized (o0000o0o2.f39708OoooOO0) {
                o0000o0o2.f39708OoooOO0.OooOO0O(this);
                Unit unit = Unit.INSTANCE;
            }
            this.f39713Oooo.resumeWith(obj);
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

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ OooO00o<R> f39729Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO00o<R> oooO00o) {
            super(1);
            this.f39729Oooo = oooO00o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Throwable th2 = th;
            OooO00o<R> oooO00o = this.f39729Oooo;
            CancellableContinuation<? super o00Oo0> cancellableContinuation = oooO00o.f39715OoooO0;
            if (cancellableContinuation != null) {
                cancellableContinuation.cancel(th2);
            }
            oooO00o.f39715OoooO0 = null;
            return Unit.INSTANCE;
        }
    }

    public o0000O0O(@NotNull o00OOOOo viewConfiguration, @NotNull OooO density) {
        Intrinsics.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f39706OoooO0 = viewConfiguration;
        this.f39707OoooO0O = density;
        this.f39705OoooO = SuspendingPointerInputFilterKt.f6115OooO00o;
        this.f39708OoooOO0 = new o000OOo<>(new OooO00o[16]);
        this.f39712o000oOoO = new o000OOo<>(new OooO00o[16]);
        this.f39710OoooOOo = 0L;
        this.f39711OoooOo0 = GlobalScope.INSTANCE;
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float OooO0o0(int i) {
        return this.f39707OoooO0O.OooO0o0(i);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final long OooOoOO(float f) {
        return this.f39707OoooO0O.OooOoOO(f);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final long OooOoo0(long j) {
        return this.f39707OoooO0O.OooOoo0(j);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // p421o0Oo0oo.o000000O
    @Nullable
    public final <R> Object Oooo0OO(@NotNull Function2<? super OooOOO, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        OooO00o oooO00o = new OooO00o(this, cancellableContinuationImpl);
        synchronized (this.f39708OoooOO0) {
            this.f39708OoooOO0.OooO0O0(oooO00o);
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

    @Override // p421o0Oo0oo.o000000
    @NotNull
    public final o000OOo OoooO00() {
        return this;
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float OoooOO0(float f) {
        return this.f39707OoooO0O.OoooOO0(f);
    }

    @Override // o0000O0O.OooO
    public final float OoooOOo() {
        return this.f39707OoooO0O.OoooOOo();
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float OoooOoo(float f) {
        return this.f39707OoooO0O.OoooOoo(f);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final int OooooOO(long j) {
        return this.f39707OoooO0O.OooooOO(j);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return p048OoooooO.o00OOOOo.OooO00o(this, function1);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final int OoooooO(float f) {
        return this.f39707OoooO0O.OoooooO(f);
    }

    @Override // o0000O0O.OooO
    public final float getDensity() {
        return this.f39707OoooO0O.getDensity();
    }

    @Override // p421o0Oo0oo.o000000O
    @NotNull
    public final o00OOOOo getViewConfiguration() {
        return this.f39706OoooO0;
    }

    public final void o000OOo(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<set-?>");
        this.f39711OoooOo0 = coroutineScope;
    }

    @Override // o0000O0O.OooO
    @Stable
    public final long o00ooo(long j) {
        return this.f39707OoooO0O.o00ooo(j);
    }

    public final void o0O0O00(o00Oo0 o00oo1, PointerEventPass pointerEventPass) {
        o000OOo<OooO00o<?>> o000ooo2;
        int i;
        synchronized (this.f39708OoooOO0) {
            o000OOo<OooO00o<?>> o000ooo3 = this.f39712o000oOoO;
            o000ooo3.OooO0OO(o000ooo3.f3678OoooO0, this.f39708OoooOO0);
        }
        try {
            int i2 = OooO0O0.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i2 == 1 || i2 == 2) {
                o000OOo<OooO00o<?>> o000ooo4 = this.f39712o000oOoO;
                int i3 = o000ooo4.f3678OoooO0;
                if (i3 > 0) {
                    int i4 = 0;
                    OooO00o<?>[] oooO00oArr = o000ooo4.f3677Oooo;
                    do {
                        oooO00oArr[i4].OooOOO(o00oo1, pointerEventPass);
                        i4++;
                    } while (i4 < i3);
                }
            } else if (i2 == 3 && (i = (o000ooo2 = this.f39712o000oOoO).f3678OoooO0) > 0) {
                int i5 = i - 1;
                OooO00o<?>[] oooO00oArr2 = o000ooo2.f3677Oooo;
                do {
                    oooO00oArr2[i5].OooOOO(o00oo1, pointerEventPass);
                    i5--;
                } while (i5 >= 0);
            }
        } finally {
            this.f39712o000oOoO.OooO0o0();
        }
    }

    @Override // p421o0Oo0oo.o000OOo
    public final void o0OO00O() {
        boolean z;
        o00Oo0 o00oo1 = this.f39709OoooOOO;
        if (o00oo1 == null) {
            return;
        }
        List<o0OOO0o> list = o00oo1.f39738OooO00o;
        int size = list.size();
        int i = 0;
        while (true) {
            z = true;
            if (i >= size) {
                break;
            }
            if (!(true ^ list.get(i).f39753OooO0Oo)) {
                z = false;
                break;
            }
            i++;
        }
        if (z) {
            return;
        }
        List<o0OOO0o> list2 = o00oo1.f39738OooO00o;
        ArrayList changes = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            o0OOO0o o0ooo0o2 = list2.get(i2);
            long j = o0ooo0o2.f39750OooO00o;
            long j2 = o0ooo0o2.f39752OooO0OO;
            long j3 = o0ooo0o2.f39751OooO0O0;
            boolean z2 = o0ooo0o2.f39753OooO0Oo;
            o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30409OooO0O0;
            changes.add(new o0OOO0o(j, j3, j2, false, j3, j2, z2, z2, 1, o00O0O.OooO.f30410OooO0OO));
        }
        Intrinsics.checkNotNullParameter(changes, "changes");
        o00Oo0 o00oo2 = new o00Oo0(changes, null);
        this.f39705OoooO = o00oo2;
        o0O0O00(o00oo2, PointerEventPass.Initial);
        o0O0O00(o00oo2, PointerEventPass.Main);
        o0O0O00(o00oo2, PointerEventPass.Final);
        this.f39709OoooOOO = null;
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    @Override // o0000O0O.OooO
    @Stable
    public final float oo000o(long j) {
        return this.f39707OoooO0O.oo000o(j);
    }

    @Override // p421o0Oo0oo.o000OOo
    public final void oo0o0Oo(@NotNull o00Oo0 pointerEvent, @NotNull PointerEventPass pass, long j) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.f39710OoooOOo = j;
        if (pass == PointerEventPass.Initial) {
            this.f39705OoooO = pointerEvent;
        }
        o0O0O00(pointerEvent, pass);
        List<o0OOO0o> list = pointerEvent.f39738OooO00o;
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
        this.f39709OoooOOO = pointerEvent;
    }
}
