package androidx.compose.foundation;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026Oooo0OO.o000;
import p026Oooo0OO.o0000O0;
import p100o000oOoO.o0O00OO;
import p418o0Oo0oo.o00000;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", f = "Hoverable.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
public final class OooOO0O extends SuspendLambda implements Function2<o00000, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o000 f5634Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f5635Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f5636Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f5637Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<o0000O0> f5638OoooO00;

    @DebugMetadata(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1", f = "Hoverable.kt", i = {0}, l = {104}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    public static final class OooO00o extends RestrictedSuspendLambda implements Function2<p418o0Oo0oo.OooOOO, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f5639Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f5640Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f5641Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f5642Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<o0000O0> f5643OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o000 f5644OoooO00;

        /* JADX INFO: renamed from: androidx.compose.foundation.OooOO0O$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$1", f = "Hoverable.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0034OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f5645Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ o000 f5646Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ o0O00OO<o0000O0> f5647Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0034OooO00o(o000 o000Var, o0O00OO<o0000O0> o0o00oo2, Continuation<? super C0034OooO00o> continuation) {
                super(2, continuation);
                this.f5646Oooo0oO = o000Var;
                this.f5647Oooo0oo = o0o00oo2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0034OooO00o(this.f5646Oooo0oO, this.f5647Oooo0oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0034OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f5645Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o000 o000Var = this.f5646Oooo0oO;
                    o0O00OO<o0000O0> o0o00oo2 = this.f5647Oooo0oo;
                    this.f5645Oooo0o = 1;
                    if (HoverableKt.OooO00o.OooO00o(o000Var, o0o00oo2, this) == coroutine_suspended) {
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

        @DebugMetadata(c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$1$2", f = "Hoverable.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f5648Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ o0O00OO<o0000O0> f5649Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ o000 f5650Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(o0O00OO<o0000O0> o0o00oo2, o000 o000Var, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f5649Oooo0oO = o0o00oo2;
                this.f5650Oooo0oo = o000Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f5649Oooo0oO, this.f5650Oooo0oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f5648Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o0O00OO<o0000O0> o0o00oo2 = this.f5649Oooo0oO;
                    o000 o000Var = this.f5650Oooo0oo;
                    this.f5648Oooo0o = 1;
                    if (HoverableKt.OooO00o.OooO0O0(o0o00oo2, o000Var, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CoroutineContext coroutineContext, CoroutineScope coroutineScope, o000 o000Var, o0O00OO<o0000O0> o0o00oo2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f5642Oooo0oo = coroutineContext;
            this.f5639Oooo = coroutineScope;
            this.f5644OoooO00 = o000Var;
            this.f5643OoooO0 = o0o00oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f5642Oooo0oo, this.f5639Oooo, this.f5644OoooO00, this.f5643OoooO0, continuation);
            oooO00o.f5641Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p418o0Oo0oo.OooOOO oooOOO, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(oooOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0030  */
        /* JADX WARN: Code duplicated, block: B:13:0x003a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x003b  */
        /* JADX WARN: Code duplicated, block: B:17:0x0048  */
        /* JADX WARN: Code duplicated, block: B:18:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x004d  */
        /* JADX WARN: Code duplicated, block: B:21:0x0060  */
        /* JADX WARN: Code duplicated, block: B:23:0x0063  */
        /* JADX WARN: Code duplicated, block: B:25:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003b -> B:15:0x0040). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r14.f5640Oooo0o
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 != r3) goto L17
                java.lang.Object r1 = r14.f5641Oooo0oO
                o0Oo0oo.OooOOO r1 = (p418o0Oo0oo.OooOOO) r1
                kotlin.ResultKt.throwOnFailure(r15)
                r4 = r1
                r1 = r0
                r0 = r14
                goto L40
            L17:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1f:
                kotlin.ResultKt.throwOnFailure(r15)
                java.lang.Object r15 = r14.f5641Oooo0oO
                o0Oo0oo.OooOOO r15 = (p418o0Oo0oo.OooOOO) r15
                r1 = r15
                r15 = r14
            L28:
                kotlin.coroutines.CoroutineContext r4 = r15.f5642Oooo0oo
                boolean r4 = kotlinx.coroutines.JobKt.isActive(r4)
                if (r4 == 0) goto L7c
                r15.f5641Oooo0oO = r1
                r15.f5640Oooo0o = r3
                java.lang.Object r4 = o00OO0O0.o0OOO0o.OooO00o(r1, r2, r15, r3, r2)
                if (r4 != r0) goto L3b
                return r0
            L3b:
                r13 = r0
                r0 = r15
                r15 = r4
                r4 = r1
                r1 = r13
            L40:
                o0Oo0oo.o00Oo0 r15 = (p418o0Oo0oo.o00Oo0) r15
                int r15 = r15.f39726OooO0Oo
                r5 = 4
                r6 = 0
                if (r15 != r5) goto L4a
                r5 = 1
                goto L4b
            L4a:
                r5 = 0
            L4b:
                if (r5 == 0) goto L60
                kotlinx.coroutines.CoroutineScope r7 = r0.f5639Oooo
                r8 = 0
                r9 = 0
                androidx.compose.foundation.OooOO0O$OooO00o$OooO00o r10 = new androidx.compose.foundation.OooOO0O$OooO00o$OooO00o
                Oooo0OO.o000 r15 = r0.f5644OoooO00
                o000oOoO.o0O00OO<Oooo0OO.o0000O0> r5 = r0.f5643OoooO0
                r10.<init>(r15, r5, r2)
                r11 = 3
                r12 = 0
                kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
                goto L78
            L60:
                r5 = 5
                if (r15 != r5) goto L64
                r6 = 1
            L64:
                if (r6 == 0) goto L78
                kotlinx.coroutines.CoroutineScope r7 = r0.f5639Oooo
                r8 = 0
                r9 = 0
                androidx.compose.foundation.OooOO0O$OooO00o$OooO0O0 r10 = new androidx.compose.foundation.OooOO0O$OooO00o$OooO0O0
                o000oOoO.o0O00OO<Oooo0OO.o0000O0> r15 = r0.f5643OoooO0
                Oooo0OO.o000 r5 = r0.f5644OoooO00
                r10.<init>(r15, r5, r2)
                r11 = 3
                r12 = 0
                kotlinx.coroutines.BuildersKt.launch$default(r7, r8, r9, r10, r11, r12)
            L78:
                r15 = r0
                r0 = r1
                r1 = r4
                goto L28
            L7c:
                kotlin.Unit r15 = kotlin.Unit.INSTANCE
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.OooOO0O.OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(CoroutineScope coroutineScope, o000 o000Var, o0O00OO<o0000O0> o0o00oo2, Continuation<? super OooOO0O> continuation) {
        super(2, continuation);
        this.f5637Oooo0oo = coroutineScope;
        this.f5634Oooo = o000Var;
        this.f5638OoooO00 = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        OooOO0O oooOO0O = new OooOO0O(this.f5637Oooo0oo, this.f5634Oooo, this.f5638OoooO00, continuation);
        oooOO0O.f5636Oooo0oO = obj;
        return oooOO0O;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00000 o00000Var, Continuation<? super Unit> continuation) {
        return ((OooOO0O) create(o00000Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5635Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00000 o00000Var = (o00000) this.f5636Oooo0oO;
            OooO00o oooO00o = new OooO00o(get$context(), this.f5637Oooo0oo, this.f5634Oooo, this.f5638OoooO00, null);
            this.f5635Oooo0o = 1;
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
