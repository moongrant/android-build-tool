package Oooo0;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalFoundationApi
public final class o00O0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final o00O0O0 f646OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f647OooO0oO = new OooO00o();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final o00O0O0 f648OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f649OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f650OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f651OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f652OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f653OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f654OooO0o0;

    public static final class OooO00o {
    }

    static {
        o00O0O0 o00o0o0 = new o00O0O0();
        f648OooO0oo = o00o0o0;
        f646OooO = new o00O0O0(o00o0o0.f650OooO0O0, o00o0o0.f651OooO0OO, o00o0o0.f652OooO0Oo, o00o0o0.f654OooO0o0, false);
    }

    public o00O0O0(long j, float f, float f2, boolean z, boolean z2) {
        this.f649OooO00o = true;
        this.f650OooO0O0 = j;
        this.f651OooO0OO = f;
        this.f652OooO0Oo = f2;
        this.f654OooO0o0 = z;
        this.f653OooO0o = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O0O0)) {
            return false;
        }
        o00O0O0 o00o0o0 = (o00O0O0) obj;
        if (this.f649OooO00o != o00o0o0.f649OooO00o) {
            return false;
        }
        long j = this.f650OooO0O0;
        long j2 = o00o0o0.f650OooO0O0;
        o0000O0O.OooOo00.OooO00o oooO00o = o0000O0O.OooOo00.f27313OooO0O0;
        return ((j > j2 ? 1 : (j == j2 ? 0 : -1)) == 0) && o0000O0O.OooOOO0.OooO00o(this.f651OooO0OO, o00o0o0.f651OooO0OO) && o0000O0O.OooOOO0.OooO00o(this.f652OooO0Oo, o00o0o0.f652OooO0Oo) && this.f654OooO0o0 == o00o0o0.f654OooO0o0 && this.f653OooO0o == o00o0o0.f653OooO0o;
    }

    public final int hashCode() {
        return ((Oooo000.o000O00O.OooO00o(this.f652OooO0Oo, Oooo000.o000O00O.OooO00o(this.f651OooO0OO, (o0000O0O.OooOo00.OooO0OO(this.f650OooO0O0) + ((this.f649OooO00o ? 1231 : 1237) * 31)) * 31, 31), 31) + (this.f654OooO0o0 ? 1231 : 1237)) * 31) + (this.f653OooO0o ? 1231 : 1237);
    }

    @NotNull
    public final String toString() {
        if (this.f649OooO00o) {
            return "MagnifierStyle.TextDefault";
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("MagnifierStyle(size=");
        sbOooO0o0.append((Object) o0000O0O.OooOo00.OooO0Oo(this.f650OooO0O0));
        sbOooO0o0.append(", cornerRadius=");
        sbOooO0o0.append((Object) o0000O0O.OooOOO0.OooO0O0(this.f651OooO0OO));
        sbOooO0o0.append(", elevation=");
        sbOooO0o0.append((Object) o0000O0O.OooOOO0.OooO0O0(this.f652OooO0Oo));
        sbOooO0o0.append(", clippingEnabled=");
        sbOooO0o0.append(this.f654OooO0o0);
        sbOooO0o0.append(", fishEyeEnabled=");
        return Oooo000.Oooo0.OooO0O0(sbOooO0o0, this.f653OooO0o, ')');
    }

    public o00O0O0() {
        o0000O0O.OooOo00.OooO00o oooO00o = o0000O0O.OooOo00.f27313OooO0O0;
        long j = o0000O0O.OooOo00.f27315OooO0Oo;
        this.f649OooO00o = false;
        this.f650OooO0O0 = j;
        this.f651OooO0OO = Float.NaN;
        this.f652OooO0Oo = Float.NaN;
        this.f654OooO0o0 = true;
        this.f653OooO0o = false;
    }
}
