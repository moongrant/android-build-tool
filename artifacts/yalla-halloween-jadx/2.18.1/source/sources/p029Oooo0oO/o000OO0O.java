package p029Oooo0oO;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f2271OooO00o;

    public final boolean equals(Object obj) {
        return (obj instanceof o000OO0O) && this.f2271OooO00o == ((o000OO0O) obj).f2271OooO00o;
    }

    public final int hashCode() {
        long j = this.f2271OooO00o;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f2271OooO00o + ')';
    }
}
