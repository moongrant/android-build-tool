package p100o000oOoO;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class o0OO00o0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oOO00O f29599OooO00o;

    public /* synthetic */ o0OO00o0(oOO00O ooo00o) {
        this.f29599OooO00o = ooo00o;
    }

    public static final /* synthetic */ o0OO00o0 OooO00o(oOO00O ooo00o) {
        return new o0OO00o0(ooo00o);
    }

    @NotNull
    public static <T> oOO00O OooO0O0(@NotNull oOO00O composer) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        return composer;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o0OO00o0) && Intrinsics.areEqual(this.f29599OooO00o, ((o0OO00o0) obj).f29599OooO00o);
    }

    public final int hashCode() {
        return this.f29599OooO00o.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f29599OooO00o + ')';
    }
}
