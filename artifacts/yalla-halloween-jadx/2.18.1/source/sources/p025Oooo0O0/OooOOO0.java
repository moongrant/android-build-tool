package p025Oooo0O0;

import Oooo0.o00O0O0O;
import Oooo0.o00O0OO0;
import androidx.compose.foundation.MutatePriority;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 implements o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function1<Float, Unit> f1375OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f1376OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00O0O0O f1377OooO0OO;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function2<o00Oo0, Continuation<? super Unit>, Object> f1378Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f1379Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MutatePriority f1381Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(MutatePriority mutatePriority, Function2<? super o00Oo0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f1381Oooo0oo = mutatePriority;
            this.f1378Oooo = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OooOOO0.this.new OooO00o(this.f1381Oooo0oo, this.f1378Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1379Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOO0 oooOOO0 = OooOOO0.this;
                o00O0O0O o00o0o0o2 = oooOOO0.f1377OooO0OO;
                OooO0O0 oooO0O0 = oooOOO0.f1376OooO0O0;
                MutatePriority mutatePriority = this.f1381Oooo0oo;
                Function2<o00Oo0, Continuation<? super Unit>, Object> function2 = this.f1378Oooo;
                this.f1379Oooo0o = 1;
                Objects.requireNonNull(o00o0o0o2);
                if (CoroutineScopeKt.coroutineScope(new o00O0OO0(mutatePriority, o00o0o0o2, function2, oooO0O0, null), this) == coroutine_suspended) {
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

    public static final class OooO0O0 implements o00Oo0 {
        public OooO0O0() {
        }

        @Override // p025Oooo0O0.o00Oo0
        public final void OooO00o(float f) {
            OooOOO0.this.f1375OooO00o.invoke(Float.valueOf(f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooOOO0(@NotNull Function1<? super Float, Unit> onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.f1375OooO00o = onDelta;
        this.f1376OooO0O0 = new OooO0O0();
        this.f1377OooO0OO = new o00O0O0O();
    }

    @Override // p025Oooo0O0.o000000
    @Nullable
    public final Object OooO00o(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super o00Oo0, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OooO00o(mutatePriority, function2, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
