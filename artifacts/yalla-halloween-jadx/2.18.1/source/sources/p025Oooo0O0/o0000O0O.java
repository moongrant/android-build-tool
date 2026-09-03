package p025Oooo0O0;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableKt;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O implements o0000, o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o000OO00> f1502OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public o0000O f1503OooO0O0;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", i = {}, l = {445}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o0000O, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function2<o0000Ooo, Continuation<? super Unit>, Object> f1504Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f1505Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f1506Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function2<? super o0000Ooo, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f1504Oooo = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = o0000O0O.this.new OooO00o(this.f1504Oooo, continuation);
            oooO00o.f1506Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0000O o0000o2, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o0000o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1505Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0000O o0000o2 = (o0000O) this.f1506Oooo0oO;
                o0000O0O o0000o0o2 = o0000O0O.this;
                Objects.requireNonNull(o0000o0o2);
                Intrinsics.checkNotNullParameter(o0000o2, "<set-?>");
                o0000o0o2.f1503OooO0O0 = o0000o2;
                Function2<o0000Ooo, Continuation<? super Unit>, Object> function2 = this.f1504Oooo;
                o0000O0O o0000o0o3 = o0000O0O.this;
                this.f1505Oooo0o = 1;
                if (function2.invoke(o0000o0o3, this) == coroutine_suspended) {
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

    public o0000O0O(@NotNull oO0Oo<o000OO00> scrollLogic) {
        Intrinsics.checkNotNullParameter(scrollLogic, "scrollLogic");
        this.f1502OooO00o = scrollLogic;
        ScrollableKt.OooO0O0 oooO0O0 = ScrollableKt.f5724OooO00o;
        this.f1503OooO0O0 = ScrollableKt.f5724OooO00o;
    }

    @Override // p025Oooo0O0.o0000
    @Nullable
    public final Object OooO00o(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super o0000Ooo, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objOooO0O0 = this.f1502OooO00o.getValue().f1552OooO0Oo.OooO0O0(mutatePriority, new OooO00o(function2, null), continuation);
        return objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0O0 : Unit.INSTANCE;
    }

    @Override // p025Oooo0O0.o0000Ooo
    public final void OooO0O0(float f, long j) {
        o000OO00 value = this.f1502OooO00o.getValue();
        value.OooO00o(this.f1503OooO0O0, value.OooO0oo(f), new OooO(j), 1);
    }
}
