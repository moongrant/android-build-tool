package p025Oooo0O0;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.time.DurationKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p418o0Oo0oo.OooOOO;
import p418o0Oo0oo.o00000;
import p418o0Oo0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> f1578OooO00o = new OooO00o(null);

    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 1}, l = {262, 277}, m = "waitForUpOrCancellation", n = {"$this$waitForUpOrCancellation", "$this$waitForUpOrCancellation"}, s = {"L$0", "L$0"})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooOOO f1579Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f1580Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f1581Oooo0oo;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1580Oooo0oO = obj;
            this.f1581Oooo0oo |= Integer.MIN_VALUE;
            return o000OOo0.OooO0o(null, this);
        }
    }

    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(o0000O00 o0000o00, o00O0O.OooO oooO, Continuation<? super Unit> continuation) {
            long j = oooO.f30395OooO00o;
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 0}, l = {244}, m = "awaitFirstDownOnPass", n = {"$this$awaitFirstDownOnPass", "pass", "requireUnconsumed"}, s = {"L$0", "L$1", "Z$0"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f1582Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooOOO f1583Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public PointerEventPass f1584Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f1585Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f1586OoooO00;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1582Oooo = obj;
            this.f1586OoooO00 |= Integer.MIN_VALUE;
            return o000OOo0.OooO0OO(null, null, false, this);
        }
    }

    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", i = {}, l = {IZegoLiveEventCallback.StreamEvent.PlayEnd}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<o00000, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> f1587Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f1588Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f1589Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0000oo f1590Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function1<o00O0O.OooO, Unit> f1591OoooO00;

        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ o00000 f1592Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f1593Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public /* synthetic */ Object f1594Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ o0000oo f1595Oooo0oo;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public final /* synthetic */ Function1<o00O0O.OooO, Unit> f1596OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> f1597OoooO00;

            /* JADX INFO: renamed from: Oooo0O0.o000OOo0$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", i = {0}, l = {210, 216}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
            public static final class C0014OooO00o extends RestrictedSuspendLambda implements Function2<OooOOO, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
                public final /* synthetic */ CoroutineScope f1598Oooo;

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public int f1599Oooo0o;

                /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                public /* synthetic */ Object f1600Oooo0oO;

                /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
                public final /* synthetic */ Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> f1601Oooo0oo;

                /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
                public final /* synthetic */ Function1<o00O0O.OooO, Unit> f1602OoooO0;

                /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
                public final /* synthetic */ o0000oo f1603OoooO00;

                /* JADX INFO: renamed from: Oooo0O0.o000OOo0$OooO0OO$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
                @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1$1", f = "TapGestureDetector.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
                public static final class C0015OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
                    public final /* synthetic */ o0Oo0oo f1604Oooo;

                    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                    public int f1605Oooo0o;

                    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                    public final /* synthetic */ Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> f1606Oooo0oO;

                    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
                    public final /* synthetic */ o0000oo f1607Oooo0oo;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0015OooO00o(Function3<? super o0000O00, ? super o00O0O.OooO, ? super Continuation<? super Unit>, ? extends Object> function3, o0000oo o0000ooVar, o0Oo0oo o0oo0oo2, Continuation<? super C0015OooO00o> continuation) {
                        super(2, continuation);
                        this.f1606Oooo0oO = function3;
                        this.f1607Oooo0oo = o0000ooVar;
                        this.f1604Oooo = o0oo0oo2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C0015OooO00o(this.f1606Oooo0oO, this.f1607Oooo0oo, this.f1604Oooo, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C0015OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f1605Oooo0o;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> function3 = this.f1606Oooo0oO;
                            o0000oo o0000ooVar = this.f1607Oooo0oo;
                            o00O0O.OooO oooO = new o00O0O.OooO(this.f1604Oooo.f39744OooO0OO);
                            this.f1605Oooo0o = 1;
                            if (function3.invoke(o0000ooVar, oooO, this) == coroutine_suspended) {
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
                public C0014OooO00o(Function3<? super o0000O00, ? super o00O0O.OooO, ? super Continuation<? super Unit>, ? extends Object> function3, CoroutineScope coroutineScope, o0000oo o0000ooVar, Function1<? super o00O0O.OooO, Unit> function1, Continuation<? super C0014OooO00o> continuation) {
                    super(2, continuation);
                    this.f1601Oooo0oo = function3;
                    this.f1598Oooo = coroutineScope;
                    this.f1603OoooO00 = o0000ooVar;
                    this.f1602OoooO0 = function1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C0014OooO00o c0014OooO00o = new C0014OooO00o(this.f1601Oooo0oo, this.f1598Oooo, this.f1603OoooO00, this.f1602OoooO0, continuation);
                    c0014OooO00o.f1600Oooo0oO = obj;
                    return c0014OooO00o;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OooOOO oooOOO, Continuation<? super Unit> continuation) {
                    return ((C0014OooO00o) create(oooOOO, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0060  */
                /* JADX WARN: Code duplicated, block: B:22:0x0066  */
                /* JADX WARN: Code duplicated, block: B:24:0x0072  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    OooOOO oooOOO;
                    o0Oo0oo o0oo0oo2;
                    Function1<o00O0O.OooO, Unit> function1;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f1599Oooo0o;
                    if (i != 0) {
                        if (i == 1) {
                            oooOOO = (OooOOO) this.f1600Oooo0oO;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        o0oo0oo2 = (o0Oo0oo) obj;
                        if (o0oo0oo2 == null) {
                            this.f1603OoooO00.OooOOO();
                        } else {
                            o0oo0oo2.OooO00o();
                            this.f1603OoooO00.OooOOoo();
                            function1 = this.f1602OoooO0;
                            if (function1 != null) {
                                function1.invoke(new o00O0O.OooO(o0oo0oo2.f39744OooO0OO));
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    oooOOO = (OooOOO) this.f1600Oooo0oO;
                    this.f1600Oooo0oO = oooOOO;
                    this.f1599Oooo0o = 1;
                    obj = o000OOo0.OooO0O0(oooOOO, true, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o0Oo0oo o0oo0oo3 = (o0Oo0oo) obj;
                    o0oo0oo3.OooO00o();
                    Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> function3 = this.f1601Oooo0oo;
                    if (function3 != o000OOo0.f1578OooO00o) {
                        BuildersKt__Builders_commonKt.launch$default(this.f1598Oooo, null, null, new C0015OooO00o(function3, this.f1603OoooO00, o0oo0oo3, null), 3, null);
                    }
                    this.f1600Oooo0oO = null;
                    this.f1599Oooo0o = 2;
                    obj = o000OOo0.OooO0o(oooOOO, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o0oo0oo2 = (o0Oo0oo) obj;
                    if (o0oo0oo2 == null) {
                        this.f1603OoooO00.OooOOO();
                    } else {
                        o0oo0oo2.OooO00o();
                        this.f1603OoooO00.OooOOoo();
                        function1 = this.f1602OoooO0;
                        if (function1 != null) {
                            function1.invoke(new o00O0O.OooO(o0oo0oo2.f39744OooO0OO));
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(o0000oo o0000ooVar, o00000 o00000Var, Function3<? super o0000O00, ? super o00O0O.OooO, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super o00O0O.OooO, Unit> function1, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f1595Oooo0oo = o0000ooVar;
                this.f1592Oooo = o00000Var;
                this.f1597OoooO00 = function3;
                this.f1596OoooO0 = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f1595Oooo0oo, this.f1592Oooo, this.f1597OoooO00, this.f1596OoooO0, continuation);
                oooO00o.f1594Oooo0oO = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f1593Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f1594Oooo0oO;
                    this.f1595Oooo0oo.OooOo0o();
                    o00000 o00000Var = this.f1592Oooo;
                    C0014OooO00o c0014OooO00o = new C0014OooO00o(this.f1597OoooO00, coroutineScope, this.f1595Oooo0oo, this.f1596OoooO0, null);
                    this.f1593Oooo0o = 1;
                    if (o00000Var.Oooo0OO(c0014OooO00o, this) == coroutine_suspended) {
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
        public OooO0OO(o0000oo o0000ooVar, Function3<? super o0000O00, ? super o00O0O.OooO, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super o00O0O.OooO, Unit> function1, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f1590Oooo0oo = o0000ooVar;
            this.f1587Oooo = function3;
            this.f1591OoooO00 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f1590Oooo0oo, this.f1587Oooo, this.f1591OoooO00, continuation);
            oooO0OO.f1589Oooo0oO = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00000 o00000Var, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(o00000Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1588Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooO00o oooO00o = new OooO00o(this.f1590Oooo0oo, (o00000) this.f1589Oooo0oO, this.f1587Oooo, this.f1591OoooO00, null);
                this.f1588Oooo0o = 1;
                if (CoroutineScopeKt.coroutineScope(oooO00o, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> f1608Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f1609Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f1610Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00000 f1611Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function1<o00O0O.OooO, Unit> f1612OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function1<o00O0O.OooO, Unit> f1613OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<o00O0O.OooO, Unit> f1614OoooO0O;

        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<o00000, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> f1615Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f1616Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public /* synthetic */ Object f1617Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ o0000oo f1618Oooo0oo;

            /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
            public final /* synthetic */ Function1<o00O0O.OooO, Unit> f1619OoooO;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public final /* synthetic */ Function1<o00O0O.OooO, Unit> f1620OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f1621OoooO00;

            /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
            public final /* synthetic */ Function1<o00O0O.OooO, Unit> f1622OoooO0O;

            /* JADX INFO: renamed from: Oooo0O0.o000OOo0$OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {94, 106, 117, 127, 140, 158}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "down", "upOrCancel", "longPressTimeout", "$this$awaitPointerEventScope", "upOrCancel", "longPressTimeout", "$this$awaitPointerEventScope", "upOrCancel", "longPressTimeout", "$this$awaitPointerEventScope", "upOrCancel", "secondDown"}, s = {"L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2"})
            public static final class C0016OooO00o extends RestrictedSuspendLambda implements Function2<OooOOO, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
                public long f1623Oooo;

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public Object f1624Oooo0o;

                /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                public Object f1625Oooo0oO;

                /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
                public Ref.ObjectRef f1626Oooo0oo;

                /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
                public final /* synthetic */ Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> f1627OoooO;

                /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
                public /* synthetic */ Object f1628OoooO0;

                /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
                public int f1629OoooO00;

                /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
                public final /* synthetic */ o0000oo f1630OoooO0O;

                /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
                public final /* synthetic */ CoroutineScope f1631OoooOO0;

                /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
                public final /* synthetic */ Function1<o00O0O.OooO, Unit> f1632OoooOOO;

                /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
                public final /* synthetic */ Function1<o00O0O.OooO, Unit> f1633OoooOOo;

                /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
                public final /* synthetic */ Function1<o00O0O.OooO, Unit> f1634o000oOoO;

                /* JADX INFO: renamed from: Oooo0O0.o000OOo0$OooO0o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
                @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$1", f = "TapGestureDetector.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
                public static final class C0017OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
                    public final /* synthetic */ o0Oo0oo f1635Oooo;

                    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                    public int f1636Oooo0o;

                    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                    public final /* synthetic */ Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> f1637Oooo0oO;

                    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
                    public final /* synthetic */ o0000oo f1638Oooo0oo;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0017OooO00o(Function3<? super o0000O00, ? super o00O0O.OooO, ? super Continuation<? super Unit>, ? extends Object> function3, o0000oo o0000ooVar, o0Oo0oo o0oo0oo2, Continuation<? super C0017OooO00o> continuation) {
                        super(2, continuation);
                        this.f1637Oooo0oO = function3;
                        this.f1638Oooo0oo = o0000ooVar;
                        this.f1635Oooo = o0oo0oo2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C0017OooO00o(this.f1637Oooo0oO, this.f1638Oooo0oo, this.f1635Oooo, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C0017OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f1636Oooo0o;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> function3 = this.f1637Oooo0oO;
                            o0000oo o0000ooVar = this.f1638Oooo0oo;
                            o00O0O.OooO oooO = new o00O0O.OooO(this.f1635Oooo.f39744OooO0OO);
                            this.f1636Oooo0o = 1;
                            if (function3.invoke(o0000ooVar, oooO, this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: Oooo0O0.o000OOo0$OooO0o$OooO00o$OooO00o$OooO0O0 */
                @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$2", f = "TapGestureDetector.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
                public static final class OooO0O0 extends RestrictedSuspendLambda implements Function2<OooOOO, Continuation<? super o0Oo0oo>, Object> {

                    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                    public int f1639Oooo0o;

                    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                    public /* synthetic */ Object f1640Oooo0oO;

                    public OooO0O0(Continuation<? super OooO0O0> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        OooO0O0 oooO0O0 = new OooO0O0(continuation);
                        oooO0O0.f1640Oooo0oO = obj;
                        return oooO0O0;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OooOOO oooOOO, Continuation<? super o0Oo0oo> continuation) {
                        return ((OooO0O0) create(oooOOO, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f1639Oooo0o;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            OooOOO oooOOO = (OooOOO) this.f1640Oooo0oO;
                            this.f1639Oooo0o = 1;
                            obj = o000OOo0.OooO0o(oooOOO, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return obj;
                    }
                }

                /* JADX INFO: renamed from: Oooo0O0.o000OOo0$OooO0o$OooO00o$OooO00o$OooO0OO */
                @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$3", f = "TapGestureDetector.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
                public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
                    public final /* synthetic */ o0Oo0oo f1641Oooo;

                    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                    public int f1642Oooo0o;

                    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                    public final /* synthetic */ Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> f1643Oooo0oO;

                    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
                    public final /* synthetic */ o0000oo f1644Oooo0oo;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public OooO0OO(Function3<? super o0000O00, ? super o00O0O.OooO, ? super Continuation<? super Unit>, ? extends Object> function3, o0000oo o0000ooVar, o0Oo0oo o0oo0oo2, Continuation<? super OooO0OO> continuation) {
                        super(2, continuation);
                        this.f1643Oooo0oO = function3;
                        this.f1644Oooo0oo = o0000ooVar;
                        this.f1641Oooo = o0oo0oo2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new OooO0OO(this.f1643Oooo0oO, this.f1644Oooo0oo, this.f1641Oooo, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f1642Oooo0o;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> function3 = this.f1643Oooo0oO;
                            o0000oo o0000ooVar = this.f1644Oooo0oo;
                            o00O0O.OooO oooO = new o00O0O.OooO(this.f1641Oooo.f39744OooO0OO);
                            this.f1642Oooo0o = 1;
                            if (function3.invoke(o0000ooVar, oooO, this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: Oooo0O0.o000OOo0$OooO0o$OooO00o$OooO00o$OooO0o, reason: collision with other inner class name */
                @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1$4", f = "TapGestureDetector.kt", i = {}, l = {ZegoConstants.RoomError.SessionError}, m = "invokeSuspend", n = {}, s = {})
                public static final class C0018OooO0o extends RestrictedSuspendLambda implements Function2<OooOOO, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
                    public final /* synthetic */ Function1<o00O0O.OooO, Unit> f1645Oooo;

                    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                    public int f1646Oooo0o;

                    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                    public /* synthetic */ Object f1647Oooo0oO;

                    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
                    public final /* synthetic */ o0000oo f1648Oooo0oo;

                    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
                    public final /* synthetic */ Ref.ObjectRef<o0Oo0oo> f1649OoooO0;

                    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
                    public final /* synthetic */ Function1<o00O0O.OooO, Unit> f1650OoooO00;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0018OooO0o(o0000oo o0000ooVar, Function1<? super o00O0O.OooO, Unit> function1, Function1<? super o00O0O.OooO, Unit> function2, Ref.ObjectRef<o0Oo0oo> objectRef, Continuation<? super C0018OooO0o> continuation) {
                        super(2, continuation);
                        this.f1648Oooo0oo = o0000ooVar;
                        this.f1645Oooo = function1;
                        this.f1650OoooO00 = function2;
                        this.f1649OoooO0 = objectRef;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        C0018OooO0o c0018OooO0o = new C0018OooO0o(this.f1648Oooo0oo, this.f1645Oooo, this.f1650OoooO00, this.f1649OoooO0, continuation);
                        c0018OooO0o.f1647Oooo0oO = obj;
                        return c0018OooO0o;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OooOOO oooOOO, Continuation<? super Unit> continuation) {
                        return ((C0018OooO0o) create(oooOOO, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f1646Oooo0o;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            OooOOO oooOOO = (OooOOO) this.f1647Oooo0oO;
                            this.f1646Oooo0o = 1;
                            obj = o000OOo0.OooO0o(oooOOO, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj;
                        if (o0oo0oo2 != null) {
                            o0oo0oo2.OooO00o();
                            this.f1648Oooo0oo.OooOOoo();
                            this.f1645Oooo.invoke(new o00O0O.OooO(o0oo0oo2.f39744OooO0OO));
                            return Unit.INSTANCE;
                        }
                        this.f1648Oooo0oo.OooOOO();
                        Function1<o00O0O.OooO, Unit> function1 = this.f1650OoooO00;
                        if (function1 == null) {
                            return null;
                        }
                        function1.invoke(new o00O0O.OooO(this.f1649OoooO0.element.f39744OooO0OO));
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0016OooO00o(o0000oo o0000ooVar, Function3<? super o0000O00, ? super o00O0O.OooO, ? super Continuation<? super Unit>, ? extends Object> function3, CoroutineScope coroutineScope, Function1<? super o00O0O.OooO, Unit> function1, Function1<? super o00O0O.OooO, Unit> function2, Function1<? super o00O0O.OooO, Unit> function4, Continuation<? super C0016OooO00o> continuation) {
                    super(2, continuation);
                    this.f1630OoooO0O = o0000ooVar;
                    this.f1627OoooO = function3;
                    this.f1631OoooOO0 = coroutineScope;
                    this.f1634o000oOoO = function1;
                    this.f1632OoooOOO = function2;
                    this.f1633OoooOOo = function4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C0016OooO00o c0016OooO00o = new C0016OooO00o(this.f1630OoooO0O, this.f1627OoooO, this.f1631OoooOO0, this.f1634o000oOoO, this.f1632OoooOOO, this.f1633OoooOOo, continuation);
                    c0016OooO00o.f1628OoooO0 = obj;
                    return c0016OooO00o;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OooOOO oooOOO, Continuation<? super Unit> continuation) {
                    return ((C0016OooO00o) create(oooOOO, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code duplicated, block: B:22:0x0099  */
                /* JADX WARN: Code duplicated, block: B:25:0x00ad  */
                /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
                /* JADX WARN: Code duplicated, block: B:30:0x00d8 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:31:0x00d9  */
                /* JADX WARN: Code duplicated, block: B:34:0x00e2 A[Catch: PointerEventTimeoutCancellationException -> 0x00f3, TryCatch #4 {PointerEventTimeoutCancellationException -> 0x00f3, blocks: (B:32:0x00dc, B:34:0x00e2, B:35:0x00e8), top: B:92:0x00dc }] */
                /* JADX WARN: Code duplicated, block: B:35:0x00e8 A[Catch: PointerEventTimeoutCancellationException -> 0x00f3, TRY_LEAVE, TryCatch #4 {PointerEventTimeoutCancellationException -> 0x00f3, blocks: (B:32:0x00dc, B:34:0x00e2, B:35:0x00e8), top: B:92:0x00dc }] */
                /* JADX WARN: Code duplicated, block: B:42:0x00fe  */
                /* JADX WARN: Code duplicated, block: B:45:0x011b A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:49:0x0127  */
                /* JADX WARN: Code duplicated, block: B:51:0x012b  */
                /* JADX WARN: Code duplicated, block: B:53:0x012f  */
                /* JADX WARN: Code duplicated, block: B:54:0x013d  */
                /* JADX WARN: Code duplicated, block: B:56:0x0161 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:57:0x0162  */
                /* JADX WARN: Code duplicated, block: B:60:0x0169  */
                /* JADX WARN: Code duplicated, block: B:62:0x016d  */
                /* JADX WARN: Code duplicated, block: B:63:0x017d  */
                /* JADX WARN: Code duplicated, block: B:65:0x0188  */
                /* JADX WARN: Code duplicated, block: B:68:0x01ba A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:72:0x01c1  */
                /* JADX WARN: Code duplicated, block: B:75:0x01d3  */
                /* JADX WARN: Code duplicated, block: B:78:0x01ec A[RETURN] */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    OooOOO oooOOO;
                    Object objOooO0O0;
                    OooOOO oooOOO2;
                    o0Oo0oo o0oo0oo2;
                    Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> function3;
                    long jOooO0OO;
                    Ref.ObjectRef objectRef;
                    Ref.ObjectRef objectRef2;
                    Object objO00O0O;
                    OooOOO oooOOO3;
                    o0Oo0oo o0oo0oo3;
                    Ref.ObjectRef objectRef3;
                    Ref.ObjectRef objectRef4;
                    OooOOO oooOOO4;
                    Function1<o00O0O.OooO, Unit> function1;
                    T t;
                    T t2;
                    T t3;
                    Object objOooo0o0;
                    long j;
                    Ref.ObjectRef objectRef5;
                    OooOOO oooOOO5;
                    Function1<o00O0O.OooO, Unit> function2;
                    o0Oo0oo o0oo0oo4;
                    Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> function4;
                    Ref.ObjectRef objectRef6;
                    OooOOO oooOOO6;
                    C0018OooO0o c0018OooO0o;
                    Function1<o00O0O.OooO, Unit> function5;
                    Function1<o00O0O.OooO, Unit> function6;
                    Function1<o00O0O.OooO, Unit> function7;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.f1629OoooO00) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            oooOOO = (OooOOO) this.f1628OoooO0;
                            this.f1628OoooO0 = oooOOO;
                            this.f1629OoooO00 = 1;
                            objOooO0O0 = o000OOo0.OooO0O0(oooOOO, true, this);
                            if (objOooO0O0 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            oooOOO2 = oooOOO;
                            o0oo0oo2 = (o0Oo0oo) objOooO0O0;
                            o0oo0oo2.OooO00o();
                            this.f1630OoooO0O.OooOo0o();
                            function3 = this.f1627OoooO;
                            if (function3 != o000OOo0.f1578OooO00o) {
                                BuildersKt__Builders_commonKt.launch$default(this.f1631OoooOO0, null, null, new C0017OooO00o(function3, this.f1630OoooO0O, o0oo0oo2, null), 3, null);
                            }
                            if (this.f1634o000oOoO != null) {
                                jOooO0OO = oooOOO2.getViewConfiguration().OooO0OO();
                            } else {
                                jOooO0OO = DurationKt.MAX_MILLIS;
                            }
                            objectRef = new Ref.ObjectRef();
                            try {
                                OooO0O0 oooO0O0 = new OooO0O0(null);
                                this.f1628OoooO0 = oooOOO2;
                                this.f1624Oooo0o = o0oo0oo2;
                                this.f1625Oooo0oO = objectRef;
                                this.f1626Oooo0oo = objectRef;
                                this.f1623Oooo = jOooO0OO;
                                this.f1629OoooO00 = 2;
                                objO00O0O = oooOOO2.o00O0O(jOooO0OO, oooO0O0, this);
                                if (objO00O0O == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                oooOOO3 = oooOOO2;
                                o0oo0oo3 = o0oo0oo2;
                                objectRef3 = objectRef;
                                t = objO00O0O;
                                try {
                                    objectRef.element = t;
                                    t2 = objectRef3.element;
                                    if (t2 == 0) {
                                        this.f1630OoooO0O.OooOOO();
                                    } else {
                                        ((o0Oo0oo) t2).OooO00o();
                                        this.f1630OoooO0O.OooOOoo();
                                    }
                                    break;
                                } catch (PointerEventTimeoutCancellationException unused) {
                                    objectRef4 = objectRef3;
                                    oooOOO4 = oooOOO3;
                                    function1 = this.f1634o000oOoO;
                                    if (function1 != null) {
                                        function1.invoke(new o00O0O.OooO(o0oo0oo3.f39744OooO0OO));
                                    }
                                    this.f1628OoooO0 = oooOOO4;
                                    this.f1624Oooo0o = objectRef4;
                                    this.f1625Oooo0oO = null;
                                    this.f1626Oooo0oo = null;
                                    this.f1623Oooo = jOooO0OO;
                                    this.f1629OoooO00 = 3;
                                    if (o000OOo0.OooO00o(oooOOO4, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    this.f1630OoooO0O.OooOOoo();
                                    objectRef3 = objectRef4;
                                    oooOOO3 = oooOOO4;
                                }
                                t3 = objectRef3.element;
                                if (t3 != 0) {
                                    if (this.f1632OoooOOO == null) {
                                        function2 = this.f1633OoooOOo;
                                        if (function2 != null) {
                                            function2.invoke(new o00O0O.OooO(((o0Oo0oo) t3).f39744OooO0OO));
                                        }
                                    } else {
                                        this.f1628OoooO0 = oooOOO3;
                                        this.f1624Oooo0o = objectRef3;
                                        this.f1625Oooo0oO = null;
                                        this.f1626Oooo0oo = null;
                                        this.f1623Oooo = jOooO0OO;
                                        this.f1629OoooO00 = 4;
                                        Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> function8 = o000OOo0.f1578OooO00o;
                                        objOooo0o0 = oooOOO3.Oooo0o0(oooOOO3.getViewConfiguration().OooO00o(), new o00((o0Oo0oo) t3, null), this);
                                        if (objOooo0o0 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        j = jOooO0OO;
                                        objectRef5 = objectRef3;
                                        oooOOO5 = oooOOO3;
                                        o0oo0oo4 = (o0Oo0oo) objOooo0o0;
                                        if (o0oo0oo4 == null) {
                                            function5 = this.f1633OoooOOo;
                                            if (function5 != null) {
                                                function5.invoke(new o00O0O.OooO(((o0Oo0oo) objectRef5.element).f39744OooO0OO));
                                            }
                                        } else {
                                            this.f1630OoooO0O.OooOo0o();
                                            function4 = this.f1627OoooO;
                                            if (function4 != o000OOo0.f1578OooO00o) {
                                                BuildersKt__Builders_commonKt.launch$default(this.f1631OoooOO0, null, null, new OooO0OO(function4, this.f1630OoooO0O, o0oo0oo4, null), 3, null);
                                            }
                                            try {
                                                c0018OooO0o = new C0018OooO0o(this.f1630OoooO0O, this.f1632OoooOOO, this.f1633OoooOOo, objectRef5, null);
                                                this.f1628OoooO0 = oooOOO5;
                                                this.f1624Oooo0o = objectRef5;
                                                this.f1625Oooo0oO = o0oo0oo4;
                                                this.f1629OoooO00 = 5;
                                                if (oooOOO5.o00O0O(j, c0018OooO0o, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } catch (PointerEventTimeoutCancellationException unused2) {
                                                objectRef6 = objectRef5;
                                                oooOOO6 = oooOOO5;
                                                function6 = this.f1633OoooOOo;
                                                if (function6 != null) {
                                                    function6.invoke(new o00O0O.OooO(((o0Oo0oo) objectRef6.element).f39744OooO0OO));
                                                }
                                                function7 = this.f1634o000oOoO;
                                                if (function7 != null) {
                                                    function7.invoke(new o00O0O.OooO(o0oo0oo4.f39744OooO0OO));
                                                }
                                                this.f1628OoooO0 = null;
                                                this.f1624Oooo0o = null;
                                                this.f1625Oooo0oO = null;
                                                this.f1629OoooO00 = 6;
                                                if (o000OOo0.OooO00o(oooOOO6, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                this.f1630OoooO0O.OooOOoo();
                                            }
                                        }
                                    }
                                }
                                return Unit.INSTANCE;
                            } catch (PointerEventTimeoutCancellationException unused3) {
                                objectRef2 = objectRef;
                                objectRef4 = objectRef2;
                                oooOOO4 = oooOOO2;
                                o0oo0oo3 = o0oo0oo2;
                                function1 = this.f1634o000oOoO;
                                if (function1 != null) {
                                    function1.invoke(new o00O0O.OooO(o0oo0oo3.f39744OooO0OO));
                                }
                                this.f1628OoooO0 = oooOOO4;
                                this.f1624Oooo0o = objectRef4;
                                this.f1625Oooo0oO = null;
                                this.f1626Oooo0oo = null;
                                this.f1623Oooo = jOooO0OO;
                                this.f1629OoooO00 = 3;
                                if (o000OOo0.OooO00o(oooOOO4, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                this.f1630OoooO0O.OooOOoo();
                                objectRef3 = objectRef4;
                                oooOOO3 = oooOOO4;
                                t3 = objectRef3.element;
                                if (t3 != 0) {
                                    if (this.f1632OoooOOO == null) {
                                        function2 = this.f1633OoooOOo;
                                        if (function2 != null) {
                                            function2.invoke(new o00O0O.OooO(((o0Oo0oo) t3).f39744OooO0OO));
                                        }
                                    } else {
                                        this.f1628OoooO0 = oooOOO3;
                                        this.f1624Oooo0o = objectRef3;
                                        this.f1625Oooo0oO = null;
                                        this.f1626Oooo0oo = null;
                                        this.f1623Oooo = jOooO0OO;
                                        this.f1629OoooO00 = 4;
                                        Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> function9 = o000OOo0.f1578OooO00o;
                                        objOooo0o0 = oooOOO3.Oooo0o0(oooOOO3.getViewConfiguration().OooO00o(), new o00((o0Oo0oo) t3, null), this);
                                        if (objOooo0o0 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        j = jOooO0OO;
                                        objectRef5 = objectRef3;
                                        oooOOO5 = oooOOO3;
                                        o0oo0oo4 = (o0Oo0oo) objOooo0o0;
                                        if (o0oo0oo4 == null) {
                                            function5 = this.f1633OoooOOo;
                                            if (function5 != null) {
                                                function5.invoke(new o00O0O.OooO(((o0Oo0oo) objectRef5.element).f39744OooO0OO));
                                            }
                                        } else {
                                            this.f1630OoooO0O.OooOo0o();
                                            function4 = this.f1627OoooO;
                                            if (function4 != o000OOo0.f1578OooO00o) {
                                                BuildersKt__Builders_commonKt.launch$default(this.f1631OoooOO0, null, null, new OooO0OO(function4, this.f1630OoooO0O, o0oo0oo4, null), 3, null);
                                            }
                                            c0018OooO0o = new C0018OooO0o(this.f1630OoooO0O, this.f1632OoooOOO, this.f1633OoooOOo, objectRef5, null);
                                            this.f1628OoooO0 = oooOOO5;
                                            this.f1624Oooo0o = objectRef5;
                                            this.f1625Oooo0oO = o0oo0oo4;
                                            this.f1629OoooO00 = 5;
                                            if (oooOOO5.o00O0O(j, c0018OooO0o, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        case 1:
                            oooOOO = (OooOOO) this.f1628OoooO0;
                            ResultKt.throwOnFailure(obj);
                            objOooO0O0 = obj;
                            oooOOO2 = oooOOO;
                            o0oo0oo2 = (o0Oo0oo) objOooO0O0;
                            o0oo0oo2.OooO00o();
                            this.f1630OoooO0O.OooOo0o();
                            function3 = this.f1627OoooO;
                            if (function3 != o000OOo0.f1578OooO00o) {
                                BuildersKt__Builders_commonKt.launch$default(this.f1631OoooOO0, null, null, new C0017OooO00o(function3, this.f1630OoooO0O, o0oo0oo2, null), 3, null);
                            }
                            if (this.f1634o000oOoO != null) {
                                jOooO0OO = oooOOO2.getViewConfiguration().OooO0OO();
                            } else {
                                jOooO0OO = DurationKt.MAX_MILLIS;
                            }
                            objectRef = new Ref.ObjectRef();
                            OooO0O0 oooO0O1 = new OooO0O0(null);
                            this.f1628OoooO0 = oooOOO2;
                            this.f1624Oooo0o = o0oo0oo2;
                            this.f1625Oooo0oO = objectRef;
                            this.f1626Oooo0oo = objectRef;
                            this.f1623Oooo = jOooO0OO;
                            this.f1629OoooO00 = 2;
                            objO00O0O = oooOOO2.o00O0O(jOooO0OO, oooO0O1, this);
                            if (objO00O0O == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            oooOOO3 = oooOOO2;
                            o0oo0oo3 = o0oo0oo2;
                            objectRef3 = objectRef;
                            t = objO00O0O;
                            objectRef.element = t;
                            t2 = objectRef3.element;
                            if (t2 == 0) {
                                this.f1630OoooO0O.OooOOO();
                            } else {
                                ((o0Oo0oo) t2).OooO00o();
                                this.f1630OoooO0O.OooOOoo();
                            }
                            t3 = objectRef3.element;
                            if (t3 != 0) {
                                if (this.f1632OoooOOO == null) {
                                    function2 = this.f1633OoooOOo;
                                    if (function2 != null) {
                                        function2.invoke(new o00O0O.OooO(((o0Oo0oo) t3).f39744OooO0OO));
                                    }
                                } else {
                                    this.f1628OoooO0 = oooOOO3;
                                    this.f1624Oooo0o = objectRef3;
                                    this.f1625Oooo0oO = null;
                                    this.f1626Oooo0oo = null;
                                    this.f1623Oooo = jOooO0OO;
                                    this.f1629OoooO00 = 4;
                                    Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> function10 = o000OOo0.f1578OooO00o;
                                    objOooo0o0 = oooOOO3.Oooo0o0(oooOOO3.getViewConfiguration().OooO00o(), new o00((o0Oo0oo) t3, null), this);
                                    if (objOooo0o0 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    j = jOooO0OO;
                                    objectRef5 = objectRef3;
                                    oooOOO5 = oooOOO3;
                                    o0oo0oo4 = (o0Oo0oo) objOooo0o0;
                                    if (o0oo0oo4 == null) {
                                        function5 = this.f1633OoooOOo;
                                        if (function5 != null) {
                                            function5.invoke(new o00O0O.OooO(((o0Oo0oo) objectRef5.element).f39744OooO0OO));
                                        }
                                    } else {
                                        this.f1630OoooO0O.OooOo0o();
                                        function4 = this.f1627OoooO;
                                        if (function4 != o000OOo0.f1578OooO00o) {
                                            BuildersKt__Builders_commonKt.launch$default(this.f1631OoooOO0, null, null, new OooO0OO(function4, this.f1630OoooO0O, o0oo0oo4, null), 3, null);
                                        }
                                        c0018OooO0o = new C0018OooO0o(this.f1630OoooO0O, this.f1632OoooOOO, this.f1633OoooOOo, objectRef5, null);
                                        this.f1628OoooO0 = oooOOO5;
                                        this.f1624Oooo0o = objectRef5;
                                        this.f1625Oooo0oO = o0oo0oo4;
                                        this.f1629OoooO00 = 5;
                                        if (oooOOO5.o00O0O(j, c0018OooO0o, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        case 2:
                            jOooO0OO = this.f1623Oooo;
                            objectRef = this.f1626Oooo0oo;
                            objectRef2 = (Ref.ObjectRef) this.f1625Oooo0oO;
                            o0oo0oo2 = (o0Oo0oo) this.f1624Oooo0o;
                            oooOOO2 = (OooOOO) this.f1628OoooO0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                oooOOO3 = oooOOO2;
                                o0oo0oo3 = o0oo0oo2;
                                objectRef3 = objectRef2;
                                t = obj;
                                objectRef.element = t;
                                t2 = objectRef3.element;
                                if (t2 == 0) {
                                    this.f1630OoooO0O.OooOOO();
                                } else {
                                    ((o0Oo0oo) t2).OooO00o();
                                    this.f1630OoooO0O.OooOOoo();
                                }
                                break;
                            } catch (PointerEventTimeoutCancellationException unused4) {
                                objectRef4 = objectRef2;
                                oooOOO4 = oooOOO2;
                                o0oo0oo3 = o0oo0oo2;
                                function1 = this.f1634o000oOoO;
                                if (function1 != null) {
                                    function1.invoke(new o00O0O.OooO(o0oo0oo3.f39744OooO0OO));
                                }
                                this.f1628OoooO0 = oooOOO4;
                                this.f1624Oooo0o = objectRef4;
                                this.f1625Oooo0oO = null;
                                this.f1626Oooo0oo = null;
                                this.f1623Oooo = jOooO0OO;
                                this.f1629OoooO00 = 3;
                                if (o000OOo0.OooO00o(oooOOO4, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                this.f1630OoooO0O.OooOOoo();
                                objectRef3 = objectRef4;
                                oooOOO3 = oooOOO4;
                                t3 = objectRef3.element;
                                if (t3 != 0) {
                                    if (this.f1632OoooOOO == null) {
                                        function2 = this.f1633OoooOOo;
                                        if (function2 != null) {
                                            function2.invoke(new o00O0O.OooO(((o0Oo0oo) t3).f39744OooO0OO));
                                        }
                                    } else {
                                        this.f1628OoooO0 = oooOOO3;
                                        this.f1624Oooo0o = objectRef3;
                                        this.f1625Oooo0oO = null;
                                        this.f1626Oooo0oo = null;
                                        this.f1623Oooo = jOooO0OO;
                                        this.f1629OoooO00 = 4;
                                        Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> function11 = o000OOo0.f1578OooO00o;
                                        objOooo0o0 = oooOOO3.Oooo0o0(oooOOO3.getViewConfiguration().OooO00o(), new o00((o0Oo0oo) t3, null), this);
                                        if (objOooo0o0 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        j = jOooO0OO;
                                        objectRef5 = objectRef3;
                                        oooOOO5 = oooOOO3;
                                        o0oo0oo4 = (o0Oo0oo) objOooo0o0;
                                        if (o0oo0oo4 == null) {
                                            function5 = this.f1633OoooOOo;
                                            if (function5 != null) {
                                                function5.invoke(new o00O0O.OooO(((o0Oo0oo) objectRef5.element).f39744OooO0OO));
                                            }
                                        } else {
                                            this.f1630OoooO0O.OooOo0o();
                                            function4 = this.f1627OoooO;
                                            if (function4 != o000OOo0.f1578OooO00o) {
                                                BuildersKt__Builders_commonKt.launch$default(this.f1631OoooOO0, null, null, new OooO0OO(function4, this.f1630OoooO0O, o0oo0oo4, null), 3, null);
                                            }
                                            c0018OooO0o = new C0018OooO0o(this.f1630OoooO0O, this.f1632OoooOOO, this.f1633OoooOOo, objectRef5, null);
                                            this.f1628OoooO0 = oooOOO5;
                                            this.f1624Oooo0o = objectRef5;
                                            this.f1625Oooo0oO = o0oo0oo4;
                                            this.f1629OoooO00 = 5;
                                            if (oooOOO5.o00O0O(j, c0018OooO0o, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            t3 = objectRef3.element;
                            if (t3 != 0) {
                                if (this.f1632OoooOOO == null) {
                                    function2 = this.f1633OoooOOo;
                                    if (function2 != null) {
                                        function2.invoke(new o00O0O.OooO(((o0Oo0oo) t3).f39744OooO0OO));
                                    }
                                } else {
                                    this.f1628OoooO0 = oooOOO3;
                                    this.f1624Oooo0o = objectRef3;
                                    this.f1625Oooo0oO = null;
                                    this.f1626Oooo0oo = null;
                                    this.f1623Oooo = jOooO0OO;
                                    this.f1629OoooO00 = 4;
                                    Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> function12 = o000OOo0.f1578OooO00o;
                                    objOooo0o0 = oooOOO3.Oooo0o0(oooOOO3.getViewConfiguration().OooO00o(), new o00((o0Oo0oo) t3, null), this);
                                    if (objOooo0o0 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    j = jOooO0OO;
                                    objectRef5 = objectRef3;
                                    oooOOO5 = oooOOO3;
                                    o0oo0oo4 = (o0Oo0oo) objOooo0o0;
                                    if (o0oo0oo4 == null) {
                                        function5 = this.f1633OoooOOo;
                                        if (function5 != null) {
                                            function5.invoke(new o00O0O.OooO(((o0Oo0oo) objectRef5.element).f39744OooO0OO));
                                        }
                                    } else {
                                        this.f1630OoooO0O.OooOo0o();
                                        function4 = this.f1627OoooO;
                                        if (function4 != o000OOo0.f1578OooO00o) {
                                            BuildersKt__Builders_commonKt.launch$default(this.f1631OoooOO0, null, null, new OooO0OO(function4, this.f1630OoooO0O, o0oo0oo4, null), 3, null);
                                        }
                                        c0018OooO0o = new C0018OooO0o(this.f1630OoooO0O, this.f1632OoooOOO, this.f1633OoooOOo, objectRef5, null);
                                        this.f1628OoooO0 = oooOOO5;
                                        this.f1624Oooo0o = objectRef5;
                                        this.f1625Oooo0oO = o0oo0oo4;
                                        this.f1629OoooO00 = 5;
                                        if (oooOOO5.o00O0O(j, c0018OooO0o, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        case 3:
                            jOooO0OO = this.f1623Oooo;
                            objectRef4 = (Ref.ObjectRef) this.f1624Oooo0o;
                            oooOOO4 = (OooOOO) this.f1628OoooO0;
                            ResultKt.throwOnFailure(obj);
                            this.f1630OoooO0O.OooOOoo();
                            objectRef3 = objectRef4;
                            oooOOO3 = oooOOO4;
                            t3 = objectRef3.element;
                            if (t3 != 0) {
                                if (this.f1632OoooOOO == null) {
                                    function2 = this.f1633OoooOOo;
                                    if (function2 != null) {
                                        function2.invoke(new o00O0O.OooO(((o0Oo0oo) t3).f39744OooO0OO));
                                    }
                                } else {
                                    this.f1628OoooO0 = oooOOO3;
                                    this.f1624Oooo0o = objectRef3;
                                    this.f1625Oooo0oO = null;
                                    this.f1626Oooo0oo = null;
                                    this.f1623Oooo = jOooO0OO;
                                    this.f1629OoooO00 = 4;
                                    Function3<o0000O00, o00O0O.OooO, Continuation<? super Unit>, Object> function13 = o000OOo0.f1578OooO00o;
                                    objOooo0o0 = oooOOO3.Oooo0o0(oooOOO3.getViewConfiguration().OooO00o(), new o00((o0Oo0oo) t3, null), this);
                                    if (objOooo0o0 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    j = jOooO0OO;
                                    objectRef5 = objectRef3;
                                    oooOOO5 = oooOOO3;
                                    o0oo0oo4 = (o0Oo0oo) objOooo0o0;
                                    if (o0oo0oo4 == null) {
                                        function5 = this.f1633OoooOOo;
                                        if (function5 != null) {
                                            function5.invoke(new o00O0O.OooO(((o0Oo0oo) objectRef5.element).f39744OooO0OO));
                                        }
                                    } else {
                                        this.f1630OoooO0O.OooOo0o();
                                        function4 = this.f1627OoooO;
                                        if (function4 != o000OOo0.f1578OooO00o) {
                                            BuildersKt__Builders_commonKt.launch$default(this.f1631OoooOO0, null, null, new OooO0OO(function4, this.f1630OoooO0O, o0oo0oo4, null), 3, null);
                                        }
                                        c0018OooO0o = new C0018OooO0o(this.f1630OoooO0O, this.f1632OoooOOO, this.f1633OoooOOo, objectRef5, null);
                                        this.f1628OoooO0 = oooOOO5;
                                        this.f1624Oooo0o = objectRef5;
                                        this.f1625Oooo0oO = o0oo0oo4;
                                        this.f1629OoooO00 = 5;
                                        if (oooOOO5.o00O0O(j, c0018OooO0o, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        case 4:
                            long j2 = this.f1623Oooo;
                            Ref.ObjectRef objectRef7 = (Ref.ObjectRef) this.f1624Oooo0o;
                            OooOOO oooOOO7 = (OooOOO) this.f1628OoooO0;
                            ResultKt.throwOnFailure(obj);
                            objectRef5 = objectRef7;
                            j = j2;
                            oooOOO5 = oooOOO7;
                            objOooo0o0 = obj;
                            o0oo0oo4 = (o0Oo0oo) objOooo0o0;
                            if (o0oo0oo4 == null) {
                                function5 = this.f1633OoooOOo;
                                if (function5 != null) {
                                    function5.invoke(new o00O0O.OooO(((o0Oo0oo) objectRef5.element).f39744OooO0OO));
                                }
                            } else {
                                this.f1630OoooO0O.OooOo0o();
                                function4 = this.f1627OoooO;
                                if (function4 != o000OOo0.f1578OooO00o) {
                                    BuildersKt__Builders_commonKt.launch$default(this.f1631OoooOO0, null, null, new OooO0OO(function4, this.f1630OoooO0O, o0oo0oo4, null), 3, null);
                                }
                                c0018OooO0o = new C0018OooO0o(this.f1630OoooO0O, this.f1632OoooOOO, this.f1633OoooOOo, objectRef5, null);
                                this.f1628OoooO0 = oooOOO5;
                                this.f1624Oooo0o = objectRef5;
                                this.f1625Oooo0oO = o0oo0oo4;
                                this.f1629OoooO00 = 5;
                                if (oooOOO5.o00O0O(j, c0018OooO0o, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        case 5:
                            o0oo0oo4 = (o0Oo0oo) this.f1625Oooo0oO;
                            objectRef6 = (Ref.ObjectRef) this.f1624Oooo0o;
                            oooOOO6 = (OooOOO) this.f1628OoooO0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                break;
                            } catch (PointerEventTimeoutCancellationException unused5) {
                                function6 = this.f1633OoooOOo;
                                if (function6 != null) {
                                    function6.invoke(new o00O0O.OooO(((o0Oo0oo) objectRef6.element).f39744OooO0OO));
                                }
                                function7 = this.f1634o000oOoO;
                                if (function7 != null) {
                                    function7.invoke(new o00O0O.OooO(o0oo0oo4.f39744OooO0OO));
                                }
                                this.f1628OoooO0 = null;
                                this.f1624Oooo0o = null;
                                this.f1625Oooo0oO = null;
                                this.f1629OoooO00 = 6;
                                if (o000OOo0.OooO00o(oooOOO6, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                this.f1630OoooO0O.OooOOoo();
                            }
                            return Unit.INSTANCE;
                        case 6:
                            ResultKt.throwOnFailure(obj);
                            this.f1630OoooO0O.OooOOoo();
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(o0000oo o0000ooVar, Function3<? super o0000O00, ? super o00O0O.OooO, ? super Continuation<? super Unit>, ? extends Object> function3, CoroutineScope coroutineScope, Function1<? super o00O0O.OooO, Unit> function1, Function1<? super o00O0O.OooO, Unit> function2, Function1<? super o00O0O.OooO, Unit> function4, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f1618Oooo0oo = o0000ooVar;
                this.f1615Oooo = function3;
                this.f1621OoooO00 = coroutineScope;
                this.f1620OoooO0 = function1;
                this.f1622OoooO0O = function2;
                this.f1619OoooO = function4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f1618Oooo0oo, this.f1615Oooo, this.f1621OoooO00, this.f1620OoooO0, this.f1622OoooO0O, this.f1619OoooO, continuation);
                oooO00o.f1617Oooo0oO = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(o00000 o00000Var, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(o00000Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f1616Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o00000 o00000Var = (o00000) this.f1617Oooo0oO;
                    C0016OooO00o c0016OooO00o = new C0016OooO00o(this.f1618Oooo0oo, this.f1615Oooo, this.f1621OoooO00, this.f1620OoooO0, this.f1622OoooO0O, this.f1619OoooO, null);
                    this.f1616Oooo0o = 1;
                    if (o00000Var.Oooo0OO(c0016OooO00o, this) == coroutine_suspended) {
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
        public OooO0o(o00000 o00000Var, Function3<? super o0000O00, ? super o00O0O.OooO, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super o00O0O.OooO, Unit> function1, Function1<? super o00O0O.OooO, Unit> function2, Function1<? super o00O0O.OooO, Unit> function4, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f1611Oooo0oo = o00000Var;
            this.f1608Oooo = function3;
            this.f1613OoooO00 = function1;
            this.f1612OoooO0 = function2;
            this.f1614OoooO0O = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f1611Oooo0oo, this.f1608Oooo, this.f1613OoooO00, this.f1612OoooO0, this.f1614OoooO0O, continuation);
            oooO0o.f1610Oooo0oO = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1609Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f1610Oooo0oO;
                o0000oo o0000ooVar = new o0000oo(this.f1611Oooo0oo);
                o00000 o00000Var = this.f1611Oooo0oo;
                OooO00o oooO00o = new OooO00o(o0000ooVar, this.f1608Oooo, coroutineScope, this.f1613OoooO00, this.f1612OoooO0, this.f1614OoooO0O, null);
                this.f1609Oooo0o = 1;
                if (o00000O0.OooO0O0(o00000Var, oooO00o, this) == coroutine_suspended) {
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

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f A[LOOP:1: B:22:0x0061->B:26:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at java.base/java.util.HashMap.put(HashMap.java:610)
        	at java.base/java.util.HashSet.add(HashSet.java:221)
        	at jadx.core.utils.BlockUtils.addPredecessors(BlockUtils.java:703)
        	at jadx.core.utils.BlockUtils.addPredecessors(BlockUtils.java:706)
        */
    public static final java.lang.Object OooO00o(p418o0Oo0oo.OooOOO r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof p025Oooo0O0.o00O0000
            if (r0 == 0) goto L13
            r0 = r9
            Oooo0O0.o00O0000 r0 = (p025Oooo0O0.o00O0000) r0
            int r1 = r0.f1655Oooo0oo
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1655Oooo0oo = r1
            goto L18
        L13:
            Oooo0O0.o00O0000 r0 = new Oooo0O0.o00O0000
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f1654Oooo0oO
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1655Oooo0oo
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            o0Oo0oo.OooOOO r8 = r0.f1653Oooo0o
            kotlin.ResultKt.throwOnFailure(r9)
            goto L42
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.ResultKt.throwOnFailure(r9)
        L36:
            r0.f1653Oooo0o = r8
            r0.f1655Oooo0oo = r3
            r9 = 0
            java.lang.Object r9 = o00OO0O0.o0OOO0o.OooO00o(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L42
            goto L76
        L42:
            o0Oo0oo.o00Oo0 r9 = (p418o0Oo0oo.o00Oo0) r9
            java.util.List<o0Oo0oo.o0Oo0oo> r2 = r9.f39723OooO00o
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L4c:
            if (r6 >= r4) goto L5a
            java.lang.Object r7 = r2.get(r6)
            o0Oo0oo.o0Oo0oo r7 = (p418o0Oo0oo.o0Oo0oo) r7
            r7.OooO00o()
            int r6 = r6 + 1
            goto L4c
        L5a:
            java.util.List<o0Oo0oo.o0Oo0oo> r9 = r9.f39723OooO00o
            int r2 = r9.size()
            r4 = 0
        L61:
            if (r4 >= r2) goto L72
            java.lang.Object r6 = r9.get(r4)
            o0Oo0oo.o0Oo0oo r6 = (p418o0Oo0oo.o0Oo0oo) r6
            boolean r6 = r6.f39745OooO0Oo
            if (r6 == 0) goto L6f
            r5 = 1
            goto L72
        L6f:
            int r4 = r4 + 1
            goto L61
        L72:
            if (r5 != 0) goto L36
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p025Oooo0O0.o000OOo0.OooO00o(o0Oo0oo.OooOOO, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final Object OooO0O0(@NotNull OooOOO oooOOO, boolean z, @NotNull Continuation<? super o0Oo0oo> continuation) {
        return OooO0OO(oooOOO, PointerEventPass.Main, z, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d A[LOOP:0: B:19:0x0056->B:26:0x006d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:18:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object OooO0OO(@org.jetbrains.annotations.NotNull p418o0Oo0oo.OooOOO r9, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.PointerEventPass r10, boolean r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super p418o0Oo0oo.o0Oo0oo> r12) {
        /*
            boolean r0 = r12 instanceof Oooo0O0.o000OOo0.OooO0O0
            if (r0 == 0) goto L13
            r0 = r12
            Oooo0O0.o000OOo0$OooO0O0 r0 = (Oooo0O0.o000OOo0.OooO0O0) r0
            int r1 = r0.f1586OoooO00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1586OoooO00 = r1
            goto L18
        L13:
            Oooo0O0.o000OOo0$OooO0O0 r0 = new Oooo0O0.o000OOo0$OooO0O0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f1582Oooo
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1586OoooO00
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r9 = r0.f1585Oooo0oo
            androidx.compose.ui.input.pointer.PointerEventPass r10 = r0.f1584Oooo0oO
            o0Oo0oo.OooOOO r11 = r0.f1583Oooo0o
            kotlin.ResultKt.throwOnFailure(r12)
            r8 = r11
            r11 = r9
            r9 = r8
            goto L4c
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            kotlin.ResultKt.throwOnFailure(r12)
        L3d:
            r0.f1583Oooo0o = r9
            r0.f1584Oooo0oO = r10
            r0.f1585Oooo0oo = r11
            r0.f1586OoooO00 = r3
            java.lang.Object r12 = r9.OooOo0(r10, r0)
            if (r12 != r1) goto L4c
            return r1
        L4c:
            o0Oo0oo.o00Oo0 r12 = (p418o0Oo0oo.o00Oo0) r12
            java.util.List<o0Oo0oo.o0Oo0oo> r2 = r12.f39723OooO00o
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L56:
            if (r6 >= r4) goto L70
            java.lang.Object r7 = r2.get(r6)
            o0Oo0oo.o0Oo0oo r7 = (p418o0Oo0oo.o0Oo0oo) r7
            if (r11 == 0) goto L65
            boolean r7 = p418o0Oo0oo.o00Ooo.OooO00o(r7)
            goto L69
        L65:
            boolean r7 = p418o0Oo0oo.o00Ooo.OooO0O0(r7)
        L69:
            if (r7 != 0) goto L6d
            r2 = 0
            goto L71
        L6d:
            int r6 = r6 + 1
            goto L56
        L70:
            r2 = 1
        L71:
            if (r2 == 0) goto L3d
            java.util.List<o0Oo0oo.o0Oo0oo> r9 = r12.f39723OooO00o
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p025Oooo0O0.o000OOo0.OooO0OO(o0Oo0oo.OooOOO, androidx.compose.ui.input.pointer.PointerEventPass, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final Object OooO0Oo(@NotNull o00000 o00000Var, @NotNull Function3<? super o0000O00, ? super o00O0O.OooO, ? super Continuation<? super Unit>, ? extends Object> function3, @Nullable Function1<? super o00O0O.OooO, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objOooO0O0 = o00000O0.OooO0O0(o00000Var, new OooO0OO(new o0000oo(o00000Var), function3, function1, null), continuation);
        return objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0O0 : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[LOOP:1: B:21:0x0058->B:25:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00b1 -> B:48:0x00b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object OooO0o(@org.jetbrains.annotations.NotNull p418o0Oo0oo.OooOOO r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super p418o0Oo0oo.o0Oo0oo> r14) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p025Oooo0O0.o000OOo0.OooO0o(o0Oo0oo.OooOOO, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public static final Object OooO0o0(@NotNull o00000 o00000Var, @Nullable Function1<? super o00O0O.OooO, Unit> function1, @Nullable Function1<? super o00O0O.OooO, Unit> function2, @NotNull Function3<? super o0000O00, ? super o00O0O.OooO, ? super Continuation<? super Unit>, ? extends Object> function3, @Nullable Function1<? super o00O0O.OooO, Unit> function4, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OooO0o(o00000Var, function3, function2, function1, function4, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
