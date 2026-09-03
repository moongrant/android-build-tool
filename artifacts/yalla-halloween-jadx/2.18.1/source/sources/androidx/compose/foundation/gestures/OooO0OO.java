package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.OooOo00;
import p100o000oOoO.oO0Oo;
import p418o0Oo0oo.OooOOO;
import p418o0Oo0oo.o00000;
import p418o0Oo0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", f = "Draggable.kt", i = {}, l = {263}, m = "invokeSuspend", n = {}, s = {})
public final class OooO0OO extends SuspendLambda implements Function2<o00000, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Function1<o0Oo0oo, Boolean>> f5695Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f5696Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f5697Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f5698Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ boolean f5699OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Orientation f5700OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Function0<Boolean>> f5701OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ Channel<OooOo00> f5702OoooO0O;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", f = "Draggable.kt", i = {0}, l = {265}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Function1<o0Oo0oo, Boolean>> f5703Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f5704Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f5705Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00000 f5706Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ boolean f5707OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Orientation f5708OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Function0<Boolean>> f5709OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ Channel<OooOo00> f5710OoooO0O;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", f = "Draggable.kt", i = {0, 0, 1, 1, 1}, l = {268, 276}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "velocityTracker", "$this$awaitPointerEventScope", "velocityTracker", "isDragSuccessful"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
        public static final class C0035OooO00o extends RestrictedSuspendLambda implements Function2<OooOOO, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public CoroutineScope f5711Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public o0OO00O.OooO0O0 f5712Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public Channel f5713Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public Orientation f5714Oooo0oo;

            /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f5715OoooO;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public int f5716OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public boolean f5717OoooO00;

            /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
            public /* synthetic */ Object f5718OoooO0O;

            /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
            public final /* synthetic */ oO0Oo<Function1<o0Oo0oo, Boolean>> f5719OoooOO0;

            /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
            public final /* synthetic */ Orientation f5720OoooOOO;

            /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
            public final /* synthetic */ Channel<OooOo00> f5721OoooOOo;

            /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
            public final /* synthetic */ boolean f5722OoooOo0;

            /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
            public final /* synthetic */ oO0Oo<Function0<Boolean>> f5723o000oOoO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0035OooO00o(CoroutineScope coroutineScope, oO0Oo<? extends Function1<? super o0Oo0oo, Boolean>> oo0oo, oO0Oo<? extends Function0<Boolean>> oo0oo2, Orientation orientation, Channel<OooOo00> channel, boolean z, Continuation<? super C0035OooO00o> continuation) {
                super(2, continuation);
                this.f5715OoooO = coroutineScope;
                this.f5719OoooOO0 = oo0oo;
                this.f5723o000oOoO = oo0oo2;
                this.f5720OoooOOO = orientation;
                this.f5721OoooOOo = channel;
                this.f5722OoooOo0 = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0035OooO00o c0035OooO00o = new C0035OooO00o(this.f5715OoooO, this.f5719OoooOO0, this.f5723o000oOoO, this.f5720OoooOOO, this.f5721OoooOOo, this.f5722OoooOo0, continuation);
                c0035OooO00o.f5718OoooO0O = obj;
                return c0035OooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OooOOO oooOOO, Continuation<? super Unit> continuation) {
                return ((C0035OooO00o) create(oooOOO, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0058  */
            /* JADX WARN: Code duplicated, block: B:21:0x0079 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:22:0x007a  */
            /* JADX WARN: Code duplicated, block: B:25:0x0083  */
            /* JADX WARN: Code duplicated, block: B:30:0x00a9 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
            /* JADX WARN: Code duplicated, block: B:63:0x0109  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00aa -> B:74:0x00b3). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00fb -> B:64:0x010b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0109 -> B:64:0x010b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r19) {
                /*
                    Method dump skipped, instruction units count: 273
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.OooO0OO.OooO00o.C0035OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(o00000 o00000Var, oO0Oo<? extends Function1<? super o0Oo0oo, Boolean>> oo0oo, oO0Oo<? extends Function0<Boolean>> oo0oo2, Orientation orientation, Channel<OooOo00> channel, boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f5706Oooo0oo = o00000Var;
            this.f5703Oooo = oo0oo;
            this.f5709OoooO00 = oo0oo2;
            this.f5708OoooO0 = orientation;
            this.f5710OoooO0O = channel;
            this.f5707OoooO = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f5706Oooo0oo, this.f5703Oooo, this.f5709OoooO00, this.f5708OoooO0, this.f5710OoooO0O, this.f5707OoooO, continuation);
            oooO00o.f5705Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0050  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope coroutineScope;
            CancellationException e;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f5704Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f5705Oooo0oO;
                try {
                    o00000 o00000Var = this.f5706Oooo0oo;
                    C0035OooO00o c0035OooO00o = new C0035OooO00o(coroutineScope2, this.f5703Oooo, this.f5709OoooO00, this.f5708OoooO0, this.f5710OoooO0O, this.f5707OoooO, null);
                    this.f5705Oooo0oO = coroutineScope2;
                    this.f5704Oooo0o = 1;
                    if (o00000Var.Oooo0OO(c0035OooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (CancellationException e2) {
                    coroutineScope = coroutineScope2;
                    e = e2;
                    if (!CoroutineScopeKt.isActive(coroutineScope)) {
                        throw e;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f5705Oooo0oO;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException e3) {
                    e = e3;
                    if (!CoroutineScopeKt.isActive(coroutineScope)) {
                        throw e;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO0OO(boolean z, oO0Oo<? extends Function1<? super o0Oo0oo, Boolean>> oo0oo, oO0Oo<? extends Function0<Boolean>> oo0oo2, Orientation orientation, Channel<OooOo00> channel, boolean z2, Continuation<? super OooO0OO> continuation) {
        super(2, continuation);
        this.f5698Oooo0oo = z;
        this.f5695Oooo = oo0oo;
        this.f5701OoooO00 = oo0oo2;
        this.f5700OoooO0 = orientation;
        this.f5702OoooO0O = channel;
        this.f5699OoooO = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        OooO0OO oooO0OO = new OooO0OO(this.f5698Oooo0oo, this.f5695Oooo, this.f5701OoooO00, this.f5700OoooO0, this.f5702OoooO0O, this.f5699OoooO, continuation);
        oooO0OO.f5697Oooo0oO = obj;
        return oooO0OO;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00000 o00000Var, Continuation<? super Unit> continuation) {
        return ((OooO0OO) create(o00000Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5696Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00000 o00000Var = (o00000) this.f5697Oooo0oO;
            if (!this.f5698Oooo0oo) {
                return Unit.INSTANCE;
            }
            OooO00o oooO00o = new OooO00o(o00000Var, this.f5695Oooo, this.f5701OoooO00, this.f5700OoooO0, this.f5702OoooO0O, this.f5699OoooO, null);
            this.f5696Oooo0o = 1;
            if (CoroutineScopeKt.coroutineScope(oooO00o, this) == coroutine_suspended) {
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
