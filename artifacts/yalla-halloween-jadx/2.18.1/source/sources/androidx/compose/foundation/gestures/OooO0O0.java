package androidx.compose.foundation.gestures;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.OooOo00;
import p025Oooo0O0.o0000;
import p025Oooo0O0.o0000Ooo;
import p025Oooo0O0.o00O0O;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {237, 239, 241, 251, 253, 257}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "event", "$this$LaunchedEffect", "event", "$this$LaunchedEffect", "event", "$this$LaunchedEffect", "$this$LaunchedEffect", "$this$LaunchedEffect"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
public final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public /* synthetic */ Object f5683Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Ref.ObjectRef f5684Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Ref.ObjectRef f5685Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f5686Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o0000 f5687OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Channel<OooOo00> f5688OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<o00O0O> f5689OoooO0O;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", f = "Draggable.kt", i = {0}, l = {246}, m = "invokeSuspend", n = {"$this$drag"}, s = {"L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<o0000Ooo, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<OooOo00> f5690Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Ref.ObjectRef f5691Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f5692Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f5693Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Channel<OooOo00> f5694OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Ref.ObjectRef<OooOo00> objectRef, Channel<OooOo00> channel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f5690Oooo = objectRef;
            this.f5694OoooO00 = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f5690Oooo, this.f5694OoooO00, continuation);
            oooO00o.f5693Oooo0oo = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0000Ooo o0000ooo, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o0000ooo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0058 -> B:23:0x005e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0000Ooo o0000ooo;
            OooO00o oooO00o;
            OooOo00 oooOo00;
            OooO00o oooO00o2;
            T t;
            o0000Ooo o0000ooo2;
            Ref.ObjectRef<OooOo00> objectRef;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f5692Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0000ooo = (o0000Ooo) this.f5693Oooo0oo;
                oooO00o = this;
                oooOo00 = oooO00o.f5690Oooo.element;
                if (!(oooOo00 instanceof OooOo00.OooO0o) || (oooOo00 instanceof OooOo00.OooO00o)) {
                    return Unit.INSTANCE;
                }
                OooOo00.OooO0O0 oooO0O0 = oooOo00 instanceof OooOo00.OooO0O0 ? (OooOo00.OooO0O0) oooOo00 : null;
                if (oooO0O0 != null) {
                    o0000ooo.OooO0O0(oooO0O0.f1458OooO00o, oooO0O0.f1459OooO0O0);
                }
                Ref.ObjectRef<OooOo00> objectRef2 = oooO00o.f5690Oooo;
                Channel<OooOo00> channel = oooO00o.f5694OoooO00;
                oooO00o.f5693Oooo0oo = o0000ooo;
                oooO00o.f5691Oooo0o = objectRef2;
                oooO00o.f5692Oooo0oO = 1;
                Object objReceive = channel.receive(oooO00o);
                if (objReceive == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Object obj3 = coroutine_suspended;
                oooO00o2 = oooO00o;
                t = objReceive;
                o0000ooo2 = o0000ooo;
                objectRef = objectRef2;
                obj2 = obj3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ref.ObjectRef<OooOo00> objectRef3 = this.f5691Oooo0o;
                o0000Ooo o0000ooo3 = (o0000Ooo) this.f5693Oooo0oo;
                ResultKt.throwOnFailure(obj);
                o0000ooo2 = o0000ooo3;
                objectRef = objectRef3;
                obj2 = coroutine_suspended;
                oooO00o2 = this;
                t = obj;
            }
            objectRef.element = t;
            oooO00o = oooO00o2;
            coroutine_suspended = obj2;
            o0000ooo = o0000ooo2;
            oooOo00 = oooO00o.f5690Oooo.element;
            if (oooOo00 instanceof OooOo00.OooO0o) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(Channel<OooOo00> channel, o0000 o0000Var, oO0Oo<o00O0O> oo0oo, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f5688OoooO00 = channel;
        this.f5687OoooO0 = o0000Var;
        this.f5689OoooO0O = oo0oo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        OooO0O0 oooO0O0 = new OooO0O0(this.f5688OoooO00, this.f5687OoooO0, this.f5689OoooO0O, continuation);
        oooO0O0.f5683Oooo = obj;
        return oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd A[Catch: CancellationException -> 0x00f2, TryCatch #3 {CancellationException -> 0x00f2, blocks: (B:36:0x00c1, B:38:0x00cd, B:41:0x00dd, B:43:0x00e1), top: B:61:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd A[Catch: CancellationException -> 0x00f2, TryCatch #3 {CancellationException -> 0x00f2, blocks: (B:36:0x00c1, B:38:0x00cd, B:41:0x00dd, B:43:0x00e1), top: B:61:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1 A[Catch: CancellationException -> 0x00f2, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x00f2, blocks: (B:36:0x00c1, B:38:0x00cd, B:41:0x00dd, B:43:0x00e1), top: B:61:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0106  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00da -> B:20:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00df -> B:20:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ec -> B:20:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0103 -> B:20:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0106 -> B:20:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.OooO0O0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
