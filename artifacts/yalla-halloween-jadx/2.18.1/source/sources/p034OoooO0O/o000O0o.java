package p034OoooO0O;

import OooO00o.OooO00o;
import androidx.compose.runtime.Immutable;
import kotlin.ULong;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o00000O0;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f3531OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f3532OooO0O0;

    public o000O0o(long j, long j2) {
        this.f3531OooO00o = j;
        this.f3532OooO0O0 = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000O0o)) {
            return false;
        }
        o000O0o o000o0o2 = (o000O0o) obj;
        return o00000O0.OooO0Oo(this.f3531OooO00o, o000o0o2.f3531OooO00o) && o00000O0.OooO0Oo(this.f3532OooO0O0, o000o0o2.f3532OooO0O0);
    }

    public final int hashCode() {
        long j = this.f3531OooO00o;
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        return ULong.m686hashCodeimpl(this.f3532OooO0O0) + (ULong.m686hashCodeimpl(j) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("SelectionColors(selectionHandleColor=");
        sbOooO0o0.append((Object) o00000O0.OooOO0(this.f3531OooO00o));
        sbOooO0o0.append(", selectionBackgroundColor=");
        sbOooO0o0.append((Object) o00000O0.OooOO0(this.f3532OooO0O0));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
