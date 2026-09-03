package p025Oooo0O0;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p418o0Oo0oo.OooOOO;
import p418o0Oo0oo.o00000;
import p418o0Oo0oo.o00Ooo;
import p418o0Oo0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", i = {0, 1}, l = {276, 280, 284}, m = "invokeSuspend", n = {"$this$forEachGesture", "$this$forEachGesture"}, s = {"L$0", "L$0"})
public final class o0OoOo0 extends SuspendLambda implements Function2<o00000, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f1694Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f1695Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f1696Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<OooO, Unit> f1697Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Function2<o0Oo0oo, OooO, Unit> f1698OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f1699OoooO00;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1", f = "DragGestureDetector.kt", i = {0}, l = {286}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    public static final class OooO00o extends RestrictedSuspendLambda implements Function2<OooOOO, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f1700Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f1701Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f1702Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0Oo0oo f1703Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function2<o0Oo0oo, OooO, Unit> f1704OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f1705OoooO00;

        /* JADX INFO: renamed from: Oooo0O0.o0OoOo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0019OooO00o extends Lambda implements Function1<o0Oo0oo, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function2<o0Oo0oo, OooO, Unit> f1706Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0019OooO00o(Function2<? super o0Oo0oo, ? super OooO, Unit> function2) {
                super(1);
                this.f1706Oooo0o = function2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o0Oo0oo o0oo0oo2) {
                o0Oo0oo it = o0oo0oo2;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f1706Oooo0o.invoke(it, new OooO(o00Ooo.OooO0oO(it)));
                it.OooO00o();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(o0Oo0oo o0oo0oo2, Function0<Unit> function0, Function0<Unit> function1, Function2<? super o0Oo0oo, ? super OooO, Unit> function2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f1703Oooo0oo = o0oo0oo2;
            this.f1700Oooo = function0;
            this.f1705OoooO00 = function1;
            this.f1704OoooO0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f1703Oooo0oo, this.f1700Oooo, this.f1705OoooO00, this.f1704OoooO0, continuation);
            oooO00o.f1702Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOO oooOOO, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(oooOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OooOOO oooOOO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1701Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOO oooOOO2 = (OooOOO) this.f1702Oooo0oO;
                long j = this.f1703Oooo0oo.f39742OooO00o;
                C0019OooO00o c0019OooO00o = new C0019OooO00o(this.f1704OoooO0);
                this.f1702Oooo0oO = oooOOO2;
                this.f1701Oooo0o = 1;
                Object objOooO0oO = OooOo.OooO0oO(oooOOO2, j, c0019OooO00o, this);
                if (objOooO0oO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOOO = oooOOO2;
                obj = objOooO0oO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOO = (OooOOO) this.f1702Oooo0oO;
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                List<o0Oo0oo> list = oooOOO.OooOoO0().f39723OooO00o;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    o0Oo0oo o0oo0oo2 = list.get(i2);
                    if (o00Ooo.OooO0OO(o0oo0oo2)) {
                        o0oo0oo2.OooO00o();
                    }
                }
                this.f1700Oooo.invoke();
            } else {
                this.f1705OoooO00.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1", f = "DragGestureDetector.kt", i = {}, l = {277}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends RestrictedSuspendLambda implements Function2<OooOOO, Continuation<? super o0Oo0oo>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f1707Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f1708Oooo0oO;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(continuation);
            oooO0O0.f1708Oooo0oO = obj;
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
            int i = this.f1707Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOO oooOOO = (OooOOO) this.f1708Oooo0oO;
                this.f1707Oooo0o = 1;
                obj = o000OOo0.OooO0O0(oooOOO, false, this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0OoOo0(Function1<? super OooO, Unit> function1, Function0<Unit> function0, Function0<Unit> function2, Function2<? super o0Oo0oo, ? super OooO, Unit> function3, Continuation<? super o0OoOo0> continuation) {
        super(2, continuation);
        this.f1697Oooo0oo = function1;
        this.f1694Oooo = function0;
        this.f1699OoooO00 = function2;
        this.f1698OoooO0 = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0OoOo0 o0oooo1 = new o0OoOo0(this.f1697Oooo0oo, this.f1694Oooo, this.f1699OoooO00, this.f1698OoooO0, continuation);
        o0oooo1.f1696Oooo0oO = obj;
        return o0oooo1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00000 o00000Var, Continuation<? super Unit> continuation) {
        return ((o0OoOo0) create(o00000Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005c A[Catch: CancellationException -> 0x0016, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0016, blocks: (B:7:0x0012, B:14:0x0024, B:25:0x0057, B:27:0x005c, B:22:0x004c), top: B:34:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:29:0x007f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o00000 o00000Var;
        o0Oo0oo o0oo0oo2;
        OooO00o oooO00o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1695Oooo0o;
        try {
            if (i != 0) {
                if (i == 1) {
                    o00000Var = (o00000) this.f1696Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    o00000Var = (o00000) this.f1696Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                    o0oo0oo2 = (o0Oo0oo) obj;
                    if (o0oo0oo2 != null) {
                        this.f1697Oooo0oo.invoke(new OooO(o0oo0oo2.f39744OooO0OO));
                        oooO00o = new OooO00o(o0oo0oo2, this.f1699OoooO00, this.f1694Oooo, this.f1698OoooO0, null);
                        this.f1696Oooo0oO = null;
                        this.f1695Oooo0o = 3;
                        if (o00000Var.Oooo0OO(oooO00o, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            o00000 o00000Var2 = (o00000) this.f1696Oooo0oO;
            OooO0O0 oooO0O0 = new OooO0O0(null);
            this.f1696Oooo0oO = o00000Var2;
            this.f1695Oooo0o = 1;
            Object objOooo0OO = o00000Var2.Oooo0OO(oooO0O0, this);
            if (objOooo0OO == coroutine_suspended) {
                return coroutine_suspended;
            }
            o00000Var = o00000Var2;
            obj = objOooo0OO;
            o0Oo0oo o0oo0oo3 = (o0Oo0oo) obj;
            this.f1696Oooo0oO = o00000Var;
            this.f1695Oooo0o = 2;
            obj = OooOo.OooO00o(o00000Var, o0oo0oo3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            o0oo0oo2 = (o0Oo0oo) obj;
            if (o0oo0oo2 != null) {
                this.f1697Oooo0oo.invoke(new OooO(o0oo0oo2.f39744OooO0OO));
                oooO00o = new OooO00o(o0oo0oo2, this.f1699OoooO00, this.f1694Oooo, this.f1698OoooO0, null);
                this.f1696Oooo0oO = null;
                this.f1695Oooo0o = 3;
                if (o00000Var.Oooo0OO(oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            this.f1694Oooo.invoke();
            throw e;
        }
    }
}
