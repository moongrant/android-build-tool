package p442o0OoOo0;

import OooO00o.OooO00o;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;
import p191o00o0O.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 implements o000oOoO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final OooOo f40216Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Function1<OooOo, o00Ooo> f40217Oooo0oO;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OoOo0(@NotNull OooOo cacheDrawScope, @NotNull Function1<? super OooOo, o00Ooo> onBuildDrawCache) {
        Intrinsics.checkNotNullParameter(cacheDrawScope, "cacheDrawScope");
        Intrinsics.checkNotNullParameter(onBuildDrawCache, "onBuildDrawCache");
        this.f40216Oooo0o = cacheDrawScope;
        this.f40217Oooo0oO = onBuildDrawCache;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p442o0OoOo0.o000oOoO
    public final void OooOo0o(@NotNull OooOo00 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        OooOo oooOo = this.f40216Oooo0o;
        Objects.requireNonNull(oooOo);
        Intrinsics.checkNotNullParameter(params, "<set-?>");
        oooOo.f40207Oooo0o = params;
        oooOo.f40208Oooo0oO = null;
        this.f40217Oooo0oO.invoke(oooOo);
        if (oooOo.f40208Oooo0oO == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
        }
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // p442o0OoOo0.o00O0O
    public final void Oooo0o(@NotNull o00oO0o o00oo0o2) {
        Intrinsics.checkNotNullParameter(o00oo0o2, "<this>");
        o00Ooo o00ooo2 = this.f40216Oooo0o.f40208Oooo0oO;
        Intrinsics.checkNotNull(o00ooo2);
        o00ooo2.f40211OooO00o.invoke(o00oo0o2);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OoOo0)) {
            return false;
        }
        o0OoOo0 o0oooo1 = (o0OoOo0) obj;
        return Intrinsics.areEqual(this.f40216Oooo0o, o0oooo1.f40216Oooo0o) && Intrinsics.areEqual(this.f40217Oooo0oO, o0oooo1.f40217Oooo0oO);
    }

    public final int hashCode() {
        return this.f40217Oooo0oO.hashCode() + (this.f40216Oooo0o.hashCode() * 31);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("DrawContentCacheModifier(cacheDrawScope=");
        sbOooO0o0.append(this.f40216Oooo0o);
        sbOooO0o0.append(", onBuildDrawCache=");
        sbOooO0o0.append(this.f40217Oooo0oO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
