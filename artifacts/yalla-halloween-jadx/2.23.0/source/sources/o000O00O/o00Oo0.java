package o000O00O;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", i = {0, 0}, l = {55, 56}, m = "invokeSuspend", n = {"$this$flow", "accumulator"}, s = {"L$0", "L$1"})
public final class o00Oo0 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> f34595OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Ref.ObjectRef f34596OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f34597OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f34598OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f34599OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Flow<Object> f34600OooO0oo;

    public static final class OooO00o<T> implements FlowCollector {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Object> f34601OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ FlowCollector<Object> f34602OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function3<Object, T, Continuation<Object>, Object> f34603OooO0o0;

        /* JADX INFO: renamed from: o000O00O.o00Oo0$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleScan$1$1", f = "FlowExt.kt", i = {0}, l = {57, 58}, m = "emit", n = {"this"}, s = {"L$0"})
        public static final class C0403OooO00o extends ContinuationImpl {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public OooO00o f34604OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public /* synthetic */ Object f34605OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Ref.ObjectRef f34606OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ OooO00o<T> f34607OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public int f34608OooO0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0403OooO00o(OooO00o<? super T> oooO00o, Continuation<? super C0403OooO00o> continuation) {
                super(continuation);
                this.f34607OooO0oO = oooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f34605OooO0o = obj;
                this.f34608OooO0oo |= Integer.MIN_VALUE;
                return this.f34607OooO0oO.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Ref.ObjectRef<Object> objectRef, Function3<Object, ? super T, ? super Continuation<Object>, ? extends Object> function3, FlowCollector<Object> flowCollector) {
            this.f34601OooO0Oo = objectRef;
            this.f34603OooO0o0 = function3;
            this.f34602OooO0o = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            C0403OooO00o c0403OooO00o;
            OooO00o<T> oooO00o;
            Ref.ObjectRef<Object> objectRef;
            if (continuation instanceof C0403OooO00o) {
                c0403OooO00o = (C0403OooO00o) continuation;
                int i = c0403OooO00o.f34608OooO0oo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0403OooO00o.f34608OooO0oo = i - Integer.MIN_VALUE;
                } else {
                    c0403OooO00o = new C0403OooO00o(this, continuation);
                }
            } else {
                c0403OooO00o = new C0403OooO00o(this, continuation);
            }
            T t2 = (T) c0403OooO00o.f34605OooO0o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c0403OooO00o.f34608OooO0oo;
            if (i2 != 0) {
                if (i2 == 1) {
                    objectRef = c0403OooO00o.f34606OooO0o0;
                    oooO00o = c0403OooO00o.f34604OooO0Oo;
                    ResultKt.throwOnFailure(t2);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(t2);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(t2);
            Ref.ObjectRef<Object> objectRef2 = this.f34601OooO0Oo;
            Object obj = objectRef2.element;
            c0403OooO00o.f34604OooO0Oo = this;
            c0403OooO00o.f34606OooO0o0 = objectRef2;
            c0403OooO00o.f34608OooO0oo = 1;
            Object objInvoke = this.f34603OooO0o0.invoke(obj, t, c0403OooO00o);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO00o = this;
            t2 = (T) objInvoke;
            objectRef = objectRef2;
            objectRef.element = t2;
            FlowCollector<Object> flowCollector = oooO00o.f34602OooO0o;
            Object obj2 = oooO00o.f34601OooO0Oo.element;
            c0403OooO00o.f34604OooO0Oo = null;
            c0403OooO00o.f34606OooO0o0 = null;
            c0403OooO00o.f34608OooO0oo = 2;
            if (flowCollector.emit(obj2, c0403OooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(Flow flow, Object obj, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.f34599OooO0oO = obj;
        this.f34600OooO0oo = flow;
        this.f34595OooO = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00Oo0 o00oo1 = new o00Oo0(this.f34600OooO0oo, this.f34599OooO0oO, this.f34595OooO, continuation);
        o00oo1.f34597OooO0o = obj;
        return o00oo1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        return ((o00Oo0) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Ref.ObjectRef objectRef;
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f34598OooO0o0;
        if (i != 0) {
            if (i == 1) {
                objectRef = this.f34596OooO0Oo;
                flowCollector = (FlowCollector) this.f34597OooO0o;
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
        FlowCollector flowCollector2 = (FlowCollector) this.f34597OooO0o;
        objectRef = new Ref.ObjectRef();
        ?? r4 = this.f34599OooO0oO;
        objectRef.element = r4;
        this.f34597OooO0o = flowCollector2;
        this.f34596OooO0Oo = objectRef;
        this.f34598OooO0o0 = 1;
        if (flowCollector2.emit(r4, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        flowCollector = flowCollector2;
        OooO00o oooO00o = new OooO00o(objectRef, this.f34595OooO, flowCollector);
        this.f34597OooO0o = null;
        this.f34596OooO0Oo = null;
        this.f34598OooO0o0 = 2;
        if (this.f34600OooO0oo.collect(oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
