package p100o000oOoO;

import OooO00o.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ooo0Oo0<T> implements oO0Oo<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final T f29721Oooo0o;

    public ooo0Oo0(T t) {
        this.f29721Oooo0o = t;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ooo0Oo0) && Intrinsics.areEqual(this.f29721Oooo0o, ((ooo0Oo0) obj).f29721Oooo0o);
    }

    @Override // p100o000oOoO.oO0Oo
    public final T getValue() {
        return this.f29721Oooo0o;
    }

    public final int hashCode() {
        T t = this.f29721Oooo0o;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    @NotNull
    public final String toString() {
        return o0.OooO00o(OooO00o.OooO0o0("StaticValueHolder(value="), this.f29721Oooo0o, ')');
    }
}
