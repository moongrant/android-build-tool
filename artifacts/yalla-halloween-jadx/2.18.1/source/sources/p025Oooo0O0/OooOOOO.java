package p025Oooo0O0;

import Oooo0.o00O0O0O;
import Oooo0.o00O0OO0;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function1<Float, Float> f1383OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f1384OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00O0O0O f1385OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0O00OO<Boolean> f1386OooO0Oo;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function2<o0000O, Continuation<? super Unit>, Object> f1387Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f1388Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MutatePriority f1390Oooo0oo;

        /* JADX INFO: renamed from: Oooo0O0.OooOOOO$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0011OooO00o extends SuspendLambda implements Function2<o0000O, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ Function2<o0000O, Continuation<? super Unit>, Object> f1391Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f1392Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public /* synthetic */ Object f1393Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ OooOOOO f1394Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0011OooO00o(OooOOOO oooOOOO, Function2<? super o0000O, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C0011OooO00o> continuation) {
                super(2, continuation);
                this.f1394Oooo0oo = oooOOOO;
                this.f1391Oooo = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0011OooO00o c0011OooO00o = new C0011OooO00o(this.f1394Oooo0oo, this.f1391Oooo, continuation);
                c0011OooO00o.f1393Oooo0oO = obj;
                return c0011OooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(o0000O o0000o2, Continuation<? super Unit> continuation) {
                return ((C0011OooO00o) create(o0000o2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f1392Oooo0o;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        o0000O o0000o2 = (o0000O) this.f1393Oooo0oO;
                        this.f1394Oooo0oo.f1386OooO0Oo.setValue(Boxing.boxBoolean(true));
                        Function2<o0000O, Continuation<? super Unit>, Object> function2 = this.f1391Oooo;
                        this.f1392Oooo0o = 1;
                        if (function2.invoke(o0000o2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.f1394Oooo0oo.f1386OooO0Oo.setValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    this.f1394Oooo0oo.f1386OooO0Oo.setValue(Boxing.boxBoolean(false));
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(MutatePriority mutatePriority, Function2<? super o0000O, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f1390Oooo0oo = mutatePriority;
            this.f1387Oooo = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OooOOOO.this.new OooO00o(this.f1390Oooo0oo, this.f1387Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1388Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOOO oooOOOO = OooOOOO.this;
                o00O0O0O o00o0o0o2 = oooOOOO.f1385OooO0OO;
                OooO0O0 oooO0O0 = oooOOOO.f1384OooO0O0;
                MutatePriority mutatePriority = this.f1390Oooo0oo;
                C0011OooO00o c0011OooO00o = new C0011OooO00o(oooOOOO, this.f1387Oooo, null);
                this.f1388Oooo0o = 1;
                Objects.requireNonNull(o00o0o0o2);
                if (CoroutineScopeKt.coroutineScope(new o00O0OO0(mutatePriority, o00o0o0o2, c0011OooO00o, oooO0O0, null), this) == coroutine_suspended) {
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

    public static final class OooO0O0 implements o0000O {
        public OooO0O0() {
        }

        @Override // p025Oooo0O0.o0000O
        public final float OooO00o(float f) {
            return OooOOOO.this.f1383OooO00o.invoke(Float.valueOf(f)).floatValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooOOOO(@NotNull Function1<? super Float, Float> onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f1383OooO00o = onDelta;
        this.f1384OooO0O0 = new OooO0O0();
        this.f1385OooO0OO = new o00O0O0O();
        this.f1386OooO0Oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);
    }

    @Override // p025Oooo0O0.o000OO0O
    public final boolean OooO00o() {
        return this.f1386OooO0Oo.getValue().booleanValue();
    }

    @Override // p025Oooo0O0.o000OO0O
    @Nullable
    public final Object OooO0O0(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super o0000O, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OooO00o(mutatePriority, function2, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @Override // p025Oooo0O0.o000OO0O
    public final float OooO0OO(float f) {
        return this.f1383OooO00o.invoke(Float.valueOf(f)).floatValue();
    }
}
