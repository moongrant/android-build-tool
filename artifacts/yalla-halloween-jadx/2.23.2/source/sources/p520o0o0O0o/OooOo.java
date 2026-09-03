package p520o0o0O0o;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo implements NestedScrollConnection {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o000oOoO f52873OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f52874OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f52875OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f52876OooO0oO;

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.refresh.SwipeNestedScrollConnection$onScroll$1", f = "SwipeNestedScrollConnection.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f52877OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f52878OooO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(float f, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f52878OooO0o = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OooOo.this.new OooO00o(this.f52878OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f52877OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o000oOoO o000oooo2 = OooOo.this.f52873OooO0Oo;
                this.f52877OooO0Oo = 1;
                o000oooo2.getClass();
                Object objMutate = o000oooo2.f52895OooO0O0.mutate(MutatePriority.UserInput, new Oooo0(o000oooo2, this.f52878OooO0o, null), this);
                if (objMutate != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objMutate = Unit.INSTANCE;
                }
                if (objMutate == coroutine_suspended) {
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

    public OooOo(@NotNull o000oOoO state, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f52873OooO0Oo = state;
        this.f52875OooO0o0 = coroutineScope;
        this.f52874OooO0o = 0.3f;
        this.f52876OooO0oO = true;
    }

    public final long OooO00o(long j) {
        o000oOoO o000oooo2 = this.f52873OooO0Oo;
        o000oooo2.f52898OooO0o0.setValue(Boolean.TRUE);
        float fM1448getYimpl = Offset.m1448getYimpl(j);
        float f = this.f52874OooO0o;
        Animatable<Float, AnimationVector1D> animatable = o000oooo2.f52894OooO00o;
        float fCoerceAtLeast = RangesKt.coerceAtLeast(animatable.getValue().floatValue() + (fM1448getYimpl * f), 0.0f) - animatable.getValue().floatValue();
        if (Math.abs(fCoerceAtLeast) < 0.5f) {
            return Offset.INSTANCE.m1463getZeroF1C5BW0();
        }
        BuildersKt__Builders_commonKt.launch$default(this.f52875OooO0o0, null, null, new OooO00o(fCoerceAtLeast, null), 3, null);
        return OffsetKt.Offset(0.0f, fCoerceAtLeast / f);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final /* synthetic */ Object mo333onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        return androidx.compose.ui.input.nestedscroll.OooO00o.OooO00o(this, j, j2, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo334onPostScrollDzOQY0M(long j, long j2, int i) {
        if (this.f52876OooO0oO) {
            return (!NestedScrollSource.m2604equalsimpl0(i, NestedScrollSource.INSTANCE.m2609getDragWNlRxjI()) || Offset.m1448getYimpl(j2) <= 0.0f) ? Offset.INSTANCE.m1463getZeroF1C5BW0() : OooO00o(j2);
        }
        return Offset.INSTANCE.m1463getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final Object mo335onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
        this.f52873OooO0Oo.f52898OooO0o0.setValue(Boolean.FALSE);
        return Velocity.m3991boximpl(Velocity.INSTANCE.m4011getZero9UxMQ8M());
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo336onPreScrollOzD1aCk(long j, int i) {
        if (this.f52876OooO0oO) {
            return (!NestedScrollSource.m2604equalsimpl0(i, NestedScrollSource.INSTANCE.m2609getDragWNlRxjI()) || Offset.m1448getYimpl(j) >= 0.0f) ? Offset.INSTANCE.m1463getZeroF1C5BW0() : OooO00o(j);
        }
        return Offset.INSTANCE.m1463getZeroF1C5BW0();
    }
}
