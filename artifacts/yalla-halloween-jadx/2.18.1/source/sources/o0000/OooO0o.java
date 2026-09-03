package o0000;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f26567OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOO0 f26568OooO00o;

    public static final class OooO00o {
    }

    public OooO0o(@NotNull OooOO0 platformLocale) {
        Intrinsics.checkNotNullParameter(platformLocale, "platformLocale");
        this.f26568OooO00o = platformLocale;
    }

    @NotNull
    public final String OooO00o() {
        return this.f26568OooO00o.OooO00o();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof OooO0o)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.areEqual(OooO00o(), ((OooO0o) obj).OooO00o());
    }

    public final int hashCode() {
        return OooO00o().hashCode();
    }

    @NotNull
    public final String toString() {
        return OooO00o();
    }
}
