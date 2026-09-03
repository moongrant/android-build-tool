package p023Oooo00O;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00O00o0<T, V extends o0O0O00> implements o00O0O<T, V> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final V f1151OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OOO00<V> f1152OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00OO0O0<T, V> f1153OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final T f1154OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final T f1155OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final V f1156OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final V f1157OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final V f1158OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f1159OooO0oo;

    public o00O00o0(@NotNull oo000o<T> animationSpec, @NotNull o00OO0O0<T, V> typeConverter, T t, T t2, @Nullable V v) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        o00OOO00<V> animationSpec2 = animationSpec.OooO00o(typeConverter);
        Intrinsics.checkNotNullParameter(animationSpec2, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        this.f1152OooO00o = animationSpec2;
        this.f1153OooO0O0 = typeConverter;
        this.f1154OooO0OO = t;
        this.f1155OooO0Oo = t2;
        V vInvoke = typeConverter.OooO00o().invoke(t);
        this.f1157OooO0o0 = vInvoke;
        V vInvoke2 = typeConverter.OooO00o().invoke(t2);
        this.f1156OooO0o = vInvoke2;
        V v2 = v != null ? (V) o000OOo.OooO00o(v) : (V) o000OOo.OooO0O0(typeConverter.OooO00o().invoke(t));
        this.f1158OooO0oO = v2;
        this.f1159OooO0oo = animationSpec2.OooO0Oo(vInvoke, vInvoke2, v2);
        this.f1151OooO = (V) animationSpec2.OooO0o0(vInvoke, vInvoke2, v2);
    }

    @Override // p023Oooo00O.o00O0O
    public final boolean OooO00o() {
        return this.f1152OooO00o.OooO00o();
    }

    @Override // p023Oooo00O.o00O0O
    public final long OooO0O0() {
        return this.f1159OooO0oo;
    }

    @Override // p023Oooo00O.o00O0O
    @NotNull
    public final o00OO0O0<T, V> OooO0OO() {
        return this.f1153OooO0O0;
    }

    @Override // p023Oooo00O.o00O0O
    @NotNull
    public final V OooO0Oo(long j) {
        return !OooO0o0(j) ? (V) this.f1152OooO00o.OooO0O0(j, this.f1157OooO0o0, this.f1156OooO0o, this.f1158OooO0oO) : this.f1151OooO;
    }

    @Override // p023Oooo00O.o00O0O
    public final T OooO0o(long j) {
        return !OooO0o0(j) ? (T) this.f1153OooO0O0.OooO0O0().invoke(this.f1152OooO00o.OooO0oO(j, this.f1157OooO0o0, this.f1156OooO0o, this.f1158OooO0oO)) : this.f1155OooO0Oo;
    }

    @Override // p023Oooo00O.o00O0O
    public final boolean OooO0o0(long j) {
        return j >= OooO0O0();
    }

    @Override // p023Oooo00O.o00O0O
    public final T OooO0oO() {
        return this.f1155OooO0Oo;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("TargetBasedAnimation: ");
        sbOooO0o0.append(this.f1154OooO0OO);
        sbOooO0o0.append(" -> ");
        sbOooO0o0.append(this.f1155OooO0Oo);
        sbOooO0o0.append(",initial velocity: ");
        sbOooO0o0.append(this.f1158OooO0oO);
        sbOooO0o0.append(", duration: ");
        Intrinsics.checkNotNullParameter(this, "<this>");
        sbOooO0o0.append(OooO0O0() / 1000000);
        sbOooO0o0.append(" ms");
        return sbOooO0o0.toString();
    }
}
