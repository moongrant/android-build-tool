package p025Oooo0O0;

import androidx.compose.foundation.MutatePriority;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O implements o0000, o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000000 f1485OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o00Oo0 f1486OooO0O0;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.IgnorePointerDraggableState$drag$2", f = "Draggable.kt", i = {}, l = {478}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o00Oo0, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function2<o0000Ooo, Continuation<? super Unit>, Object> f1487Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f1488Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f1489Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function2<? super o0000Ooo, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f1487Oooo = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = o00000O.this.new OooO00o(this.f1487Oooo, continuation);
            oooO00o.f1489Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00Oo0 o00oo1, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o00oo1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1488Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00Oo0 o00oo1 = (o00Oo0) this.f1489Oooo0oO;
                o00000O o00000o = o00000O.this;
                o00000o.f1486OooO0O0 = o00oo1;
                Function2<o0000Ooo, Continuation<? super Unit>, Object> function2 = this.f1487Oooo;
                this.f1488Oooo0o = 1;
                if (function2.invoke(o00000o, this) == coroutine_suspended) {
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

    public o00000O(@NotNull o000000 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f1485OooO00o = origin;
    }

    @Override // p025Oooo0O0.o0000
    @Nullable
    public final Object OooO00o(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super o0000Ooo, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objOooO00o = this.f1485OooO00o.OooO00o(mutatePriority, new OooO00o(function2, null), continuation);
        return objOooO00o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO00o : Unit.INSTANCE;
    }

    @Override // p025Oooo0O0.o0000Ooo
    public final void OooO0O0(float f, long j) {
        o00Oo0 o00oo1 = this.f1486OooO0O0;
        if (o00oo1 != null) {
            o00oo1.OooO00o(f);
        }
    }
}
