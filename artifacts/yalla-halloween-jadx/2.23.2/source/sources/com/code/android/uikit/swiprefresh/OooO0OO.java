package com.code.android.uikit.swiprefresh;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
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
import p201o00o0Ooo.o0O000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements NestedScrollConnection {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final RefreshState f13282OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f13283OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f13284OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f13285OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f13286OooO0oo;

    @DebugMetadata(c = "com.code.android.uikit.swiprefresh.RefreshNestedScrollConnection$onPull$1", f = "RefreshNestedScrollConnection.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f13287OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f13288OooO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(float f, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f13288OooO0o = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OooO0OO.this.new OooO00o(this.f13288OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f13287OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooO0OO oooO0OO = OooO0OO.this;
                oooO0OO.f13282OooO0Oo.OooO0o0(RefreshState.State.Pull);
                RefreshState refreshState = oooO0OO.f13282OooO0Oo;
                this.f13287OooO0Oo = 1;
                refreshState.getClass();
                Object objMutate = refreshState.f13307OooO0O0.mutate(MutatePriority.UserInput, new o0O000O(refreshState, this.f13288OooO0o, null), this);
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

    public OooO0OO(@NotNull RefreshState refreshState, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(refreshState, "refreshState");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f13282OooO0Oo = refreshState;
        this.f13284OooO0o0 = coroutineScope;
        this.f13283OooO0o = true;
        this.f13285OooO0oO = 2.5f;
    }

    public final long OooO00o(long j) {
        float fOooO0O0;
        float f = this.f13285OooO0oO;
        boolean z = f == 0.0f;
        RefreshState refreshState = this.f13282OooO0Oo;
        if (z) {
            fOooO0O0 = 1.0f;
        } else {
            fOooO0O0 = 1 - (refreshState.OooO0O0() / (this.f13286OooO0oo * f));
        }
        float fCoerceAtLeast = RangesKt.coerceAtLeast(refreshState.OooO0O0() + (Offset.m1448getYimpl(j) * fOooO0O0), 0.0f) - refreshState.OooO0O0();
        if (Math.abs(fCoerceAtLeast) < 0.5f) {
            return Offset.INSTANCE.m1463getZeroF1C5BW0();
        }
        BuildersKt__Builders_commonKt.launch$default(this.f13284OooO0o0, null, null, new OooO00o(fCoerceAtLeast, null), 3, null);
        return OffsetKt.Offset(0.0f, Offset.m1448getYimpl(j));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo333onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
        return Velocity.m3991boximpl(VelocityKt.Velocity(0.0f, Velocity.m4001getYimpl(j2)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo334onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!this.f13283OooO0o) {
            return Offset.INSTANCE.m1463getZeroF1C5BW0();
        }
        RefreshState refreshState = this.f13282OooO0Oo;
        if (refreshState.OooO0OO() == RefreshState.State.Refresh) {
            return Offset.INSTANCE.m1463getZeroF1C5BW0();
        }
        if (refreshState.OooO0OO() == RefreshState.State.Finish) {
            return Offset.INSTANCE.m1463getZeroF1C5BW0();
        }
        return (!NestedScrollSource.m2604equalsimpl0(i, NestedScrollSource.INSTANCE.m2609getDragWNlRxjI()) || Offset.m1448getYimpl(j2) <= 0.0f) ? Offset.INSTANCE.m1463getZeroF1C5BW0() : OooO00o(j2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final Object mo335onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation) {
        RefreshState refreshState = this.f13282OooO0Oo;
        if (refreshState.OooO0OO() != RefreshState.State.Pull) {
            return Velocity.m3991boximpl(Velocity.INSTANCE.m4011getZero9UxMQ8M());
        }
        if (refreshState.OooO0O0() >= this.f13286OooO0oo) {
            refreshState.OooO0o0(RefreshState.State.Refresh);
            return Velocity.m3991boximpl(VelocityKt.Velocity(0.0f, Velocity.m4001getYimpl(j)));
        }
        refreshState.OooO0o0(RefreshState.State.Close);
        return Velocity.m3991boximpl(Velocity.INSTANCE.m4011getZero9UxMQ8M());
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo336onPreScrollOzD1aCk(long j, int i) {
        if (!this.f13283OooO0o) {
            return Offset.INSTANCE.m1463getZeroF1C5BW0();
        }
        RefreshState refreshState = this.f13282OooO0Oo;
        if (refreshState.OooO0OO() == RefreshState.State.Refresh) {
            return Offset.INSTANCE.m1463getZeroF1C5BW0();
        }
        if (refreshState.OooO0OO() == RefreshState.State.Finish) {
            return Offset.INSTANCE.m1463getZeroF1C5BW0();
        }
        return (!NestedScrollSource.m2604equalsimpl0(i, NestedScrollSource.INSTANCE.m2609getDragWNlRxjI()) || Offset.m1448getYimpl(j) >= 0.0f) ? Offset.INSTANCE.m1463getZeroF1C5BW0() : OooO00o(j);
    }
}
