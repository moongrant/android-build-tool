package p516o0o0O000;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.common.util.FrameAnimKt$frameAnim$1", f = "FrameAnim.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
public final class o00Ooo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f42088Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f42089Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f42090Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int[] f42091Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f42092OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f42093OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Integer> f42094OoooO0O;

    @DebugMetadata(c = "com.yalla.yalla.common.util.FrameAnimKt$frameAnim$1$1", f = "FrameAnim.kt", i = {0, 0, 0}, l = {79}, m = "invokeSuspend", n = {"$this$forEach$iv", "frameDuration", "it"}, s = {"L$0", "J$0", "I$2"})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f42095Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public long f42096Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int[] f42097Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public o0O00OO f42098Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ long f42099OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f42100OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f42101OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f42102OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ int[] f42103OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ int f42104OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f42105OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f42106OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Integer> f42107OoooOoO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f42108o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(long j, int[] iArr, Ref.IntRef intRef, int i, Function1<? super Integer, Unit> function1, Function0<Unit> function0, o0O00OO<Integer> o0o00oo2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f42099OoooO = j;
            this.f42103OoooOO0 = iArr;
            this.f42108o000oOoO = intRef;
            this.f42104OoooOOO = i;
            this.f42105OoooOOo = function1;
            this.f42106OoooOo0 = function0;
            this.f42107OoooOoO = o0o00oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f42099OoooO, this.f42103OoooOO0, this.f42108o000oOoO, this.f42104OoooOOO, this.f42105OoooOOo, this.f42106OoooOo0, this.f42107OoooOoO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0038  */
        /* JADX WARN: Code duplicated, block: B:18:0x006f  */
        /* JADX WARN: Code duplicated, block: B:20:0x0073  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0038 -> B:12:0x0047). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0060 -> B:17:0x0063). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.f42102OoooO0O
                r2 = 1
                if (r1 == 0) goto L24
                if (r1 != r2) goto L1c
                int r1 = r12.f42100OoooO0
                int r3 = r12.f42101OoooO00
                int r4 = r12.f42095Oooo
                long r5 = r12.f42096Oooo0o
                o000oOoO.o0O00OO r7 = r12.f42098Oooo0oo
                int[] r8 = r12.f42097Oooo0oO
                kotlin.ResultKt.throwOnFailure(r13)
                r13 = r12
                goto L63
            L1c:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L24:
                kotlin.ResultKt.throwOnFailure(r13)
                long r3 = r12.f42099OoooO
                int[] r13 = r12.f42103OoooOO0
                int r13 = r13.length
                long r5 = (long) r13
                long r3 = r3 / r5
                r13 = r12
            L2f:
                kotlin.jvm.internal.Ref$IntRef r1 = r13.f42108o000oOoO
                int r5 = r1.element
                int r6 = r13.f42104OoooOOO
                int r6 = r6 + r2
                if (r5 >= r6) goto L84
                int r5 = r5 + 1
                r1.element = r5
                int[] r1 = r13.f42103OoooOO0
                o000oOoO.o0O00OO<java.lang.Integer> r5 = r13.f42107OoooOoO
                r6 = 0
                int r7 = r1.length
                r8 = r1
                r10 = r7
                r7 = r5
                r4 = r3
                r3 = r10
            L47:
                if (r6 >= r3) goto L6f
                r1 = r8[r6]
                r13.f42097Oooo0oO = r8
                r13.f42098Oooo0oo = r7
                r13.f42096Oooo0o = r4
                r13.f42095Oooo = r6
                r13.f42101OoooO00 = r3
                r13.f42100OoooO0 = r1
                r13.f42102OoooO0O = r2
                java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r4, r13)
                if (r9 != r0) goto L60
                return r0
            L60:
                r10 = r4
                r4 = r6
                r5 = r10
            L63:
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
                r7.setValue(r1)
                int r1 = r4 + 1
                r4 = r5
                r6 = r1
                goto L47
            L6f:
                int r1 = r13.f42104OoooOOO
                if (r1 <= 0) goto L82
                kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r1 = r13.f42105OoooOOo
                if (r1 == 0) goto L82
                kotlin.jvm.internal.Ref$IntRef r3 = r13.f42108o000oOoO
                int r3 = r3.element
                java.lang.Integer r3 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)
                r1.invoke(r3)
            L82:
                r3 = r4
                goto L2f
            L84:
                kotlin.jvm.functions.Function0<kotlin.Unit> r13 = r13.f42106OoooOo0
                if (r13 == 0) goto L8b
                r13.invoke()
            L8b:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: o0o0O000.o00Ooo.OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00Ooo(long j, int[] iArr, int i, Function1<? super Integer, Unit> function1, Function0<Unit> function0, o0O00OO<Integer> o0o00oo2, Continuation<? super o00Ooo> continuation) {
        super(2, continuation);
        this.f42090Oooo0oO = j;
        this.f42091Oooo0oo = iArr;
        this.f42088Oooo = i;
        this.f42093OoooO00 = function1;
        this.f42092OoooO0 = function0;
        this.f42094OoooO0O = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00Ooo(this.f42090Oooo0oO, this.f42091Oooo0oo, this.f42088Oooo, this.f42093OoooO00, this.f42092OoooO0, this.f42094OoooO0O, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00Ooo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42089Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.IntRef intRef = new Ref.IntRef();
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            OooO00o oooO00o = new OooO00o(this.f42090Oooo0oO, this.f42091Oooo0oo, intRef, this.f42088Oooo, this.f42093OoooO00, this.f42092OoooO0, this.f42094OoooO0O, null);
            this.f42089Oooo0o = 1;
            if (BuildersKt.withContext(coroutineDispatcher, oooO00o, this) == coroutine_suspended) {
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
