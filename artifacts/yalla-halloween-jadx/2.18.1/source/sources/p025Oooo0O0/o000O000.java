package p025Oooo0O0;

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
import p100o000oOoO.oO0Oo;
import p418o0Oo0oo.OooOOO;
import p418o0Oo0oo.o00000;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", f = "Scrollable.kt", i = {}, l = {271}, m = "invokeSuspend", n = {}, s = {})
public final class o000O000 extends SuspendLambda implements Function2<o00000, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<o000OO00> f1523Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f1524Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f1525Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f1526Oooo0oo;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", f = "Scrollable.kt", i = {0}, l = {273}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    public static final class OooO00o extends RestrictedSuspendLambda implements Function2<OooOOO, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<o000OO00> f1527Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f1528Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f1529Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0000O0 f1530Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0000O0 o0000o1, oO0Oo<o000OO00> oo0oo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f1530Oooo0oo = o0000o1;
            this.f1527Oooo = oo0oo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f1530Oooo0oo, this.f1527Oooo, continuation);
            oooO00o.f1529Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOO oooOOO, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(oooOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0043  */
        /* JADX WARN: Code duplicated, block: B:18:0x0052 A[LOOP:0: B:14:0x0041->B:18:0x0052, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:30:0x0050 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:31:0x0055 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:13:0x0037). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f1528Oooo0o
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r10.f1529Oooo0oO
                o0Oo0oo.OooOOO r1 = (p418o0Oo0oo.OooOOO) r1
                kotlin.ResultKt.throwOnFailure(r11)
                r3 = r1
                r1 = r0
                r0 = r10
                goto L37
            L16:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1e:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r11 = r10.f1529Oooo0oO
                o0Oo0oo.OooOOO r11 = (p418o0Oo0oo.OooOOO) r11
                r1 = r11
                r11 = r10
            L27:
                r11.f1529Oooo0oO = r1
                r11.f1528Oooo0o = r2
                java.lang.Object r3 = androidx.compose.foundation.gestures.ScrollableKt.OooO00o(r1, r11)
                if (r3 != r0) goto L32
                return r0
            L32:
                r9 = r0
                r0 = r11
                r11 = r3
                r3 = r1
                r1 = r9
            L37:
                o0Oo0oo.o00Oo0 r11 = (p418o0Oo0oo.o00Oo0) r11
                java.util.List<o0Oo0oo.o0Oo0oo> r4 = r11.f39723OooO00o
                int r5 = r4.size()
                r6 = 0
                r7 = 0
            L41:
                if (r7 >= r5) goto L55
                java.lang.Object r8 = r4.get(r7)
                o0Oo0oo.o0Oo0oo r8 = (p418o0Oo0oo.o0Oo0oo) r8
                boolean r8 = r8.OooO0OO()
                r8 = r8 ^ r2
                if (r8 != 0) goto L52
                r4 = 0
                goto L56
            L52:
                int r7 = r7 + 1
                goto L41
            L55:
                r4 = 1
            L56:
                if (r4 == 0) goto L95
                Oooo0O0.o0000O0 r4 = r0.f1530Oooo0oo
                o000oOoO.oO0Oo<Oooo0O0.o000OO00> r5 = r0.f1527Oooo
                r3.OooO00o()
                long r7 = r4.OooO00o(r3, r11)
                java.lang.Object r4 = r5.getValue()
                Oooo0O0.o000OO00 r4 = (p025Oooo0O0.o000OO00) r4
                float r5 = r4.OooO0oO(r7)
                float r5 = r4.OooO0Oo(r5)
                Oooo0O0.o000OO0O r4 = r4.f1552OooO0Oo
                float r4 = r4.OooO0OO(r5)
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L7e
                r4 = 1
                goto L7f
            L7e:
                r4 = 0
            L7f:
                if (r4 != 0) goto L95
                java.util.List<o0Oo0oo.o0Oo0oo> r11 = r11.f39723OooO00o
                int r4 = r11.size()
            L87:
                if (r6 >= r4) goto L95
                java.lang.Object r5 = r11.get(r6)
                o0Oo0oo.o0Oo0oo r5 = (p418o0Oo0oo.o0Oo0oo) r5
                r5.OooO00o()
                int r6 = r6 + 1
                goto L87
            L95:
                r11 = r0
                r0 = r1
                r1 = r3
                goto L27
            */
            throw new UnsupportedOperationException("Method not decompiled: Oooo0O0.o000O000.OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(o0000O0 o0000o1, oO0Oo<o000OO00> oo0oo, Continuation<? super o000O000> continuation) {
        super(2, continuation);
        this.f1526Oooo0oo = o0000o1;
        this.f1523Oooo = oo0oo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o000O000 o000o001 = new o000O000(this.f1526Oooo0oo, this.f1523Oooo, continuation);
        o000o001.f1525Oooo0oO = obj;
        return o000o001;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00000 o00000Var, Continuation<? super Unit> continuation) {
        return ((o000O000) create(o00000Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1524Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00000 o00000Var = (o00000) this.f1525Oooo0oO;
            OooO00o oooO00o = new OooO00o(this.f1526Oooo0oo, this.f1523Oooo, null);
            this.f1524Oooo0o = 1;
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
