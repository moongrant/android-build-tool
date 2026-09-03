package p089o000o000;

import androidx.annotation.RestrictTo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Object f29037OooO00o = new Object();

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function3<T, T, Continuation<? super T>, Object> f29038Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f29039Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f29040Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Flow<T> f29041Oooo0oo;

        /* JADX INFO: renamed from: o000o000.o00Ooo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0317OooO00o<T> implements FlowCollector {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<Object> f29042Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ Function3<T, T, Continuation<? super T>, Object> f29043Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ FlowCollector<T> f29044Oooo0oo;

            /* JADX INFO: renamed from: o000o000.o00Ooo$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$1", f = "FlowExt.kt", i = {0}, l = {74, 77}, m = "emit", n = {"this"}, s = {"L$0"})
            public static final class C0318OooO00o extends ContinuationImpl {

                /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
                public final /* synthetic */ C0317OooO00o<T> f29045Oooo;

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public C0317OooO00o f29046Oooo0o;

                /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                public Ref.ObjectRef f29047Oooo0oO;

                /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
                public /* synthetic */ Object f29048Oooo0oo;

                /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
                public int f29049OoooO00;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0318OooO00o(C0317OooO00o<? super T> c0317OooO00o, Continuation<? super C0318OooO00o> continuation) {
                    super(continuation);
                    this.f29045Oooo = c0317OooO00o;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f29048Oooo0oo = obj;
                    this.f29049OoooO00 |= Integer.MIN_VALUE;
                    return this.f29045Oooo.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0317OooO00o(Ref.ObjectRef<Object> objectRef, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3, FlowCollector<? super T> flowCollector) {
                this.f29042Oooo0o = objectRef;
                this.f29043Oooo0oO = function3;
                this.f29044Oooo0oo = flowCollector;
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
                C0318OooO00o c0318OooO00o;
                Ref.ObjectRef<Object> objectRef;
                C0317OooO00o<T> c0317OooO00o;
                if (continuation instanceof C0318OooO00o) {
                    c0318OooO00o = (C0318OooO00o) continuation;
                    int i = c0318OooO00o.f29049OoooO00;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0318OooO00o.f29049OoooO00 = i - Integer.MIN_VALUE;
                    } else {
                        c0318OooO00o = new C0318OooO00o(this, continuation);
                    }
                } else {
                    c0318OooO00o = new C0318OooO00o(this, continuation);
                }
                Object obj = c0318OooO00o.f29048Oooo0oo;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c0318OooO00o.f29049OoooO00;
                if (i2 != 0) {
                    if (i2 == 1) {
                        Ref.ObjectRef<Object> objectRef2 = c0318OooO00o.f29047Oooo0oO;
                        c0317OooO00o = c0318OooO00o.f29046Oooo0o;
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
                objectRef = this.f29042Oooo0o;
                Object obj2 = objectRef.element;
                Object obj3 = o00Ooo.f29037OooO00o;
                if (obj2 != o00Ooo.f29037OooO00o) {
                    Function3<T, T, Continuation<? super T>, Object> function3 = this.f29043Oooo0oO;
                    c0318OooO00o.f29046Oooo0o = this;
                    c0318OooO00o.f29047Oooo0oO = objectRef;
                    c0318OooO00o.f29049OoooO00 = 1;
                    t = (T) function3.invoke((T) obj2, t, c0318OooO00o);
                    if (t == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                c0317OooO00o = this;
                objectRef.element = t;
                FlowCollector<T> flowCollector = c0317OooO00o.f29044Oooo0oo;
                T t2 = c0317OooO00o.f29042Oooo0o.element;
                c0318OooO00o.f29046Oooo0o = null;
                c0318OooO00o.f29047Oooo0oO = null;
                c0318OooO00o.f29049OoooO00 = 2;
                if (flowCollector.emit(t2, c0318OooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Flow<? extends T> flow, Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f29041Oooo0oo = flow;
            this.f29038Oooo = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f29041Oooo0oo, this.f29038Oooo, continuation);
            oooO00o.f29040Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((OooO00o) create((FlowCollector) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f29039Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.f29040Oooo0oO;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Object obj2 = o00Ooo.f29037OooO00o;
                objectRef.element = (T) o00Ooo.f29037OooO00o;
                Flow<T> flow = this.f29041Oooo0oo;
                C0317OooO00o c0317OooO00o = new C0317OooO00o(objectRef, this.f29038Oooo, flowCollector);
                this.f29039Oooo0o = 1;
                if (flow.collect(c0317OooO00o, this) == coroutine_suspended) {
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0<R> extends SuspendLambda implements Function2<o00O0OO0<R>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> f29050Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f29051Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f29052Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Flow<T> f29053Oooo0oo;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ OooOo00<R> f29054Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f29055Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public /* synthetic */ Object f29056Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> f29057Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, OooOo00<R> oooOo00, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f29057Oooo0oo = function3;
                this.f29054Oooo = oooOo00;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f29057Oooo0oo, this.f29054Oooo, continuation);
                oooO00o.f29056Oooo0oO = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to o000o000.o00Ooo$OooO0O0$OooO00o<T> for r4v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r4.f29055Oooo0o
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.ResultKt.throwOnFailure(r5)
                    goto L29
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    kotlin.ResultKt.throwOnFailure(r5)
                    java.lang.Object r5 = r4.f29056Oooo0oO
                    kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r4.f29057Oooo0oo
                    o000o000.OooOo00<R> r3 = r4.f29054Oooo
                    r4.f29055Oooo0o = r2
                    java.lang.Object r5 = r1.invoke(r3, r5, r4)
                    if (r5 != r0) goto L29
                    return r0
                L29:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o000o000.o00Ooo.OooO0O0.OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Flow<? extends T> flow, Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f29053Oooo0oo = flow;
            this.f29050Oooo = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f29053Oooo0oo, this.f29050Oooo, continuation);
            oooO0O0.f29052Oooo0oO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create((o00O0OO0) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f29051Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00O0OO0 o00o0oo1 = (o00O0OO0) this.f29052Oooo0oO;
                Flow<T> flow = this.f29053Oooo0oo;
                OooO00o oooO00o = new OooO00o(this.f29050Oooo, new OooOo00(o00o0oo1), null);
                this.f29051Oooo0o = 1;
                if (FlowKt.collectLatest(flow, oooO00o, this) == coroutine_suspended) {
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

    @NotNull
    public static final <T> Flow<T> OooO00o(@NotNull Flow<? extends T> flow, @NotNull Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> operation) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return FlowKt.flow(new OooO00o(flow, operation, null));
    }

    @NotNull
    public static final <T, R> Flow<R> OooO0O0(@NotNull Flow<? extends T> flow, @NotNull Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return o00O0O0O.OooO00o(new OooO0O0(flow, transform, null));
    }
}
