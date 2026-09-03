package p101o000oo;

import androidx.annotation.RestrictTo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o00O0O0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f35539OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function2<o00O0O0O<T>, Continuation<? super Unit>, Object> f35540OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f35541OooO0o0;

        /* JADX INFO: renamed from: o000oo.o00O0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", i = {0, 1}, l = {67, 68}, m = "invokeSuspend", n = {"producer", "producer"}, s = {"L$0", "L$0"})
        public static final class C0407OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public ChannelIterator f35542OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public /* synthetic */ Object f35543OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f35544OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ FlowCollector<T> f35545OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ Function2<o00O0O0O<T>, Continuation<? super Unit>, Object> f35546OooO0oo;

            /* JADX INFO: renamed from: o000oo.o00O0O0$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", f = "SimpleChannelFlow.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0408OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f35547OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public final /* synthetic */ Function2<o00O0O0O<T>, Continuation<? super Unit>, Object> f35548OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ Channel<T> f35549OooO0o0;

                /* JADX INFO: renamed from: o000oo.o00O0O0$OooO00o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
                @DebugMetadata(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", f = "SimpleChannelFlow.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
                public static final class C0409OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public int f35550OooO0Oo;

                    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                    public final /* synthetic */ Channel<T> f35551OooO0o;

                    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                    public /* synthetic */ Object f35552OooO0o0;

                    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
                    public final /* synthetic */ Function2<o00O0O0O<T>, Continuation<? super Unit>, Object> f35553OooO0oO;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0409OooO00o(Channel<T> channel, Function2<? super o00O0O0O<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C0409OooO00o> continuation) {
                        super(2, continuation);
                        this.f35551OooO0o = channel;
                        this.f35553OooO0oO = function2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        C0409OooO00o c0409OooO00o = new C0409OooO00o(this.f35551OooO0o, this.f35553OooO0oO, continuation);
                        c0409OooO00o.f35552OooO0o0 = obj;
                        return c0409OooO00o;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C0409OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f35550OooO0Oo;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            o00O0OO0 o00o0oo1 = new o00O0OO0((CoroutineScope) this.f35552OooO0o0, this.f35551OooO0o);
                            this.f35550OooO0Oo = 1;
                            if (this.f35553OooO0oO.invoke(o00o0oo1, this) == coroutine_suspended) {
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
                /* JADX WARN: Multi-variable type inference failed */
                public C0408OooO00o(Channel<T> channel, Function2<? super o00O0O0O<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C0408OooO00o> continuation) {
                    super(2, continuation);
                    this.f35549OooO0o0 = channel;
                    this.f35548OooO0o = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0408OooO00o(this.f35549OooO0o0, this.f35548OooO0o, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0408OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f35547OooO0Oo;
                    Channel<T> channel = this.f35549OooO0o0;
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            C0409OooO00o c0409OooO00o = new C0409OooO00o(channel, this.f35548OooO0o, null);
                            this.f35547OooO0Oo = 1;
                            if (CoroutineScopeKt.coroutineScope(c0409OooO00o, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                    } catch (Throwable th) {
                        channel.cancel(th);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0407OooO00o(FlowCollector<? super T> flowCollector, Function2<? super o00O0O0O<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C0407OooO00o> continuation) {
                super(2, continuation);
                this.f35545OooO0oO = flowCollector;
                this.f35546OooO0oo = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0407OooO00o c0407OooO00o = new C0407OooO00o(this.f35545OooO0oO, this.f35546OooO0oo, continuation);
                c0407OooO00o.f35543OooO0o = obj;
                return c0407OooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0407OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x005d A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:15:0x005e  */
            /* JADX WARN: Code duplicated, block: B:18:0x006c  */
            /* JADX WARN: Code duplicated, block: B:20:0x007e A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:21:0x007f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007f -> B:12:0x0051). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r12.f35544OooO0o0
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L2f
                    if (r1 == r3) goto L21
                    if (r1 != r2) goto L19
                    kotlinx.coroutines.channels.ChannelIterator r1 = r12.f35542OooO0Oo
                    java.lang.Object r5 = r12.f35543OooO0o
                    kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
                    kotlin.ResultKt.throwOnFailure(r13)
                    goto L50
                L19:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L21:
                    kotlinx.coroutines.channels.ChannelIterator r1 = r12.f35542OooO0Oo
                    java.lang.Object r5 = r12.f35543OooO0o
                    kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
                    kotlin.ResultKt.throwOnFailure(r13)
                    r6 = r5
                    r5 = r1
                    r1 = r0
                    r0 = r12
                    goto L64
                L2f:
                    kotlin.ResultKt.throwOnFailure(r13)
                    java.lang.Object r13 = r12.f35543OooO0o
                    r5 = r13
                    kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                    r13 = 0
                    r1 = 6
                    kotlinx.coroutines.channels.Channel r13 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r13, r4, r4, r1, r4)
                    r6 = 0
                    r7 = 0
                    o000oo.o00O0O0$OooO00o$OooO00o$OooO00o r8 = new o000oo.o00O0O0$OooO00o$OooO00o$OooO00o
                    kotlin.jvm.functions.Function2<o000oo.o00O0O0O<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r12.f35546OooO0oo
                    r8.<init>(r13, r1, r4)
                    r9 = 3
                    r10 = 0
                    kotlinx.coroutines.Job r5 = kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
                    kotlinx.coroutines.channels.ChannelIterator r1 = r13.iterator()
                L50:
                    r13 = r12
                L51:
                    r13.f35543OooO0o = r5
                    r13.f35542OooO0Oo = r1
                    r13.f35544OooO0o0 = r3
                    java.lang.Object r6 = r1.hasNext(r13)
                    if (r6 != r0) goto L5e
                    return r0
                L5e:
                    r11 = r0
                    r0 = r13
                    r13 = r6
                    r6 = r5
                    r5 = r1
                    r1 = r11
                L64:
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    boolean r13 = r13.booleanValue()
                    if (r13 == 0) goto L84
                    java.lang.Object r13 = r5.next()
                    r0.f35543OooO0o = r6
                    r0.f35542OooO0Oo = r5
                    r0.f35544OooO0o0 = r2
                    kotlinx.coroutines.flow.FlowCollector<T> r7 = r0.f35545OooO0oO
                    java.lang.Object r13 = r7.emit(r13, r0)
                    if (r13 != r1) goto L7f
                    return r1
                L7f:
                    r13 = r0
                    r0 = r1
                    r1 = r5
                    r5 = r6
                    goto L51
                L84:
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(r6, r4, r3, r4)
                    kotlin.Unit r13 = kotlin.Unit.INSTANCE
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: o000oo.o00O0O0.OooO00o.C0407OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function2<? super o00O0O0O<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f35540OooO0o = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f35540OooO0o, continuation);
            oooO00o.f35541OooO0o0 = obj;
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
            int i = this.f35539OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0407OooO00o c0407OooO00o = new C0407OooO00o((FlowCollector) this.f35541OooO0o0, this.f35540OooO0o, null);
                this.f35539OooO0Oo = 1;
                if (CoroutineScopeKt.coroutineScope(c0407OooO00o, this) == coroutine_suspended) {
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
    public static final <T> Flow<T> OooO00o(@NotNull Function2<? super o00O0O0O<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return FlowKt__ContextKt.buffer$default(FlowKt.flow(new OooO00o(block, null)), -2, null, 2, null);
    }
}
