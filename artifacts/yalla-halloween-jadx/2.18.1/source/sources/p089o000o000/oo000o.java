package p089o000o000;

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
public final class oo000o extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Object f29086Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Ref.ObjectRef f29087Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f29088Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public /* synthetic */ Object f29089Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> f29090OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Flow<Object> f29091OoooO00;

    public static final class OooO00o<T> implements FlowCollector {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Object> f29092Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function3<Object, T, Continuation<Object>, Object> f29093Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ FlowCollector<Object> f29094Oooo0oo;

        /* JADX INFO: renamed from: o000o000.oo000o$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleScan$1$1", f = "FlowExt.kt", i = {0}, l = {57, 58}, m = "emit", n = {"this"}, s = {"L$0"})
        public static final class C0319OooO00o extends ContinuationImpl {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ OooO00o<T> f29095Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public OooO00o f29096Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public Ref.ObjectRef f29097Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public /* synthetic */ Object f29098Oooo0oo;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public int f29099OoooO00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0319OooO00o(OooO00o<? super T> oooO00o, Continuation<? super C0319OooO00o> continuation) {
                super(continuation);
                this.f29095Oooo = oooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f29098Oooo0oo = obj;
                this.f29099OoooO00 |= Integer.MIN_VALUE;
                return this.f29095Oooo.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Ref.ObjectRef<Object> objectRef, Function3<Object, ? super T, ? super Continuation<Object>, ? extends Object> function3, FlowCollector<Object> flowCollector) {
            this.f29092Oooo0o = objectRef;
            this.f29093Oooo0oO = function3;
            this.f29094Oooo0oo = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            C0319OooO00o c0319OooO00o;
            OooO00o<T> oooO00o;
            Ref.ObjectRef<Object> objectRef;
            if (continuation instanceof C0319OooO00o) {
                c0319OooO00o = (C0319OooO00o) continuation;
                int i = c0319OooO00o.f29099OoooO00;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0319OooO00o.f29099OoooO00 = i - Integer.MIN_VALUE;
                } else {
                    c0319OooO00o = new C0319OooO00o(this, continuation);
                }
            } else {
                c0319OooO00o = new C0319OooO00o(this, continuation);
            }
            T t2 = (T) c0319OooO00o.f29098Oooo0oo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c0319OooO00o.f29099OoooO00;
            if (i2 != 0) {
                if (i2 == 1) {
                    objectRef = c0319OooO00o.f29097Oooo0oO;
                    oooO00o = c0319OooO00o.f29096Oooo0o;
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
            Ref.ObjectRef<Object> objectRef2 = this.f29092Oooo0o;
            Function3<Object, T, Continuation<Object>, Object> function3 = this.f29093Oooo0oO;
            Object obj = objectRef2.element;
            c0319OooO00o.f29096Oooo0o = this;
            c0319OooO00o.f29097Oooo0oO = objectRef2;
            c0319OooO00o.f29099OoooO00 = 1;
            Object objInvoke = function3.invoke(obj, t, c0319OooO00o);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO00o = this;
            t2 = (T) objInvoke;
            objectRef = objectRef2;
            objectRef.element = t2;
            FlowCollector<Object> flowCollector = oooO00o.f29094Oooo0oo;
            Object obj2 = oooO00o.f29092Oooo0o.element;
            c0319OooO00o.f29096Oooo0o = null;
            c0319OooO00o.f29097Oooo0oO = null;
            c0319OooO00o.f29099OoooO00 = 2;
            if (flowCollector.emit(obj2, c0319OooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oo000o(Object obj, Flow<Object> flow, Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3, Continuation<? super oo000o> continuation) {
        super(2, continuation);
        this.f29086Oooo = obj;
        this.f29091OoooO00 = flow;
        this.f29090OoooO0 = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        oo000o oo000oVar = new oo000o(this.f29086Oooo, this.f29091OoooO00, this.f29090OoooO0, continuation);
        oo000oVar.f29089Oooo0oo = obj;
        return oo000oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        return ((oo000o) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Ref.ObjectRef objectRef;
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f29088Oooo0oO;
        if (i != 0) {
            if (i == 1) {
                objectRef = this.f29087Oooo0o;
                flowCollector = (FlowCollector) this.f29089Oooo0oo;
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
        FlowCollector flowCollector2 = (FlowCollector) this.f29089Oooo0oo;
        objectRef = new Ref.ObjectRef();
        ?? r4 = this.f29086Oooo;
        objectRef.element = r4;
        this.f29089Oooo0oo = flowCollector2;
        this.f29087Oooo0o = objectRef;
        this.f29088Oooo0oO = 1;
        if (flowCollector2.emit(r4, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        flowCollector = flowCollector2;
        Flow<Object> flow = this.f29091OoooO00;
        OooO00o oooO00o = new OooO00o(objectRef, this.f29090OoooO0, flowCollector);
        this.f29089Oooo0oo = null;
        this.f29087Oooo0o = null;
        this.f29088Oooo0oO = 2;
        if (flow.collect(oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
