package p230o00oOo0o;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.nestedscroll.OooO00o;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o0Oo0oo implements NestedScrollConnection {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f39790OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o000000 f39791OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f39792OooO0o0;

    public o0Oo0oo(boolean z, boolean z2, @NotNull o000000 pagerState) {
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        this.f39790OooO0Oo = z;
        this.f39792OooO0o0 = z2;
        this.f39791OooO0o = pagerState;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo333onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
        long jVelocity;
        if (this.f39791OooO0o.OooO0OO() == 0.0f) {
            jVelocity = VelocityKt.Velocity(this.f39790OooO0Oo ? Velocity.m4000getXimpl(j2) : 0.0f, this.f39792OooO0o0 ? Velocity.m4001getYimpl(j2) : 0.0f);
        } else {
            jVelocity = Velocity.INSTANCE.m4011getZero9UxMQ8M();
        }
        return Velocity.m3991boximpl(jVelocity);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo334onPostScrollDzOQY0M(long j, long j2, int i) {
        if (NestedScrollSource.m2604equalsimpl0(i, NestedScrollSource.INSTANCE.m2610getFlingWNlRxjI())) {
            return OffsetKt.Offset(this.f39790OooO0Oo ? Offset.m1447getXimpl(j2) : 0.0f, this.f39792OooO0o0 ? Offset.m1448getYimpl(j2) : 0.0f);
        }
        return Offset.INSTANCE.m1463getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final /* synthetic */ Object mo335onPreFlingQWom1Mo(long j, Continuation continuation) {
        return OooO00o.OooO0OO(this, j, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final /* synthetic */ long mo336onPreScrollOzD1aCk(long j, int i) {
        return OooO00o.OooO0Oo(this, j, i);
    }
}
