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
@DebugMetadata(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0O extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34583OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Flow<Object> f34584OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f34585OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function3<Object, Object, Continuation<Object>, Object> f34586OooO0oO;

    public static final class OooO00o<T> implements FlowCollector {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Object> f34587OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ FlowCollector<T> f34588OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function3<T, T, Continuation<? super T>, Object> f34589OooO0o0;

        /* JADX INFO: renamed from: o000O00O.o00O0O$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$1", f = "FlowExt.kt", i = {0}, l = {74, 77}, m = "emit", n = {"this"}, s = {"L$0"})
        public static final class C0402OooO00o extends ContinuationImpl {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public OooO00o f34590OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public /* synthetic */ Object f34591OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public Ref.ObjectRef f34592OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ OooO00o<T> f34593OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public int f34594OooO0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0402OooO00o(OooO00o<? super T> oooO00o, Continuation<? super C0402OooO00o> continuation) {
                super(continuation);
                this.f34593OooO0oO = oooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f34591OooO0o = obj;
                this.f34594OooO0oo |= Integer.MIN_VALUE;
                return this.f34593OooO0oO.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Ref.ObjectRef<Object> objectRef, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3, FlowCollector<? super T> flowCollector) {
            this.f34587OooO0Oo = objectRef;
            this.f34589OooO0o0 = function3;
            this.f34588OooO0o = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            C0402OooO00o c0402OooO00o;
            Ref.ObjectRef<Object> objectRef;
            OooO00o<T> oooO00o;
            if (continuation instanceof C0402OooO00o) {
                c0402OooO00o = (C0402OooO00o) continuation;
                int i = c0402OooO00o.f34594OooO0oo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0402OooO00o.f34594OooO0oo = i - Integer.MIN_VALUE;
                } else {
                    c0402OooO00o = new C0402OooO00o(this, continuation);
                }
            } else {
                c0402OooO00o = new C0402OooO00o(this, continuation);
            }
            Object obj = c0402OooO00o.f34591OooO0o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c0402OooO00o.f34594OooO0oo;
            if (i2 != 0) {
                if (i2 == 1) {
                    Ref.ObjectRef<Object> objectRef2 = c0402OooO00o.f34592OooO0o0;
                    oooO00o = c0402OooO00o.f34590OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                    objectRef = objectRef2;
                    t = (T) obj;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objectRef = this.f34587OooO0Oo;
            Object obj2 = objectRef.element;
            if (obj2 != o00Ooo.f34609OooO00o) {
                c0402OooO00o.f34590OooO0Oo = this;
                c0402OooO00o.f34592OooO0o0 = objectRef;
                c0402OooO00o.f34594OooO0oo = 1;
                t = (T) this.f34589OooO0o0.invoke((T) obj2, t, c0402OooO00o);
                if (t == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            oooO00o = this;
            objectRef.element = t;
            FlowCollector<T> flowCollector = oooO00o.f34588OooO0o;
            T t2 = oooO00o.f34587OooO0Oo.element;
            c0402OooO00o.f34590OooO0Oo = null;
            c0402OooO00o.f34592OooO0o0 = null;
            c0402OooO00o.f34594OooO0oo = 2;
            if (flowCollector.emit(t2, c0402OooO00o) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O0O(Flow<Object> flow, Function3<Object, Object, ? super Continuation<Object>, ? extends Object> function3, Continuation<? super o00O0O> continuation) {
        super(2, continuation);
        this.f34584OooO0o = flow;
        this.f34586OooO0oO = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00O0O o00o0o2 = new o00O0O(this.f34584OooO0o, this.f34586OooO0oO, continuation);
        o00o0o2.f34585OooO0o0 = obj;
        return o00o0o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<Object> flowCollector, Continuation<? super Unit> continuation) {
        return ((o00O0O) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f34583OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.f34585OooO0o0;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = o00Ooo.f34609OooO00o;
            OooO00o oooO00o = new OooO00o(objectRef, this.f34586OooO0oO, flowCollector);
            this.f34583OooO0Oo = 1;
            if (this.f34584OooO0o.collect(oooO00o, this) == coroutine_suspended) {
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
