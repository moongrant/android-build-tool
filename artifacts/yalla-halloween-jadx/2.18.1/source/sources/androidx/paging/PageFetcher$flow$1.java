package androidx.paging;

import kotlin.Function;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o000OO;
import p089o000o000.o00O00o0;
import p089o000o000.o00O0O00;
import p089o000o000.o00O0OO0;
import p089o000o000.o00Ooo;
import p089o000o000.o0O0ooO;
import p089o000o000.oo000o;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
public final class PageFetcher$flow$1 extends SuspendLambda implements Function2<o00O0OO0<o0O0ooO<Object>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f8708Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f8709Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o000OO<Object, Object> f8710Oooo0oo;

    @DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", i = {}, l = {63, 63}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f8711Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f8712Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00O0O00<Object, Object> f8713Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O0O00<Object, Object> o00o0o01, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f8713Oooo0oo = o00o0o01;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f8713Oooo0oo, continuation);
            oooO00o.f8712Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0043  */
        /* JADX WARN: Code duplicated, block: B:23:0x0052 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            RemoteMediator$InitializeAction remoteMediator$InitializeAction;
            Boolean boolBoxBoolean;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f8711Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.f8712Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.f8712Oooo0oO;
            o00O0O00<Object, Object> o00o0o01 = this.f8713Oooo0oo;
            if (o00o0o01 != null) {
                this.f8712Oooo0oO = flowCollector;
                this.f8711Oooo0o = 1;
                obj = o00o0o01.OooO0OO(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                remoteMediator$InitializeAction = null;
            }
            boolBoxBoolean = Boxing.boxBoolean(remoteMediator$InitializeAction == RemoteMediator$InitializeAction.LAUNCH_INITIAL_REFRESH);
            this.f8712Oooo0oO = null;
            this.f8711Oooo0o = 2;
            if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
            remoteMediator$InitializeAction = (RemoteMediator$InitializeAction) obj;
            boolBoxBoolean = Boxing.boxBoolean(remoteMediator$InitializeAction == RemoteMediator$InitializeAction.LAUNCH_INITIAL_REFRESH);
            this.f8712Oooo0oO = null;
            this.f8711Oooo0o = 2;
            if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", i = {0, 1, 1}, l = {73, 77}, m = "invokeSuspend", n = {"previousGeneration", "previousGeneration", "pagingSource"}, s = {"L$0", "L$0", "L$1"})
    public static final class OooO0O0 extends SuspendLambda implements Function3<o000OO.OooO00o<Object, Object>, Boolean, Continuation<? super o000OO.OooO00o<Object, Object>>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ boolean f8714Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o00O00o0 f8715Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f8716Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ o000OO.OooO00o f8717Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ o000OO<Object, Object> f8718OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00O0O00<Object, Object> f8719OoooO00;

        public /* synthetic */ class OooO00o extends FunctionReferenceImpl implements Function0<Unit> {
            public OooO00o(Object obj) {
                super(0, obj, o000OO.class, "refresh", "refresh()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                ((o000OO) this.receiver).f28876OooO0Oo.OooO00o(Boolean.TRUE);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00O0O00<Object, Object> o00o0o01, o000OO<Object, Object> o000oo2, Continuation<? super OooO0O0> continuation) {
            super(3, continuation);
            this.f8719OoooO00 = o00o0o01;
            this.f8718OoooO0 = o000oo2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(o000OO.OooO00o<Object, Object> oooO00o, Boolean bool, Continuation<? super o000OO.OooO00o<Object, Object>> continuation) {
            boolean zBooleanValue = bool.booleanValue();
            OooO0O0 oooO0O0 = new OooO0O0(this.f8719OoooO00, this.f8718OoooO0, continuation);
            oooO0O0.f8717Oooo0oo = oooO00o;
            oooO0O0.f8714Oooo = zBooleanValue;
            return oooO0O0.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to androidx.paging.PageFetcher$flow$1$OooO0O0 for r14v1 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$flow$1.OooO0O0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ class OooO0OO implements FlowCollector, FunctionAdapter {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O0OO0<o0O0ooO<Object>> f8720Oooo0o;

        public OooO0OO(o00O0OO0<o0O0ooO<Object>> o00o0oo1) {
            this.f8720Oooo0o = o00o0oo1;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            Object objSend = this.f8720Oooo0o.send((o0O0ooO) obj, continuation);
            return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, this.f8720Oooo0o, o00O0OO0.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1(o000OO o000oo2, Continuation continuation) {
        super(2, continuation);
        this.f8710Oooo0oo = o000oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1(this.f8710Oooo0oo, continuation);
        pageFetcher$flow$1.f8709Oooo0oO = obj;
        return pageFetcher$flow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00O0OO0<o0O0ooO<Object>> o00o0oo1, Continuation<? super Unit> continuation) {
        return ((PageFetcher$flow$1) create(o00o0oo1, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f8708Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00O0OO0 o00o0oo1 = (o00O0OO0) this.f8709Oooo0oO;
            Flow flowOnStart = FlowKt.onStart(this.f8710Oooo0oo.f28876OooO0Oo.f28689OooO0O0, new OooO00o(null, null));
            OooO0O0 operation = new OooO0O0(null, this.f8710Oooo0oo, null);
            Object obj2 = o00Ooo.f29037OooO00o;
            Intrinsics.checkNotNullParameter(flowOnStart, "<this>");
            Intrinsics.checkNotNullParameter(operation, "operation");
            Flow flowOooO0O0 = o00Ooo.OooO0O0(FlowKt.filterNotNull(FlowKt.flow(new oo000o(null, flowOnStart, operation, null))), new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(null, this.f8710Oooo0oo, null));
            OooO0OO oooO0OO = new OooO0OO(o00o0oo1);
            this.f8708Oooo0o = 1;
            if (flowOooO0O0.collect(oooO0OO, this) == coroutine_suspended) {
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
