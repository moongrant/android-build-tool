package p031OoooO;

import OooO00o.OooO00o;
import Oooo000.OooO0O0;
import Oooo000.o000O00O;
import androidx.compose.runtime.Immutable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f2885OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f2886OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f2887OooO0OO;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0O0O00)) {
            return false;
        }
        o0O0O00 o0o0o00 = (o0O0O00) obj;
        if (!(this.f2885OooO00o == o0o0o00.f2885OooO00o)) {
            return false;
        }
        if (this.f2886OooO0O0 == o0o0o00.f2886OooO0O0) {
            return (this.f2887OooO0OO > o0o0o00.f2887OooO0OO ? 1 : (this.f2887OooO0OO == o0o0o00.f2887OooO0OO ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f2887OooO0OO) + o000O00O.OooO00o(this.f2886OooO0O0, Float.floatToIntBits(this.f2885OooO00o) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ResistanceConfig(basis=");
        sbOooO0o0.append(this.f2885OooO00o);
        sbOooO0o0.append(", factorAtMin=");
        sbOooO0o0.append(this.f2886OooO0O0);
        sbOooO0o0.append(", factorAtMax=");
        return OooO0O0.OooO00o(sbOooO0o0, this.f2887OooO0OO, ')');
    }
}
