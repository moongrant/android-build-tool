package o0OOOO0o;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Optional;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public final class OooO00o<T> extends Optional<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final OooO00o<Object> f38222Oooo0o = new OooO00o<>();

    private Object readResolve() {
        return f38222Oooo0o;
    }

    @Override // com.google.common.base.Optional
    public final T OooO00o(T t) {
        OooOOOO.OooOO0(t, "use Optional.orNull() instead of Optional.or(null)");
        return t;
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
