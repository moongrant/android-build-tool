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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o00000O;
import p101o000oo.o00000O0;
import p101o000oo.o0000O0;
import p101o000oo.o0000O0O;
import p101o000oo.o00O0;
import p101o000oo.o00O0O0O;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nPageFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher$flow$1\n+ 2 FlowExt.kt\nandroidx/paging/FlowExtKt\n*L\n1#1,256:1\n106#2:257\n*S KotlinDebug\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher$flow$1\n*L\n125#1:257\n*E\n"})
public final class PageFetcher$flow$1 extends SuspendLambda implements Function2<o00O0O0O<o0OOO0o<Object>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f10297OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Oooo0<Object, Object> f10298OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f10299OooO0o0;

    @DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", i = {}, l = {63, 63}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f10300OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f10301OooO0o0;

        public OooO00o(o00O0<Object, Object> o00o1, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(null, continuation);
            oooO00o.f10301OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            RemoteMediator$InitializeAction remoteMediator$InitializeAction;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10300OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.f10301OooO0o0;
                    ResultKt.throwOnFailure(obj);
                    remoteMediator$InitializeAction = (RemoteMediator$InitializeAction) obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.f10301OooO0o0;
            remoteMediator$InitializeAction = null;
            Boolean boolBoxBoolean = Boxing.boxBoolean(remoteMediator$InitializeAction == RemoteMediator$InitializeAction.LAUNCH_INITIAL_REFRESH);
            this.f10301OooO0o0 = null;
            this.f10300OooO0Oo = 2;
            if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", i = {0, 1, 1}, l = {73, 77}, m = "invokeSuspend", n = {"previousGeneration", "previousGeneration", "pagingSource"}, s = {"L$0", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nPageFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher$flow$1$2\n+ 2 Logger.kt\nandroidx/paging/LoggerKt\n*L\n1#1,256:1\n41#2,10:257\n*S KotlinDebug\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher$flow$1$2\n*L\n101#1:257,10\n*E\n"})
    public static final class OooO0O0 extends SuspendLambda implements Function3<Oooo0.OooO00o<Object, Object>, Boolean, Continuation<? super Oooo0.OooO00o<Object, Object>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o0O0O00 f10302OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Oooo0.OooO00o f10303OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f10304OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ boolean f10305OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<Object, Object> f10306OooO0oo;

        public /* synthetic */ class OooO00o extends FunctionReferenceImpl implements Function0<Unit> {
            public OooO00o(Oooo0 oooo0) {
                super(0, oooo0, Oooo0.class, "refresh", "refresh()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                ((Oooo0) this.receiver).f10272OooO0Oo.OooO00o(Boolean.TRUE);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo0 oooo0, o00O0 o00o1, Continuation continuation) {
            super(3, continuation);
            this.f10306OooO0oo = oooo0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Oooo0.OooO00o<Object, Object> oooO00o, Boolean bool, Continuation<? super Oooo0.OooO00o<Object, Object>> continuation) {
            boolean zBooleanValue = bool.booleanValue();
            OooO0O0 oooO0O0 = new OooO0O0(this.f10306OooO0oo, null, continuation);
            oooO0O0.f10303OooO0o = oooO00o;
            oooO0O0.f10305OooO0oO = zBooleanValue;
            return oooO0O0.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to androidx.paging.PageFetcher$flow$1$OooO0O0 for r15v1 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r16) {
            /*
                Method dump skipped, instruction units count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$flow$1.OooO0O0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1", f = "PageFetcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPageFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher$flow$1$3$downstreamFlow$1\n+ 2 Logger.kt\nandroidx/paging/LoggerKt\n*L\n1#1,256:1\n41#2,10:257\n*S KotlinDebug\n*F\n+ 1 PageFetcher.kt\nandroidx/paging/PageFetcher$flow$1$3$downstreamFlow$1\n*L\n128#1:257,10\n*E\n"})
    public static final class OooO0OO extends SuspendLambda implements Function2<Oooo000<Object>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f10307OooO0Oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(continuation);
            oooO0OO.f10307OooO0Oo = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Oooo000<Object> oooo000, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(oooo000, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Oooo000 oooo000 = (Oooo000) this.f10307OooO0Oo;
            o0000O0 o0000o1 = o0000O0O.f35428OooO00o;
            if (o0000o1 != null) {
                z = o0000o1.OooO0O0(2);
            }
            if (z) {
                o0000o1.OooO00o(2, "Sent " + oooo000);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooO0o implements FlowCollector, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O0O0O<o0OOO0o<Object>> f10308OooO0Oo;

        public OooO0o(o00O0O0O<o0OOO0o<Object>> o00o0o0o2) {
            this.f10308OooO0Oo = o00o0o0o2;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            Object objSend = this.f10308OooO0Oo.send((o0OOO0o) obj, continuation);
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
            return new FunctionReferenceImpl(2, this.f10308OooO0Oo, o00O0O0O.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1(Oooo0 oooo0, Continuation continuation) {
        super(2, continuation);
        this.f10298OooO0o = oooo0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1(this.f10298OooO0o, continuation);
        pageFetcher$flow$1.f10299OooO0o0 = obj;
        return pageFetcher$flow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00O0O0O<o0OOO0o<Object>> o00o0o0o2, Continuation<? super Unit> continuation) {
        return ((PageFetcher$flow$1) create(o00o0o0o2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f10297OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00O0O0O o00o0o0o2 = (o00O0O0O) this.f10299OooO0o0;
            Oooo0<Object, Object> oooo0 = this.f10298OooO0o;
            Flow flowOnStart = FlowKt.onStart(oooo0.f10272OooO0Oo.f35567OooO0O0, new OooO00o(null, null));
            OooO0O0 operation = new OooO0O0(oooo0, null, null);
            Object obj2 = o00000O.f35397OooO00o;
            Intrinsics.checkNotNullParameter(flowOnStart, "<this>");
            Intrinsics.checkNotNullParameter(operation, "operation");
            Flow flowOooO00o = o00000O.OooO00o(FlowKt.filterNotNull(FlowKt.flow(new o00000O0(flowOnStart, null, operation, null))), new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(oooo0, null, null));
            OooO0o oooO0o = new OooO0o(o00o0o0o2);
            this.f10297OooO0Oo = 1;
            if (flowOooO00o.collect(oooO0o, this) == coroutine_suspended) {
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
