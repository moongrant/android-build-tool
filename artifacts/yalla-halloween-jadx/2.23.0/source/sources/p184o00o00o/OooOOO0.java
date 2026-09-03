package p184o00o00o;

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
public final class OooOOO0 implements NestedScrollConnection {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f38606OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Oooo000 f38607OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f38608OooO0o0;

    public OooOOO0(boolean z, boolean z2, @NotNull Oooo000 pagerState) {
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        this.f38606OooO0Oo = z;
        this.f38608OooO0o0 = z2;
        this.f38607OooO0o = pagerState;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @Nullable
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo331onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
        long jVelocity;
        if (this.f38607OooO0o.OooO0OO() == 0.0f) {
            jVelocity = VelocityKt.Velocity(this.f38606OooO0Oo ? Velocity.m3990getXimpl(j2) : 0.0f, this.f38608OooO0o0 ? Velocity.m3991getYimpl(j2) : 0.0f);
        } else {
            jVelocity = Velocity.INSTANCE.m4001getZero9UxMQ8M();
        }
        return Velocity.m3981boximpl(jVelocity);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo332onPostScrollDzOQY0M(long j, long j2, int i) {
        if (NestedScrollSource.m2594equalsimpl0(i, NestedScrollSource.INSTANCE.m2600getFlingWNlRxjI())) {
            return OffsetKt.Offset(this.f38606OooO0Oo ? Offset.m1436getXimpl(j2) : 0.0f, this.f38608OooO0o0 ? Offset.m1437getYimpl(j2) : 0.0f);
        }
        return Offset.INSTANCE.m1452getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final /* synthetic */ Object mo333onPreFlingQWom1Mo(long j, Continuation continuation) {
        return OooO00o.OooO0OO(this, j, continuation);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final /* synthetic */ long mo334onPreScrollOzD1aCk(long j, int i) {
        return OooO00o.OooO0Oo(this, j, i);
    }
}
