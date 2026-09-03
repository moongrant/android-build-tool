package p254o00ooO0O;

import com.umeng.analytics.pro.ak;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.code.android.util.AnimationUtil$startFrameAnimation$2", f = "AnimationUtil.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3}, l = {15, 18, 24, 27}, m = "invokeSuspend", n = {"$this$forEach$iv", "frameDuration", "$this$forEach$iv", "frameDuration", "$this$forEach$iv", "frameDuration", ak.aC, "$this$forEach$iv", "frameDuration", ak.aC}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0", "I$0", "L$0", "J$0", "I$0"})
public final class o0000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f34238Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f34239Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int[] f34240Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Function1 f34241Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ long f34242OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f34243OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f34244OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f34245OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ int[] f34246OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f34247OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ int f34248o000oOoO;

    @DebugMetadata(c = "com.code.android.util.AnimationUtil$startFrameAnimation$2$1$1", f = "AnimationUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f34249Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f34250Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function1<? super Integer, Unit> function1, int i, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f34249Oooo0o = function1;
            this.f34250Oooo0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f34249Oooo0o, this.f34250Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f34249Oooo0o.invoke(Boxing.boxInt(this.f34250Oooo0oO));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.code.android.util.AnimationUtil$startFrameAnimation$2$2$1", f = "AnimationUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f34251Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f34252Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super Integer, Unit> function1, int i, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f34251Oooo0o = function1;
            this.f34252Oooo0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f34251Oooo0o, this.f34252Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f34251Oooo0o.invoke(Boxing.boxInt(this.f34252Oooo0oO));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000(long j, int[] iArr, int i, Function1<? super Integer, Unit> function1, Continuation<? super o0000> continuation) {
        super(2, continuation);
        this.f34242OoooO = j;
        this.f34246OoooOO0 = iArr;
        this.f34248o000oOoO = i;
        this.f34247OoooOOO = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000(this.f34242OoooO, this.f34246OoooOO0, this.f34248o000oOoO, this.f34247OoooOOO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0105  */
    /* JADX WARN: Code duplicated, block: B:42:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x010c A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b1 -> B:27:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00fc -> B:39:0x00ff). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p254o00ooO0O.o0000.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
