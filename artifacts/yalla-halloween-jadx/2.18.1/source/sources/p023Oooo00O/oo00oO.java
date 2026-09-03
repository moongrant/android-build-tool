package p023Oooo00O;

import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class oo00oO<V extends o0O0O00> implements o00OOO00<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00Oo00<V> f1288OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final RepeatMode f1289OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f1290OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f1291OooO0Oo;

    public oo00oO(o00Oo00 o00oo00, RepeatMode repeatMode, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this.f1288OooO00o = o00oo00;
        this.f1289OooO0O0 = repeatMode;
        this.f1290OooO0OO = ((long) (o00oo00.OooO0o() + o00oo00.OooO0OO())) * 1000000;
        this.f1291OooO0Oo = j * 1000000;
    }

    public final V OooO(long j, V v, V v2, V v3) {
        long j2 = this.f1291OooO0Oo;
        long j3 = j + j2;
        long j4 = this.f1290OooO0OO;
        return j3 > j4 ? (V) OooO0O0(j4 - j2, v, v2, v3) : v2;
    }

    @Override // p023Oooo00O.o00OOO00
    public final boolean OooO00o() {
        return true;
    }

    @Override // p023Oooo00O.o00OOO00
    @NotNull
    public final V OooO0O0(long j, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return (V) this.f1288OooO00o.OooO0O0(OooO0oo(j), initialValue, targetValue, OooO(j, initialValue, initialVelocity, targetValue));
    }

    @Override // p023Oooo00O.o00OOO00
    public final long OooO0Oo(@NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return Long.MAX_VALUE;
    }

    @Override // p023Oooo00O.o00OOO00
    public final /* synthetic */ o0O0O00 OooO0o0(o0O0O00 o0o0o00, o0O0O00 o0o0o01, o0O0O00 o0o0o02) {
        return o00OO.OooO00o(this, o0o0o00, o0o0o01, o0o0o02);
    }

    @Override // p023Oooo00O.o00OOO00
    @NotNull
    public final V OooO0oO(long j, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return (V) this.f1288OooO00o.OooO0oO(OooO0oo(j), initialValue, targetValue, OooO(j, initialValue, initialVelocity, targetValue));
    }

    public final long OooO0oo(long j) {
        long j2 = this.f1291OooO0Oo;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.f1290OooO0OO;
        long j5 = j3 / j4;
        if (this.f1289OooO0O0 != RepeatMode.Restart && j5 % ((long) 2) != 0) {
            return ((j5 + 1) * j4) - j3;
        }
        Long.signum(j5);
        return j3 - (j5 * j4);
    }
}
