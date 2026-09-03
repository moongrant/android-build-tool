package p539o0o0OoOO;

import com.yalla.yalla.ui.view.MarqueeRecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.view.MarqueeRecyclerView$startMarquee$1", f = "MarqueeRecyclerView.kt", i = {}, l = {58, 59}, m = "invokeSuspend", n = {}, s = {})
public final class u1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f55713OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MarqueeRecyclerView f55714OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f55715OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.view.MarqueeRecyclerView$startMarquee$1$1", f = "MarqueeRecyclerView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f55716OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MarqueeRecyclerView f55717OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, MarqueeRecyclerView marqueeRecyclerView, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f55716OooO0Oo = z;
            this.f55717OooO0o0 = marqueeRecyclerView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f55716OooO0Oo, this.f55717OooO0o0, continuation);
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
            this.f55717OooO0o0.smoothScrollBy(this.f55716OooO0Oo ? -10 : 10, 0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(boolean z, MarqueeRecyclerView marqueeRecyclerView, Continuation<? super u1> continuation) {
        super(2, continuation);
        this.f55715OooO0o0 = z;
        this.f55714OooO0o = marqueeRecyclerView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new u1(this.f55715OooO0o0, this.f55714OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((u1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003f -> B:11:0x0020). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x000a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f55713OooO0Oo
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L1c
        Lf:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L17:
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r8
            goto L2b
        L1c:
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r8
        L20:
            r9.f55713OooO0Oo = r3
            r4 = 90
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r4, r9)
            if (r1 != r0) goto L2b
            return r0
        L2b:
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
            o0o0OoOO.u1$OooO00o r4 = new o0o0OoOO.u1$OooO00o
            com.yalla.yalla.ui.view.MarqueeRecyclerView r5 = r9.f55714OooO0o
            r6 = 0
            boolean r7 = r9.f55715OooO0o0
            r4.<init>(r7, r5, r6)
            r9.f55713OooO0Oo = r2
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r4, r9)
            if (r1 != r0) goto L20
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p539o0o0OoOO.u1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
