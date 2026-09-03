package p148o00Oo0o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.MutableState;
import io.agora.rtc.Constants;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.uikit.FrameAnimationsKt$frameAnimWithDrawable$1", f = "FrameAnimations.kt", i = {}, l = {TextFieldImplKt.AnimationDuration}, m = "invokeSuspend", n = {}, s = {})
public final class oo000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f37923OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f37924OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int[] f37925OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f37926OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f37927OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f37928OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Drawable> f37929OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Context f37930OooOO0O;

    @DebugMetadata(c = "com.code.android.uikit.FrameAnimationsKt$frameAnimWithDrawable$1$1", f = "FrameAnimations.kt", i = {0, 0, 0}, l = {Constants.ERR_PUBLISH_STREAM_NOT_FOUND}, m = "invokeSuspend", n = {"$this$forEach$iv", "frameDuration", "it"}, s = {"L$0", "J$0", "I$2"})
    @SourceDebugExtension({"SMAP\nFrameAnimations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameAnimations.kt\ncom/code/android/uikit/FrameAnimationsKt$frameAnimWithDrawable$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,306:1\n13600#2,2:307\n*S KotlinDebug\n*F\n+ 1 FrameAnimations.kt\ncom/code/android/uikit/FrameAnimationsKt$frameAnimWithDrawable$1$1\n*L\n154#1:307,2\n*E\n"})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f37931OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f37932OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public MutableState f37933OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int[] f37934OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Context f37935OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f37936OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f37937OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f37938OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ long f37939OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f37940OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int[] f37941OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f37942OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f37943OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Drawable> f37944OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37945OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final /* synthetic */ Context f37946OooOOoo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(long j, int[] iArr, Ref.IntRef intRef, int i, Function1<? super Integer, Unit> function1, Function0<Unit> function0, MutableState<Drawable> mutableState, Context context, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f37939OooOO0o = j;
            this.f37941OooOOO0 = iArr;
            this.f37940OooOOO = intRef;
            this.f37942OooOOOO = i;
            this.f37943OooOOOo = function1;
            this.f37945OooOOo0 = function0;
            this.f37944OooOOo = mutableState;
            this.f37946OooOOoo = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f37939OooOO0o, this.f37941OooOOO0, this.f37940OooOOO, this.f37942OooOOOO, this.f37943OooOOOo, this.f37945OooOOo0, this.f37944OooOOo, this.f37946OooOOoo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003a  */
        /* JADX WARN: Code duplicated, block: B:13:0x004c  */
        /* JADX WARN: Code duplicated, block: B:15:0x0064 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x006e  */
        /* JADX WARN: Code duplicated, block: B:19:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003a -> B:12:0x004a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0062 -> B:16:0x0065). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x006e
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
                int r1 = r12.f37938OooOO0O
                r2 = 1
                if (r1 == 0) goto L26
                if (r1 != r2) goto L1e
                int r1 = r12.f37937OooOO0
                int r3 = r12.f37931OooO
                int r4 = r12.f37936OooO0oo
                long r5 = r12.f37932OooO0Oo
                android.content.Context r7 = r12.f37935OooO0oO
                androidx.compose.runtime.MutableState r8 = r12.f37933OooO0o
                int[] r9 = r12.f37934OooO0o0
                kotlin.ResultKt.throwOnFailure(r13)
                r13 = r12
                goto L65
            L1e:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L26:
                kotlin.ResultKt.throwOnFailure(r13)
                int[] r13 = r12.f37941OooOOO0
                int r13 = r13.length
                long r3 = (long) r13
                long r5 = r12.f37939OooOO0o
                long r5 = r5 / r3
                r13 = r12
            L31:
                kotlin.jvm.internal.Ref$IntRef r1 = r13.f37940OooOOO
                int r3 = r1.element
                int r4 = r13.f37942OooOOOO
                int r4 = r4 + r2
                if (r3 >= r4) goto L82
                int r3 = r3 + 1
                r1.element = r3
                int[] r1 = r13.f37941OooOOO0
                int r3 = r1.length
                androidx.compose.runtime.MutableState<android.graphics.drawable.Drawable> r4 = r13.f37944OooOOo
                android.content.Context r7 = r13.f37946OooOOoo
                r8 = 0
                r9 = r1
                r11 = r8
                r8 = r4
                r4 = r11
            L4a:
                if (r4 >= r3) goto L6e
                r1 = r9[r4]
                r13.f37934OooO0o0 = r9
                r13.f37933OooO0o = r8
                r13.f37935OooO0oO = r7
                r13.f37932OooO0Oo = r5
                r13.f37936OooO0oo = r4
                r13.f37931OooO = r3
                r13.f37937OooOO0 = r1
                r13.f37938OooOO0O = r2
                java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r5, r13)
                if (r10 != r0) goto L65
                return r0
            L65:
                android.graphics.drawable.Drawable r1 = p013OooOo0o.o00Oo0.OooO00o(r7, r1)
                r8.setValue(r1)
                int r4 = r4 + r2
                goto L4a
            L6e:
                int r1 = r13.f37942OooOOOO
                if (r1 <= 0) goto L31
                kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r1 = r13.f37943OooOOOo
                if (r1 == 0) goto L31
                kotlin.jvm.internal.Ref$IntRef r3 = r13.f37940OooOOO
                int r3 = r3.element
                java.lang.Integer r3 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)
                r1.invoke(r3)
                goto L31
            L82:
                kotlin.jvm.functions.Function0<kotlin.Unit> r13 = r13.f37945OooOOo0
                if (r13 == 0) goto L89
                r13.invoke()
            L89:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: o00Oo0o.oo000o.OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oo000o(long j, int[] iArr, int i, Function1<? super Integer, Unit> function1, Function0<Unit> function0, MutableState<Drawable> mutableState, Context context, Continuation<? super oo000o> continuation) {
        super(2, continuation);
        this.f37926OooO0o0 = j;
        this.f37925OooO0o = iArr;
        this.f37927OooO0oO = i;
        this.f37928OooO0oo = function1;
        this.f37923OooO = function0;
        this.f37929OooOO0 = mutableState;
        this.f37930OooOO0O = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oo000o(this.f37926OooO0o0, this.f37925OooO0o, this.f37927OooO0oO, this.f37928OooO0oo, this.f37923OooO, this.f37929OooOO0, this.f37930OooOO0O, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oo000o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f37924OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.IntRef intRef = new Ref.IntRef();
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            OooO00o oooO00o = new OooO00o(this.f37926OooO0o0, this.f37925OooO0o, intRef, this.f37927OooO0oO, this.f37928OooO0oo, this.f37923OooO, this.f37929OooOO0, this.f37930OooOO0O, null);
            this.f37924OooO0Oo = 1;
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
