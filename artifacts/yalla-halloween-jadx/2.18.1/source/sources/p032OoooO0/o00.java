package p032OoooO0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p418o0Oo0oo.OooOOO;
import p418o0Oo0oo.o00000;
import p418o0Oo0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
public final class o00 extends SuspendLambda implements Function2<o00000, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f2993Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f2994Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f2995Oooo0oo;

    @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", i = {0, 1, 1}, l = {99, 103}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "down"}, s = {"L$0", "L$0", "L$1"})
    public static final class OooO00o extends RestrictedSuspendLambda implements Function2<OooOOO, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f2996Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o0Oo0oo f2997Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f2998Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f2999Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O00OO o00o00oo2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f2996Oooo = o00o00oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f2996Oooo, continuation);
            oooO00o.f2999Oooo0oo = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOO oooOOO, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(oooOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x006a  */
        /* JADX WARN: Code duplicated, block: B:21:0x007a  */
        /* JADX WARN: Code duplicated, block: B:24:0x0080  */
        /* JADX WARN: Code duplicated, block: B:27:0x0085 A[LOOP:0: B:18:0x0068->B:27:0x0085, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:32:0x0083 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:17:0x005e). Please report as a decompilation issue!!! */
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
                r17 = this;
                r0 = r17
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f2998Oooo0oO
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2f
                if (r2 == r4) goto L25
                if (r2 != r3) goto L1d
                o0Oo0oo.o0Oo0oo r2 = r0.f2997Oooo0o
                java.lang.Object r5 = r0.f2999Oooo0oo
                o0Oo0oo.OooOOO r5 = (p418o0Oo0oo.OooOOO) r5
                kotlin.ResultKt.throwOnFailure(r18)
                r7 = r18
                r6 = r0
                goto L5e
            L1d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L25:
                java.lang.Object r2 = r0.f2999Oooo0oo
                o0Oo0oo.OooOOO r2 = (p418o0Oo0oo.OooOOO) r2
                kotlin.ResultKt.throwOnFailure(r18)
                r5 = r18
                goto L41
            L2f:
                kotlin.ResultKt.throwOnFailure(r18)
                java.lang.Object r2 = r0.f2999Oooo0oo
                o0Oo0oo.OooOOO r2 = (p418o0Oo0oo.OooOOO) r2
                r0.f2999Oooo0oo = r2
                r0.f2998Oooo0oO = r4
                java.lang.Object r5 = p025Oooo0O0.o000OOo0.OooO0O0(r2, r4, r0)
                if (r5 != r1) goto L41
                return r1
            L41:
                o0Oo0oo.o0Oo0oo r5 = (p418o0Oo0oo.o0Oo0oo) r5
                OoooO0.o00O00OO r6 = r0.f2996Oooo
                long r7 = r5.f39744OooO0OO
                r6.OooO0OO()
                r6 = r0
                r16 = r5
                r5 = r2
                r2 = r16
            L50:
                r7 = 0
                r6.f2999Oooo0oo = r5
                r6.f2997Oooo0o = r2
                r6.f2998Oooo0oO = r3
                java.lang.Object r7 = o00OO0O0.o0OOO0o.OooO00o(r5, r7, r6, r4, r7)
                if (r7 != r1) goto L5e
                return r1
            L5e:
                o0Oo0oo.o00Oo0 r7 = (p418o0Oo0oo.o00Oo0) r7
                java.util.List<o0Oo0oo.o0Oo0oo> r7 = r7.f39723OooO00o
                int r8 = r7.size()
                r9 = 0
                r10 = 0
            L68:
                if (r10 >= r8) goto L88
                java.lang.Object r11 = r7.get(r10)
                o0Oo0oo.o0Oo0oo r11 = (p418o0Oo0oo.o0Oo0oo) r11
                long r12 = r11.f39742OooO00o
                long r14 = r2.f39742OooO00o
                boolean r12 = p418o0Oo0oo.o0OOO0o.OooO00o(r12, r14)
                if (r12 == 0) goto L80
                boolean r11 = r11.f39745OooO0Oo
                if (r11 == 0) goto L80
                r11 = 1
                goto L81
            L80:
                r11 = 0
            L81:
                if (r11 == 0) goto L85
                r9 = 1
                goto L88
            L85:
                int r10 = r10 + 1
                goto L68
            L88:
                if (r9 != 0) goto L50
                OoooO0.o00O00OO r1 = r6.f2996Oooo
                r1.OooO0O0()
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: OoooO0.o00.OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(o00O00OO o00o00oo2, Continuation<? super o00> continuation) {
        super(2, continuation);
        this.f2995Oooo0oo = o00o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00 o00Var = new o00(this.f2995Oooo0oo, continuation);
        o00Var.f2994Oooo0oO = obj;
        return o00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00000 o00000Var, Continuation<? super Unit> continuation) {
        return ((o00) create(o00000Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f2993Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00000 o00000Var = (o00000) this.f2994Oooo0oO;
            OooO00o oooO00o = new OooO00o(this.f2995Oooo0oo, null);
            this.f2993Oooo0o = 1;
            if (o00000Var.Oooo0OO(oooO00o, this) == coroutine_suspended) {
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
