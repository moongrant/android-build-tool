package p023Oooo00O;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00000O<T, V extends o0O0O00> implements o00O0O<T, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OOOO0<V> f1039OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00OO0O0<T, V> f1040OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final T f1041OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final V f1042OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final V f1043OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final V f1044OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final T f1045OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f1046OooO0oo;

    public o00000O(@NotNull o00000OO<T> animationSpec, @NotNull o00OO0O0<T, V> typeConverter, T t, @NotNull V initialVelocityVector) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
        o00OOOO0<V> animationSpec2 = animationSpec.OooO00o(typeConverter);
        Intrinsics.checkNotNullParameter(animationSpec2, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
        this.f1039OooO00o = animationSpec2;
        this.f1040OooO0O0 = typeConverter;
        this.f1041OooO0OO = t;
        V vInvoke = typeConverter.OooO00o().invoke(t);
        this.f1042OooO0Oo = vInvoke;
        this.f1044OooO0o0 = (V) o000OOo.OooO00o(initialVelocityVector);
        this.f1045OooO0oO = (T) typeConverter.OooO0O0().invoke(animationSpec2.OooO0O0(vInvoke, initialVelocityVector));
        long jOooO0o0 = animationSpec2.OooO0o0(vInvoke, initialVelocityVector);
        this.f1046OooO0oo = jOooO0o0;
        V v = (V) o000OOo.OooO00o(animationSpec2.OooO0Oo(jOooO0o0, vInvoke, initialVelocityVector));
        this.f1043OooO0o = v;
        int iOooO0O0 = v.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            V v2 = this.f1043OooO0o;
            v2.OooO0o0(i, RangesKt.coerceIn(v2.OooO00o(i), -this.f1039OooO00o.OooO00o(), this.f1039OooO00o.OooO00o()));
        }
    }

    @Override // p023Oooo00O.o00O0O
    public final boolean OooO00o() {
        return false;
    }

    @Override // p023Oooo00O.o00O0O
    public final long OooO0O0() {
        return this.f1046OooO0oo;
    }

    @Override // p023Oooo00O.o00O0O
    @NotNull
    public final o00OO0O0<T, V> OooO0OO() {
        return this.f1040OooO0O0;
    }

    @Override // p023Oooo00O.o00O0O
    @NotNull
    public final V OooO0Oo(long j) {
        return !OooO0o0(j) ? (V) this.f1039OooO00o.OooO0Oo(j, this.f1042OooO0Oo, this.f1044OooO0o0) : this.f1043OooO0o;
    }

    @Override // p023Oooo00O.o00O0O
    public final T OooO0o(long j) {
        return !OooO0o0(j) ? (T) this.f1040OooO0O0.OooO0O0().invoke(this.f1039OooO00o.OooO0OO(j, this.f1042OooO0Oo, this.f1044OooO0o0)) : this.f1045OooO0oO;
    }

    @Override // p023Oooo00O.o00O0O
    public final boolean OooO0o0(long j) {
        return j >= OooO0O0();
    }

    @Override // p023Oooo00O.o00O0O
    public final T OooO0oO() {
        return this.f1045OooO0oO;
    }
}
